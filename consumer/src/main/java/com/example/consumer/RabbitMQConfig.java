package com.example.consumer;

import org.springframework.amqp.core.Queue;
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
     * Queue
     */
    @Bean
    public Queue myQueue() {
        return new Queue(queueName, false);
    }
}
