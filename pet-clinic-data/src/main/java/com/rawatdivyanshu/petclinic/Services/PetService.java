package com.rawatdivyanshu.petclinic.Services;

import com.rawatdivyanshu.petclinic.Models.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
