package com.rabbitmq.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by mai on 2018/4/30.
 */
@Component
public class RabbitMqSendHello {

    Logger logger = LoggerFactory.getLogger(RabbitMqSendHello.class);

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        logger.info("--------start send message--------");
        String message = "send hello"+new Date();
        amqpTemplate.convertAndSend("hello1", message);
    }
}
