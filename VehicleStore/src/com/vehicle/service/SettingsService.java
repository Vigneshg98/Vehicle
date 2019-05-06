package com.vehicle.service;

import java.util.List;

import com.vehicle.model.UserRegister;
import com.vehicle.model.Vehicle;

public interface SettingsService {
	void applySettings(Vehicle obz);
	List<Vehicle> getData();
	void delete(int id);
}
