package com.nt.service;

import java.util.List;

import com.nt.model.Contact;

public interface ContactService {
	
	public String getFindByName(Integer  id);
	public List<String> getAllContactByNames(); 
	public Contact getContactById(Integer id);
	
	
}
