package com.example.projectdb.api.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectdb.api.model.Login;
import com.example.projectdb.service.LoginService;

@CrossOrigin(origins = "*")
@RestController
public class LoginController {
@Autowired
private LoginService loginService;

@PostMapping("POST/login")
public String addUser(@RequestBody Login login) {
    loginService.fetchUsers(login);
    return "successfully added";
}
}
