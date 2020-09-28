package com.nt.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.jupiter.api.Test;

import com.nt.dao.ContractDAO;
import com.nt.exeception.NoDataFoundException;
import com.nt.model.Contact;

public class ContactServiceTest {
	
 private static ContactServiceImpl service=null;

	@BeforeClass
	public static void init() {
			List<String> name=new ArrayList<String>();
			name.add("Neha");
		name.add("Jonh");
		name.add("Peter");
		
		//Create mock object
		ContractDAO daoProxy=EasyMock.createMock(ContractDAO.class);
		
		//setting behivour of mock object
		EasyMock.expect(daoProxy.findAll()).andReturn(name);
	
			 Contact c=new  Contact();
		 c.setId(101);
		 c.setName("Neha");
		 c.setPhno(123456);
		EasyMock.expect(daoProxy.findById(101)).andReturn(c);
		EasyMock.expect(daoProxy.findById(201)).andReturn(null);
		
		//saving proxy  object
		EasyMock.replay(daoProxy); 
		
		 service = new ContactServiceImpl();
		service.setContractDAO(daoProxy);
		}
	
	
	@Test
	@Ignore
	public void getAllNames() {
		List<String> cname=	service.getAllContactByNames();
	assertNotNull(cname);
	}	
	@Test
	@Ignore
	public void testGetContactById_01() {
		Contact contact =	service.getContactById(101);
		assertNotNull( contact);
		}
	
	@Test(expected=NoDataFoundException.class)
	public void testGetContactById_02() {
		service.getContactById(201);
		}


}
