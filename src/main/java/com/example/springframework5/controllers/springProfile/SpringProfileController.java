package com.example.springframework5.controllers.springProfile;

import com.example.springframework5.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SpringProfileController {

    public final GreetingService greetingService;

    public SpringProfileController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public  String getGreeting() {
        return greetingService.sayGreetings();
    }
}
