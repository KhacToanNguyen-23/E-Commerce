package com.Fptu.eCommerce.module.user.controller;
import com.Fptu.eCommerce.module.user.dto.UserResponseDto;
import com.Fptu.eCommerce.module.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;


    @GetMapping("/search")
    public List<UserResponseDto> search(@RequestParam String name){
        List<UserResponseDto> userResponseDtoList = userService.findByName(name);
        return userResponseDtoList;
    }

//    @PostMapping("/api/user")
//    public UserResponseDto create(@RequestParam  String username, @RequestParam String password){
//
//    }

    @DeleteMapping("/api/user/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }


}
