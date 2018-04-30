package com.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by mai on 2018/4/30.
 */
@SpringBootApplication
public class RabbitMqBoot {


    private static Logger logger = LoggerFactory.getLogger(RabbitMqBoot.class);

    public static void main(String[] args) throws Exception {
        logger.info("-===============startSpringBoot==============");

        SpringApplication.run(RabbitMqBoot.class, args);
    }
}
