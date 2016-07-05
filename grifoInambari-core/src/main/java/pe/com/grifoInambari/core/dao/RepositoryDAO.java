package pe.com.grifoInambari.core.dao;

import pe.com.grifoInambari.core.domain.Repository;

public interface RepositoryDAO {

	Repository findRepositoryByCodeANDAllGalonesANDCombusMax(String code, Double allGalones, Double combusMax);
	
	String[] findRoleByRepositoryId(Long repositoryId);
}
