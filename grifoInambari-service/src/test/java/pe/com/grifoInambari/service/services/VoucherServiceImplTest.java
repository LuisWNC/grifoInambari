package pe.com.grifoInambari.service.services;

import org.springframework.beans.factory.annotation.Autowired;

public class VoucherServiceImplTest extends AbstractUnitTest{

	@Autowired
	protected VoucherService voucherService;
	
	
	public void testVoucherDAO() {
		System.out.println("voucherService ::: "+voucherService);
	}
	
	public void testFindQuantityByDateAndProductId() {
		
	}
}
