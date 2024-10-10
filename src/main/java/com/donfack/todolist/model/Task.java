package com.donfack.todolist.model;

import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class Task {
    private int id;
    private String name;
    private String description;
    private boolean status;
    private Date creationDate;
    private Date executionDate;

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", creationDate=" + creationDate +
                ", executionDate=" + executionDate +
                '}';
    }

    public Task(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    public Task() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(Date executionDate) {
        this.executionDate = executionDate;
    }
}
