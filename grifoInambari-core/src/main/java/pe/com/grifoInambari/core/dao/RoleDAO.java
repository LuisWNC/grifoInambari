package pe.com.grifoInambari.core.dao;

import pe.com.grifoInambari.core.domain.Role;

public interface RoleDAO {

	 Role findRoleByNameRoleANDDescriptionANDUrlRole(String nameRole, String description, String urlRole);
	 
	 String[] findRoleByRoleId(Long roleId);
}
