package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.dao.ContractDAO;
import com.nt.exeception.NoDataFoundException;
import com.nt.model.Contact;

public class ContactServiceImpl implements ContactService {

	private ContractDAO dao;
	
	public void setContractDAO(ContractDAO dao) {
		// TODO Auto-generated method stub
		this.dao=dao;
			}

	@Override
	public String getFindByName(Integer id) {
		// TODO Auto-generated method stub
		String name =dao.findNameById(101);
		return name.toUpperCase();
	}

	@Override
	public List<String> getAllContactByNames() {
		// TODO Auto-generated method stub
	List<String> names=	dao.findAll();
	if(!names.isEmpty())
	{
		return names;
	}
		return null;
	}

	@Override
	public Contact getContactById(Integer id) {
		// TODO Auto-generated method stub
		Contact contact=dao.findById(id);
		if(contact==null)
		{
			throw new NoDataFoundException();
		}
		return contact;
	}

	
	

	

}
