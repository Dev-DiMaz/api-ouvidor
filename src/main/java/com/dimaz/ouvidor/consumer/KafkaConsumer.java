package com.dimaz.ouvidor.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

	@KafkaListener(topics = "newTopic", groupId = "group_id") 
	public void consume(String message) {
		System.out.println("message => "+message);
	}
}
