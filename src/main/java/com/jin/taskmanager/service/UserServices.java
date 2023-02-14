package com.jin.taskmanager.service;

import com.jin.taskmanager.model.User;
import com.jin.taskmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserServices {

    private final UserRepository userRepository;

    @Autowired
    public UserServices(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public void addUser(@RequestBody User user){
        userRepository.save(user);
    }

    public void deleteUser(Long id){
        boolean exists = userRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException("User "+id+" does not exists");
        }
        userRepository.deleteById(id);
    }

    public void updateUser(Long id, User user){
        // in progress
    }

}
