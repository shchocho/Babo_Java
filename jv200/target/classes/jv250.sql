DROP TABLE Sample10;

CREATE TABLE Sample10(
	no			INT(11)		DEFAULT NULL,
	name		VARCHAR(20)	DEFAULT NULL,
	birthday	DATE		DEFAULT NULL,
	address		VARCHAR(40)	DEFAULT NULL
);

SELECT * FROM Sample10;

INSERT INTO Sample10 VALUES (1, '유비', '1998-04-06', '대구 중구 반월당');
INSERT INTO Sample10 VALUES (2, '관우', '274-04-06', '대구 중구 교동');
INSERT INTO Sample10 VALUES (3, '장비', '165-04-06', '대구 중구 교동');

CREATE TABLE Customer(
	cid			BIGINT		PRIMARY KEY AUTO_INCREMENT,
	name		VARCHAR(20)	NOT NULL,
	ssn			CHAR(14)	NOT NULL,
	phone		VARCHAR(14)	DEFAULT NULL,
	userID	VARCHAR(16)	NOT NULL,
	passwd		VARCHAR(16)	NOT NULL,
	regDate		TIMESTAMP	NOT NULL	DEFAULT CURRENT_TIMESTAMP
) AUTO_INCREMENT = 1001;


ALTER TABLE Customer CHANGE customerId userId VARCHAR(16) NOT NULL;

ALTER TABLE Account CHANGE accountNum accountNum VARCHAR(16) NOT NULL;

DELETE FROM Account WHERE aid = 3016;
DELETE FROM Account WHERE customerId = 1009;


SELECT * FROM Customer;

INSERT INTO Customer(name,ssn,phone,userId,passwd) VALUES('유비','991122-1234567',
'010-1234-12234','java','1234'); 
INSERT INTO Customer(name,ssn,phone,userId,passwd) VALUES('관우','971122-1234567',
'010-1234-12234','c++','1234'); 
INSERT INTO Customer(name,ssn,phone,userId,passwd) VALUES('장비','071122-1234567',
'010-1234-12234','pafer','1234'); 

UPDATE Customer SET ssn = '991122-1234567',phone='010-4685-9998' WHERE cid=1003;

DELETE FROM Customer WHERE cid = 1001;

CREATE TABLE Account(
	aid 		BIGINT 		PRIMARY KEY AUTO_INCREMENT,
	accountNum 	VARCHAR(12) NOT NULL DEFAULT '000-00-0000' , 		-- 111-11-1111
	balance		DOUBLE		NOT NULL DEFAULT 0.0,
	interesRATE DOUBLE		NOT NULL DEFAULT 0.0,
	overdraft	DOUBLE		NOT NULL DEFAULT 0.0,
	accountType CHAR(1)		NOT NULL DEFAULT  'S',
	customerId	BIGINT		NOT NULL,	
	regDate		TIMESTAMP	NOT NULL DEFAULT CURRENT_TIMESTAMP,
	
	CONSTRAINT Account_customerID_FK FOREIGN KEY (customerId) REFERENCES Customer(cid)
)AUTO_INCREMENT = 3001;

DROP TABLE Account;

INSERT INTO Account(accountNum, balance, overdraft, accountType, customerId) VALUES('456-489-7899', 45680.0, 999990.0, 'C', 1002);

SELECT * FROM Account;

SELECT * FROM Account a INNER JOIN Customer c ON a.customerID = c.cid;


SELECT * FROM Account a INNER JOIN Customer c ON a.customerId = c.cid
WHERE c.ssn = '991122-1234567';

DROP TABLE Customer;


