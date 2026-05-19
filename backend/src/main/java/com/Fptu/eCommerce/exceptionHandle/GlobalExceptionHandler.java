package com.Fptu.eCommerce.exceptionHandle;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

/**
 * Concept 3: Global Exception Handler (@ControllerAdvice)
 * Đây là "Bảo vệ cổng" của toàn bộ dự án. Bất cứ lỗi (Exception) nào văng ra 
 * từ Controller hoặc Service đều sẽ bị class này "bắt" lại.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * @ExceptionHandler chỉ định rằng hàm này sẽ xử lý lỗi ResourceNotFoundException.
     * Bất cứ khi nào mã ném ra ResourceNotFoundException, hàm này sẽ chạy.
     */
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFoundException(
            ResourceNotFoundException ex, 
            HttpServletRequest request) {
        
        // Tạo một object phản hồi lỗi theo chuẩn của mình
        ErrorResponse errorResponse = new ErrorResponse(
                LocalDateTime.now(),
                HttpStatus.NOT_FOUND.value(), // Lỗi 404
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                ex.getMessage(), // Lấy câu thông báo từ Exception truyền vào
                request.getRequestURI() // Lấy URL gây ra lỗi
        );

        // Trả về cho Frontend với status 404 (Not Found)
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    /**
     * Hàm này để gom toàn bộ các lỗi không lường trước được (Ví dụ: Lỗi chia cho 0, NullPointer...)
     * Tất cả các lỗi chưa được định nghĩa cụ thể sẽ rơi vào Exception.class (Lớp cha của mọi lỗi)
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGlobalException(
            Exception ex, 
            HttpServletRequest request) {
        
        ErrorResponse errorResponse = new ErrorResponse(
                LocalDateTime.now(),
                HttpStatus.INTERNAL_SERVER_ERROR.value(), // Lỗi 500
                HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),
                "Lỗi hệ thống không xác định: " + ex.getMessage(),
                request.getRequestURI()
        );

        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
