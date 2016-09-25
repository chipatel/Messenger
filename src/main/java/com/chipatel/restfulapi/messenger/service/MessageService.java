package com.chipatel.restfulapi.messenger.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.chipatel.restfulapi.messenger.model.Message;

public class MessageService {

	Message m1 = new Message(1L, "1st message via list", "chipatel");
	Message m2 = new Message(2L, "2nd message via list", "chipatel");
	Message m3 = new Message(3L, "3nd message via list", "chipatel");
	HashMap<Long, Message> list = new HashMap<Long, Message>();

	public MessageService() {
		list.put(1L, m1);
		list.put(2L, m2);
		list.put(3L, m3);
	}

	public List<Message> getAllMessages() {
		List<Message> l = new ArrayList<>();
		for (Map.Entry<Long, Message> entry : list.entrySet()) {
			l.add(entry.getValue());
		}
		return l;
	}

	public Message getMessage(long id) {
		return list.get(id);
	}
}
