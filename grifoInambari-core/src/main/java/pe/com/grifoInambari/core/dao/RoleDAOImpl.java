package pe.com.grifoInambari.core.dao;

import java.util.List;

import org.hibernate.SQLQuery;

import pe.com.grifoInambari.core.domain.Role;

public class RoleDAOImpl extends BaseDAOHibernate implements RoleDAO{

	
	public Role findRoleByNameRoleANDDescriptionANDUrlRole(String nameRole, String description, String urlRole){
		String query = " from Role WHERE accessRole = '" + nameRole + "' ";
		query = query + " and description = '" + description + " '";
		query = query + " and urlRole = '" + urlRole+ " '";
		query = query + " AND STATUS = 'ROLE_ACT' ";
		return findFirst(Role.class, query);
		
	}
	
	public String[] findRoleByRoleId(Long roleId){
		String sql = " "+ " " + roleId;
		
		SQLQuery query = getSession().createSQLQuery(sql);
		
		List<Object> list =query.list();
		
		String[] role = new String[list.size()] ;

		for (int i = 0; i < list.size(); i++) {
			role [i] = (String) list.get(i);
		}
		
		return role ;

	}

}
