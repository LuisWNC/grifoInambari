SELECT * FROM grifo;
SELECT * FROM person;



INSERT INTO baseType VALUES('GRIFO_INACT','STATUS_GRIFO','Inactivo',NULL,NULL);
INSERT INTO baseType VALUES('GRIFO_ACT','STATUS_GRIFO','Activo',NULL,NULL);


INSERT INTO person VALUES(1,'Hernan','Vilca','Masco','932312134','73625324','av:lima','masculino');


INSERT INTO grifo VALUES(1,1,'Grifo Inambari','20743647321','inambari','1','boleta','932635463','001','GRIFO_ACT');

UPDATE grifo SET businessName='GRIFO INAMBARI'WHERE id IN(2,3);
UPDATE grifo SET address ='Inambari' WHERE id=1;

