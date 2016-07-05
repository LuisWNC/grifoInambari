package pe.com.grifoInambari.core.dao;

import pe.com.grifoInambari.core.domain.UserSystem;

public interface UserSystemDAO {

	UserSystem findUserSystemByUserAndPassword(String user, String password);

	String[] findRoleByUserId(Long userId);

}
