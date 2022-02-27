package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // url 주소와 매칭해주는 것
public class HomeController {

    // 127.0.0.1:8080/home
    @GetMapping(value = "/home")
    public String homeGet() {
        // home.jsp를 표시하기

        // home.jsp로 list 값을 전송시켜서 출력
        
        return "home";
    }

    // 127.0.0.1:8080/join
    @GetMapping(value = "/join")
    public String joinGet() {
        // join.jsp 표시하기
        return "join";
    }

    // 127.0.0.1:8080/join
    @GetMapping(value = "/login")
    public String loginGet() {
        return "login";
    }

    // 127.0.0.1:8080/join
    @GetMapping(value = "/board")
    public String boardGet() {
        return "board";
    }

    // 소스 코드가 바뀌면 자동으로 재실행하게 -> 디펜던시 추가
    // nodemon --inspect ./bin/www

}
