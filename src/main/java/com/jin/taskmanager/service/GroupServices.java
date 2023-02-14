package com.jin.taskmanager.service;

import com.jin.taskmanager.model.Group;
import com.jin.taskmanager.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class GroupServices {

    private final GroupRepository groupRepository;

    @Autowired
    public GroupServices(GroupRepository groupRepository){
        this.groupRepository = groupRepository;
    }

    public List<Group> getGroups(){
        return groupRepository.findAll();
    }

    public void addGroup(@RequestBody Group group){
        groupRepository.save(group);
    }

    public void deleteGroup(Long id){
        boolean exists = groupRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException("Group "+id+" does not exists");
        }
        groupRepository.deleteById(id);
    }

    public void updateGroup(Long id, Group group){
        //in progress
    }

}
