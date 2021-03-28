package com.hypeflame.job.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hypeflame.job.dto.UserModel;
import com.hypeflame.job.enums.OrderStatus;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.ui.ModelMap;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_order")
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date moment;
    private OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;

    public Order() {
    }

    public Order(Long id, Date moment, OrderStatus orderStatus, User user) {
        this.id = id;
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.user = user;
    }

}
