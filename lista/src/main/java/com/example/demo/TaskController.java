package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	
	private final List<Task> tasks = new ArrayList<Task>();
	
	@PostMapping("/task")
	public void addTask(@RequestBody Task task) {
		tasks.add(task);
	}
	
	@GetMapping("/tasks")
	public List<Task> getAllTasks() {
		return tasks;
	}
	
	@GetMapping("task/{id}")
	public Task getTaskById(@PathVariable Long id) {
        return tasks.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);

	}
	
	@DeleteMapping("task/{id}")
	public void deleteTaskById(@PathVariable Long id) {
        tasks.removeIf(t -> t.getId().equals(id));
    }
	
	
}
