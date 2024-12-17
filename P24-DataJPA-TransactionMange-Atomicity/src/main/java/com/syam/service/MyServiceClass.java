package com.syam.service;

import org.springframework.stereotype.Service;

import com.syam.entity.MyDestination;
import com.syam.entity.MySource;
import com.syam.repository.MyDestinationRepository;
import com.syam.repository.MySourceRepository;

import jakarta.transaction.Transactional;

@Service
public class MyServiceClass {
	
	private MySourceRepository mySourceRepository;
	
	private MyDestinationRepository myDestinationRepository;
	
	
	//@Autowired
	public MyServiceClass(MySourceRepository mySourceRepository, MyDestinationRepository myDestinationRepository) {
		super();
		this.mySourceRepository = mySourceRepository;
		this.myDestinationRepository = myDestinationRepository;
	}


	//@Transactional(rollbackFor = Exception.class)
	@Transactional(rollbackOn = Exception.class)		//----->>>> ATOMICITY	***********************
	public void service() {
		MySource mySource = new MySource();
		mySource.setCommonId(04);
		mySource.setCol2("D");
		mySourceRepository.save(mySource);
		
		System.out.println(10/0);			//-------->here in this line exception occurs above & below code (QUERYS) also not executed.....this is called atomicity
		
		MyDestination myDestination = new MyDestination();
		myDestination.setCommonId(04);
		myDestination.setCol2("D");
		myDestinationRepository.save(myDestination);
	}
	
}
