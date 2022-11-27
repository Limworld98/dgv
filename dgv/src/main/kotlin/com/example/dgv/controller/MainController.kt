package com.example.dgv.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import javax.servlet.http.HttpServletRequest

@Controller
class MainController {

    @GetMapping("/")
    fun index(req : HttpServletRequest) : String{
        return "mainpage"
    }

    @GetMapping("/main")
    fun main(req : HttpServletRequest) : String{
        return "mainpage"
    }

    @GetMapping("/list")
    fun list(req : HttpServletRequest) : String{
        return "list"
    }

    @GetMapping("/changeSeat")
    fun changeSeat(req : HttpServletRequest) : String{
        return "changeSeat"
    }

    @GetMapping("/movieList")
    fun movieList(req : HttpServletRequest) : String{
        return "movieList"
    }

    @GetMapping("/movieTimes")
    fun movieTimes(req : HttpServletRequest) : String{
        return "movieTimes"
    }

    @GetMapping("/payback")
    fun payback(req : HttpServletRequest) : String{
        return "payback"
    }

    @GetMapping("/payment")
    fun payment(req : HttpServletRequest) : String{
        return "payment"
    }

    @GetMapping("/seats")
    fun seats(req : HttpServletRequest) : String{
        return "seats"
    }
}