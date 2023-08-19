package com.velocity.service;

import java.util.List;


import com.velocity.model.Policy;

public interface IApiInterfImp {

	

	
	List<Policy> getall();
    
	void create(Policy p);
		

	void update(Integer id,Policy p);
		
	
	 void delete(Integer id);



	
	

	
	
	
	
}
