package com.jin.taskmanager.repository;

import com.jin.taskmanager.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
