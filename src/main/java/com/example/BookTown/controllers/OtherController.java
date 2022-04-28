package com.example.BookTown.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/other")
public class OtherController {

    @GetMapping(value = "/about")
    public String about(){
        return "new_about";
    }

}
