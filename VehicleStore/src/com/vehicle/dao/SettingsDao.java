package com.vehicle.dao;

import java.util.List;

import com.vehicle.model.UserRegister;
import com.vehicle.model.Vehicle;

public interface SettingsDao {
	void applySettings(Vehicle obz);
	List<Vehicle> getData();
	void delete(int obz);
	
}
