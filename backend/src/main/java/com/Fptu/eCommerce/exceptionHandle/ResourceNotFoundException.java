package com.Fptu.eCommerce.exceptionHandle;

/**
 * Concept 2: Custom Exception
 * Đây là một lỗi tự định nghĩa. Trong quá trình viết code (ở Service), 
 * nếu bạn tìm không thấy dữ liệu trong Database, bạn sẽ dùng lệnh:
 * throw new ResourceNotFoundException("Không tìm thấy user id = " + id);
 */
public class ResourceNotFoundException extends RuntimeException {
    
    public ResourceNotFoundException(String message) {
        // Truyền câu thông báo lỗi lên lớp cha RuntimeException
        super(message);
    }
}
