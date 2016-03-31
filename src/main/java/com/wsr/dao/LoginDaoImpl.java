package com.wsr.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wsr.dto.ProjectUsers;
import com.wsr.util.WSRConstants;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("rawtypes")
	public List<ProjectUsers> getUser() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<ProjectUsers> projectUsersList = null;
		try {
			projectUsersList = hibernateTemplate.loadAll(ProjectUsers.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return projectUsersList;
	}

	@Override
	public List findUserRolebyUserName(String username) {
		List list = null;
		try {
			Session session = hibernateTemplate.getSessionFactory().getCurrentSession();
			if (null != session) {
				SQLQuery query = session.createSQLQuery(WSRConstants.GET_LOGIN_DETAILS);
				query.setParameter("userName", username);
				list = query.list();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
