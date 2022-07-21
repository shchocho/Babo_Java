



CREATE INDEX CustomerIndex ON Customer(ssn);

SELECT aid,accountNum, accountType, balance, cid FROM Account a INNER JOIN Customer c ON a.customerId = c.cid
WHERE c.ssn = '840104-1234567';