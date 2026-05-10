package com.Fptu.eCommerce.module.user.repository;

import com.Fptu.eCommerce.module.user.dto.UserRequestDto;
import com.Fptu.eCommerce.module.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
    List<UserEntity> findByUsername(String username);
    void deleteById(Long id);
}
