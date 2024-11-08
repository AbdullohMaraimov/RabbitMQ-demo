package com.idealist.rabbitmq.rabbitmqdemo.consumer;

import com.idealist.rabbitmq.rabbitmqdemo.dto.User;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RabbitMQJsonConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQJsonConsumer.class);

    @RabbitListener(queues = "${rabbitmq.queue.json.name}")
    public void consumerJsonMessage(User user) {
        LOGGER.info(String.format("Received Json Message -> %s", user.toString()));
    }

}
