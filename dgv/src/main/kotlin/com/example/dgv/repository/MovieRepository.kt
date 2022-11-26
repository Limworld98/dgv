package com.example.dgv.repository

import com.example.dgv.domain.Movie
import org.springframework.data.jpa.repository.JpaRepository

interface MovieRepository : JpaRepository<Movie,Long>{
    fun findByMovieid(movieid : Long) : Movie?
    fun findByMovieName(movieName:String) : Movie?
    fun findAllByMovieNameContains(MovieName:String) : List<Movie> ?
}