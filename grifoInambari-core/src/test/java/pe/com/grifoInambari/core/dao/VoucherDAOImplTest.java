package pe.com.grifoInambari.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

public class VoucherDAOImplTest extends AbstractUnitTest {

	@Autowired
	protected VoucherDAO voucherDAO;

	public void testVoucherDAO() {
		System.out.println("::: " + voucherDAO.findQuantityByDateAndProductId(1L, "2016-07-04"));
	}
}
