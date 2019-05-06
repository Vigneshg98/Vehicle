package com.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vehicle.dao.UserDao;
import com.vehicle.model.UserRegister;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;
	
	@Override
	@Transactional
	public void insertUser(UserRegister ur) {
		userDao.insertUser(ur);
	}
	
	@Override
	@Transactional
	public List<UserRegister> checkUser() {
		return userDao.checkUser();
	}
	
	@Override
	@Transactional
	public void resetPass(String id, UserRegister obz) {
		userDao.resetPass(id, obz);
	}
	

}
