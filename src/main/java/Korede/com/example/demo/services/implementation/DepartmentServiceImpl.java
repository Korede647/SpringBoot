package Korede.com.example.demo.services.implementation;

import Korede.com.example.demo.dto.DepartmentDTO;
import Korede.com.example.demo.dto.DepartmentResponseDTO;
import Korede.com.example.demo.models.Department;
import Korede.com.example.demo.repository.DepartmentRepository;
import Korede.com.example.demo.services.DepartmentService;

import java.util.List;
import java.util.Optional;
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
    public Optional<Department> getDepartmentById(Long id) {
        return departmentRepository.findById(id);
    }

    @Override
    public DepartmentResponseDTO createDepartment(DepartmentDTO departmentDTO) {
        if(departmentRepository.existsByName(departmentDTO.getName())){
            throw new RuntimeException("Department " + departmentDTO.getName() + " already exists");
        }
        Department department = new Department();
        department.setName(departmentDTO.getName());
        department.setDescription(departmentDTO.getDescription());
        Department savedRecord = departmentRepository.save(department);
        return new DepartmentResponseDTO(savedRecord.getId(), savedRecord.getName(), savedRecord.getDescription());
    }

    @Override
    public DepartmentResponseDTO updateDepartment(Long id, DepartmentDTO departmentDTO) {
        return null;
    }

    @Override
    public String deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
        String message = "Department deleted successfully";
        return message;
    }

    @Override
    public List<DepartmentResponseDTO> searchDepartment(String name) {
       return departmentRepository.findByName(name).stream()
                .map(department -> new DepartmentResponseDTO(department.getId(), department.getName(), department.getDescription()))
                .collect(Collectors.toList());
    }
}
