package com.kodilla.kodilla.jms.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class KodillaJmsTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaJmsTaskApplication.class, args);
    }

}
