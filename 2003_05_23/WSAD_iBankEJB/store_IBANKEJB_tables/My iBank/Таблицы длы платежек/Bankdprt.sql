--  Generate SQL 
--  Version:                   	V5R1M0 010525 
--  Generated on:              	14.08.02 16:31:55 
--  Relational Database:       	BNK400DB 
--  Standards Option:          	DB2 UDB AS/400 
  
DROP TABLE RSB59TB.BANKDPRT ; 
  
CREATE TABLE RSB59TB.BANKDPRT ( 
	PARTYID INTEGER NOT NULL DEFAULT 0 , 
	BIC_RCC CHAR(10) CCSID 1025 NOT NULL DEFAULT '' , 
	KINDDEPART CHAR(6) CCSID 1025 NOT NULL DEFAULT '' , 
	BIC_GENERAL FOR COLUMN BIC_GENERA CHAR(10) CCSID 1025 NOT NULL DEFAULT '' , 
	REGION CHAR(3) CCSID 1025 NOT NULL DEFAULT '' , 
	PLACE CHAR(6) CCSID 1025 NOT NULL DEFAULT '' , 
	CHECKALG SMALLINT NOT NULL DEFAULT 0 , 
	CHECKDATA CHAR(13) CCSID 1025 NOT NULL DEFAULT '' , 
	BLNC_RCC CHAR(4) CCSID 1025 NOT NULL DEFAULT '' , 
	"LOCK" CHAR(1) CCSID 1025 NOT NULL DEFAULT '' , 
	CORACC CHAR(26) CCSID 1025 NOT NULL DEFAULT '' , 
	REPT CHAR(1) CCSID 1025 NOT NULL DEFAULT '' , 
	VKEY CHAR(9) CCSID 1025 NOT NULL DEFAULT '' , 
	NOTBANK CHAR(1) CCSID 1025 NOT NULL DEFAULT '' , 
	RESERVE CHAR(89) CCSID 1025 NOT NULL DEFAULT '' ) ; 
  
LABEL ON TABLE RSB59TB.BANKDPRT 
	IS 'BANKDPRT.DBT' ; 
  
LABEL ON COLUMN RSB59TB.BANKDPRT 
( PARTYID IS 'INT4' , 
	BIC_RCC IS 'ZSTRING' , 
	KINDDEPART IS 'ZSTRING' , 
	BIC_GENERAL IS 'ZSTRING' , 
	REGION IS 'ZSTRING' , 
	PLACE IS 'ZSTRING' , 
	CHECKALG IS 'INT2' , 
	CHECKDATA IS 'ZSTRING' , 
	BLNC_RCC IS 'ZSTRING' , 
	"LOCK" IS 'STRING' , 
	CORACC IS 'ZSTRING' , 
	REPT IS 'STRING' , 
	VKEY IS 'ZSTRING' , 
	NOTBANK IS 'STRING' , 
	RESERVE IS 'ZSTRING' ) ; 
  
LABEL ON COLUMN RSB59TB.BANKDPRT 
( PARTYID TEXT IS '������������� ��������' , 
	BIC_RCC TEXT IS '��� ���' , 
	KINDDEPART TEXT IS '��� ��������� ����� �� ��' , 
	BIC_GENERAL TEXT IS '��� ������' , 
	REGION TEXT IS '������ � ������������� ��' , 
	PLACE TEXT IS '���������� ����� � ������������� ��' , 
	CHECKALG TEXT IS '�������� �������� �����' , 
	CHECKDATA TEXT IS '������ ��� �������� �����' , 
	BLNC_RCC TEXT IS '���������� ���� � ���' , 
	"LOCK" TEXT IS '������� ����������' , 
	CORACC TEXT IS '�������' , 
	REPT TEXT IS '������� ������ �������' , 
	VKEY TEXT IS '���������� ����' , 
	NOTBANK TEXT IS '������� ������������ ��������� ���.' , 
	RESERVE TEXT IS '������' ) ; 
  
