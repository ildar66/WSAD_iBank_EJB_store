--------------------------- �������� ������ IBANK-----------------------

CONNECT RESET;

-------------------- �������� ���� IBANK-------------------------------- 

CREATE DATABASE IBANKEJB;

CONNECT TO IBANKEJB;

CREATE SCHEMA ILDAR;
------------------------------------------------------------------------

-------------------- �������� ������ ----------------------------------- 
-------------------- '���������� � ��������' ---------------------------
--DROP TABLE ildar.clients ;

CREATE TABLE ildar.clients (
       client_id            INTEGER NOT NULL,
       inn_cln              VARCHAR(12) ,
       okpo                 VARCHAR(8) ,
       name_cln             VARCHAR(160) NOT NULL,
       fio_cln              VARCHAR(160) NOT NULL,
       phone_cln            VARCHAR(40) NOT NULL,
       fax_cln              VARCHAR(40) ,
       email_cln            VARCHAR(256),
       num_dogov            VARCHAR(10) NOT NULL,
       reg_date             DATE NOT NULL,
       perms                CHAR(5) DEFAULT '0' NOT NULL,
       lock_word            VARCHAR(20) NOT NULL,
       ordering_customer    VARCHAR(160) ,
       status               INTEGER DEFAULT 1 NOT NULL,
       cln_type             CHAR(1) NOT NULL,
       kpp                  VARCHAR(9) ,
       doc_sign_num         CHAR(20) NOT NULL,
       ext_client_id        VARCHAR(20) ,
       soato                VARCHAR(20) ,
       resident_flag        CHAR(1) 
);
COMMENT ON TABLE ildar.clients IS '���������� � ��������';

COMMENT ON COLUMN ildar.clients.client_id IS '������������� �������';
COMMENT ON COLUMN ildar.clients.inn_cln IS '��� �������';
COMMENT ON COLUMN ildar.clients.okpo IS '���� �������';
COMMENT ON COLUMN ildar.clients.name_cln IS '������������ �������';
COMMENT ON COLUMN ildar.clients.fio_cln IS '�.�.�. �������������� ���� � �������';
COMMENT ON COLUMN ildar.clients.phone_cln IS '������� �������';
COMMENT ON COLUMN ildar.clients.fax_cln IS '���� �������';
COMMENT ON COLUMN ildar.clients.email_cln IS 'E-mail �������';
COMMENT ON COLUMN ildar.clients.num_dogov IS '����� �������� ����� � �������� �� ���';
COMMENT ON COLUMN ildar.clients.reg_date IS '���� ����������� ������� � ���';
COMMENT ON COLUMN ildar.clients.perms IS '����� ������� (13 ����������� ����):
1 ��� - ������� �������
2 ��� - ������� �������
3 ��� - ������
4 ��� - �������� �������
5 ��� - ��������� �� �������
6 ��� - ��������� �� ������������ �������
7 ��� - ������ �� ������� ������ ';
--8 ��� - ������ �� ������� ������
--9 ��� - ��������� ����������
--10 ��� - ����������� 
--11 ��� - ���������� ���������
--12 ��� - ��������� �� ������ �� �������
--13 ��� - ��������� �� �������� ������� ������';
COMMENT ON COLUMN ildar.clients.lock_word IS '������������� ����� ��� ������������ ������� �� ��������';
COMMENT ON COLUMN ildar.clients.ordering_customer IS '������������ ������� �� ���������� �����';
COMMENT ON COLUMN ildar.clients.status IS '������ �������
0 - ������
1 - ������������
2 - �������';
COMMENT ON COLUMN ildar.clients.cln_type IS '��� �������
1 - ���������� ���� 
0 - ����������� ����';
COMMENT ON COLUMN ildar.clients.kpp IS '��� (��� ���������� �� ����)';
COMMENT ON COLUMN ildar.clients.doc_sign_num IS '����� �������� ��� ���������� ������ ����������. ������������ � ���� ������� �����, ��� �� ������ ��� ��������� �������� �� ��� ����.
1) �������� ��������� ��������� - 0-2
2) ������ - 3-5
--3) ��������� �� ������� - 6-8
--4) ��������� �� ������� - 9-11
--5) ��������� �� ������� - 12-14
--6) ��������� �� ������. ������� - 15-17
�������������� 000 - 1 �������, 001 - 2 ������� � �.�.';
COMMENT ON COLUMN ildar.clients.ext_client_id IS '������������� ������� �� ������� �������';
COMMENT ON COLUMN ildar.clients.soato IS '����� �������';
COMMENT ON COLUMN ildar.clients.resident_flag IS '������� ���������';

