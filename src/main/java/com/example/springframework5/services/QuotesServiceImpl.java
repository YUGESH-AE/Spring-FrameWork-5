package com.example.springframework5.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuotesServiceImpl implements QuotesService {

    @Autowired
    private final MotivationalQuotes MotivationalQuotes;

    public QuotesServiceImpl() {
        this.MotivationalQuotes = new MotivationalQuotes();
    }

    @Override
    public String getQuotes() {
        return MotivationalQuotes.getRandomQuote();
    }
}
