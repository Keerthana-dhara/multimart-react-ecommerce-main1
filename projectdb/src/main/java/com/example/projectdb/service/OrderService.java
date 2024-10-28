package com.example.projectdb.service;

import org.springframework.stereotype.Service;
import com.example.projectdb.Model.WebOrder;
import com.example.projectdb.Model.dao.WebOrderDAO;
import java.util.List;

@Service
public class OrderService {

    private WebOrderDAO webOrderDAO;

    public OrderService(WebOrderDAO webOrderDAO){
        this.webOrderDAO=webOrderDAO;
    }

    public List<WebOrder> getOrders(){
        return webOrderDAO.findAll();
    }
}
