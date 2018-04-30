package com.rabbitmq.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mai on 2018/4/30.
 */
@Configuration
public class RabbitMqFanoutConfig {

    @Bean
    public Queue AQueue(){
        return new Queue("fanout.a");
    }

    @Bean
    public Queue BQueue(){
        return new Queue("fanout.b");
    }

    @Bean
    public Queue CQueue(){
        return new Queue("fanout.c");
    }

    @Bean
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange(ExchangeTypes.FANOUT);
    }

    @Bean
    public Binding bindingAFanout(Queue AQueue,FanoutExchange fanoutExchange){
        return BindingBuilder.bind(AQueue).to(fanoutExchange);
    }

    @Bean
    public Binding bindingBFanout(Queue BQueue,FanoutExchange fanoutExchange){
        return BindingBuilder.bind(BQueue).to(fanoutExchange);
    }

    @Bean
    public Binding bindingCFanout(Queue CQueue,FanoutExchange fanoutExchange){
        return BindingBuilder.bind(CQueue).to(fanoutExchange);
    }

}
