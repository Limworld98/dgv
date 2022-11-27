package com.example.dgv.service

import com.example.dgv.domain.Movie
import com.example.dgv.domain.Order
import com.example.dgv.repository.OrderRepository
import org.springframework.stereotype.Service
import javax.persistence.Id

@Service
class OrderService (val orderRepository: OrderRepository){
    fun save(order: Order): Order {
        return orderRepository.save(order);
    }

    fun findByOrderid(orderid : Long) : Order? {
        return orderRepository.findByOrderid(orderid)
    }

    fun findByMovieid(movieid : Long) : Order? {
        return orderRepository.findByOrderid(movieid)
    }

    fun findAll() : List<Order>? {
        return orderRepository.findAll()
    }


}