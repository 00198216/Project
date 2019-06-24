package com.uca.capas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.User;
import com.uca.capas.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository Users;
	
	@Override
	public List<User> findALL() throws DataAccessException {
		
		return Users.findAll();
	}

	@Override
	public User findUserandPass(String usuario, String clave) throws DataAccessException {
		
		return Users.findUserandPass(usuario, clave);
	}



	

}
