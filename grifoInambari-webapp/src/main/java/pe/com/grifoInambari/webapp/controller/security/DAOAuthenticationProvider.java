package pe.com.grifoInambari.webapp.controller.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;


public class DAOAuthenticationProvider implements AuthenticationProvider {

	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		
		UsernamePasswordAuthenticationToken successToken=null;
		
		String userName= authentication.getPrincipal().toString();
		String password= authentication.getCredentials().toString();
		if(userName.equals("admin")&& password.equals("admin123")){
			List<GrantedAuthority> authority= new ArrayList<GrantedAuthority>();
			successToken= new UsernamePasswordAuthenticationToken(userName, password,authority);
					
		}
		return successToken;
	}

	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
