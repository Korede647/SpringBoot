package Korede.com.example.demo.repository;

import Korede.com.example.demo.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    List<Department> findByName(String name);
}
