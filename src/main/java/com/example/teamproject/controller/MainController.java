package com.example.teamproject.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/")
public class MainController {
    @GetMapping("/")
    public String goToMain(){
        log.info("*************");
        log.info("메인페이지");
        log.info("*************");
        return "/main/main";
    }
}
