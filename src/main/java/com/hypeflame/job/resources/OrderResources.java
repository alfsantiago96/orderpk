package com.hypeflame.job.resources;

import com.hypeflame.job.dto.OrderModel;
import com.hypeflame.job.entities.Order;
import com.hypeflame.job.services.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/orders")
public class OrderResources {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<OrderModel>> findAll(){
        List<Order> orders = orderService.findAll();
        return ResponseEntity.ok().body(toCollectionModel(orders));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<OrderModel> findById(@PathVariable Long id){
        Order order = orderService.findById(id);
        OrderModel orderModel = toModel(order);
        return ResponseEntity.ok().body(orderModel);
    }

    private OrderModel toModel(Order order){
        return modelMapper.map(order, OrderModel.class);
    }

    private List<OrderModel> toCollectionModel(List<Order> orders){
        return orders.stream()
                .map(order -> toModel(order))
                .collect(Collectors.toList());
    }
}
