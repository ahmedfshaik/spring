DROP TABLE DECL_TX_WITHDRAW;
DROP TABLE DECL_TX_DEPOSIT;
CREATE TABLE DECL_TX_WITHDRAW( ACCNO INTEGER PRIMARY KEY,NAME VARCHAR(100),AMOUNT INTEGER);
CREATE TABLE DECL_TX_DEPOSIT( ACCNO INTEGER PRIMARY KEY,NAME VARCHAR(100),AMOUNT INTEGER);
INSERT INTO DECL_TX_WITHDRAW VALUES(1,'AHMED',100);
INSERT INTO DECL_TX_DEPOSIT VALUES(1,'SABEEHA',100);


CREATE TABLE PRG_TX_WITHDRAW( ACCNO INTEGER PRIMARY KEY,NAME VARCHAR(100),AMOUNT INTEGER);
CREATE TABLE PRG_TX_DEPOSIT( ACCNO INTEGER PRIMARY KEY,NAME VARCHAR(100),AMOUNT INTEGER);
INSERT INTO PRG_TX_WITHDRAW VALUES(1,'AHMED',100);
INSERT INTO PRG_TX_DEPOSIT VALUES(1,'SABEEHA',100);