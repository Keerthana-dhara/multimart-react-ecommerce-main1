package com.example.projectdb.Model.dao;

import java.util.Optional;
import org.springframework.data.repository.ListCrudRepository;
import com.example.projectdb.Model.LocalUser;

public interface LocalUserDAO extends ListCrudRepository<LocalUser,Long>{
Optional<LocalUser> findByUsernameIgnoreCase(String username);
Optional<LocalUser> findByEmailIgnoreCase(String email);
}
