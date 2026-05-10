package com.Fptu.eCommerce.module.user.service;

import com.Fptu.eCommerce.module.user.dto.UserRequestDto;
import com.Fptu.eCommerce.module.user.dto.UserResponseDto;
import com.Fptu.eCommerce.module.user.entity.UserEntity;

import com.Fptu.eCommerce.module.user.mapping.UserMapper;
import com.Fptu.eCommerce.module.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;

    private UserEntity entity;


    public List<UserResponseDto> findByName(String username) {
        List<UserEntity> userEntities =userRepository.findByUsername(username);
        return userMapper.toDTOList(userEntities);
    }



    @Transactional
    public void delete(Long id) {
        if(!userRepository.existsById(Math.toIntExact(id))){
            throw new RuntimeException("User not found with id: " + id);
        }
        userRepository.deleteById(id);
    }



















}
