package com.velocity.repository;

import org.springframework.stereotype.Repository;

@Repository("tak")
public class SuperUserDaoImpl implements IUserDao {

	@Override
	public String byName(Integer id) {
		
		return "dhiraj";
	}

}
