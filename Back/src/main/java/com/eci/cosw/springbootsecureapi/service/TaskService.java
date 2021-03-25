package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Task;

import java.util.List;

public interface TaskService {

    public List<Task> getTasks();
    public void createTask(Task task);
}
