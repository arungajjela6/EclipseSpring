package com.mtc.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mtc.app.dao.IMessageDAO;


/**
 * {@link Service} with hard-coded input data.
 */
//@Component
public class ExampleService implements Service {
	
	//@Autowired
	IMessageDAO messageDAO;
	
	public String getMessage() {
		return messageDAO.fetchMessage();	
	}
	
	public void setMessageDAO(IMessageDAO messageDAO) {
		this.messageDAO = messageDAO;
	}

}
