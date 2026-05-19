package com.Fptu.eCommerce.configuration;

import com.Fptu.eCommerce.module.user.security.JwtAuthenticationFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * 5. WebSecurityConfig (Cấu hình tổng cục Bảo Mật)
 * Nơi quy định luật lệ: Ai được vào API nào, API nào bị cấm, v.v.
 */
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfig {

    private final JwtAuthenticationFilter jwtAuthenticationFilter;

    /**
     * Cấu hình mã hóa mật khẩu (Không bao giờ lưu pass text trắng vào DB)
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * Bean này dùng để thực hiện việc Đăng nhập (AuthenticationManager)
     */
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
        return authConfig.getAuthenticationManager();
    }

    /**
     * Dòng luật chính của hệ thống
     */
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .cors().and().csrf().disable() // Tắt bảo mật CSRF (vì mình dùng JWT rồi)
            
            // Cấu hình không sử dụng Session lưu trạng thái (vì REST API là Stateless)
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
            
            // Quy định đường dẫn API
            .authorizeHttpRequests(auth -> auth
                // Những API cho phép vào tự do không cần Token (như Đăng nhập, Đăng ký)
                .requestMatchers("/api/auth/**").permitAll()
                // Những API xem sản phẩm, xem danh mục ai cũng xem được
                .requestMatchers("/api/products/**", "/api/categories/**").permitAll()
                // API dành riêng cho ADMIN
                .requestMatchers("/api/admin/**").hasRole("ADMIN")
                // Tất cả các request còn lại đều bắt buộc phải có Token hợp lệ
                .anyRequest().authenticated()
            );

        // Đặt cái Filter (Trạm kiểm soát Token) của mình vào trước Filter mặc định của Spring
        http.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}
