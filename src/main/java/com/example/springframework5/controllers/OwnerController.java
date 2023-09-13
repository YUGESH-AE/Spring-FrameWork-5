package com.example.springframework5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OwnerController {

    @GetMapping({"/owners","/owners/index","/owners/index.html"})
    public String index(){
        return "owners/index.html";
    }

}
