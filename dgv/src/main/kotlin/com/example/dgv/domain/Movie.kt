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
class Movie(movieName : String, director : String, genre : String, time : Int, limit : Int) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var movieid:Long?=null
    var movieName = movieName
    var director = director
    var genre = genre
    var time = time
    var limit = limit
}