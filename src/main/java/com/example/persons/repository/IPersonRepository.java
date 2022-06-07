package com.example.persons.repository;

import com.example.persons.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //es de spring-boot, reconoce que esta clase es una clase repositorio
public interface IPersonRepository extends CrudRepository<Person, String> {
}
