package com.marques.school.client

import com.marques.school.Student
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "student-service", url = "\${application.config.students-url}")
interface StudentClient {

    @GetMapping("/school/{school-id}")
    fun findAllStudentsBySchool(@PathVariable("school-id") schoolId: Int): List<Student>
}