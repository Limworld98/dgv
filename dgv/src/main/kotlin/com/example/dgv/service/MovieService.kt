package com.example.dgv.service

import com.example.dgv.domain.Movie
import com.example.dgv.repository.MovieRepository
import org.springframework.stereotype.Service

@Service
class MovieService (val movieRepository: MovieRepository){
    fun save(movie: Movie){
        movieRepository.save(movie);
    }

    fun findByMovieid(movieid: Long) : Movie? {
        return movieRepository.findByMovieid(movieid)
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