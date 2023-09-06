package com.nashtech.common.command;

import com.nashtech.common.model.PaymentDetails;
import com.nashtech.common.model.User;
import lombok.Builder;
import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
@Builder
public class ProcessPaymentCommand {
    @TargetAggregateIdentifier
    String paymentId;
    String orderId;
    Double price;
    Integer quantity;
    String productId;
    User userDetails;
    PaymentDetails paymentDetails;

}