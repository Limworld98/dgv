package com.example.dgv.controller

import com.example.dgv.service.UserService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.io.PrintWriter
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.servlet.http.HttpSession

@Controller
class LoginController (val userService: UserService){

    @GetMapping("/login")
    fun login_page(session : HttpSession, response : HttpServletResponse) : String{

        if(session.getAttribute("user") != null){ // 로그인 상태인데 회원가입하려 할 시
            response.setContentType("text/html; charset=UTF-8");
            val out : PrintWriter = response.getWriter();
            out.println("<script>" + "alert(\"이미 로그인 되어있습니다!\");" + "location.href=\"main\";" + "</script>");
            out.flush();
        }
        return "login"
    }

    @PostMapping("/login")
    @ResponseBody
    fun login(session : HttpSession, response : HttpServletResponse, request : HttpServletRequest) : String {
        val id = request.getParameter("id")
        val pw = request.getParameter("pw")
        val userSearch = userService.findByUserId(id)

        if(userSearch == null) {// 아이디 자체가 존재하지 않음
            response.setContentType("text/html; charset=UTF-8");
            val out : PrintWriter = response.getWriter();
            out.println("<script>" + "alert(\"존재하지 않는 아이디입니다" + "\");" + "location.href=\"login\";" + "</script>");
            out.flush();
        }
        else {
            if(pw == userSearch.password) {// 로그인 성공
                session.setAttribute("user",userSearch)
                return "main"
            }
            else {//아이디만 일치
                response.setContentType("text/html; charset=UTF-8");
                val out : PrintWriter = response.getWriter();
                out.println("<script>" + "alert(\"비밀번호가 일치하지 않습니다." + "\");" + "location.href=\"login\";" + "</script>");
                out.flush();
            }
        }

        return "main" //미사용
    }
}