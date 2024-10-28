package com.example.projectdb.service;

import org.springframework.stereotype.Service;

import com.example.projectdb.Model.Product;
import com.example.projectdb.Model.dao.ProductDAO;
import java.util.List;
@Service
public class ProductService {

    private ProductDAO productDAO;

    public ProductService(ProductDAO productDAO){
        this.productDAO=productDAO;
    }

    public List<Product> getProducts(){
        return productDAO.findAll();
    }

}
