package com.example.springframework5.controllers;

import com.example.springframework5.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetController {
    public final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listOfVets(Model model) {

        model.addAttribute("vets", vetService.findAll());
        return "vets/index.html";
    }
}
