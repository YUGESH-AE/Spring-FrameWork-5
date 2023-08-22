package com.example.springframework5.controllers.PropertyInjecton;

import com.example.springframework5.services.GreetingService;
import com.example.springframework5.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingService;



    public String getGreetings(){
        return greetingService.sayGreetings();
    }

}
