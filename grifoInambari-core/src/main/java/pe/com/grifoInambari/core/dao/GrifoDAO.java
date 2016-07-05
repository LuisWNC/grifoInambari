package pe.com.grifoInambari.core.dao;

import java.util.List;

import pe.com.grifoInambari.core.domain.StatusGrifo;
import pe.com.grifoInambari.core.domain.Grifo;

public interface GrifoDAO {
	
	Grifo findGrifoById(Long id); 
	
	void deleteGrifo(Grifo grifo);
	
	List<Grifo> findGrifo();
	
	void updateGrifo(Grifo grifo);

	void saveGrifo(Grifo grifo);
	
	

}
