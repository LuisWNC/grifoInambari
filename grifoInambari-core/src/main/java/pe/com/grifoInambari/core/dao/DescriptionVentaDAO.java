package pe.com.grifoInambari.core.dao;

import pe.com.grifoInambari.core.domain.DescriptionVenta;

public interface DescriptionVentaDAO {

	DescriptionVenta findDescriptionVentaBy(String quantity, String priceUnitary, String priceTotal);
	String[] findRoleByDescriptionVentaId(Long descriptionVentaId);
}
