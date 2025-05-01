package Korede.com.example.demo.services.implementation;

import Korede.com.example.demo.dto.RegisterUserDTO;
import Korede.com.example.demo.dto.RegisterResponseDTO;
import Korede.com.example.demo.models.User;
import Korede.com.example.demo.repository.UserRepository;
import Korede.com.example.demo.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
     this.userRepository = userRepository;
    }

    @Override
    public RegisterResponseDTO createUser(RegisterUserDTO registerUser) {
        if (userRepository.existsByEmail(registerUser.getEmail())){
            throw new RuntimeException ("User with email "+ registerUser.getEmail() + "already exists");
        }
        User user = new User();
        user.setFirstName(registerUser.getFirstName());
        user.setLastName(registerUser.getLastName());
        user.setEmail(registerUser.getEmail());
        user.setPassword(registerUser.getPassword());
        User savedRecord = userRepository.save(user);
        return new RegisterResponseDTO("Registration is Successful", savedRecord.getId());
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getAUser(Long id) {
        return null;
    }

    @Override
    public String deleteUser(Long id) {
        return "";
    }

    @Override
    public User updateUser(User user, Long id) {
        return null;
    }
}
