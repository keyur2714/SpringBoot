package com.webstack.welcomeapp.dto;

import org.springframework.stereotype.Component;

@Component
public class MessageDTO {

	private String msgType;
	private String message;

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MessageDTO [msgType=" + msgType + ", message=" + message + "]";
	}

	
}
