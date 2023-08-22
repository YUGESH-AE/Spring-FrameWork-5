package com.example.springframework5.services.primaryBean;

import com.example.springframework5.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryBeanGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello World From Primary Bean Service";
    }
}
