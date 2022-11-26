package com.example.dgv.service

import com.example.dgv.domain.User
import com.example.dgv.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(val userRepository: UserRepository) {
    fun findById(id: Long): User {
        val tmp = userRepository.findById(id)
        return tmp.get()
    }

    fun findByUserId(userId: String) : User?{
        return userRepository.findByUserId(userId)
    }
    fun findAll() : List<User>?{
        return userRepository.findAll()
    }
    fun save(user: User){
        userRepository.save(user);
    }
}