ALTER TABLE ildar.clients
       ADD  CONSTRAINT XPKclients PRIMARY KEY (client_id) ;
------------------------------------------------------------------------
--DROP TABLE ildar.address;
CREATE TABLE ildar.address (
       client_id            INTEGER NOT NULL,
       addr_cln             VARCHAR(200) NOT NULL,
       country_code         CHAR(3) ,
       city                 VARCHAR(40) ,
       city_latin           VARCHAR(40) ,
       address_latin        VARCHAR(200)
);
COMMENT ON TABLE ildar.address IS '������ �������';

COMMENT ON COLUMN ildar.address.client_id IS '������������� �������';
COMMENT ON COLUMN ildar.address.addr_cln IS '����� �������';
COMMENT ON COLUMN ildar.address.country_code IS '��� ������ �������';
COMMENT ON COLUMN ildar.address.city IS '����� �������������� �������';
COMMENT ON COLUMN ildar.address.city_latin IS '����� �������������� ������� �� ����������';
COMMENT ON COLUMN ildar.address.address_latin IS '����� ������� �� ���������� �����';

ALTER TABLE ildar.address
       ADD  CONSTRAINT XPKaddress PRIMARY KEY (client_id) ;

ALTER TABLE ildar.adress
       ADD  CONSTRAINT "AddressClient" FOREIGN KEY (client_id)
       REFERENCES ildar.clients ON DELETE RESTRICT;
------------------------------------------------------------------------
------------'���������� ������'-----------------------------------------
--DROP TABLE ildar.banks ;

CREATE TABLE ildar.banks (
       bik                  CHAR(9) NOT NULL,
       bill_corr            CHAR(20) ,
       bank_name            VARCHAR(80) NOT NULL,
       city                 VARCHAR(40) ,
       delivery             VARCHAR(10) 
);
COMMENT ON TABLE ildar.banks IS '���������� ������';

COMMENT ON COLUMN ildar.banks.bik IS '��� �����';
COMMENT ON COLUMN ildar.banks.bill_corr IS '������� �����';
COMMENT ON COLUMN ildar.banks.bank_name IS '������������ �����';
COMMENT ON COLUMN ildar.banks.city IS '��������������� �����';
COMMENT ON COLUMN ildar.banks.delivery IS '��� ������� (�����, ��������, �����������)';

ALTER TABLE ildar.banks
       ADD  CONSTRAINT XPKbanks PRIMARY KEY (bik) ;
------------------------------------------------------------------------
------------'���������� �����������'------------------------------------
--DROP TABLE ildar.recipients ;

CREATE TABLE ildar.recipients (
       id                   CHAR(20) NOT NULL,
       client_id            INTEGER NOT NULL,
       inn                  VARCHAR(12) ,
       name                 VARCHAR(160) NOT NULL,
       bic                  CHAR(9) ,
       bill                 VARCHAR(20) ,
       comments             VARCHAR(210) 
);
COMMENT ON TABLE ildar.recipients IS '���������� �����������';

COMMENT ON COLUMN ildar.recipients.id IS '���������� ������������� ����������';
COMMENT ON COLUMN ildar.recipients.client_id IS '������������� �������';
COMMENT ON COLUMN ildar.recipients.inn IS '��� ����������';
COMMENT ON COLUMN ildar.recipients.name IS '������������ ����������';
COMMENT ON COLUMN ildar.recipients.bic IS '��� ����� ����������';
COMMENT ON COLUMN ildar.recipients.bill IS '���� ����������';
COMMENT ON COLUMN ildar.recipients.comments IS '����� ���������� �������';

