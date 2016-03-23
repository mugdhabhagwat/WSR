package com.wsr.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ProjectRoles")
public class ProjectRoles {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="role_id")
	private String roleId;
	
	@Column(name="role_description")
	private String roleDescription;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "projectRoles")
	private Set<ProjectUsers> projectUsers = new HashSet<ProjectUsers>(0);

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public Set<ProjectUsers> getProjectUserRoles() {
		return this.projectUsers;
	}

	public void setProjectUsers(Set<ProjectUsers> projectUsers) {
		this.projectUsers = projectUsers;
	}
}
