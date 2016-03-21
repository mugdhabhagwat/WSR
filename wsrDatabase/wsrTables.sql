CREATE TABLE IF NOT EXISTS `ProjectUsers` (
`user_id` INT(11) NOT NULL AUTO_INCREMENT,
`username` VARCHAR(45) NOT NULL,
`password` VARCHAR(45) NOT NULL,
`created_by` VARCHAR(20) DEFAULT NULL, /*not in use currently*/
`created_on` DATE DEFAULT NULL,
`last_updated_by` VARCHAR(20) DEFAULT NULL, /*not in use currently*/
`last_updated_on` DATE DEFAULT NULL, /*not in use currently*/
PRIMARY KEY(user_id)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS `ProjectRoles` (
`role_id` INT(11) NOT NULL AUTO_INCREMENT,
`role_description` VARCHAR(45) DEFAULT NULL,
PRIMARY KEY(role_id)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS `ProjectUserRoles` (
`role_id` INT(11) NOT NULL,
`user_id` INT(11) NOT NULL,
CONSTRAINT fk_roleid FOREIGN KEY (role_id) REFERENCES ProjectRoles(role_id),
CONSTRAINT fk_userid FOREIGN KEY (user_id) REFERENCES ProjectUsers(user_id),
PRIMARY KEY(role_id,user_id)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS `Project` (
`proj_id` INT(11) NOT NULL AUTO_INCREMENT,
`name` VARCHAR(45) DEFAULT NULL,
`description` VARCHAR(100) DEFAULT NULL,
`owner` VARCHAR(20) DEFAULT NULL, /*not in use currently*/
`start_date` DATE DEFAULT NULL,
`end_date` DATE DEFAULT NULL,
`last_updated_by` VARCHAR(20) DEFAULT NULL, /*not in use currently*/
`last_updated_on` DATE DEFAULT NULL, /*not in use currently*/
PRIMARY KEY(proj_id)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS `ProjectDetails` (
`proj_details_id` INT(11) NOT NULL AUTO_INCREMENT, 
`proj_id` INT(11) ,
`last_updated_by` VARCHAR(20) DEFAULT NULL,
`last_updated_on` DATE DEFAULT NULL,
`week_start_date` DATE DEFAULT NULL,
`week_end_date` DATE DEFAULT NULL,
CONSTRAINT fk_projid FOREIGN KEY (proj_id) REFERENCES Project(proj_id),
PRIMARY KEY(proj_details_id)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
