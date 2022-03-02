package com.example.pets.service;

import com.example.pets.model.Pet;
import com.example.pets.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {
    private final PetRepository petRepository;

    @Autowired
    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public void deletePet(Long id) {
        petRepository.deleteById(id);
    }

    public void savePet(Pet pet) {
        petRepository.save(pet);
    }

    public Pet getPet(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }
}
