package pe.com.grifoInambari.service.services;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.grifoInambari.core.dao.UserSystemDAO;
import pe.com.grifoInambari.core.domain.UserSystem;
import pe.com.grifoInambari.core.security.User;

public class UserSytemServiceImpl implements UserSytemService{

	@Autowired 
	private UserSystemDAO userSystemDAO;

	
	public User findValidateUser(String userName, String password){
		UserSystem userSystem =userSystemDAO.findUserSystemByUserAndPassword(userName, password);
		User user= null;
		if(userSystem !=null){
			user = new User();
			user.setFullName(userSystem.getPerson().getName()+" "+userSystem.getPerson().getLastNameF()+""+userSystem.getPerson().getLastNameM());
			user.setUserId(userSystem.getId());
			String[] roles=userSystemDAO.findRoleByUserId(userSystem.getId());
			user.setRoles(roles);
			
		}
		
		return user;
		
		
	}
	
}
