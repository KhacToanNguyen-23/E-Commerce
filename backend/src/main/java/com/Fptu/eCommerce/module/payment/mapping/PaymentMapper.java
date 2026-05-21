package com.Fptu.eCommerce.module.payment.mapping;

import com.Fptu.eCommerce.module.payment.dto.PaymentRequestDto;
import com.Fptu.eCommerce.module.payment.dto.PaymentResponseDto;
import com.Fptu.eCommerce.module.payment.entity.PaymentEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PaymentMapper {
    PaymentResponseDto toDTO(PaymentEntity entity);

    PaymentEntity toEntity(PaymentResponseDto dto);

    PaymentEntity toEntity(PaymentRequestDto dto);

    List<PaymentResponseDto> toDTOList(List<PaymentEntity> entities);
}
