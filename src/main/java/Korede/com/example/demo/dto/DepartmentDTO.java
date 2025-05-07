package Korede.com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;

public class DepartmentDTO {
    @NotBlank (message = "Department name cannot be empty")
    private String name;
    @NotBlank (message = "Description cannot be empty")
    private String description;

    public DepartmentDTO(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
