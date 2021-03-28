package com.hypeflame.job.dto;

import com.hypeflame.job.entities.Payment;
import com.hypeflame.job.entities.User;
import com.hypeflame.job.enums.OrderStatus;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Getter
@Setter
public class OrderModel {

    private Long id;
    private String userName;
    private Date moment;
    private OrderStatus orderStatus;
    private Payment payment;

}
