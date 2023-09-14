package com.example.springframework5.bootstrap;

import com.example.springframework5.model.Owner;
import com.example.springframework5.model.Vet;
import com.example.springframework5.services.OwnerService;
import com.example.springframework5.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();

        owner1.setFirstName("Ravi");
        owner1.setLastName("Kumar");

        ownerService.save(owner1);
        System.out.println("Loaded owner 1");

        Owner owner2 = new Owner();

        owner2.setFirstName("Suresh");
        owner2.setLastName("Kumar");

        ownerService.save(owner2);
        System.out.println("Loaded owner 2");


        Vet vet1 = new Vet();

        vet1.setFirstName("Sanjay");
        vet1.setLastName("Kumar");

        vetService.save(vet1);
        System.out.println("Loaded vet 1");

        Vet vet2 = new Vet();

        vet2.setFirstName("Ravi");
        vet2.setLastName("Shankar");

        vetService.save(vet2);
        System.out.println("Loaded vet 2");

    }
}
