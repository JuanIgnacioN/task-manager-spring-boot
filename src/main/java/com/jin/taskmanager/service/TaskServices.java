package com.jin.taskmanager.service;

import com.jin.taskmanager.model.Task;
import com.jin.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TaskServices {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskServices(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public List<Task> getTasks(){
        return taskRepository.findAll();
    }

    public void addTask(@RequestBody Task task){
        taskRepository.save(task);
    }

    public void deleteTask(Long id){
        boolean exists = taskRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException("Task with id "+ id +" does not exits");
        }
        taskRepository.deleteById(id);
    }

    public void updateTask(Task task){
        // In progress
    }

}
