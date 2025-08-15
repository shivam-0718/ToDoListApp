package com.todolist.service;

import com.todolist.model.Task;

import java.util.List;

public interface ITaskService {
    List<Task> getAllTasks();
    void createTask(String title);
    void deleteTask(Long id);
    void toggleTask(Long id);
}
