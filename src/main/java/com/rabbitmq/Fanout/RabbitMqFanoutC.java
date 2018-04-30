package com.rabbitmq.Fanout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by mai on 2018/4/30.
 */
@Component
@RabbitListener(queues = "fanout.c")
public class RabbitMqFanoutC {

    Logger logger = LoggerFactory.getLogger(RabbitMqFanoutC.class);

    @RabbitHandler
    public void getMassage(String massage){
        logger.info("===========start get massage fanout.c ");
        logger.info("Massage = {}",massage);

    }
}
