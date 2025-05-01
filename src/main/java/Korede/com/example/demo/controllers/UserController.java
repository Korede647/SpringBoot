package Korede.com.example.demo.controllers;

import Korede.com.example.demo.dto.RegisterResponseDTO;
import Korede.com.example.demo.dto.RegisterUserDTO;
import Korede.com.example.demo.models.User;
import Korede.com.example.demo.services.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import io.swagger.v3.oas.annotations.tags.*;

@Tag(name="Auth")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/students")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<?> createUser(@Valid @RequestBody RegisterUserDTO registerUserDTO, BindingResult result){
        RegisterResponseDTO responseUser = userService.createUser(registerUserDTO);
        if (result.hasErrors()) {
            List<String> errors = result.getFieldErrors().stream().map(error-> error.getField() + ": " + error.getDefaultMessage()).collect(Collectors.toList());
                    return new ResponseEntity<>(Map.of("errors", errors), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(responseUser, HttpStatus.CREATED);
    }
}
