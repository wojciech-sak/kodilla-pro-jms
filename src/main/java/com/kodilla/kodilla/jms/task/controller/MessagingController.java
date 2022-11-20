package com.kodilla.kodilla.jms.task.controller;

import com.kodilla.kodilla.jms.task.domain.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class MessagingController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping(path = "/process/order")
    public void processMessage(@RequestBody OrderDto order) {
        jmsTemplate.convertAndSend("queue-order", order);

        System.out.println("Log order in controller: " + order);
    }

}
