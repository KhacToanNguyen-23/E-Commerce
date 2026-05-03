package com.Fptu.eCommerce.module.user.repository;

import com.Fptu.eCommerce.module.user.dto.UserDTO;
import com.Fptu.eCommerce.module.user.entity.UserEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    private final JdbcTemplate jdbcTemplate;

    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<UserEntity> findByName(String name) {
        String sql = "SELECT * FROM users WHERE name LIKE ?";

        return jdbcTemplate.query(sql,
                new Object[]{"%" + name + "%"},
                (rs, rowNum) -> {
                    UserEntity user = new UserEntity();
                    user.setId(rs.getLong("id"));
                    user.setName(rs.getString("name"));
                    user.setEmail(rs.getString("email"));
                    user.setPhone(rs.getString("phone"));
                    return user;
                });
    }

    public void creat(UserDTO userDTO) {
        // nghiệp vụ query và add user và database
    }

    public boolean delete(UserDTO userDTO) {
        // nghiệp vụ quert và update vào datase;
        return true;
    }

    public void update(UserDTO userDTO) {
        // nghiệp vụ update vào database
    }

    public UserEntity checkLogin(String name, String password) {
        return null;
    }
}
