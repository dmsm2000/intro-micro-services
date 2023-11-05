package com.marques.school

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class School (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int,
        var name: String,
        var email: String,
)


