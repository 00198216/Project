package com.uca.capas.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.User;
import com.uca.capas.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository Users;
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<User> findALL() throws DataAccessException {
		
		return Users.findCliente();
	}

	@Override
	public User findUserandPass(String usuario, String clave) throws DataAccessException {
		
		return Users.findUserandPass(usuario, clave);
	}

	@Override
	@Transactional
	public void UpdateU(int id) throws DataAccessException {
		User user = Users.findOne(id);
		if(user.getStateU().equals("Activo")) {
			user.setState(false);
		}
		else {
			user.setState(true);
		}
		entityManager.merge(user);
		entityManager.flush();
		
		
	}



	

}
