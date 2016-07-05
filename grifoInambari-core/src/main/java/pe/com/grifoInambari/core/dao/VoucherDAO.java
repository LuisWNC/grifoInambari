package pe.com.grifoInambari.core.dao;

import java.math.BigDecimal;

import pe.com.grifoInambari.core.domain.Voucher;

public interface VoucherDAO {

	Voucher findVoucherByNumVoucherTypeVocherTotalAndSubTotal(String numVoucher, String typeVoucher,
			String subTotal, String total);

	String[] findRoleByVoucherId(Long voucherId);

	BigDecimal findQuantityByDateAndProductId(Long productId, String toDay);

}
