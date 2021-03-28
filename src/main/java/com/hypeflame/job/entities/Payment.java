package com.hypeflame.job.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_payment")
@Getter
@Setter
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date moment;

    @MapsId
    @OneToOne
    @JsonIgnore
    private Order order;

    public Payment(){

    }

    public Payment(Long id, Date moment, Order order) {
        this.id = id;
        this.moment = moment;
        this.order = order;
    }
}
