package com.example.dgv.domain

import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import javax.persistence.*

@Entity
@Table(name = "Order")
@Getter
@Setter
@NoArgsConstructor
class Order(id:Long?, movieid: Long?, orderDate: String, price : Long) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var orderid:Long?=null
    var id = id //예매자 고유 id ,외래키
    var movieid = movieid //영화 고유 id, 외래키
    var orderDate = orderDate
    var price = price
}