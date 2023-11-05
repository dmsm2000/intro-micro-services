package com.marques.student

import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository: JpaRepository<Student, Int> {
    fun findAllBySchoolId(schoolId: Int): List<Student>
}