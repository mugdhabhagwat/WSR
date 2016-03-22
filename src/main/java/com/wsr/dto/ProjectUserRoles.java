package com.wsr.dto;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "ProjectUserRoles", catalog = "wsrreport")
@AssociationOverrides({
		@AssociationOverride(name = "pk.ProjectUsers", 
			joinColumns = @JoinColumn(name = "user_id")),
		@AssociationOverride(name = "pk.ProjectRoles", 
			joinColumns = @JoinColumn(name = "role_id")) })
public class ProjectUserRoles {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="role_id")
	private String roleId;
	
	@Column(name="user_id" )
	private int user_id;

}
