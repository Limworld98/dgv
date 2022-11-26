package com.example.dgv.domain

import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import javax.persistence.*

@Entity
@Table(name = "Movie")
@Getter
@Setter
@NoArgsConstructor
class Movie(movieName : String) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var movieid:Long?=null
}