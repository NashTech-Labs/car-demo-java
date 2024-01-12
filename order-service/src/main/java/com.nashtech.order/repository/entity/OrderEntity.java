package com.nashtech.order.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashMap;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "orders")
public class OrderEntity {
    @Id
    private String orderId;
    private String userId;
    private String productIds;
    private String paymentId;
    private String shipmentId;
    private Date timestamp = new Date();
    private String orderStatus;
}