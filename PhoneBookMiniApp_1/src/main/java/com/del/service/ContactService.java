package com.del.service;

import java.util.List;

import com.del.comand.Contact;

public interface ContactService {
	
	public	 boolean saveContact(Contact con);
	public List<Contact> getAllContact();
	public Contact getContactById(Integer cid);
	public	 boolean updateContactById(Integer cid);
	public	 boolean deleteContactById(Integer cid);
	
	

}
