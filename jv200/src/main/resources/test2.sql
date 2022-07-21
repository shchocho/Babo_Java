
INSERT INTO Customer(name,ssn) VALUES ('James Bond','900101-1234567');

INSERT INTO Account(accountType, balance, interesRATE, customerid) VALUES('C',2000.0,0.03,1001);

UPDATE Customer SET name = ‘Jason Bourne’ WHERE cid = 1002;

DELETE FROM Customer WHERE cid = 1002;

SELECT accountType, balance FROM Account WHERE aid = 3001;