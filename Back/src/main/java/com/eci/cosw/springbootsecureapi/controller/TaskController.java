package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.model.Task;
import com.eci.cosw.springbootsecureapi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping( "api" )
public class TaskController {

    @Autowired
    TaskService taskService;

    @RequestMapping( value = "/alltasks", method = RequestMethod.GET )
    public List<Task> getTasks(){
        System.out.println("llegue al get tasks");
        return taskService.getTasks();
    }

    @RequestMapping( value = "/create", method = RequestMethod.POST )
    public void createTask(@RequestBody Task task){
        System.out.println("llegue pa crear las tareas");
        taskService.createTask(task);
    }

}
