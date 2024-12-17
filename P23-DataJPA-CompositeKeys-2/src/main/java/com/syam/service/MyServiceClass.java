package com.syam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.syam.entity.EntityClass;
import com.syam.entity.PrimaryKeysClass;
import com.syam.repository.RepositoryInterface;

@Service
public class MyServiceClass {
	
	private RepositoryInterface rp;

	public MyServiceClass(RepositoryInterface rp) {
		this.rp = rp;
	}
	
	public void saves() {
		 PrimaryKeysClass primaryKeysClass = new PrimaryKeysClass();
		 primaryKeysClass.setPk1(04);
		 primaryKeysClass.setPk2("D");
		 primaryKeysClass.setPk3(04);
		 
		 EntityClass entityClass = new EntityClass();
		 entityClass.setCol1(02);
		 entityClass.setCol2(02);
		 entityClass.setCol3("SKYS");
		 entityClass.setPkc(primaryKeysClass);
		 
		 rp.save(entityClass);
	}
	
	public void search() {
		PrimaryKeysClass primaryKeysClass = new PrimaryKeysClass();
		 primaryKeysClass.setPk1(01);
		 primaryKeysClass.setPk2("A");
		 primaryKeysClass.setPk3(01);
		 
		 Optional<EntityClass> byId = rp.findById(primaryKeysClass);
		 if(byId.isPresent()) {
			 System.out.println(byId.get());
		 }
	}
	
	public void delete() {
		 PrimaryKeysClass primaryKeysClass = new PrimaryKeysClass();
		 primaryKeysClass.setPk1(02);
		 primaryKeysClass.setPk2("B");
		 primaryKeysClass.setPk3(02);
		 
		 rp.deleteById(primaryKeysClass);
		
	}
	
	public void searchAll() {
		List<EntityClass> all = rp.findAll();
		all.forEach(allRecords ->{
			System.out.println(allRecords);
		});
	}
	
}
