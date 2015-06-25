package com.Aartek.SpringLogin.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.Aartek.SpringLogin.form.Contact;
 
@Repository
public class RegisterRepository {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void registerRepository(Contact c) {
	
		
		System.out.println("Repository"+c.getFirstname());
		    c.setId(1);
		    hibernateTemplate.save(c);
		
	 
	
		
	}

}
