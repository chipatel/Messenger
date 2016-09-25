package com.chipatel.restfulapi.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.chipatel.restfulapi.messenger.model.Message;
import com.chipatel.restfulapi.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService messageService = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage() {
		return messageService.getAllMessages();
	}

	@GET
	@Path("/id={id}")
	@Produces(MediaType.APPLICATION_XML)
	public Message getTest(@PathParam("id") Long id) {
		return messageService.getMessage(id);
	}

}
