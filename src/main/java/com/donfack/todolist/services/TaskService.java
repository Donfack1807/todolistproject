package com.donfack.todolist.services;

import com.donfack.todolist.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TaskService {

    List<Task> taskList = new ArrayList<>(Arrays.asList(new Task(1, "danse", "danse pour les enfants malades"), new Task(2, "course", "danse pour les enfants malades")));

    public List<Task> getTasks(){
       return taskList;
    }

    public Task getTaskByName(String name){
        return taskList.stream()
                .filter(t -> t.getName().equals(name))
                .findFirst().orElse(new Task());
    }

    public Task getTaskById(int id){
        return taskList.stream()
                .filter(t -> t.getId() ==id)
                .findFirst().orElse(new Task());
    }

    public void addTask(Task t) {
        System.out.println(t.toString());
        taskList.add(t);
    }

    public void updateTask(Task task) {
        Task remTask =taskList.stream()
                .filter(t -> t.getId() == task.getId())
                .findFirst().orElse(new Task());
        taskList.remove(remTask);
        taskList.add(task);
        System.out.println(task.toString());
    }

    public void deleteTask(Task t) {
        taskList.remove(t);
    }
}
