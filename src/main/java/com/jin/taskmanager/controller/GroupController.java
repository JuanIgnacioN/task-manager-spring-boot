package com.jin.taskmanager.controller;

import com.jin.taskmanager.model.Group;
import com.jin.taskmanager.service.GroupServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path="api/group")
public class GroupController {

    private final GroupServices groupServices;

    @Autowired
    public GroupController(GroupServices groupServices){
        this.groupServices = groupServices;
    }

    @GetMapping
    public List<Group> getGroups(){
        return groupServices.getGroups();
    }

    @PostMapping
    public void addGroup(@RequestBody Group group){
        groupServices.addGroup(group);
    }

    @DeleteMapping(path="{groupId}")
    public void deleteGroup(@PathVariable("groupId") Long id){
        groupServices.deleteGroup(id);
    }

    @PutMapping(path = "{groupId}")
    public void updateGroup(
            @PathVariable("groupId") Long id,
            @RequestParam(required = true) Group group
    ){
        groupServices.updateGroup(id, group);
    }



}
