package com.example.dgv.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import java.io.PrintWriter
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.servlet.http.HttpSession

//메인페이지 및 마이페이지 구현
//마이페이지에서는 orders DB 에서 현재 유저의 예약만 찾아서 보여줘야함. session에서 유저 id 추출하면 되겠지?

@Controller
class MainController {

    @GetMapping("/")
    fun index(request : HttpServletRequest) : String{
        return "mainpage"
    }

    @GetMapping("/main")
    fun main(request : HttpServletRequest) : String{
        return "mainpage"
    }

    @GetMapping("/myMovies")
    fun list(session: HttpSession, response: HttpServletResponse, request : HttpServletRequest, model : Model) : String? {
        if(session.getAttribute("user") == null){ // 유저 로그인 체크
            response.contentType = "text/html; charset=UTF-8";
            val out : PrintWriter = response.writer;
            out.println("<script>" + "alert(\"먼저 로그인을 해주세요\");" + "location.href=\"login\";" + "</script>");
            out.flush();
            return null
        }


        return "myMovies"
    }

    @GetMapping("/seatChange")
    fun seatChange(session : HttpSession, response: HttpServletResponse, request : HttpServletRequest) : String? {
        response.contentType = "text/html;charset=UTF-8";
        return "seatChange"
    }

    @GetMapping("/seatRefund")
    fun seatRefund(session : HttpSession, response: HttpServletResponse, request : HttpServletRequest) : String? {
        response.contentType = "text/html;charset=UTF-8";
        return "seatRefund"
    }


}