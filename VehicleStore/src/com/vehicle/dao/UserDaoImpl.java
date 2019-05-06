package com.vehicle.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vehicle.model.UserRegister;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sf;
	
	@Override
	public void insertUser(UserRegister ur) {
		Session session = sf.getCurrentSession();
		session.saveOrUpdate(ur);
	}
	
	@Override
	public List<UserRegister> checkUser() {
		Session session = sf.getCurrentSession();
		Query query = session.createQuery("from UserRegister");
		List<UserRegister> ob = query.list();
		return ob;
	}
	
	@Override
	public void resetPass(String name, UserRegister obz) {
		Session session = sf.getCurrentSession();
		List<UserRegister> use = session.createQuery("from UserRegister where userName='"+obz.getUserName()+"' ").getResultList();
		for(UserRegister reg:use) {
			reg.setUserPass(obz.getUserPass());
			session.update(reg);
			break;
		}
	}
}