ALTER TABLE ildar.recipients
       ADD  CONSTRAINT XPKrecipients PRIMARY KEY (id) ;

ALTER TABLE ildar.recipients
       ADD  CONSTRAINT "RecipientsClient" FOREIGN KEY (client_id)
       REFERENCES ildar.clients ON DELETE CASCADE ;
------------------------------------------------------------------------
-------------------- '�������� �������' -------------------------------- 
--DROP TABLE ildar.init_as ;

CREATE TABLE ildar.init_as (
       branch_id            VARCHAR(20) NOT NULL,
       bik                  CHAR(9) NOT NULL,
       version              VARCHAR(60) ,
       eng_name             VARCHAR(140) ,
       app_name             VARCHAR(30) ,
       content_type         VARCHAR(255) ,
       content              LONG VARCHAR ,
       swift                CHAR(11) ,
       address              VARCHAR(200) ,
       city_latin           VARCHAR(40) ,
       address_latin        VARCHAR(200) 
);
COMMENT ON TABLE ildar.init_as IS '�������� �������';

COMMENT ON COLUMN ildar.init_as.branch_id IS '������������� ����� � ������ �������';
COMMENT ON COLUMN ildar.init_as.bik IS '��� �����';
COMMENT ON COLUMN ildar.init_as.version IS '������ ������� iBank';
COMMENT ON COLUMN ildar.init_as.eng_name IS '������������ ����� �� ����������';
COMMENT ON COLUMN ildar.init_as.app_name IS '������������ ����������';
COMMENT ON COLUMN ildar.init_as.content_type IS '��� �����������';
COMMENT ON COLUMN ildar.init_as.content IS '���������� (������� ���������� �� ���������)';
COMMENT ON COLUMN ildar.init_as.swift IS 'SWIFT ��� �����';
COMMENT ON COLUMN ildar.init_as.address IS '����� �����';
COMMENT ON COLUMN ildar.init_as.city_latin IS '����� ����� �� ���������� ����� (��������� ��������� ���� ����������� SWIFT ��� �����)';
COMMENT ON COLUMN ildar.init_as.address_latin IS '����� ����� �� ���������� ����� (��������� ��������� ���� ����������� SWIFT ��� �����)';

ALTER TABLE ildar.init_as
       ADD  CONSTRAINT XPKinit_as PRIMARY KEY (branch_id) ;
------------------------------------------------------------------------
------------'����� �������� �������'------------------------------------
--DROP TABLE ildar.accounts ;

CREATE TABLE ildar.accounts (
       branch_id            VARCHAR(20) NOT NULL,
       account              CHAR(20) NOT NULL,
       client_id            INTEGER NOT NULL,
       type_account         CHAR(1) NOT NULL,
       create_date          DATE NOT NULL,
       create_amount        NUM(28,10) NOT NULL,
       currency             VARCHAR(3) NOT NULL
);
COMMENT ON TABLE ildar.accounts IS '����� �������� �������';

COMMENT ON COLUMN ildar.accounts.branch_id IS '���������� ������������� ����� ��� �������, ������������������ � �������';
COMMENT ON COLUMN ildar.accounts.account IS '���� �������';
COMMENT ON COLUMN ildar.accounts.client_id IS '���������� � ������ ������� ������������� �������, �� ������� ��������������� ���� �� ������� clients';
COMMENT ON COLUMN ildar.accounts.type_account IS '��� �����. ����� ��������� ��������:
0 - ���������,
1 - �������,
2 - ����������,
3 - ��������������';
COMMENT ON COLUMN ildar.accounts.create_date IS '���� ��������� �����';
COMMENT ON COLUMN ildar.accounts.create_amount IS '����� �� ������ ��������� ����� (� �������� ������)';
COMMENT ON COLUMN ildar.accounts.currency IS '��������� ��� (USD, DEM � �.�.) ������ �����';

ALTER TABLE ildar.accounts
       ADD   CONSTRAINT XPKaccounts PRIMARY KEY (branch_id, account)  ;

ALTER TABLE ildar.accounts 
              ADD  CONSTRAINT "AccountsInit_as"
              FOREIGN KEY (branch_id) REFERENCES ildar.init_as ;
