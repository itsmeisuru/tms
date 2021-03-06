DROP SCHEMA IF EXISTS tms_shema;
CREATE SCHEMA tms_shema;
USE tms_shema;

CREATE TABLE user (
  userid INT UNSIGNED NOT NULL AUTO_INCREMENT,
  username VARCHAR(45) NOT NULL,
  password VARCHAR(45) NOT NULL,
  PRIMARY KEY  (userid),
  KEY idx_user_username (username)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE role (
  roleid SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
  rolename VARCHAR(20) NOT NULL,
  PRIMARY KEY  (roleid),
  KEY idx_role_rolename (rolename)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE userpermission (
  permissionid SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
  userid INT UNSIGNED NOT NULL,
  roleid SMALLINT UNSIGNED NOT NULL,
  PRIMARY KEY  (permissionid),
  FOREIGN KEY (userid) REFERENCES user(userid) ON DELETE CASCADE,
  FOREIGN KEY (roleid) REFERENCES role(roleid) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=utf8;




