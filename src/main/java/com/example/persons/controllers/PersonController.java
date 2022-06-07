package com.example.persons.controllers;

import com.example.persons.model.Person;
import com.example.persons.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    /**
     * create
     * PATH: /persons
     * Method: POST
     * Params: Body
     * Returns Body (vacio)
     */
    //
    @PostMapping("/persons") //PATH y el METODO
    public void create(@RequestBody Person person) {
        personService.create(person);
    }

    /**
     * buscar
     * PATH: /persons/{id}
     * Method: GET
     * PAram: PAth
     * Return Person as JSON
     */
    @GetMapping("/persons/{idPErson}")
    public Person findById(@PathVariable("idPErson") String id) {
        return personService.find(id);
    }
}
