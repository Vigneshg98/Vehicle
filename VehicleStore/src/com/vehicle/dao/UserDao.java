package com.vehicle.dao;

import java.util.List;

import com.vehicle.model.UserRegister;

public interface UserDao {
	void insertUser(UserRegister ur);
	List<UserRegister> checkUser();
	void resetPass(String name, UserRegister obz);
}
