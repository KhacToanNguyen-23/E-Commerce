package com.Fptu.eCommerce.module.user.security;

import com.Fptu.eCommerce.module.user.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

/**
 * 1. UserPrincipal (Người dùng bảo mật)
 * Đây là class đại diện cho User trong hệ thống của Spring Security.
 * Spring Security không hiểu "UserEntity" của mình, nó chỉ hiểu "UserDetails".
 * Nên mình phải viết class này để "dịch" UserEntity thành UserDetails cho Spring nó hiểu.
 */
@Data
@AllArgsConstructor
public class UserPrincipal implements UserDetails {

    private Long id;
    private String username;
    private String password;
    // Chứa quyền của User (ví dụ: ROLE_USER, ROLE_ADMIN)
    private Collection<? extends GrantedAuthority> authorities;

    /**
     * Hàm này dùng để chuyển đổi từ UserEntity (trong Database) 
     * sang UserPrincipal (của Spring Security)
     */
    public static UserPrincipal create(UserEntity user) {
        // Lấy quyền từ database, nếu rỗng thì gán mặc định là ROLE_USER
        String role = user.getRole() != null ? user.getRole() : "ROLE_USER";
        
        // Spring Security yêu cầu quyền phải nằm trong GrantedAuthority
        GrantedAuthority authority = new SimpleGrantedAuthority(role);

        return new UserPrincipal(
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                Collections.singletonList(authority)
        );
    }

    // Các hàm dưới đây của Spring Security, thường mặc định trả về true
    // (Tài khoản không hết hạn, không bị khóa...)
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() { return true; }

    @Override
    public boolean isAccountNonLocked() { return true; }

    @Override
    public boolean isCredentialsNonExpired() { return true; }

    @Override
    public boolean isEnabled() { return true; }
}
