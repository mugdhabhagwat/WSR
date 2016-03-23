package com.wsr.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wsr.dto.ProjectUsers;

@Repository
public class LoginDaoImpl  implements LoginDao  {
	
	@Autowired 
	HibernateTemplate hibernateTemplate;
	
	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("rawtypes")
	public List<ProjectUsers> getUser() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<ProjectUsers> projectUsersList = null;
		try{
			projectUsersList=hibernateTemplate.loadAll(ProjectUsers.class);
		}catch(Exception e){	
			e.printStackTrace();
		}
		session.close();
		return projectUsersList;
	}

}
