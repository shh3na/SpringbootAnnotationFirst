package com.velocity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.velocity.repository.IUserDao;

@Service
public class UserService {
    
	@Autowired
	@Qualifier("tak")
	private IUserDao userdao;

	public void getName(Integer id) {
		 String name = userdao.byName(id);
		 System.out.println(name);
		// System.out.println("Imple class : " +userdao.getClass().getName());
		
	}
	
	

//	public UserService(@Qualifier("log") IUserDao userdao) {
//		super();
//		this.userdao = userdao;
//	}
	
    
//	@Autowired
//	@Qualifier("log")
//	public void setUserdao(IUserDao userdao) {
//		this.userdao = userdao;
//		
//	}
	
	
	
	
	
	
}
