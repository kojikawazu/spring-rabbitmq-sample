package com.example.producer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Message controller
 */
@RestController
public class MessageController {

    /*
     * Message producer
     */
    private final MessageProducer messageProducer;

    /*
     * Constructor
     * 
     * @param messageProducer Message producer
     */
    public MessageController(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    /*
     * Send message
     * 
     * @return Message sent
     */
    @GetMapping("/send")
    public String send() {
        String message = "Hello from Producer!";
        messageProducer.sendMessage(message);
        return "Message sent: " + message;
    }
}
