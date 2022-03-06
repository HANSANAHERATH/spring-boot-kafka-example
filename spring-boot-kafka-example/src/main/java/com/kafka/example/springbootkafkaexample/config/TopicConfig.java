package com.kafka.example.springbootkafkaexample.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


@Configuration
public class TopicConfig {

    private static String topic = "User";

    @Bean
    public NewTopic topic1() {
        return TopicBuilder
                .name(topic)
                .build();
    }
}
