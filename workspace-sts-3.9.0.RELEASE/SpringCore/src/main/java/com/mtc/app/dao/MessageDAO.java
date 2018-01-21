package com.mtc.app.dao;

import org.springframework.stereotype.Component;

//@Component("messageDAO")
public class MessageDAO implements IMessageDAO{

	public String fetchMessage() {
		
		return "Hello I am from MessageDAO";
	}

}
