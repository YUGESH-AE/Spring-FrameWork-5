package com.example.springframework5.services;

import com.example.springframework5.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner finddById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