------------------------------------------------------------------------
CREATE TABLE ildar.ClientAcct (                                
       client_id            INTEGER NOT NULL,
       branch_id            VARCHAR(20) NOT NULL,
       account              CHAR(20) NOT NULL,
                             PRIMARY KEY (client_id, branch_id, account) 
);
ALTER TABLE ildar.ClientAcct 
              ADD  CONSTRAINT "ClientAcctClients" FOREIGN KEY (client_id) 
              REFERENCES ildar.clients ON DELETE RESTRICT;

ALTER TABLE ildar.ClientAcct 
              ADD  CONSTRAINT "ClientAcctAccounts" FOREIGN KEY (branch_id, account) 
              REFERENCES ildar.accounts ON DELETE RESTRICT;
-----------------------------------------------------------------------
------------'��������� ���������'--------------------------------------
--DROP TABLE ildar.payments;

CREATE TABLE ildar.payments (
       doc_id               VARCHAR(28) NOT NULL,
       client_id            INTEGER NOT NULL,
       date_doc             DATE NOT NULL,
       num_doc              VARCHAR(5) NOT NULL,
       payment_type         VARCHAR(10) ,
       payer_inn            VARCHAR(12) ,
       payer_name           VARCHAR(160) NOT NULL,
       payer_account        CHAR(20) NOT NULL,
       amount               DECIMAL(17,2) NOT NULL,
       payer_bank_name      VARCHAR(80) NOT NULL,
       payer_bank_bic       CHAR(9) NOT NULL,
       payer_bank_acc       CHAR(20) NOT NULL,
       rcpt_inn             VARCHAR(12) ,
       rcpt_name            VARCHAR(160) NOT NULL,
       rcpt_account         CHAR(20) NOT NULL,
       rcpt_bank_name       VARCHAR(80) NOT NULL,
       rcpt_bank_bic        CHAR(9) NOT NULL,
       rcpt_bank_acc        CHAR(20) ,
       type_oper            CHAR(2) DEFAULT '01' NOT NULL,
       queue                CHAR(2) ,
       term                 DATE ,
       payment_details      VARCHAR(210) NOT NULL,
       kpp                  VARCHAR(9) ,
       status_doc           CHAR(1) NOT NULL,
       signers              CHAR(3) 
);
COMMENT ON TABLE ildar.payments IS '��������� ���������';

COMMENT ON COLUMN ildar.payments.doc_id IS '���������� � ������ ������� ������������� ���������';
COMMENT ON COLUMN ildar.payments.client_id IS '���������� � ������ ������� ������������� �������, ���������� ��������, �� ������� clients';
COMMENT ON COLUMN ildar.payments.date_doc IS '���� ���������� ���������';
COMMENT ON COLUMN ildar.payments.num_doc IS '����� ���������� ���������';
COMMENT ON COLUMN ildar.payments.payment_type IS '��� �������, ����� ��������� ��������:
"������",
"����������",
"����������"
��� �����������';
COMMENT ON COLUMN ildar.payments.payer_inn IS '��� �����������';
COMMENT ON COLUMN ildar.payments.payer_name IS '������������ �����������';
COMMENT ON COLUMN ildar.payments.payer_account IS '���� �����������';
COMMENT ON COLUMN ildar.payments.amount IS '����� ������� (� �������� ������ - ������)';
COMMENT ON COLUMN ildar.payments.payer_bank_name IS '������������ ����� �����������';
COMMENT ON COLUMN ildar.payments.payer_bank_bic IS '��� ����� �����������';
COMMENT ON COLUMN ildar.payments.payer_bank_acc IS '������� ����� �����������';
COMMENT ON COLUMN ildar.payments.rcpt_inn IS '��� ����������';
COMMENT ON COLUMN ildar.payments.rcpt_name IS '������������ ����������';
COMMENT ON COLUMN ildar.payments.rcpt_account IS '���� ����������';
COMMENT ON COLUMN ildar.payments.rcpt_bank_name IS '������������ ����� ����������';
COMMENT ON COLUMN ildar.payments.rcpt_bank_bic IS '��� ����� ����������';
COMMENT ON COLUMN ildar.payments.rcpt_bank_acc IS '������� ����� ����������';
COMMENT ON COLUMN ildar.payments.type_oper IS '��� ��������, ��� ��������� ��������� "01"';
COMMENT ON COLUMN ildar.payments.queue IS '��� ����������� �������. ����� ��������� �������� "01", "02", "03", "04", "05" ��� "06", ��� �������������';
COMMENT ON COLUMN ildar.payments.term IS '���� �������';
COMMENT ON COLUMN ildar.payments.payment_details IS '���������� �������';
COMMENT ON COLUMN ildar.payments.kpp IS '��� �����������';
COMMENT ON COLUMN ildar.payments.status_doc IS '������� (���������) ��������� ���������. ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ildar.payments.signers IS '������ ����������� ������. �������� ������� ������� ������� ��������� ������ ����������� ������: 1 - ������� ����� ������ ������������, 0 - �����������. 0-� ������ ������������� ����� ������ 1, 1-� ������ 2 � �.�.';

