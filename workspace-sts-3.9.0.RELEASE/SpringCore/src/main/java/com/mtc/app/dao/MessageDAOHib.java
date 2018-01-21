package com.mtc.app.dao;

import org.springframework.stereotype.Component;

//@Component("messageDAOHib")
public class MessageDAOHib implements IMessageDAO{

	public String fetchMessage() {
		
		return "I am from MessageDAOHib";
	}

}
