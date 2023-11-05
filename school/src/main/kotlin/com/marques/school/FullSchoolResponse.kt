package com.marques.school

import lombok.Builder

@Builder
data class FullSchoolResponse (
        val name: String,
        val email: String,
        val students: List<Student>
)