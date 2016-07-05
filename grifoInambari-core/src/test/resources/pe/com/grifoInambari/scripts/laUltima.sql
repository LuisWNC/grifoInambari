SELECT dv.quantity FROM voucher v JOIN customer c ON (c.id = v.customerId) JOIN descriptionVenta dv ON (v.id=dv.voucherId) WHERE DATE='2016-07-04' AND dv.productId = 1; 

SELECT dv.quantity
FROM voucher v JOIN customer c ON (c.id = v.customerId)
JOIN descriptionVenta dv ON (v.id=dv.voucherId)
WHERE DATE='2016-07-04'
AND dv.productId = 2; -- Petro

SELECT dv.quantity
FROM voucher v JOIN customer c ON (c.id = v.customerId)
JOIN descriptionVenta dv ON (v.id=dv.voucherId)
WHERE DATE='2016-07-04'
AND dv.productId = 3; -- Kero




SELECT * FROM product;


