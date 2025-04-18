package Aptechph.com.Task.Management.repository;

import Aptechph.com.Task.Management.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
