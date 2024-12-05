package com.example.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/*
 * Message consumer
 */
@Component
public class MessageConsumer {

    /*
     * Receive message
     * 
     * @param message Message
     */
    @RabbitListener(queues = "${app.queue.name}")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
