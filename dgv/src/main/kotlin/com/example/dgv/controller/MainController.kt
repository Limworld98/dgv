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

}