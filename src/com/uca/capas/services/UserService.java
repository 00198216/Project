package com.uca.capas.services;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.User;

@Service
public interface UserService {

  public List<User> findALL() throws DataAccessException;

  public User findUserandPass(String usuario, String clave) throws DataAccessException;;
}
