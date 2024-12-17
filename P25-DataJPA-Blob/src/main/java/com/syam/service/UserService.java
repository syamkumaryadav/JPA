package com.syam.service;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syam.entity.UserEntity;
import com.syam.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void service() throws Exception{
		
		String imagePath="D:\\Running\\sky.jpg";
		UserEntity userEntity = new UserEntity();
		
		userEntity.setUserName("A");
		userEntity.setUserEmail("a@gmail.com");
		
		long size=Files.size(Paths.get(imagePath));
		//System.out.println(size);
		byte arr[] = new byte[(int)size];
		
		FileInputStream fileInputStream = new FileInputStream(new File(imagePath));
		fileInputStream.read();
		fileInputStream.close();
		userEntity.setUserImage(arr);
		
		userRepository.save(userEntity);
		
	}

}
