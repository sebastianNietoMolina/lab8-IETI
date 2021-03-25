package com.eci.cosw.springbootsecureapi.model;

public class Task {

    public String description;
    public String name;
    public String status;
    public String dueDate;
    public String email;

    public Task(){}

    public Task(String description, String name, String state, String date, String email) {
        this.description = description;
        this.name = name;
        this.status = state;
        this.dueDate = date;
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return status;
    }

    public void setState(String state) {
        this.status = state;
    }

    public String getDate() {
        return dueDate;
    }

    public void setDate(String date) {
        this.dueDate = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return "{\"description\":"+description+", \"name\":"+name+", \"email\":"+email+"," +
                "\"status\":"+status+", \"dueDate\":"+dueDate+"}";
    }
}
