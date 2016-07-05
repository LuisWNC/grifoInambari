package pe.com.grifoInambari.core.dao;

import java.util.List;

import pe.com.grifoInambari.core.domain.StatusGrifo;
import pe.com.grifoInambari.core.domain.Grifo;

public class GrifoDAOImpl  extends BaseDAOHibernate implements GrifoDAO{

	
	public Grifo findGrifoById(Long id) {
		return findById(Grifo.class, id);
	}
	
	public void deleteGrifo(Grifo grifo) {
		delete(grifo);
	}
	
	public List<Grifo> findGrifo() {
		return find(Grifo.class, "from Grifo");
	}
	
	public void updateGrifo(Grifo grifo){
		update(grifo);
	}

	public void saveGrifo(Grifo grifo) {
		save(grifo);
	}
	
	public List<StatusGrifo> findStatusGrifo() {
		return find(StatusGrifo.class, "from StatusGrifo");
	}
	
	
	
	
	

}
