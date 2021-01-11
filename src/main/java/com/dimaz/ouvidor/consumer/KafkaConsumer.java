package com.dimaz.ouvidor.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
	private static final String TOPICO = "snake-45362.ottimizza.oic.uploadFile";
//	private static final String TOPICO = "snake-45362.tareffa.servicos_programados.exportacao";
	private static final String GROUPID = "snake-45362.tareffa-queue-events-group";
	
	@KafkaListener(topics = TOPICO, groupId = GROUPID) 
	public void consume(String message) {
		System.out.println("message => "+message);
	}
}
