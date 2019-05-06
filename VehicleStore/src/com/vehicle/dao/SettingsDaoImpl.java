package com.vehicle.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vehicle.model.UserRegister;
import com.vehicle.model.Vehicle;

@Repository
public class SettingsDaoImpl implements SettingsDao {
	@Autowired
	SessionFactory sf;
	
	@Override
	public void applySettings(Vehicle obz) {
		Session session = sf.getCurrentSession();
		session.saveOrUpdate(obz);
	}

	@Override
	public List<Vehicle> getData() {
		Session session = sf.getCurrentSession();
		Query query = session.createQuery("from Vehicle");
		List<Vehicle> ob = query.list();
		return ob;
	}

	@Override
	public void delete(int id) {
		Session session = sf.getCurrentSession();
		Vehicle veh=session.get(Vehicle.class, id);
		session.delete(veh);
	}
	
}
