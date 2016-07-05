package pe.com.grifoInambari.core.dao;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.SQLQuery;

import pe.com.grifoInambari.core.domain.Voucher;

public class VoucherDAOImpl extends BaseDAOHibernate implements VoucherDAO {

	public Voucher findVoucherByNumVoucherTypeVocherTotalAndSubTotal(String numVoucher, String typeVoucher,
			String subTotal, String total) {
		String query = " from Voucher WHERE descriptionVenta = '" + numVoucher + "' ";
		query = query + " and typeVoucher = '" + typeVoucher + " '";
		query = query + " and subTotal = '" + subTotal + " '";
		query = query + " and total = '" + total + " '";
		return findFirst(Voucher.class, query);

	}

	public String[] findRoleByVoucherId(Long voucherId) {
		String sql = " " + " " + voucherId;

		SQLQuery query = getSession().createSQLQuery(sql);

		List<Object> list = query.list();

		String[] voucher = new String[list.size()];

		for (int i = 0; i < list.size(); i++) {
			voucher[i] = (String) list.get(i);
		}
		return voucher;

	}

	public BigDecimal findQuantityByDateAndProductId(Long productId, String toDay) {
		String sql = "SELECT dv.quantity FROM voucher v JOIN customer c ON (c.id = v.customerId) "
				+ " JOIN descriptionVenta dv ON (v.id=dv.voucherId) WHERE DATE='" + toDay + "' "
				+ " AND dv.productId = " + productId;

		SQLQuery query = getSession().createSQLQuery(sql);

		List<Object> list = query.list();

		
		System.out.println("list :: "+list);
		
		return null;
	}

}
