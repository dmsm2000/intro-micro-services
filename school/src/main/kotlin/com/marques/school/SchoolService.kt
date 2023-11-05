package com.marques.school

import com.marques.school.client.StudentClient
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service

@Service
@RequiredArgsConstructor
class SchoolService(private val repository: SchoolRepository, private val client: StudentClient) {

    fun saveSchool(school: School) {
        repository.save(school)
    }

    fun findAllSchools(): List<School> {
        return repository.findAll()
    }

    fun findSchoolsWithStudents(schoolId: Int): FullSchoolResponse? {
        val school = repository.findById(schoolId).orElse(null)
        val students = client.findAllStudentsBySchool(schoolId)
        if (school == null)
            return null
        return FullSchoolResponse(name = school.name, email = school.email, students = students)
    }
}