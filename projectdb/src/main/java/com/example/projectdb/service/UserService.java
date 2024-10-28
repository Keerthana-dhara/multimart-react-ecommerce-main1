package com.example.projectdb.service;

import org.springframework.stereotype.Service;
import com.example.projectdb.Model.LocalUser;
import com.example.projectdb.Model.dao.LocalUserDAO;
import com.example.projectdb.api.model.RegistrationBody;
import com.example.projectdb.exception.UserAlreadyExistsException;

@Service
public class UserService {

    private LocalUserDAO localUserDAO;
    
    public UserService(LocalUserDAO localUserDAO){
        this.localUserDAO=localUserDAO;

    }
    public LocalUser registerUser(RegistrationBody registrationBody) throws UserAlreadyExistsException{
    if(localUserDAO.findByEmailIgnoreCase(registrationBody.getEmail()).isPresent()
    || localUserDAO.findByUsernameIgnoreCase(registrationBody.getUsername()).isPresent()){
    throw new UserAlreadyExistsException();
    }
    LocalUser user=new LocalUser();
    user.setEmail(registrationBody.getEmail());
    user.setEmail(registrationBody.getEmail());
    user.setFirstName(registrationBody.getFirstName());
    user.setLastName(registrationBody.getLastName());
    user.setUsername(registrationBody.getUsername());
    user.setPassword(registrationBody.getPassword());
    return localUserDAO.save(user);
    }
}

