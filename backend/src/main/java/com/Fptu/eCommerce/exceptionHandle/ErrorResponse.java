package com.Fptu.eCommerce.exceptionHandle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Concept 1: Error Response Object
 * Đây là khung xương chuẩn mực mà Frontend sẽ nhận được mỗi khi có lỗi xảy ra.
 * Thay vì trả về lỗi mặc định lộn xộn của Spring Boot, ta sẽ luôn trả về format này.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    
    // Thời điểm xảy ra lỗi (giúp trace bug dễ hơn)
    private LocalDateTime timestamp;
    
    // Mã trạng thái HTTP (VD: 400, 404, 500)
    private int status;
    
    // Tên của lỗi (VD: "Not Found", "Bad Request")
    private String error;
    
    // Lời nhắn chi tiết về lỗi (VD: "Không tìm thấy sản phẩm có id = 5")
    private String message;
    
    // Đường dẫn API gây ra lỗi (VD: "/api/products/5")
    private String path;
}
