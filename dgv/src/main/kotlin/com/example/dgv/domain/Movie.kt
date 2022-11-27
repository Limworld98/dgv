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
class Movie(movieName : String, director : String, genre : String, time : Long, agelimit : Long) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var movieid:Long?=null
    var movieName : String = movieName
    var director : String = director
    var genre : String = genre
    var time : Long = time
    var agelimit : Long = agelimit
}