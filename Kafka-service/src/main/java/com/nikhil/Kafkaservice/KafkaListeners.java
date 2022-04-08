package com.nikhil.Kafkaservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

	
	@KafkaListener(topics="code",groupId = "grpid")
	void listner(String data) {
		System.out.println("Listener received:"+data+" :)");
	}
}
