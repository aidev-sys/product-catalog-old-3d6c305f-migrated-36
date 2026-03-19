package com.example.productcatalog.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/rabbitmq/stats")
public class RabbitMqStatsController {

    private final RabbitTemplate rabbitTemplate;

    public RabbitMqStatsController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @GetMapping
    public Map<String, Object> stats() {
        // RabbitMQ stats would typically be retrieved via management API or custom metrics
        // This is a placeholder returning dummy values for demonstration
        return Map.of(
            "queueSize", 0,
            "messageCount", 0,
            "consumerCount", 0
        );
    }
}