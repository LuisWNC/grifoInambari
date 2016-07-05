package pe.com.grifoInambari.service.services;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.grifoInambari.core.dao.VoucherDAO;
import pe.com.grifoInambari.core.domain.Voucher;
import pe.com.grifoInambari.core.security.Comprobante;

public class VoucherServiceImpl implements VoucherService{

	@Autowired
	private VoucherDAO voucherDAO;
	
	public Comprobante findValidateComprobante(String numVoucher,String typeVoucher,String subTotal,String total){
		Voucher voucher = voucherDAO.findVoucherByNumVoucherTypeVocherTotalAndSubTotal(numVoucher, typeVoucher, subTotal, total);
		
		Comprobante comprobante =null;
		if(voucher!=null){
			comprobante =new Comprobante();
			comprobante.setNumVoucher(voucher.getNumVoucher()+""+voucher.getTypeVoucher()+""+voucher.getSubTotal()+""+voucher.getTotal());
			
		}
		
		return comprobante;
				
	}


}
