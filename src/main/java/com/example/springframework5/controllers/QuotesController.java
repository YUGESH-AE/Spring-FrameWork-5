package com.example.springframework5.controllers;

import com.example.springframework5.services.QuotesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final QuotesService quotesService;


    public JokeController(QuotesService quotesService) {
        this.quotesService = quotesService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model) {
        model.addAttribute("quotes", quotesService.getQuotes());

        return "index.html";
    }
}
