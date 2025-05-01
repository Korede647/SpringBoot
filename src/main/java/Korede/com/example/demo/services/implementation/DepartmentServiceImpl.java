package Korede.com.example.demo.services.implementation;

import Korede.com.example.demo.dto.DepartmentDTO;
import Korede.com.example.demo.dto.DepartmentResponseDTO;
import Korede.com.example.demo.repository.DepartmentRepository;
import Korede.com.example.demo.services.DepartmentService;

import java.util.List;
import java.util.stream.Collectors;


public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public List<DepartmentResponseDTO> getAllDepartments() {
        return departmentRepository.findAll().stream()
                .map(department -> new DepartmentResponseDTO(department.getId(), department.getName(), department.getDescription()))
                .collect(Collectors.toList());
    }

    @Override
    public DepartmentResponseDTO getDepartmentById(Long id) {
        return null;
    }

    @Override
    public DepartmentResponseDTO createDepartment(DepartmentDTO departmentDTO) {
        return null;
    }

    @Override
    public DepartmentResponseDTO updateDepartment(Long id, DepartmentDTO departmentDTO) {
        return null;
    }

    @Override
    public void deleteDepartment(Long id) {

    }

    @Override
    public List<DepartmentResponseDTO> searchDepartment(String name) {
        return List.of();
    }
}
