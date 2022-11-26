package com.example.dgv.domain

import javax.persistence.*
import lombok.*

@Entity
@Table(name="User")
@Getter
@Setter
@NoArgsConstructor
class User(name : String, userId : String, password: String, email : String, age : Int, account : String) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long?=null
    var name:String = name // 실명
    var userId:String = userId // 닉네임
    var password:String = password //비밀번호
    var email:String = email //이메일
    var age:Int = age // 나이
    var account:String = account // 계좌 입력
}
