package com.marques.school

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
@RequestMapping("/api/v1/schools")
class SchoolController(private val service: SchoolService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun save(@RequestBody school: School) {
        service.saveSchool(school)
    }

    @GetMapping
    fun findAllSchools(): ResponseEntity<List<School>> {
        return ResponseEntity.ok(service.findAllSchools())
    }

    @GetMapping("/with-students/{school-id}")
    fun findAllSchools(
            @PathVariable("school-id") schoolId: Int
    ): ResponseEntity<FullSchoolResponse?> {
        return ResponseEntity.ok(service.findSchoolsWithStudents(schoolId))
    }
}