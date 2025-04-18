package Aptechph.com.Task.Management.services.impl;

import Aptechph.com.Task.Management.models.Task;
import Aptechph.com.Task.Management.repository.TaskRepository;
import Aptechph.com.Task.Management.services.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task getSingleTask(Long id) {
        return null;
    }

    @Override
    public String deleteTask(Long id) {
        return "";
    }

    @Override
    public Task updateTask(Task task, Long id) {
        return null;
    }
}
