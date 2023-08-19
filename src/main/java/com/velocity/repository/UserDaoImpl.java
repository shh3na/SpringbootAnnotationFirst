package com.velocity.repository;

import org.springframework.stereotype.Repository;
//@Primary
@Repository                            //("userdao")
public class UserDaoImpl implements IUserDao{

	@Override
	public String byName(Integer id) {
		
		return "shailesh";
	}
	

}
