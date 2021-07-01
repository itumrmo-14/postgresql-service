package com.tut.postgresqlservice.controller;

import com.tut.postgresqlservice.model.User;
import com.tut.postgresqlservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user-service")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "add")
    public void add(@RequestBody User user) throws Exception {
        userService.addUser(user);
    }
}
