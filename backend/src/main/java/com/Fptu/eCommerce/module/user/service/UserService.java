package com.Fptu.eCommerce.module.user.service;

import com.Fptu.eCommerce.module.user.dto.UserResponseDto;
import com.Fptu.eCommerce.module.user.mapping.UserMapper;
import com.Fptu.eCommerce.module.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public List<UserResponseDto> findByName(String username) {
        return userMapper.toDTOList(userRepository.findByUsernameContainingIgnoreCase(username));
    }



    @Transactional
    public void delete(Long id) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("User not found with id: " + id);
        }
        userRepository.deleteById(id);
    }



    public List<UserResponseDto> findAll() {
        return userMapper.toDTOList(userRepository.findAll());
    }


}
