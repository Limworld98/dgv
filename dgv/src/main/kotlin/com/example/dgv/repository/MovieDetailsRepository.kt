package com.example.dgv.repository

import com.example.dgv.domain.MovieDetails
import org.springframework.data.jpa.repository.JpaRepository

interface MovieDetailsRepository : JpaRepository <MovieDetails,Long > {
    fun findByMovieName(movieName: String) : MovieDetails ?
    fun findByMovieScreeningTime(movieScreeningTime: String) : MovieDetails ?
}
