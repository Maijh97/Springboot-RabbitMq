package com.rabbitmq.fanout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by mai on 2018/4/30.
 */
@Component
public class RabbitMqFanoutAndRoutingKeySend {

    Logger logger = LoggerFactory.getLogger(RabbitMqFanoutA.class);


    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        logger.info("send fanout massage");
        String massage = "all, fanout RabbitMQ";
        amqpTemplate.convertAndSend(ExchangeTypes.FANOUT,"",massage);
    }

}
