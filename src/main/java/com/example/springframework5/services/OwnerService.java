package com.example.springframework5.services;

import com.example.springframework5.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

}
