package Aptechph.com.Task.Management.services;

import Aptechph.com.Task.Management.models.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {
    Task createTask(Task task);
    List<Task> getAll();
    Task getSingleTask(Long id);
    String deleteTask(Long id);
    Task updateTask(Task task, Long id);
}
