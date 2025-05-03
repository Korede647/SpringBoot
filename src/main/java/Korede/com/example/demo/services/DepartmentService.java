package Korede.com.example.demo.services;

import Korede.com.example.demo.dto.DepartmentDTO;
import Korede.com.example.demo.dto.DepartmentResponseDTO;
import Korede.com.example.demo.models.Department;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DepartmentService {
    List<DepartmentResponseDTO> getAllDepartments();
    Optional<Department> getDepartmentById(Long id);
    DepartmentResponseDTO createDepartment(DepartmentDTO departmentDTO);
    DepartmentResponseDTO updateDepartment(Long id, DepartmentDTO departmentDTO);
    String deleteDepartment(Long id);
    List<DepartmentResponseDTO> searchDepartment(String name);
}
