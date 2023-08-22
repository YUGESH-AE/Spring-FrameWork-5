package com.example.springframework5.services.springProfile;

import com.example.springframework5.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN","default"})
@Service("i18nService")
public class SpringProfileEnGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello World English Profile";
    }
}
