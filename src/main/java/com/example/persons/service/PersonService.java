package com.example.persons.service;

import com.example.persons.model.Person;
import com.example.persons.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired //solo se pueden inyectar componentes de springboot (@Service, @Repositories, @component)
    private IPersonRepository iPersonRepository;

    /**
     * no se puede crear una persona repetida por id.
     * @param person
     */
    public void create(Person person) {
        boolean personFound = iPersonRepository.existsById(person.getId());

        if (personFound) {
            throw new RuntimeException("ya existe");
        }

        iPersonRepository.save(person);
    }

    public Person find(String id) {
        return iPersonRepository.findById(id).orElse(null);
    }

    public Iterable<Person> getAll() {
        return iPersonRepository.findAll();
    }
}
