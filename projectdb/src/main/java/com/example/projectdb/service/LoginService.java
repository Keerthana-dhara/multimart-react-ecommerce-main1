package com.example.projectdb.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.projectdb.Model.dao.LoginDAO;
import com.example.projectdb.api.model.Login;

@Service
public class LoginService {
@Autowired
private LoginDAO loginDAO;

public LoginService(LoginDAO loginDAO){
    this.loginDAO=loginDAO;
}

public Login fetchUsers(Login login){
return loginDAO.save(login);
}
}
