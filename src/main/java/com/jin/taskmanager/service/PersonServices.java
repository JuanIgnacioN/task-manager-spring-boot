package com.jin.taskmanager.service;

import com.jin.taskmanager.model.Person;
import com.jin.taskmanager.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class PersonServices {

    private final PersonRepository personRepository;

    @Autowired
    public PersonServices(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public List<Person> getPerson(){
        return personRepository.findAll();
    }

    public void addPerson(@RequestBody Person person){
        personRepository.save(person);
    }

    public void deletePerson(Long id){
        boolean exists = personRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException("Person "+id+" does not exists");
        }
        personRepository.deleteById(id);
    }

    public void updatePerson(Person person){
        personRepository.save(person);
    }

}
