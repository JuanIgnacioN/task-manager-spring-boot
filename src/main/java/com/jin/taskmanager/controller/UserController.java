package com.jin.taskmanager.controller;

import com.jin.taskmanager.model.User;
import com.jin.taskmanager.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path="/api/user")
public class UserController {

    private final UserServices userServices;

    @Autowired
    public UserController(UserServices userServices){
        this.userServices = userServices;
    }

    @GetMapping
    public List<User> getUsers(){
        return userServices.getUsers();
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userServices.addUser(user);
    }

    @DeleteMapping(path = "{userId}")
    public void deleteUser(@PathVariable("userId") Long id){
        userServices.deleteUser(id);
    }

    @PutMapping(path = "{userId}")
    public void updateUser(
            @PathVariable("userId") Long id,
            @RequestParam(required = false) User user
    ){
        userServices.updateUser(id, user);
    }


}
