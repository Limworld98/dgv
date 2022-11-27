package com.example.dgv.domain

import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import javax.persistence.*

@Entity
@Table(name = "Orders")
@Getter
@Setter
@NoArgsConstructor
class Order(id:Long, movieid: Long, date: String, price : Long, time : String , seat : String) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var orderid:Long?=null
    var id : Long = id //예매자 고유 id
    var movieid : Long = movieid //영화 고유 id
    var date : String = date
    var price : Long = price
    var time : String = time
    var seat : String = seat
}