package com.Fptu.eCommerce.module.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/search")
    public String searchUser(@RequestParam String name){

        return name;
    }

}
