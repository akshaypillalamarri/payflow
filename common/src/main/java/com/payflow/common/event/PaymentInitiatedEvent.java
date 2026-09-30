package com.payflow.common.event;

import java.math.BigDecimal;
import java.util.UUID;

public record PaymentInitiatedEvent(
        UUID paymentId,
        String fromAccount,
        String toAccount,
        BigDecimal amount,
        String currency
) {
}