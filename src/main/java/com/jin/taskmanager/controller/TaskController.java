package com.jin.taskmanager.controller;

import com.jin.taskmanager.model.Task;
import com.jin.taskmanager.service.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path="api/task")
public class TaskController {

    private final TaskServices taskServices;

    @Autowired
    public TaskController(TaskServices taskServices) {
        this.taskServices = taskServices;
    }

    @GetMapping
    public List<Task> getTasks(){
        return taskServices.getTasks();
    }

    @PostMapping
    public void addTask(@RequestBody Task task){
        taskServices.addTask(task);
    }

    @DeleteMapping(path="{taskId}")
    public void deleteTask(@PathVariable("taskId") Long id){
        taskServices.deleteTask(id);
    }

    @PutMapping(path="{taskId}")
    public void updateTask(
            @PathVariable("taskId") long id,
            @RequestParam(required = true) Task task
            ){
        taskServices.updateTask(id, task);
    }

}
