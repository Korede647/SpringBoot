package Korede.com.example.demo.controllers;

import Korede.com.example.demo.dto.DepartmentDTO;
import Korede.com.example.demo.dto.DepartmentResponseDTO;
import Korede.com.example.demo.models.Department;
import Korede.com.example.demo.repository.DepartmentRepository;
import Korede.com.example.demo.services.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentController {
    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public ResponseEntity<?> createUser (@Valid @RequestBody DepartmentDTO departmentDTO, BindingResult result){
        DepartmentResponseDTO departmentResponseDTO = departmentService.createDepartment(departmentDTO);
        if(result.hasErrors()){
            List<String> errors = result.getFieldErrors().stream().map(error -> error.getField() + ": " + error.getDefaultMessage()).collect(Collectors.toList());
            return new ResponseEntity<>(Map.of("errors", errors), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(departmentResponseDTO, HttpStatus.CREATED);
    }

    @GetMapping
    public DepartmentResponseDTO getAllDepartments(){
        return new DepartmentResponseDTO();
    }

    @GetMapping
    public Long getDepartmentById (long id){
        Department department = new Department();
        if(department.getId().equals(id)){
            return new DepartmentResponseDTO().getId();
        }
        return null;
    }
}
