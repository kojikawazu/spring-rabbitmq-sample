package com.example.producer;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;

/*
 * RabbitMQ configuration
 */
@Configuration
public class RabbitMQConfig {

    /*
     * Queue name
     */
    @Value("${app.queue.name}")
    private String queueName;

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
     * Queue
     */
    @Bean
    public Queue myQueue() {
        return new Queue(queueName, false);
    }

    /*
     * Exchange
     */
    @Bean
    public TopicExchange myExchange() {
        return new TopicExchange(exchangeName);
    }

    /*
     * Binding
     */
    @Bean
    public Binding binding(Queue myQueue, TopicExchange myExchange) {
        return BindingBuilder.bind(myQueue).to(myExchange).with(routingKey);
    }
}