ALTER TABLE ildar.payments
       ADD   CONSTRAINT XPKpayments PRIMARY KEY (doc_id)  ;

ALTER TABLE ildar.payments
       ADD  CONSTRAINT R_13
              FOREIGN KEY (client_id)
                             REFERENCES ildar.clients ;
------------------------------------------------------------------------
-------------------- '���������� �����' -------------------------------- 

--DROP TABLE ildar.countries ;
CREATE TABLE ildar.countries (
       code                 CHAR(3) NOT NULL,
       country              VARCHAR(70) NOT NULL,
       iso_code             CHAR(2) NOT NULL,
       eng_name             VARCHAR(70) NOT NULL
);
COMMENT ON TABLE ildar.countries IS '���������� �����';

COMMENT ON COLUMN ildar.countries.code IS '��� ������';
COMMENT ON COLUMN ildar.countries.country IS '������������ ������';
COMMENT ON COLUMN ildar.countries.iso_code IS '��� ������ ISO';
COMMENT ON COLUMN ildar.countries.eng_name IS '������������ ������ �� ����������';

ALTER TABLE ildar.countries
       ADD  CONSTRAINT XPKcountries PRIMARY KEY (code) ;

------------------------------------------------------------------------
-------------------- '���������� �����' -------------------------------- 

--DROP TABLE ildar.currency ;
CREATE TABLE ildar.currency (
       code_currency        CHAR(3) NOT NULL,
       currency             CHAR(3) NOT NULL,
       name                 VARCHAR(64) NOT NULL,
       namev                VARCHAR(64) ,
       namer                VARCHAR(64) ,
       namep                VARCHAR(64) ,
       recalc               CHAR(20) ,
       decimals             NUM(2) DEFAULT 02 NOT NULL
);
COMMENT ON TABLE ildar.currency IS '���������� �����';
COMMENT ON COLUMN ildar.currency.code_currency IS '��������� ��� ������ (USD, DEM � ��.)';
COMMENT ON COLUMN ildar.currency.currency IS '������ (����������� - USD, DEM � ��.)';
COMMENT ON COLUMN ildar.currency.name IS '������������ - ������������ �����';
COMMENT ON COLUMN ildar.currency.namev IS '������������ - ����������� �����';
COMMENT ON COLUMN ildar.currency.namer IS '������������ - ����������� �����';
COMMENT ON COLUMN ildar.currency.namep IS '������������ - ���������� �����';
COMMENT ON COLUMN ildar.currency.recalc IS '���������� ���� ��������� ����� ��� ������';
COMMENT ON COLUMN ildar.currency.decimals IS '����� ������ ����� �������';

ALTER TABLE ildar.currency
       ADD  CONSTRAINT XPKcurrency PRIMARY KEY (code_currency) ;
------------------------------------------------------------------------
-------------------- '�������� �� ������ ��������' ----------------------------------- 

--DROP TABLE ildar.opers ;

