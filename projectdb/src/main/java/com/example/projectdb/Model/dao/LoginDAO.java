package com.example.projectdb.Model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.projectdb.api.model.Login;

@Repository
public interface LoginDAO extends CrudRepository<Login,Integer>{

}
