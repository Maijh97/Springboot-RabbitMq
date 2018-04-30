package com.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mai on 2018/4/30.
 */
@Configuration
public class RabbitMqHelloConfig {


    @Bean
    public Queue hello1Queue(){
        return new Queue("hello1");
    }

    @Bean
    public Queue hello2Queue(){
        return new Queue("hello2");
    }
}
