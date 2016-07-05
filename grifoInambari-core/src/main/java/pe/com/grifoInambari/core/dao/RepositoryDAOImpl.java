package pe.com.grifoInambari.core.dao;

import java.util.List;

import org.hibernate.SQLQuery;

import pe.com.grifoInambari.core.domain.Repository;

public class RepositoryDAOImpl extends BaseDAOHibernate implements RepositoryDAO{

	

	public Repository findRepositoryByCodeANDAllGalonesANDCombusMax(String code, Double allGalones, Double combusMax){
		String query = " from Repository WHERE grifo AND product= '" + code + "' ";
		query = query + " and allGalones = '" + allGalones + " '";
		query = query + " and combusMax = '" + combusMax+ " '";
		
		return findFirst(Repository.class,query);
		
	}
	
	public String[] findRoleByRepositoryId(Long repositoryId){
		String sql = " "+ " " + repositoryId;
		
		SQLQuery query = getSession().createSQLQuery(sql);
		
		List<Object> list =query.list();
		
		String[] repository = new String[list.size()] ;

		for (int i = 0; i < list.size(); i++) {
			repository [i] = (String) list.get(i);
		}
		
		return repository ;

	}

}
