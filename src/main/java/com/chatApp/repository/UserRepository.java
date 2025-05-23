package com.chatApp.repository;
import com.chatApp.model.User;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;

@Table(name = "users")
public interface UserRepository extends JpaRepository<User, String> {
    
}
