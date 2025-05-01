package Korede.com.example.demo.repository;

import Korede.com.example.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
     boolean existsByEmail(String email);
}
