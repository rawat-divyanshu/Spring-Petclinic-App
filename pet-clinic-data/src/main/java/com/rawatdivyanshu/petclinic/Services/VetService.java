package com.rawatdivyanshu.petclinic.Services;

import com.rawatdivyanshu.petclinic.Models.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet pet);

    Set<Vet> findAll();
}
