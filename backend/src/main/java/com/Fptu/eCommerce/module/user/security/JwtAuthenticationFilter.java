package com.Fptu.eCommerce.module.user.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

/**
 * 4. JwtAuthenticationFilter (Trạm kiểm soát vé)
 * Mỗi khi có một Request từ Frontend gửi lên Backend (để lấy danh sách sản phẩm, tạo đơn hàng...)
 * Nó BẮT BUỘC phải đi qua cái Filter (Trạm kiểm soát) này trước khi tới được Controller.
 */
@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final JwtTokenProvider tokenProvider;
    private final CustomUserDetailsService customUserDetailsService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        try {
            // 1. Lấy Token từ Request (nằm ở Header)
            String jwt = getJwtFromRequest(request);

            // 2. Nếu có Token và Token đó hợp lệ
            if (StringUtils.hasText(jwt) && tokenProvider.validateToken(jwt)) {
                
                // Lấy username từ Token
                String username = tokenProvider.getUsernameFromJWT(jwt);

                // Dùng username đó vào Database để lấy đầy đủ thông tin UserDetails
                UserDetails userDetails = customUserDetailsService.loadUserByUsername(username);

                // Tạo đối tượng Authentication (Chứng minh là ông này đã hợp lệ)
                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
                        userDetails, null, userDetails.getAuthorities());
                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                // Lưu thông tin ông này vào SecurityContext (Bộ nhớ bảo mật của Spring)
                // Từ giờ các tầng Controller/Service sẽ biết là ai đang thao tác
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
        } catch (Exception ex) {
            logger.error("Không thể thiết lập xác thực người dùng trong Security Context", ex);
        }

        // Cho phép Request đi tiếp tới Controller
        filterChain.doFilter(request, response);
    }

    /**
     * Hàm phụ: Tách chữ "Bearer " ra khỏi chuỗi Token gửi lên
     * Frontend thường gửi dạng: Authorization: Bearer eyJhbGciOiJIUz...
     */
    private String getJwtFromRequest(HttpServletRequest request) {
        String bearerToken = request.getHeader("Authorization");
        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7); // Cắt bỏ 7 ký tự "Bearer "
        }
        return null;
    }
}
