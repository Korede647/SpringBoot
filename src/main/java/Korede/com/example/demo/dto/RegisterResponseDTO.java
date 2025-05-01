package Korede.com.example.demo.dto;

import lombok.*;

@Data
@NoArgsConstructor
public class RegisterResponseDTO {
    private String message;
    private Long StudentId;

    public RegisterResponseDTO(String message, Long studentId) {
        this.message = message;
        StudentId = studentId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getStudentId() {
        return StudentId;
    }

    public void setStudentId(Long studentId) {
        StudentId = studentId;
    }
}
