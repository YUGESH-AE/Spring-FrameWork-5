package com.example.springframework5.controllers;

import com.example.springframework5.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OwnerController {

    public final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping({"/owners", "/owners/index", "/owners/index.html"})
    public String listOfOwners(Model model) {

        model.addAttribute("owners", ownerService.findAll());
        return "owners/index.html";
    }

}
