package com.example.springframework5.services;

import com.example.springframework5.model.Pet;

import java.util.Set;

public interface PetService {

    Pet finddById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
