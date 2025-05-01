package Korede.com.example.demo.controllers;

import Korede.com.example.demo.dto.DepartmentResponseDTO;
import Korede.com.example.demo.services.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentController {
    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public DepartmentResponseDTO getAllDepartments(){
        return new DepartmentResponseDTO();
    }
}
