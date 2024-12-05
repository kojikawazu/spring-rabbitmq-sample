package com.example.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

/*
 * Message producer
 */
@Component
public class MessageProducer {

    /*
     * Rabbit template
     */
    private final RabbitTemplate rabbitTemplate;

    /*
     * Exchange name
     */
    @Value("${app.exchange.name}")
    private String exchangeName;

    /*
     * Routing key
     */
    @Value("${app.routing.key}")
    private String routingKey;

    /*
     * Constructor
     * 
     * @param rabbitTemplate Rabbit template
     */
    public MessageProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    /*
     * Send message
     * 
     * @param message Message
     */
    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend(exchangeName, routingKey, message);
        System.out.println("Sent message: " + message);
    }
}
