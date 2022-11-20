package com.kodilla.kodilla.jms.task.receiver;

import com.kodilla.kodilla.jms.task.domain.OrderDto;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    @JmsListener(containerFactory = "jmsFactory", destination = "queue-order")
    public void receive(OrderDto order) {
        System.out.println("Received the message: " + order);
    }
}