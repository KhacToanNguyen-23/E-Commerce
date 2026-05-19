package com.Fptu.eCommerce.module.user.repository;

import com.Fptu.eCommerce.module.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    
    // Spring Security thường cần tìm user theo Username (hoặc email) để xác thực
    Optional<UserEntity> findByUsername(String username);
    
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}
