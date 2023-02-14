package com.jin.taskmanager.controller;

import com.jin.taskmanager.model.Person;
import com.jin.taskmanager.service.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/person")
public class PersonController {

    private final PersonServices personServices;

    @Autowired
    public PersonController(PersonServices personServices){
        this.personServices = personServices;
    }

    @GetMapping
    public List<Person> getPersons(){
        return personServices.getPersons();
    }

    @PostMapping
    public void addPerson(@RequestBody Person person){
        personServices.addPerson(person);
    }

    @DeleteMapping(path = "{personId}")
    public void deletePerson(@PathVariable("personId") Long id){
        personServices.deletePerson(id);
    }

    @PutMapping(path = "{personId}")
    public void updatePerson(
            @PathVariable("personId") Long id,
            @RequestParam(required = false) Person person
    ){
        personServices.updatePerson(id, person);
    }


}
