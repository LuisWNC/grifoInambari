

SELECT * FROM userSystem;

INSERT INTO baseType VALUES('USER_INACT','STATUS_USER','Inactivo',NULL,NULL);
INSERT INTO baseType VALUES('USER_ACT','STATUS_USER','Activo',NULL,NULL);


INSERT INTO userSystem VALUES(1,'Hernan','VilcaHernan','16/07/03','16/07/03','USER_ACT',1);

UPDATE userSystem SET userPassword='HernanVilca' WHERE id=1;
