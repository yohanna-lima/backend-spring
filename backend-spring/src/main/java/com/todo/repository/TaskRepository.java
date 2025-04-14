package com.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}