package org.example.chapter03.naming;

import java.time.LocalDateTime;

public class DeliveryService {

    public boolean isDeliveryValid(Delivery delivery) {
        return LocalDateTime.now().plusDays(1).isBefore(delivery.date);
    }
}
