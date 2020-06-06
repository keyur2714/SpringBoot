package com.webstack.welcomeapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webstack.welcomeapp.dto.MessageDTO;

@RestController
@RequestMapping("/api")
public class WelcomeController {

	@Autowired
	private MessageDTO messageDTO; 	
	
	@GetMapping("/sayHello")
	public String sayHello() {		
		return "Hello Radhe Krishna...!";
	}
	
	@RequestMapping("/getMessage")
	public MessageDTO getMessage(String message) {
		messageDTO.setMessage(message);
		messageDTO.setMsgType("INFO");	
		System.out.println(messageDTO);
		return messageDTO;
	}
	
	@RequestMapping("/getMessageByType")
	public List<MessageDTO> getMessageByType(@RequestParam("messageType") String msgType) {		
		return this.getMessages(msgType);
	}
	
	private List<MessageDTO> getMessages(String messageType){
	
		List<MessageDTO> messages = new ArrayList<>();
		MessageDTO messageDTO1 = new MessageDTO();
		messageDTO1.setMessage("Good Morning");
		messageDTO1.setMsgType("INFO");
		MessageDTO messageDTO2 = new MessageDTO();
		messageDTO2.setMessage("Good Afternoon");
		messageDTO2.setMsgType("INFO");
		MessageDTO messageDTO3 = new MessageDTO();
		messageDTO3.setMessage("I am Good");
		messageDTO3.setMsgType("POSSITIVE");		
		MessageDTO messageDTO4 = new MessageDTO();
		messageDTO4.setMessage("I am not Good");
		messageDTO4.setMsgType("NEGATIVE");
		
		messages.add(messageDTO1);
		messages.add(messageDTO2);
		messages.add(messageDTO3);
		messages.add(messageDTO4);
		List<MessageDTO> filterList = new ArrayList<>();
		for(MessageDTO msg : messages) {
			if(msg.getMsgType().equalsIgnoreCase(messageType)) {
				filterList.add(msg);
			}
		}
		
		return filterList;
		
	}
	
}
