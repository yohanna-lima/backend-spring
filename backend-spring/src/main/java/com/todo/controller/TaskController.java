package com.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.Task;
import com.todo.repository.TaskRepository;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired private TaskRepository repo;

    @GetMapping public List<Task> all() { return repo.findAll(); }

    @PostMapping public Task create(@RequestBody Task task) { return repo.save(task); }

    @PutMapping("/{id}") 
    public Task update(@PathVariable Long id, @RequestBody Task task) {
        task.setId(id);
        return repo.save(task);
    }

    @DeleteMapping("/{id}") 
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
