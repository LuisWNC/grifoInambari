SELECT * FROM descriptionVenta;
SELECT * FROM product;
SELECT * FROM voucher;
SELECT * FROM customer;
SELECT * FROM enterPrice;

INSERT INTO baseType VALUES('PRODUCT_INACT','STATUS_PRODUCT','Inactivo',NULL,NULL);
INSERT INTO baseType VALUES('PRODUCT_ACT','STATUS_PRODUCT','Activo',NULL,NULL);

INSERT INTO product VALUES(1,'gasolina','combustible','liquido','11.50','en Venta','PRODUCT_ACT','Hernan','','','Hernan Vilca','1');
INSERT INTO product VALUES(2,'petroleo','combustible','liquido','13.50','en Venta','PRODUCT_ACT','Hernan','','','Hernan Vilca','2');

UPDATE product SET nameProduct='Petroleo' WHERE id IN(1,2);
UPDATE product SET description ='Gasolina' WHERE id=1;



INSERT INTO voucher VALUES(1,'','1','boleta','90','98','',1,1);

INSERT INTO baseType VALUES('ENTERPRICE_INACT','STATUS_ENTERPRICE','Inactivo',NULL,NULL);
INSERT INTO baseType VALUES('ENTERPRICE_ACT','STATUS_ENTERPRICE','Activo',NULL,NULL);


INSERT INTO enterPrice VALUES(1,'Hernan','20734637211','938336273','Arequipa','grifoinambari.web','ENTERPRICE_ACT'); 


INSERT INTO descriptionVenta VALUES(1,1,'7 galones',2.3,6,1,1);
