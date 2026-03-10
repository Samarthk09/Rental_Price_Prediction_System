package com.rental.rental_price_prediction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "home";
    }
    
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }


}
