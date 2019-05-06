package com.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vehicle.dao.SettingsDao;
import com.vehicle.model.UserRegister;
import com.vehicle.model.Vehicle;

@Service
public class SettingsServiceImpl implements SettingsService {
	@Autowired
	SettingsDao settingsDao;
	
	@Override
	@Transactional
	public void applySettings(Vehicle obz) {
		settingsDao.applySettings(obz);
	}

	@Override
	@Transactional
	public List<Vehicle> getData() {
		return settingsDao.getData();
	}

	@Override
	@Transactional
	public void delete(int obz) {
		settingsDao.delete(obz);		
	}
	
}
