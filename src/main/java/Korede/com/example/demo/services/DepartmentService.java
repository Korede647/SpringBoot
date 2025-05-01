package Korede.com.example.demo.services;

import Korede.com.example.demo.dto.DepartmentDTO;
import Korede.com.example.demo.dto.DepartmentResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    List<DepartmentResponseDTO> getAllDepartments();
    DepartmentResponseDTO getDepartmentById(Long id);
    DepartmentResponseDTO createDepartment(DepartmentDTO departmentDTO);
    DepartmentResponseDTO updateDepartment(Long id, DepartmentDTO departmentDTO);
    void deleteDepartment(Long id);
    List<DepartmentResponseDTO> searchDepartment(String name);
}
