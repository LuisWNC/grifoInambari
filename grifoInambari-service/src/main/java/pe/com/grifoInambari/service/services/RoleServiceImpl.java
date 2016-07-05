package pe.com.grifoInambari.service.services;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.grifoInambari.core.dao.RoleDAO;
import pe.com.grifoInambari.core.domain.Role;
import pe.com.grifoInambari.core.security.Rol;

public class RoleServiceImpl implements RoleService{

	@Autowired 
	private RoleDAO roleDAO;
	
	public Rol findValidateRol(String nameRole, String description, String urlRole ){
		Role role = roleDAO.findRoleByNameRoleANDDescriptionANDUrlRole(nameRole, description, urlRole);
		Rol rol= null;
		if(role !=null){
			rol=new Rol();
			rol.setNameRole(role.getNameRole()+" "+role.getDescription());
			
		}
		return rol;
		}
		
		
	

}
