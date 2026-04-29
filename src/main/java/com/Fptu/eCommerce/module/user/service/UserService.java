package com.Fptu.eCommerce.module.user.service;

import com.Fptu.eCommerce.module.user.dto.UserDTO;
import com.Fptu.eCommerce.module.user.entity.UserEntity;
import com.Fptu.eCommerce.module.user.mapping.UserMapper;
import com.Fptu.eCommerce.module.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private UserMapper userMapper;
    private UserRepository userRepository;


    public List<UserDTO> finByName(String name) {
        List<UserDTO> result = new ArrayList<>();
        List<UserEntity> entities = userRepository.findByName(name);
        result = userMapper.toDTOList(entities);
        return result;
    }

    public void creat(UserDTO userDTO) {
        userRepository.creat(userDTO);
    }

    public boolean delete(UserDTO userDTO) {
        return userRepository.delete(userDTO);
    }

    public void update(UserDTO userDTO) {
        userRepository.update(userDTO);
    }
}
