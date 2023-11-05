package com.marques.school

import org.springframework.data.jpa.repository.JpaRepository

interface SchoolRepository: JpaRepository<School, Int> {
}