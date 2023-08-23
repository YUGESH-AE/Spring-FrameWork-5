package com.example.springframework5.services;

import com.example.springframework5.model.Vet;

import java.util.Set;

public interface VetService {

    Vet finddById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
