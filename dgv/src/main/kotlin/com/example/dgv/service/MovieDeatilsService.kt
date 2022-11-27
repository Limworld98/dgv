package com.example.dgv.service

import com.example.dgv.domain.MovieDetails
import com.example.dgv.repository.MovieDetailsRepository
import org.springframework.stereotype.Service

@Service
class MovieDeatilsService (val movieDetailsRepository: MovieDetailsRepository){

    fun findAll() : List<MovieDetails>? {
        return movieDetailsRepository.findAll()
    }

    fun findByMoviename(movieName : String) : MovieDetails? {
        return movieDetailsRepository.findByMovieName(movieName)
    }

    fun findByMovieScreeningTime(movieScreeningTime: String) : MovieDetails ? {
        return movieDetailsRepository.findByMovieScreeningTime(movieScreeningTime)
    }

}