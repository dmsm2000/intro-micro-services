package com.marques.student

import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service

@Service
@RequiredArgsConstructor
class StudentService(private val repository: StudentRepository) {

    fun saveStudent(student: Student) {
        repository.save(student)
    }

    fun findAllStudents(): List<Student> {
        return repository.findAll()
    }

    fun findAllStudentsBySchool(schoolId: Int): List<Student> {
        return repository.findAllBySchoolId(schoolId)
    }
}