package com.example.springframework5.controllers;

import com.example.springframework5.services.QuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuotesController {

    @Autowired
    private final QuotesService quotesService;


    public QuotesController(QuotesService quotesService) {
        this.quotesService = quotesService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model) {
        model.addAttribute("quotes", quotesService.getQuotes());

        return "index.html";
    }
}
