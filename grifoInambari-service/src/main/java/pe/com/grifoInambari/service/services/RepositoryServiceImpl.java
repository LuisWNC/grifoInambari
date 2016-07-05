package pe.com.grifoInambari.service.services;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.grifoInambari.core.dao.RepositoryDAO;
import pe.com.grifoInambari.core.domain.Repository;
import pe.com.grifoInambari.core.security.Almacen;

public class RepositoryServiceImpl implements RepositoryService{
	

	@Autowired
	private RepositoryDAO repositoryDAO;
	
	public Almacen findValidateAlmacen(String code ,Double allGalones , Double combusMax){
		Repository repository=repositoryDAO.findRepositoryByCodeANDAllGalonesANDCombusMax(code, allGalones, combusMax);
		Almacen almacen=null;
		if(repository!=null){
			almacen= new Almacen();
			almacen.setCode(repository.getCode()+""+repository.getAllGalones()+""+repository.getCombusMax());
			
		}
		return almacen;
	}
	
	
	
}