CREATE TABLE ildar.opers (
       branch_id            VARCHAR(20) NOT NULL,
       account              CHAR(20) NOT NULL,
       id_oper              VARCHAR(20) ,
       oper_date            DATE NOT NULL,
       oper_code            CHAR(3) ,
       doc_num              VARCHAR(5) ,
       doc_date             DATE ,
       corr_inn             VARCHAR(12) ,
       corr_name            VARCHAR(160) ,
       corr_acc             CHAR(20) ,
       corr_bank_bic        CHAR(9) ,
       corr_bank_acc        CHAR(20) ,
       corr_bank_name       VARCHAR(80) ,
       oper_amount          NUM(28,10) NOT NULL,
       oper_details         VARCHAR(210) ,
       rur_oper_amount      NUM(17,2) 
);
COMMENT ON TABLE ildar.opers IS '�������� �� ������ ��������';

COMMENT ON COLUMN ildar.opers.branch_id IS '���������� ������������� ����� ��� �������, ������������������ � �������';
COMMENT ON COLUMN ildar.opers.account IS '���� �������';
COMMENT ON COLUMN ildar.opers.id_oper IS '������������� ��������';
COMMENT ON COLUMN ildar.opers.oper_date IS '���� ��������';
COMMENT ON COLUMN ildar.opers.oper_code IS '��� ��������';
COMMENT ON COLUMN ildar.opers.doc_num IS '����� ���������';
COMMENT ON COLUMN ildar.opers.doc_date IS '���� ���������';
COMMENT ON COLUMN ildar.opers.corr_inn IS '��� ��������������';
COMMENT ON COLUMN ildar.opers.corr_name IS '������������ ��������������';
COMMENT ON COLUMN ildar.opers.corr_acc IS '���� ��������������';
COMMENT ON COLUMN ildar.opers.corr_bank_bic IS '��� ����� ��������������';
COMMENT ON COLUMN ildar.opers.corr_bank_acc IS '������� ����� ��������������';
COMMENT ON COLUMN ildar.opers.corr_bank_name IS '������������ ����� ��������������';
COMMENT ON COLUMN ildar.opers.oper_amount IS '����� �������� (+ ������, - �����)';
COMMENT ON COLUMN ildar.opers.oper_details IS '���������� �������';
COMMENT ON COLUMN ildar.opers.rur_oper_amount IS '������� �������� ��������';
------------------------------------------------------------------------
------------'�����������'-----------------------------------------------
--DROP TABLE ildar.accreditivs ;

CREATE TABLE ildar.accreditivs (
       doc_id               VARCHAR(28) NOT NULL,
       client_id            INTEGER NOT NULL,
       date_doc             DATE NOT NULL,
       num_doc              VARCHAR(5) NOT NULL,
       accreditiv_type      VARCHAR(10) ,
       payer_inn            VARCHAR(12) ,
       payer_name           VARCHAR(160) NOT NULL,
       payer_account        CHAR(20) NOT NULL,
       amount               DECIMAL(17,2) NOT NULL,
       payer_bank_name      VARCHAR(80) NOT NULL,
       payer_bank_bic       CHAR(9) NOT NULL,
       payer_bank_acc       CHAR(20) NOT NULL,
       rcpt_inn             VARCHAR(12) ,
       rcpt_name            VARCHAR(160) NOT NULL,
       rcpt_account         CHAR(20) NOT NULL,
       rcpt_bank_name       VARCHAR(80) NOT NULL,
       rcpt_bank_bic        CHAR(9) NOT NULL,
       rcpt_bank_acc        CHAR(20) ,
       account_40901        VARCHAR(20) ,
       type_oper            CHAR(2) DEFAULT '08' NOT NULL,
       term                 DATE ,
       type_accreditiv1     VARCHAR(20) NOT NULL,
       type_accreditiv2     VARCHAR(20) NOT NULL,
       condition_pay        VARCHAR(20) NOT NULL,
       accreditiv_details   VARCHAR(250) NOT NULL,
       accreditiv_docs      VARCHAR(250) NOT NULL,
       add_condition        VARCHAR(250) ,
       status_doc           CHAR(1) NOT NULL,
       signers              CHAR(3) 
);
COMMENT ON TABLE ildar.accreditivs IS '�����������';

