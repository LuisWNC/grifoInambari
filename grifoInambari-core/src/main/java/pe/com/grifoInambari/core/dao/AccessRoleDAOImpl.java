package pe.com.grifoInambari.core.dao;

import java.util.List;

import org.hibernate.SQLQuery;

import pe.com.grifoInambari.core.domain.AccessRole;

public class AccessRoleDAOImpl extends BaseDAOHibernate implements AccessRoleDAO{


	public AccessRole findAccessRoleBy(String r){
		String query = " from AccessRole WHERE grifo = '" + r + "' ";
		query = query + " AND STATUS = 'ACCESSROLE_ACT' ";
		return findFirst(AccessRole.class, query);
		
	}
	
	public String[] findRoleByAccessRoleId(Long accessRoleId){
		String sql = " "+ " " + accessRoleId;
		
		SQLQuery query = getSession().createSQLQuery(sql);
		
		List<Object> list =query.list();
		
		String[] accessRole = new String[list.size()] ;

		for (int i = 0; i < list.size(); i++) {
			accessRole[i] = (String) list.get(i);
		}
		
		return accessRole;

	}

	

}
