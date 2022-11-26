package com.example.dgv.repository

import com.example.dgv.domain.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
    fun findByUserId(userId:String) : User?
}