package com.chipatel.restfulapi.messenger.server.dao;

public class MessageDAO {
	/*
	 * SELECT t1.id AS message_id, t2.author_first_name AS first_name,
	 * t2.author_last_name AS last_name, t1.message AS message,
	 * t1.created_datetime FROM messenger.messages t1 JOIN messenger.authorInfo
	 * t2 ON t1.author_id = t2.id
	 */

}
