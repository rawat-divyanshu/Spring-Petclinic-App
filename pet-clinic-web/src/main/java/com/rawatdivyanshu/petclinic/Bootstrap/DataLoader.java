package com.rawatdivyanshu.petclinic.Bootstrap;

import com.rawatdivyanshu.petclinic.Models.Owner;
import com.rawatdivyanshu.petclinic.Models.Vet;
import com.rawatdivyanshu.petclinic.Services.OwnerService;
import com.rawatdivyanshu.petclinic.Services.VetService;
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
        owner1.setFirstName("Divyanshu");
        owner1.setLastName("Rawat");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Ritika");
        owner2.setLastName("Rawat");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Prithvi");
        vet1.setLastName("Giri");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Sanjay");
        vet2.setLastName("Sharma");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
