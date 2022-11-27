package com.example.dgv.domain

import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

//영화 상영시간대별 예약을 위한 엔터티
@Entity
@Table(name = "MovieDetails")
@Getter
@Setter
@NoArgsConstructor
class MovieDetails(movieName : String, movieScreeningTime : String) {
    @Id
    @GeneratedValue
    var movieDetailid:Long ?= null
    var movieName :String = movieName
    var movieScreeningTime :String = movieScreeningTime //영화 상영시간대가 5개 있으므로, 이에 대한 정보
}