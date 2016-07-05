
CREATE TABLE person
(
	id                 BIGINT NOT NULL AUTO_INCREMENT,
	name               VARCHAR(30) NULL,
	lastNameF          VARCHAR(25) NULL,
	lastNameM          VARCHAR(25) NULL,
	phone              VARCHAR(25) NULL,
	numDocument        VARCHAR(20) NULL,
	address            VARCHAR(70) NULL,
	sexo               VARCHAR(20) NULL,
	PRIMARY KEY (id)
);



CREATE TABLE grifo
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	personId             BIGINT NULL,
	businessName         VARCHAR(70) NULL,
	ruc                  VARCHAR(11) NULL,
	address              VARCHAR(70) NULL,
	numVoucher           VARCHAR(20) NULL,
	typeVoucher          VARCHAR(20) NULL,
	phone                VARCHAR(30) NULL,
	code                 VARCHAR(30) NULL,
	status               VARCHAR(20) NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_8 (personId) REFERENCES person (id)
);



CREATE TABLE product
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	nameProduct	         VARCHAR(25) NULL,
	typeProduct          VARCHAR(25) NULL,
	description          VARCHAR(50) NULL,
	price                VARCHAR(20) NULL,
	attribute            VARCHAR(20) NULL,
	status               VARCHAR(20) NULL,
	cretedBy             VARCHAR(20) NULL,
	dateCreated          TIMESTAMP NULL,
	dateLastUpdated      TIMESTAMP NULL,
	lastUpdatedBy        VARCHAR(20) NULL,
	version              INTEGER NULL,
	PRIMARY KEY (id)
);



CREATE TABLE price
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	grifoId              BIGINT NOT NULL,
	productId            BIGINT NOT NULL,
	price                VARCHAR(20) NULL,
	PRIMARY KEY (id,grifoId,productId),
	FOREIGN KEY R_40 (grifoId) REFERENCES grifo (id),
	FOREIGN KEY R_41 (productId) REFERENCES product (id)
);



CREATE TABLE customer
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	personId             BIGINT NULL,
	createdBy            VARCHAR(25) NULL,
	dateCreated          TIMESTAMP NULL,
	dateLastUpdated      TIMESTAMP NULL,
	lastUpdatedBy        VARCHAR(20) NULL,
	version              INTEGER NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_10 (personId) REFERENCES person (id)
);



CREATE TABLE enterPrice
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	nameEnterPrice       VARCHAR(70) NULL,
	ruc                  VARCHAR(11) NULL,
	phone                VARCHAR(35) NULL,
	address              VARCHAR(80) NULL,
	pagWeb               VARCHAR(80) NULL,
	status               VARCHAR(20) NULL,
	PRIMARY KEY (id)
);



CREATE TABLE voucher
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	date                 TIMESTAMP NULL,
	numVoucher           VARCHAR(20) NULL,
	typeVoucher          VARCHAR(20) NULL,
	subTotal             VARCHAR(25) NULL,
	total                VARCHAR(25) NULL,
	dateEnd              TIMESTAMP NULL,
	customerId           BIGINT NULL,
	enterPriceId         BIGINT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_43 (customerId) REFERENCES customer (id),
	FOREIGN KEY R_46 (enterPriceId) REFERENCES enterPrice (id)
);



CREATE TABLE descriptionVenta
(
	id                    BIGINT NOT NULL AUTO_INCREMENT,
	productId             BIGINT NULL,
	quantity              varchar(20) NULL,
	priceUnitary          varchar(20) NULL,
	priceAll              varchar(20) NULL,
	voucherId             BIGINT NULL,
	customerId            BIGINT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_14 (productId) REFERENCES product (id),
	FOREIGN KEY R_30 (voucherId) REFERENCES voucher (id),
	FOREIGN KEY R_31 (customerId) REFERENCES customer (id)
);



CREATE TABLE repository
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	code                 VARCHAR(20) NULL,
	allGalones           DECIMAL(5,2) NULL,
	productId            BIGINT NULL,
	combusMax            DECIMAL(5,2) NULL,
	grifoId              BIGINT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_15 (productId) REFERENCES product (id),
	FOREIGN KEY R_42 (grifoId) REFERENCES grifo (id)
);



CREATE TABLE userSystem
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	userName      	     VARCHAR(30) NULL,
	userPassword         VARCHAR(20) NULL,
	dateIni              TIMESTAMP NULL,
	dateEnd              TIMESTAMP NULL,
	status               VARCHAR(20) NULL,
	personId             BIGINT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_39 (personId) REFERENCES person (id)
);



CREATE TABLE role
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	nameRole             VARCHAR(30) NULL,
	description          VARCHAR(40) NULL,
	urlRole               VARCHAR(20) NULL,
	status               VARCHAR(20) NULL,
	PRIMARY KEY (id)
);



CREATE TABLE accessRole
(
	userSystemId         BIGINT NOT NULL,
	roleId               BIGINT NOT NULL,
	grifoId              BIGINT NOT NULL,
	status               VARCHAR(20) NULL,
	PRIMARY KEY (userSystemId,roleId,grifoId),
	FOREIGN KEY R_5 (userSystemId) REFERENCES userSystem (id),
	FOREIGN KEY R_6 (roleId) REFERENCES role (id),
	FOREIGN KEY R_7 (grifoId) REFERENCES grifo (id)
);


CREATE TABLE baseType
(
	typeCode             VARCHAR(20) NOT NULL,
	typeCategory         VARCHAR(20) NULL,
	description          VARCHAR(100) NULL,
	attribute1           VARCHAR(20) NULL,
	orderBy              INTEGER NULL,
	PRIMARY KEY (typeCode)
);

