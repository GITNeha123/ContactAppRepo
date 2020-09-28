package com.nt.dao;

import java.util.List;

import com.nt.model.Contact;

public interface ContractDAO {
	public String findNameById(Integer  id);
	public List<String> findAll();
	public Contact findById(Integer id);
	
}
