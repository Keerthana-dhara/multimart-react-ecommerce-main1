package com.example.projectdb.api.controller.order;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.projectdb.Model.WebOrder;
import com.example.projectdb.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService=orderService;
    }

    @GetMapping
    public List<WebOrder> getOrders() {
        return orderService.getOrders();
    }
    
}
