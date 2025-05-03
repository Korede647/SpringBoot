package Korede.com.example.demo.services;

import Korede.com.example.demo.dto.RegisterUserDTO;
import Korede.com.example.demo.dto.RegisterResponseDTO;
import Korede.com.example.demo.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
   RegisterResponseDTO createUser(RegisterUserDTO registerUserDTO);
   List<User> getAllUsers();
   User getAUser(Long id);
   String deleteUser(Long id);
   User updateUser(User user, Long id);
}
