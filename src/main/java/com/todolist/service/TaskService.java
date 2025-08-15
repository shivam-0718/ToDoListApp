package com.todolist.service;

import com.todolist.model.Task;
import com.todolist.repo.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService implements ITaskService {

    private final TaskRepository taskRepo;

    @Autowired
    public TaskService(TaskRepository taskRepo) {
        this.taskRepo = taskRepo;
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepo.findAll();
    }
}
