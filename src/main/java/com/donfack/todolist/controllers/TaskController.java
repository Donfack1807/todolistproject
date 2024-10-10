package com.donfack.todolist.controllers;

import com.donfack.todolist.model.Task;
import com.donfack.todolist.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    TaskService ts;

    @GetMapping("/tasks")
    public List<Task> getTasks(){
        return ts.getTasks() ;
    }

    @GetMapping("/tasks/{name}")
    public Task getTaskByName(@PathVariable String name){
        return ts.getTaskByName(name) ;
    }

    @GetMapping("/tasks/{id}")
    public Task getTaskById(@PathVariable int id){
        return ts.getTaskById(id) ;
    }

    @PostMapping("/task")
    public void addTask(@RequestBody Task t){
        ts.addTask(t);
    }

    @PutMapping("/task")
    public void updateTask(@RequestBody Task t){
        ts.updateTask(t);
    }

    @DeleteMapping("/task")
    public void deleteTask(@RequestBody Task t){
        ts.deleteTask(t);
    }

}
