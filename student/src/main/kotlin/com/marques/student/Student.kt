package com.marques.student

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import lombok.*

@Entity
data class Student (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int,
        var firstName: String,
        var lastName: String,
        var email: String,
        var schoolId: Int
)


