package com.petcaremanager.animal.app.rest.query;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalEntrypoint {

    @GetMapping
    public String getAnimal(){
        return "Olá Mundo Animal!";
    }

}
