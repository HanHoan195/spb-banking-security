package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {
//    @GetMapping
//    public String showHomePage() {
//        return "home";
//    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "views/login";
    }

    @GetMapping("/customers")
    public String showListPage() {
        return "views/index";
    }
}
