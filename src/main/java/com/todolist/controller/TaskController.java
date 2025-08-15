package com.todolist.controller;

import com.todolist.model.Task;
import com.todolist.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("v1")
public class TaskController {

    private final ITaskService service;

    @Autowired
    public TaskController(ITaskService service) {
        this.service = service;
    }

    @GetMapping("tasks")
    public String getTasks(Model model) {
        List<Task> tasks = service.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }
}
