package com.example.dgv.repository

import com.example.dgv.domain.Order
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository : JpaRepository<Order,Long>{
    fun findByOrderid(orderId : Long) : Order?
    fun findAllByMovieid(movieId: Long) : Order?
}