COMMENT ON COLUMN ildar.accreditivs.doc_id IS '���������� � ������ ������� ������������� ���������';
COMMENT ON COLUMN ildar.accreditivs.client_id IS '���������� � ������ ������� ������������� �������, ���������� ��������, �� ������� clients';
COMMENT ON COLUMN ildar.accreditivs.date_doc IS '���� �����������';
COMMENT ON COLUMN ildar.accreditivs.num_doc IS '����� �����������';
COMMENT ON COLUMN ildar.accreditivs.accreditiv_type IS '��� �����������, ����� ��������� ��������:
"������",
"����������",
"����������"
��� �����������';
COMMENT ON COLUMN ildar.accreditivs.payer_inn IS '��� �����������';
COMMENT ON COLUMN ildar.accreditivs.payer_name IS '������������ �����������';
COMMENT ON COLUMN ildar.accreditivs.payer_account IS '���� �����������';
COMMENT ON COLUMN ildar.accreditivs.amount IS '����� ������� (� �������� ������ - ������)';
COMMENT ON COLUMN ildar.accreditivs.payer_bank_name IS '������������ ����� �����������';
COMMENT ON COLUMN ildar.accreditivs.payer_bank_bic IS '��� ����� �����������';
COMMENT ON COLUMN ildar.accreditivs.payer_bank_acc IS '������� ����� �����������';
COMMENT ON COLUMN ildar.accreditivs.rcpt_inn IS '��� ����������';
COMMENT ON COLUMN ildar.accreditivs.rcpt_name IS '������������ ����������';
COMMENT ON COLUMN ildar.accreditivs.rcpt_account IS '���� ����������';
COMMENT ON COLUMN ildar.accreditivs.rcpt_bank_name IS '������������ ����� ����������';
COMMENT ON COLUMN ildar.accreditivs.rcpt_bank_bic IS '��� ����� ����������';
COMMENT ON COLUMN ildar.accreditivs.rcpt_bank_acc IS '������� ����� ����������';
COMMENT ON COLUMN ildar.accreditivs.account_40901 IS '����� ����������� ����� N 40901 "����������� � ������".';
COMMENT ON COLUMN ildar.accreditivs.type_oper IS '��� ��������, ��� ������������ "08"';
COMMENT ON COLUMN ildar.accreditivs.term IS '���� �������� �����������';
COMMENT ON COLUMN ildar.accreditivs.type_accreditiv1 IS '��� ����������� 1, ����� ��������� �������� "��������" ��� "�����������"';
COMMENT ON COLUMN ildar.accreditivs.type_accreditiv2 IS '��� ����������� 2, ����� ��������� �������� "��������" ��� "����������"';
COMMENT ON COLUMN ildar.accreditivs.condition_pay IS '������� ������, ����� ��������� �������� "� ��������" ��� "��� �������"';
COMMENT ON COLUMN ildar.accreditivs.accreditiv_details IS '����������� ������������ ������� (�����, �����), ����� � ���� ��������, ���� �������� ������� (���������� �����, �������� �����), ��������������� � ����� ����������';
COMMENT ON COLUMN ildar.accreditivs.accreditiv_docs IS '������������ ����������, ������ ������� ������������ ������� �� �����������';
COMMENT ON COLUMN ildar.accreditivs.add_condition IS '�������������� �������';
COMMENT ON COLUMN ildar.accreditivs.status_doc IS '������� (���������) ��������� ���������. ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ildar.accreditivs.signers IS '������ ����������� ������. �������� ������� ������� ������� ��������� ������ ����������� ������: 1 - ������� ����� ������ ������������, 0 - �����������. 0-� ������ ������������� ����� ������ 1, 1-� ������ 2 � �.�.';

ALTER TABLE ildar.accreditivs
       ADD  CONSTRAINT XPKaccreditivs PRIMARY KEY (doc_id) ;

ALTER TABLE ildar.accreditivs
       ADD  CONSTRAINT R_15
              FOREIGN KEY (client_id)
                             REFERENCES ildar.clients ;
-----------------------------------------------------------------------------------------------------

