package com.nashtech.common.command;

import lombok.Builder;
import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.HashMap;

@Value
@Builder
public class ReserveProductCommand {
    @TargetAggregateIdentifier
    String orderId;
    String userId;
    HashMap<String,Integer> orderLines;
}
