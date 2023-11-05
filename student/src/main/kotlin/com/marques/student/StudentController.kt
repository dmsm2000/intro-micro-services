package com.marques.student

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/students")
class StudentController(private val service: StudentService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun save(@RequestBody student: Student) {
        service.saveStudent(student)
    }

    @GetMapping
    fun findAllStudents(): ResponseEntity<List<Student>> {
        return ResponseEntity.ok(service.findAllStudents())
    }

    @GetMapping("/school/{school-id}")
    fun findAllStudents(@PathVariable("school-id") schoolId: Int): ResponseEntity<List<Student>> {
        return ResponseEntity.ok(service.findAllStudentsBySchool(schoolId))
    }
}