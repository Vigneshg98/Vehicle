package com.vehicle.service;

import java.util.List;

import com.vehicle.model.UserRegister;

public interface UserService {
	void insertUser(UserRegister ur);
	List<UserRegister> checkUser();
	void resetPass(String name, UserRegister obz);
}
