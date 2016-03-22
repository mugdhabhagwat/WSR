package com.wsr.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProjectUsers")
public class LoginDto implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="user_id" )
	private int user_id;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_on")
	private Date createdOn;
	
	@Column(name="last_updated_by")
	private String lastUpdatedBy;
	
	@Column(name="last_updated_on")
	private String lastUpdatedOn; 
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

}
