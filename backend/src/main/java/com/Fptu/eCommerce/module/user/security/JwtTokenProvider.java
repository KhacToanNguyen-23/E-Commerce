package com.Fptu.eCommerce.module.user.security;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

/**
 * 3. JwtTokenProvider (Máy chế tạo và kiểm tra Token)
 * Class này đảm nhận 2 việc:
 * 1. Khi user login thành công -> Tạo ra 1 chuỗi JWT.
 * 2. Khi user gửi request có chứa Token -> Kiểm tra xem Token có hợp lệ/hết hạn chưa.
 */
@Component
public class JwtTokenProvider {

    // Chìa khóa bí mật dùng để mã hóa và giải mã Token. (Thực tế nên để trong file application.properties)
    // Phải dài ít nhất 256-bit (32 ký tự)
    private final String JWT_SECRET = "KhacToanECommerceSecretKeyThatIsVeryLong123456";
    
    // Thời gian sống của Token (Ví dụ: 86400000 ms = 24 giờ)
    private final long JWT_EXPIRATION = 86400000L;

    private Key getSigningKey() {
        return Keys.hmacShaKeyFor(JWT_SECRET.getBytes());
    }

    /**
     * Hàm tạo ra chuỗi JWT từ thông tin của User
     */
    public String generateToken(Authentication authentication) {
        // Lấy thông tin user vừa đăng nhập
        UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();

        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + JWT_EXPIRATION);

        // Chế tạo chuỗi JWT
        return Jwts.builder()
                .setSubject(userPrincipal.getUsername()) // Lưu username vào token
                .setIssuedAt(now) // Thời gian tạo
                .setExpiration(expiryDate) // Thời gian hết hạn
                .signWith(getSigningKey(), SignatureAlgorithm.HS256) // Chữ ký bảo mật
                .compact();
    }

    /**
     * Hàm lấy username từ chuỗi JWT đã được giải mã
     */
    public String getUsernameFromJWT(String token) {
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(getSigningKey())
                .build()
                .parseClaimsJws(token)
                .getBody();

        return claims.getSubject();
    }

    /**
     * Hàm kiểm tra xem JWT có hợp lệ không (có bị sửa đổi, hết hạn không)
     */
    public boolean validateToken(String authToken) {
        try {
            Jwts.parserBuilder().setSigningKey(getSigningKey()).build().parseClaimsJws(authToken);
            return true;
        } catch (MalformedJwtException ex) {
            System.out.println("Token không đúng định dạng");
        } catch (ExpiredJwtException ex) {
            System.out.println("Token đã hết hạn");
        } catch (UnsupportedJwtException ex) {
            System.out.println("Token không được hỗ trợ");
        } catch (IllegalArgumentException ex) {
            System.out.println("Chuỗi Token trống");
        }
        return false;
    }
}
