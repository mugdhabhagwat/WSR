package com.wsr.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wsr.dto.LoginDto;

@Repository
public class LoginDaoImpl  implements LoginDao  {
	
	@Autowired 
	HibernateTemplate hibernateTemplate;

	@SuppressWarnings("rawtypes")
	public List getUser() {
		List list=null;
		try{
			list=hibernateTemplate.loadAll(LoginDto.class);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return list;
	}

}
