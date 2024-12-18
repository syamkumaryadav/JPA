package com.syam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syam.form.MyForm;
import com.syam.repository.MyRepo;

@Service
public class MyService {
	
	@Autowired
	private MyRepo myRepo;
	
	public void saveForm(MyForm myForm) {
		myRepo.save(myForm);
		System.out.println("ssssss");
	}

}
