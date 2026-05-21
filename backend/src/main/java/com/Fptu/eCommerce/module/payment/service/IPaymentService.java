package com.Fptu.eCommerce.module.payment.service;

import com.Fptu.eCommerce.module.payment.dto.PaymentRequestDto;
import com.Fptu.eCommerce.module.payment.dto.PaymentResponseDto;
import java.util.List;

public interface IPaymentService {
    List<PaymentResponseDto> getAll();

    PaymentResponseDto getById(Long id);

    PaymentResponseDto create(PaymentRequestDto requestDto);

    PaymentResponseDto update(Long id, PaymentRequestDto requestDto);

    void delete(Long id);
}
