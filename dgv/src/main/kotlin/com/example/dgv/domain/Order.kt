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
class Order() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var orderid:Long?=null
}