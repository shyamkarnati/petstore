package com.example.pets.controller;

import com.example.pets.model.Pet;
import com.example.pets.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class PetController {
    private final Logger logger = Logger.getLogger(PetController.class.getName());
    private final PetService petService;

    @Autowired
    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping("/petstore/pets")
    public List<Pet> getPets() {
        logger.log(Level.INFO, "Getting all pets");
        return petService.getAllPets();
    }

    @GetMapping("/petstore/pets/{id}")
    public Pet getPet(@PathVariable Long id) {
        logger.log(Level.INFO, "Getting pet with id: " + id);
        return petService.getPet(id);
    }

    @PostMapping("/petstore/pets")
    public void addPet(@RequestBody Pet pet) {
        logger.log(Level.INFO, "Adding pet: " + pet);
        petService.savePet(pet);
    }

    @DeleteMapping("/petstore/pets/{id}")
    public void deletePet(@PathVariable Long id) {
        logger.log(Level.INFO, "Deleting pet with id: " + id);
        petService.deletePet(id);
    }
}

