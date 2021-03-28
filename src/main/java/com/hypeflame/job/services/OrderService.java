package com.hypeflame.job.services;

import com.hypeflame.job.entities.Order;
import com.hypeflame.job.entities.User;
import com.hypeflame.job.repositories.OrderRepository;
import com.hypeflame.job.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        List<Order> orders = orderRepository.findAll();
        return orders;
    }

    public Order findById(Long id){
        Optional<Order> order = orderRepository.findById(id);
        return order.orElseThrow();
    }

}
