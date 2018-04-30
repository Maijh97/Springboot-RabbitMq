package com.rabbitmq.Fanout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by mai on 2018/4/30.
 */
@Component
@RabbitListener(queues = "fanout.a")
public class RabbitMqFanoutA {

    Logger logger = LoggerFactory.getLogger(RabbitMqFanoutA.class);

    @RabbitHandler
    public void getMassage(String massage){
        logger.info("===========start get massage fanout.a");
        logger.info("Massage = {}",massage);

    }
}
