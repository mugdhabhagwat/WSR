package com.wsr.util;

public interface WSRConstants {

	public static final String GET_LOGIN_DETAILS = "SELECT  pu.user_id, pu.password, pr.role_description FROM projectusers pu,projectuserroles pru, projectroles pr WHERE pu.user_id=pru.user_id AND pr.role_id=pru.role_id AND pu.username=:userName";

}
