package com.Fptu.eCommerce.module.user.mapping;

import com.Fptu.eCommerce.module.user.dto.UserDTO;
import com.Fptu.eCommerce.module.user.entity.UserEntity;
import com.Fptu.eCommerce.module.user.repository.UserRepository;
import com.Fptu.eCommerce.module.user.service.UserService;
import org.springframework.web.bind.annotation.Mapping;

import java.util.ArrayList;
import java.util.List;


public class UserMapper {

    private UserRepository userRepository;
    public List<UserDTO> toDTOList(List<UserEntity> entities) {
        List<UserDTO> result = new ArrayList<>();
        for (UserEntity entity : entities) {
            UserDTO  userDTO = new UserDTO();
            userDTO.setName(entity.getName());
            userDTO.setEmail(entity.getEmail());
            userDTO.setPhone(entity.getPhone());
            result.add(userDTO);
        }
        return result;
    }
}
