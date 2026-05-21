package com.Fptu.eCommerce.module.payment.service.imp;

import com.Fptu.eCommerce.module.payment.dto.PaymentRequestDto;
import com.Fptu.eCommerce.module.payment.dto.PaymentResponseDto;
import com.Fptu.eCommerce.module.payment.service.IPaymentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService implements IPaymentService {
    @Override
    public List<PaymentResponseDto> getAll() {
        return List.of();
    }

    @Override
    public PaymentResponseDto getById(Long id) {
        return null;
    }

    @Override
    public PaymentResponseDto create(PaymentRequestDto requestDto) {
        return null;
    }

    @Override
    public PaymentResponseDto update(Long id, PaymentRequestDto requestDto) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }
}
