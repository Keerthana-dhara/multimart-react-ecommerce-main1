package com.example.projectdb.api.controller.auth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.projectdb.api.model.RegistrationBody;
import com.example.projectdb.exception.UserAlreadyExistsException;
import com.example.projectdb.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/auth")
public class AuthenticationController {
    
    private UserService userService;

    public AuthenticationController(UserService userService){
        this.userService=userService;
    }

    @SuppressWarnings("rawtypes")
    @PostMapping("/register")
    public ResponseEntity registerUser(@RequestBody RegistrationBody registrationBody) {
        try{
          userService.registerUser(registrationBody);
          return ResponseEntity.ok().build();
        }catch(UserAlreadyExistsException ex){
          return ResponseEntity.status(HttpStatus.CONFLICT).build();
    }
    }
}
