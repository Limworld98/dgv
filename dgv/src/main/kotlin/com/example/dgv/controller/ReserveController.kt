package com.example.dgv.controller

import com.example.dgv.repository.MovieRepository
import com.example.dgv.service.MovieDeatilsService
import com.example.dgv.service.MovieService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseBody
import javax.servlet.http.HttpServletRequest

//영화 예약 , 구매, 환불 페이지

@Controller
class ReserveController (val movieService: MovieService , val movieDeatilsService: MovieDeatilsService) {
    @GetMapping("/movieList")
    fun movieList(model:Model) : String{  //현재 DB에 등록된 영화 정보들을 보여준다. (영화 이름, 장르 ,감독 , 연령제한, 상영시간)
        var movieList = movieService.findAll() //영화 정보를 DB에서 받아온 뒤, 전부 model 에 싣는다. 프론트에서 이것을 반복자로 화면에 표시

        model.addAttribute("movieList",movieList);
        return "movieList"
    }


    //주석 해제함
    @GetMapping("/movieTimes")
    fun getMovieTimes(model : Model,request : HttpServletRequest) : String{
        var movieTimes = movieDeatilsService.findAll()
        model.addAttribute("movieTimes",movieTimes)
        return "movieTimes"
    }


//    @PostMapping("/movieTimes")
//    @ResponseBody
//    fun movieTimes(model : Model, request : HttpServletRequest) : String{
//        val movie_Name = request.getParameter("name") //영화 목록 페이지에서 예매하기 버튼 클릭시 post형태로 movietimes로 이동, 영화이름 전달
//        //시간대는 일괄적으로 현재 html 지정대로 고정, 잔여좌석은 Orders 데이터베이스에서 해당 영화 이름의 시간대로 select 해서 연산
//        var movieTimes = movieDeatilsService.findAll()
//        model.addAttribute("movieTimes",movieTimes)
//        return "movieTimes"
//    }


    @GetMapping("/seats")
    fun seats(request : HttpServletRequest) : String{
        return "seats"
    }

    @GetMapping("/changeSeat")
    fun changeSeat(request : HttpServletRequest) : String{
        return "changeSeat"
    }

    @GetMapping("/payback")
    fun payback(request : HttpServletRequest) : String{
        return "payback"
    }

    @GetMapping("/payment")
    fun payment(request : HttpServletRequest) : String{
        return "payment"
    }

}