package com.rabbitmq.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by mai on 2018/4/30.
 */
@Component
@RabbitListener(queues = "hello1")
public class RabbitMqRecvHello {

    Logger logger = LoggerFactory.getLogger(RabbitMqRecvHello.class);

    @RabbitHandler
    public void getMassAge(String hello){
        logger.info("------massage：{}",hello);
    }

}
