package com.example.dgv.domain

import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import javax.persistence.*

@Entity
@Table(name = "movie_Order")
@Getter
@Setter
@NoArgsConstructor
class Order(id:Long, movieid: Long, date: String, price : Long) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var orderid:Long?=null
    var id : Long = id //예매자 고유 id
    var movieid : Long = movieid //영화 고유 id
    var date1 : String = date
    var price : Long = price
}