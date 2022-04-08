package com.nikhil.Kafkaservice.record;

public class Message {

	private String message="";

	public Message(String mess) {
		this.message = mess;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
