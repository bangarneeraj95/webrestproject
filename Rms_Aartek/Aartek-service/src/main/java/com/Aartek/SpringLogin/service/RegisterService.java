package com.Aartek.SpringLogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Aartek.SpringLogin.dao.RegisterRepository;
import com.Aartek.SpringLogin.form.Contact;

@Service
public class RegisterService {
	@Autowired
	RegisterRepository repository;
	
	public void storeInfo(Contact c){
		System.out.println("in service");
		repository.registerRepository(c);
		
	}

}
