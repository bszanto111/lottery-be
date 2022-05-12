package com.lottery.lottery.rest.controller;

import com.lottery.lottery.rest.dto.LoginData;
import com.lottery.lottery.rest.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    public boolean login(@RequestBody LoginData loginData) {
        return loginService.login(loginData);
    }
}
