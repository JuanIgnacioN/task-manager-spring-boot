package com.jin.taskmanager.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "USER_")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String mail;

    public User(){}

    public User(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

}
