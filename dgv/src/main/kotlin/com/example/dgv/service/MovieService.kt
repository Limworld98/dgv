package com.example.dgv.service

import com.example.dgv.domain.Movie
import com.example.dgv.repository.MovieRepository
import org.springframework.stereotype.Service
import javax.persistence.Id

@Service
class MovieService (val movieRepository: MovieRepository){
    fun findByMovieId(movieId: Long) : Movie? {
        return movieRepository.findByMovieid(movieId)
    }

    fun findByMovieName(movieName: String) : Movie? {
        return movieRepository.findByMovieName(movieName)
    }

    fun findAll() : List<Movie>? {
        return movieRepository.findAll()
    }

    fun serachByMovieName(movieName: String) : List<Movie>?{
        return movieRepository.findAllByMovieNameContains(movieName)
    }

}