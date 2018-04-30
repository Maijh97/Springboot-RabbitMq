package com.rabbitmq.hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by mai on 2018/4/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTest {

    @Autowired
    private RabbitMqSendHello rabbitMqSendHello;

    @Test
    public void test1(){
        rabbitMqSendHello.send();
    }
}
