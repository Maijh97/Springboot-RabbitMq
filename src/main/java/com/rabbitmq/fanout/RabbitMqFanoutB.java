package com.rabbitmq.fanout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by mai on 2018/4/30.
 */
@Component
@RabbitListener(queues = "fanout.b")
public class RabbitMqFanoutB {

    Logger logger = LoggerFactory.getLogger(RabbitMqFanoutB.class);

    @RabbitHandler
    public void getMassage(String massage){
        logger.info("===========start get massage fanout.b");
        logger.info("Massage = {}",massage);

    }
}
