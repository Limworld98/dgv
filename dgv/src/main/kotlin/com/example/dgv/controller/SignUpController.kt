package com.example.dgv.controller

import com.example.dgv.domain.User
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
class SignUpController(val userService: UserService) {

    @GetMapping("/signUp")
    fun signup_form(session : HttpSession, response : HttpServletResponse, req : HttpServletRequest) : String{
        if(session.getAttribute("user") != null){ // 로그인 상태인데 회원가입하려 할 시
            response.setContentType("text/html; charset=UTF-8");
            val out : PrintWriter = response.getWriter();
            out.println("<script>" + "alert(\"이미 회원입니다!\");" + "location.href=\"/\";" + "</script>");
            out.flush();
        }
        return "signUp"
    }


    @PostMapping("/signUp")
    @ResponseBody
    fun signUp(req: HttpServletRequest) : String{
        try{
        val name = req.getParameter("name")
        val id = req.getParameter("id")
        val pw = req.getParameter("pw")
        val email = req.getParameter("email")
        val age = req.getParameter("age").toInt()
        val account = req.getParameter("account")

        println(id)

        if(userService.findByUserId(id) != null){ // 아이디 중복검사
            return "<script>" + "alert(\"이미 있는 아이디입니다.\");" + "location.href=\"signUp\";" + "</script>";
        }


        userService.save(User(name,id,pw,email,age,account))


        }catch (e:Exception){
            e.printStackTrace()
        }

        return "<script>" + "alert(\"회원 가입 성공!\");" + "location.href=\"main\";" + "</script>";

    }
}