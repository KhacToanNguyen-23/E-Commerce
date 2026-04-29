package com.Fptu.eCommerce.module.user.controller;

import com.Fptu.eCommerce.module.user.dto.UserDTO;
import com.Fptu.eCommerce.module.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;

    @GetMapping("/search")
    public List<UserDTO> searchUser(@RequestParam String name){
        List<UserDTO> results = userService.finByName(name);
        return results;
    }


    @PostMapping("/api/users")
    public void create(@RequestBody UserDTO userDTO){
        userService.creat(userDTO);
    }


    @DeleteMapping("/api/user")
    public boolean delete(@RequestBody UserDTO userDTO){
       return userService.delete(userDTO);
    }


    @PutMapping("/api/user")
    public void update(@RequestBody UserDTO userDTO){
        userService.update(userDTO);
    }




}
