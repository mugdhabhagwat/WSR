package com.wsr.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wsr.dto.ProjectRoles;
import com.wsr.dto.ProjectUsers;

@Repository
public class RegistrationDaoImpl implements RegistrationDao {

	 @Autowired
	    private SessionFactory sessionfactory;

	@Override
	public void saveUser(ProjectUsers projectUsers) {
		sessionfactory.getCurrentSession().saveOrUpdate(projectUsers);		
	}

	@Override
	public List<ProjectRoles> getProjectRoles() {
		Session session = sessionfactory.openSession();
		@SuppressWarnings("unchecked")
		List<ProjectRoles> projectRoles = session.createQuery("from ProjectRoles").list();
		session.close();
		return projectRoles;
	}
}
