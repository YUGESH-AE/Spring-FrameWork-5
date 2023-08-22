package com.example.springframework5.controllers.primaryBean;

import com.example.springframework5.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryBeanController {

    private final GreetingService greetingService;

    public PrimaryBeanController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting( ){
        return greetingService.sayGreetings();
    }
}
