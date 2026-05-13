package com.Fptu.eCommerce.module.user.mapping;


import com.Fptu.eCommerce.module.user.dto.UserRequestDto;
import com.Fptu.eCommerce.module.user.dto.UserResponseDto;
import com.Fptu.eCommerce.module.user.entity.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {


    UserResponseDto toDTO(UserEntity entity);

    UserEntity toEntity(UserResponseDto dto);

    UserEntity toEntity(UserRequestDto dto);

    List<UserResponseDto> toDTOList(List<UserEntity> entities);
}