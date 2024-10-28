package com.example.projectdb.Model.dao;

import org.springframework.data.repository.ListCrudRepository;

import com.example.projectdb.Model.Product;

public interface ProductDAO extends ListCrudRepository<Product,Long>{

}
