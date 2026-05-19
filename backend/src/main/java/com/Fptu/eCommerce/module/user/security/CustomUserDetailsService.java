package com.Fptu.eCommerce.module.user.security;

import com.Fptu.eCommerce.module.user.entity.UserEntity;
import com.Fptu.eCommerce.module.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 2. CustomUserDetailsService
 * Spring Security cần một "Dịch vụ" để đi tìm User trong DB mỗi khi login.
 * Class này implement UserDetailsService của Spring để làm việc đó.
 */
@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    /**
     * Hàm này được Spring gọi khi người dùng bấm Đăng Nhập
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Vào Database tìm User
        UserEntity user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Không tìm thấy user: " + username));

        // Nếu tìm thấy, chuyển nó thành UserPrincipal để đưa cho Spring Security
        return UserPrincipal.create(user);
    }
}
