ALTER TABLE persona DROP COLUMN estado;

INSERT INTO baseType VALUES('GRIFO_INACT','STATUS_GRIFO','Inactivo',NULL,NULL);
INSERT INTO baseType VALUES('GRIFO_ACT','STATUS_GRIFO','Activo',NULL,NULL);


INSERT INTO baseType VALUES('USER_INACT','STATUS_USER','Inactivo',NULL,NULL);
INSERT INTO baseType VALUES('USER_ACT','STATUS_USER','Activo',NULL,NULL);


INSERT INTO baseType VALUES('ACCESSROLE_INACT','STATUS_ACCESSROLE','Inactivo',NULL,NULL);
INSERT INTO baseType VALUES('ACCESSROLE_ACT','STATUS_ACCESSROLE','Activo',NULL,NULL);


INSERT INTO baseType VALUES('ENTERPRICE_INACT','STATUS_ENTERPRICE','Inactivo',NULL,NULL);
INSERT INTO baseType VALUES('ENTERPRICE_ACT','STATUS_ENTERPRICE','Activo',NULL,NULL);


INSERT INTO baseType VALUES('PRODUCT_INACT','STATUS_PRODUCT','Inactivo',NULL,NULL);
INSERT INTO baseType VALUES('PRODUCT_ACT','STATUS_PRODUCT','Activo',NULL,NULL);


INSERT INTO baseType VALUES('ROLE_INACT','STATUS_ROLE','Inactivo',NULL,NULL);
INSERT INTO baseType VALUES('ROLE_ACT','STATUS_ROLE','Activo',NULL,NULL);






SELECT * FROM grifo;
SELECT * FROM person;



INSERT INTO baseType VALUES('GRIFO_INACT','STATUS_GRIFO','Inactivo',NULL,NULL);
INSERT INTO baseType VALUES('GRIFO_ACT','STATUS_GRIFO','Activo',NULL,NULL);


INSERT INTO person VALUES(1,'Hernan','Vilca','Masco','932312134','73625324','av:lima','masculino');


INSERT INTO grifo VALUES(1,1,'Grifo Inambari','20743647321','inambari','1','boleta','932635463','001','GRIFO_ACT');

UPDATE grifo SET businessName='GRIFO INAMBARI'WHERE id IN(2,3);
UPDATE grifo SET address ='Inambari' WHERE id=1;






SELECT * FROM userSystem;

INSERT INTO baseType VALUES('USER_INACT','STATUS_USER','Inactivo',NULL,NULL);
INSERT INTO baseType VALUES('USER_ACT','STATUS_USER','Activo',NULL,NULL);


INSERT INTO userSystem VALUES(1,'Hernan','VilcaHernan','16/07/03','16/07/03','USER_ACT',1);

UPDATE userSystem SET userPassword='HernanVilca' WHERE id=1;




SELECT * FROM customer;

INSERT INTO customer VALUES(1,1,'Hernan','16/07/03','16/07/03','Hernan Vilca','1');





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




SELECT * FROM price;

INSERT INTO price VALUES(1,1,1,'11.50')




SELECT * FROM repository;

INSERT INTO repository VALUES(1,'001','1200',1,'2400 galones',1);




SELECT * FROM role;

INSERT INTO baseType VALUES('ROLE_INACT','STATUS_ROLE','Inactivo',NULL,NULL);
INSERT INTO baseType VALUES('ROLE_ACT','STATUS_ROLE','Activo',NULL,NULL);


INSERT INTO role VALUES(1,'Grifero','empleado','gfsd','ROLE_ACT');

