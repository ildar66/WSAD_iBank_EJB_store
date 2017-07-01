--------------------------- �������� ������ IBANK-----------------------

CONNECT RESET;

-------------------- �������� ���� IBANK-------------------------------- 

CONNECT TO IBANK user db2admin using ildar66;

------------------------------------------------------------------------
-------------------- �������� ������ ----------------------------------- 

-------------------- '��������� �� ������� ������' --------------------- 
DROP TABLESPACE ibank_data;
DROP BUFFERPOOL ibank_bufer;
CREATE BUFFERPOOL ibank_bufer size 50 PAGESIZE 8k;
CREATE TABLESPACE ibank_data PAGESIZE 8k  MANAGED BY DATABASE USING (FILE 'c:\db2\database\ibank.tsd' 100M) BUFFERPOOL ibank_bufer; 

CREATE TABLE ildar.currency_payment (
       doc_id               NUM(28) NOT NULL,
       client_id            NUM(20) NOT NULL,
       date_doc             DATE NOT NULL,
       num_doc              NUM(5) NOT NULL,
       payment_speed        VARCHAR(15) NOT NULL,
       amount               DECIMAL(28,10) NOT NULL,
       amount_currency      VARCHAR(3) NOT NULL,
       conv_rate            DECIMAL(28,10) ,
       cln_name             VARCHAR(160) NOT NULL,
       cln_account          VARCHAR(20) NOT NULL,
       cln_inn              VARCHAR(12) ,
       cln_country_code     VARCHAR(3) ,
       cln_country          VARCHAR(40) ,
       cln_city             VARCHAR(60) ,
       cln_addr             VARCHAR(255) ,
       cln_employee_fio     VARCHAR(80) ,
       cln_employee_phones  VARCHAR(40) ,
       cln_bnk_name         VARCHAR(140) NOT NULL,
       cln_bnk_bic          VARCHAR(15) ,
       cln_bnk_bic_type     VARCHAR(8) ,
       cln_bnk_country_code VARCHAR(3) ,
       cln_bnk_country      VARCHAR(40) ,
       cln_bnk_city         VARCHAR(60) ,
       cln_bnk_addr         VARCHAR(255) ,
       intermed_bnk_name    VARCHAR(140) ,
       intermed_bnk_bic     VARCHAR(15) ,
       intermed_bnk_bic_type VARCHAR(8) ,
       intermed_bnk_country_code VARCHAR(3) ,
       intermed_bnk_country VARCHAR(40) ,
       intermed_bnk_city    VARCHAR(60) ,
       intermed_bnk_addr    VARCHAR(255) ,
       rcpt_bnk_name        VARCHAR(140) NOT NULL,
       rcpt_bnk_account     VARCHAR(50) ,
       rcpt_bnk_bic         VARCHAR(15) ,
       rcpt_bnk_bic_type    VARCHAR(8) ,
       rcpt_bnk_country_code VARCHAR(3) ,
       rcpt_bnk_country     VARCHAR(40) ,
       rcpt_bnk_city        VARCHAR(60) ,
       rcpt_bnk_addr        VARCHAR(255) ,
       rcpt_name            VARCHAR(160) NOT NULL,
       rcpt_account         VARCHAR(50) NOT NULL,
       rcpt_country_code    VARCHAR(3) ,
       rcpt_country         VARCHAR(40) ,
       rcpt_city            VARCHAR(60) ,
       rcpt_addr            VARCHAR(255) ,
       expense_type         VARCHAR(80) NOT NULL,
       expense_account      VARCHAR(20) ,
       payment_details      VARCHAR(140) NOT NULL,
       payment_added_info   VARCHAR(140) ,
       payment_kind_code    VARCHAR(2) ,
       payment_kind_info    VARCHAR(255) ,
       render_kind_code     VARCHAR(2) ,
       render_kind_info     VARCHAR(255) ,
       xchg_oper_type       VARCHAR(2) ,
       contract             VARCHAR(100) ,
       reg_form             VARCHAR(100) ,
       bargain_passport     VARCHAR(255) ,
       gtd                  VARCHAR(255) ,
       cxr_added_info       VARCHAR(255) ,
       status_doc           NUM(1) NOT NULL,
       signers              NUM(3) 
) IN ibank_data;

COMMENT ON TABLE ildar.currency_payment IS '��������� �� ������� ������';

COMMENT ON COLUMN ildar.currency_payment.doc_id IS '���������� � ������ ������� ������������� ���������';
COMMENT ON COLUMN ildar.currency_payment.client_id IS '���������� � ������ ������� ������������� �������, ���������� ��������, �� ������� clients';
COMMENT ON COLUMN ildar.currency_payment.date_doc IS '���� ���������';
COMMENT ON COLUMN ildar.currency_payment.num_doc IS '����� ���������';
COMMENT ON COLUMN ildar.currency_payment.payment_speed IS '��� ��������. ���������� ��������� ��������. ����� ��������� �������� "�������" ��� "�������"';
COMMENT ON COLUMN ildar.currency_payment.amount IS '����� ��������';
COMMENT ON COLUMN ildar.currency_payment.amount_currency IS '��������� ��� (USD, DEM � �.�.) ������ �������';
COMMENT ON COLUMN ildar.currency_payment.conv_rate IS '���� ���������';
COMMENT ON COLUMN ildar.currency_payment.cln_name IS '������������ ��������������';
COMMENT ON COLUMN ildar.currency_payment.cln_account IS '���� ��������������';
COMMENT ON COLUMN ildar.currency_payment.cln_inn IS '��� ��������������';
COMMENT ON COLUMN ildar.currency_payment.cln_country_code IS '��� ������ ��������������';
COMMENT ON COLUMN ildar.currency_payment.cln_country IS '������ ��������������';
COMMENT ON COLUMN ildar.currency_payment.cln_city IS '����� ��������������';
COMMENT ON COLUMN ildar.currency_payment.cln_addr IS '����� ��������������';
COMMENT ON COLUMN ildar.currency_payment.cln_employee_fio IS '�.�.�. �������������� ���������� ��������������';
COMMENT ON COLUMN ildar.currency_payment.cln_employee_phones IS '���������� �������� �������������� ���������� ��������������';
COMMENT ON COLUMN ildar.currency_payment.cln_bnk_name IS '������������ ����� ��������������';
COMMENT ON COLUMN ildar.currency_payment.cln_bnk_bic IS '����������������� ��� ����� ��������������';
COMMENT ON COLUMN ildar.currency_payment.cln_bnk_bic_type IS '��� ������������������ ���� ����� ��������������';
COMMENT ON COLUMN ildar.currency_payment.cln_bnk_country_code IS '��� ������ ����� ��������������';
COMMENT ON COLUMN ildar.currency_payment.cln_bnk_country IS '������ ����� ��������������';
COMMENT ON COLUMN ildar.currency_payment.cln_bnk_city IS '����� ����� ��������������';
COMMENT ON COLUMN ildar.currency_payment.cln_bnk_addr IS '����� ����� ��������������';
COMMENT ON COLUMN ildar.currency_payment.intermed_bnk_name IS '������������ �����-����������';
COMMENT ON COLUMN ildar.currency_payment.intermed_bnk_bic IS '����������������� ��� �����-����������';
COMMENT ON COLUMN ildar.currency_payment.intermed_bnk_bic_type IS '��� ������������������ ���� �����-����������';
COMMENT ON COLUMN ildar.currency_payment.intermed_bnk_country_code IS '��� ������ �����-����������';
COMMENT ON COLUMN ildar.currency_payment.intermed_bnk_country IS '������ �����-����������';
COMMENT ON COLUMN ildar.currency_payment.intermed_bnk_city IS '����� �����-����������';
COMMENT ON COLUMN ildar.currency_payment.intermed_bnk_addr IS '����� �����-����������';
COMMENT ON COLUMN ildar.currency_payment.rcpt_bnk_name IS '������������ ����� �����������';
COMMENT ON COLUMN ildar.currency_payment.rcpt_bnk_account IS '����� ����� ����� �����������';
COMMENT ON COLUMN ildar.currency_payment.rcpt_bnk_bic IS '����������������� ��� ����� �����������';
COMMENT ON COLUMN ildar.currency_payment.rcpt_bnk_bic_type IS '��� ������������������ ���� ����� �����������';
COMMENT ON COLUMN ildar.currency_payment.rcpt_bnk_country_code IS '��� ������ ����� �����������';
COMMENT ON COLUMN ildar.currency_payment.rcpt_bnk_country IS '������ ����� �����������';
COMMENT ON COLUMN ildar.currency_payment.rcpt_bnk_city IS '����� ����� �����������';
COMMENT ON COLUMN ildar.currency_payment.rcpt_bnk_addr IS '����� ����� �����������';
COMMENT ON COLUMN ildar.currency_payment.rcpt_name IS '������������ �����������';
COMMENT ON COLUMN ildar.currency_payment.rcpt_account IS '����� ����� �����������';
COMMENT ON COLUMN ildar.currency_payment.rcpt_country_code IS '��� ������ �����������';
COMMENT ON COLUMN ildar.currency_payment.rcpt_country IS '������ �����������';
COMMENT ON COLUMN ildar.currency_payment.rcpt_city IS '����� �����������';
COMMENT ON COLUMN ildar.currency_payment.rcpt_addr IS '����� �����������';
COMMENT ON COLUMN ildar.currency_payment.expense_type IS '������ ������ �������� �� ��������. ����� ��������� ��������:
"�� ��� ����",
"�� ���� �����������",
"����� �� ��� ����, ������-����. - �� ���� �����������"';
COMMENT ON COLUMN ildar.currency_payment.expense_account IS '���� ������ �������� �� ��������. ����������� � ������, ���� ������� �� �������� ����� �� ��������������';
COMMENT ON COLUMN ildar.currency_payment.payment_details IS '���������� �������';
COMMENT ON COLUMN ildar.currency_payment.payment_added_info IS '�������������� ����������';
COMMENT ON COLUMN ildar.currency_payment.payment_kind_code IS '��� ���� �������';
COMMENT ON COLUMN ildar.currency_payment.payment_kind_info IS '��� ���� ������� - ��������� ����������';
COMMENT ON COLUMN ildar.currency_payment.render_kind_code IS '��� ���� ������';
COMMENT ON COLUMN ildar.currency_payment.render_kind_info IS '��� ���� ������ - ��������� ����������';
COMMENT ON COLUMN ildar.currency_payment.xchg_oper_type IS '��� �������� ��������';
COMMENT ON COLUMN ildar.currency_payment.contract IS '��� ���������� � ��������, ���������, ����������, � ������������ � ������� ���������� ������� ������. ��� �������, ����������� �����, ���� � ����� ����� ��������';
COMMENT ON COLUMN ildar.currency_payment.reg_form IS '������� ����� ���������. ����������� ����� � ���� ������� ����� ���������';
COMMENT ON COLUMN ildar.currency_payment.bargain_passport IS '������� ������';
COMMENT ON COLUMN ildar.currency_payment.gtd IS '������ ���';
COMMENT ON COLUMN ildar.currency_payment.cxr_added_info IS '�������������� ���������� ��� ��������� ��������';
COMMENT ON COLUMN ildar.currency_payment.status_doc IS '������� (���������) ��������� ���������. ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ildar.currency_payment.signers IS '������ ����������� ������. �������� ������� ������� ������� ��������� ������ ����������� ������: 1 - ������� ����� ������ ������������, 0 - �����������. 0-� ������ ������������� ����� ������ 1, 1-� ������ 2 � �.�.';

ALTER TABLE ildar.currency_payment
       ADD   CONSTRAINT XPKcurrency_pay PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
-------------------- '���������� ������������' ----------------------------------- 
DROP TABLE ildar.beneficiaries ;

CREATE TABLE ildar.beneficiaries (
       id                   NUM(20) NOT NULL,
       client_id            NUM(20) NOT NULL,
       intermed_bnk_name    VARCHAR(140) ,
       intermed_bnk_bic     VARCHAR(15) ,
       intermed_bnk_bic_type VARCHAR(8) ,
       intermed_bnk_country_code CHAR(3) ,
       intermed_bnk_country VARCHAR(40) ,
       intermed_bnk_city    VARCHAR(60) ,
       intermed_bnk_addr    VARCHAR(255) ,
       rcpt_bnk_name        VARCHAR(140) NOT NULL,
       rcpt_bnk_account     VARCHAR(50) ,
       rcpt_bnk_bic         VARCHAR(15) ,
       rcpt_bnk_bic_type    VARCHAR(8) ,
       rcpt_bnk_country_code CHAR(3) ,
       rcpt_bnk_country     VARCHAR(40) ,
       rcpt_bnk_city        VARCHAR(60) ,
       rcpt_bnk_addr        VARCHAR(255) ,
       rcpt_name            VARCHAR(160) NOT NULL,
       rcpt_account         VARCHAR(50) NOT NULL,
       rcpt_country_code    CHAR(3) ,
       rcpt_country         VARCHAR(40) ,
       rcpt_city            VARCHAR(60) ,
       rcpt_addr            VARCHAR(255) 
);
COMMENT ON TABLE ildar.beneficiaries IS '���������� ������������';

COMMENT ON COLUMN ildar.beneficiaries.id IS '���������� ������������� �����������';
COMMENT ON COLUMN ildar.beneficiaries.client_id IS '������������� �������';
COMMENT ON COLUMN ildar.beneficiaries.intermed_bnk_name IS '������������ �����-����������';
COMMENT ON COLUMN ildar.beneficiaries.intermed_bnk_bic IS '����������������� ��� �����-����������';
COMMENT ON COLUMN ildar.beneficiaries.intermed_bnk_bic_type IS '��� ������������������ ���� �����-����������';
COMMENT ON COLUMN ildar.beneficiaries.intermed_bnk_country_code IS '��� ������ �����-����������';
COMMENT ON COLUMN ildar.beneficiaries.intermed_bnk_country IS '������ �����-����������';
COMMENT ON COLUMN ildar.beneficiaries.intermed_bnk_city IS '����� �����-����������';
COMMENT ON COLUMN ildar.beneficiaries.intermed_bnk_addr IS '����� �����-����������';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_bnk_name IS '������������ ����� �����������';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_bnk_account IS '����� ����� ����� �����������';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_bnk_bic IS '����������������� ��� ����� �����������';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_bnk_bic_type IS '��� ������������������ ���� ����� �����������';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_bnk_country_code IS '��� ������ ����� �����������';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_bnk_country IS '������ ����� �����������';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_bnk_city IS '����� ����� �����������';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_bnk_addr IS '����� ����� �����������';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_name IS '������������ �����������';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_account IS '����� ����� �����������';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_country_code IS '��� ������ �����������';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_country IS '������ �����������';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_city IS '����� �����������';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_addr IS '����� �����������';

ALTER TABLE ildar.beneficiaries
       ADD   CONSTRAINT XPKbeneficiaries PRIMARY KEY (id) ;
------------------------------------------------------------------------
-------------------- '���������� ����������� ��������' ----------------------------------- 
DROP TABLE ildar.clients_inbox ;

CREATE TABLE ildar.clients_inbox (
       msg_id               NUM(28) NOT NULL,
       client_id            NUM(20) NOT NULL,
       read_date            DATE 
);
COMMENT ON TABLE ildar.clients_inbox IS '���������� ����������� ��������';

COMMENT ON COLUMN ildar.clients_inbox.msg_id IS '������������� �����������';
COMMENT ON COLUMN ildar.clients_inbox.client_id IS '������������� �������';
COMMENT ON COLUMN ildar.clients_inbox.read_date IS '���� ��������� ����������� ��������';

ALTER TABLE ildar.clients_inbox
       ADD   CONSTRAINT XPKclients_inbox PRIMARY KEY (msg_id, client_id) ;
------------------------------------------------------------------------
-------------------- '���������� � ��������' ---------------------------
DROP TABLE ildar.clients ;

CREATE TABLE ildar.clients (
       client_id            NUM(20) NOT NULL,
       inn_cln              VARCHAR(12) ,
       okpo                 VARCHAR(8) ,
       name_cln             VARCHAR(160) NOT NULL,
       fio_cln              VARCHAR(160) NOT NULL,
       phone_cln            VARCHAR(40) NOT NULL,
       fax_cln              VARCHAR(40) ,
       email_cln            VARCHAR(256) ,
       addr_cln             VARCHAR(200) NOT NULL,
       num_dogov            VARCHAR(10) NOT NULL,
       reg_date             DATE NOT NULL,
       perms                NUM(5) DEFAULT 0 NOT NULL,
       lock_word            VARCHAR(20) NOT NULL,
       ordering_customer    VARCHAR(160) ,
       status               NUM(1) DEFAULT 1 NOT NULL,
       cln_type             NUM(1) NOT NULL,
       kpp                  VARCHAR(9) ,
       doc_sign_num         NUM(20) NOT NULL,
       ext_client_id        VARCHAR(20) ,
       country_code         CHAR(3) ,
       city                 VARCHAR(40) ,
       city_latin           VARCHAR(40) ,
       address_latin        VARCHAR(200) ,
       soato                VARCHAR(20) ,
       resident_flag        NUM(1) 
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
COMMENT ON COLUMN ildar.clients.addr_cln IS '����� �������';
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
COMMENT ON COLUMN ildar.clients.country_code IS '��� ������ �������';
COMMENT ON COLUMN ildar.clients.city IS '����� �������������� �������';
COMMENT ON COLUMN ildar.clients.city_latin IS '����� �������������� ������� �� ����������';
COMMENT ON COLUMN ildar.clients.address_latin IS '����� ������� �� ���������� �����';
COMMENT ON COLUMN ildar.clients.soato IS '����� �������';
COMMENT ON COLUMN ildar.clients.resident_flag IS '������� ���������';

ALTER TABLE ildar.clients
       ADD  CONSTRAINT XPKclients PRIMARY KEY (client_id) ;
------------------------------------------------------------------------
-------------------- '���������� ������ SWIFT' ------------------------- 
DROP TABLE ildar.swift ;

CREATE TABLE ildar.swift (
       bic                  CHAR(11) NOT NULL,
       name                 VARCHAR(105) NOT NULL,
       city                 VARCHAR(40) ,
       address              VARCHAR(255) ,
       country_code         CHAR(3) 
);
COMMENT ON TABLE ildar.swift IS '���������� ������ SWIFT';

COMMENT ON COLUMN ildar.swift.bic IS 'SWIFT ��� �����';
COMMENT ON COLUMN ildar.swift.name IS '������������ �����';
COMMENT ON COLUMN ildar.swift.city IS '������������ ������ �������������� �����';
COMMENT ON COLUMN ildar.swift.address IS '����� �����';
COMMENT ON COLUMN ildar.swift.country_code IS '��� ������';

ALTER TABLE ildar.swift
       ADD  CONSTRAINT XPKswift PRIMARY KEY (bic) ;

------------------------------------------------------------------------
-------------------- '���������� �����' -------------------------------- 

DROP TABLE ildar.countries ;

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
-------------------- '' ----------------------------------- 

DROP TABLE ildar.currency ;

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
-------------------- '���� �����' ----------------------------------- 
DROP TABLE ildar.currency_rates ;

CREATE TABLE ildar.currency_rates (
       rate_date            DATE NOT NULL,
       code                 CHAR(3) NOT NULL,
       cbr_rate             NUM(6,4) ,
       mmvb_rate            NUM(6,4) 
);
COMMENT ON COLUMN ildar.currency_rates.rate_date IS '���� �����';
COMMENT ON COLUMN ildar.currency_rates.code IS '��� ������';
COMMENT ON COLUMN ildar.currency_rates.cbr_rate IS '���� �����������';
COMMENT ON COLUMN ildar.currency_rates.mmvb_rate IS '���� ����';

ALTER TABLE ildar.currency_rates
       ADD  CONSTRAINT XPKcurrency_rates PRIMARY KEY (rate_date, code) ;

------------------------------------------------------------------------
-------------------- '�������� �� ������ ��������' ----------------------------------- 

DROP TABLE ildar.opers ;

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
-------------------- '�������� �������' ----------------------------------- 
DROP TABLE ildar.init_as ;

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
-------------------- '����������� ��� ��������' ----------------------------------- 
DROP TABLE ildar.outbox ;

CREATE TABLE ildar.outbox (
       msg_id               NUM(28) NOT NULL,
       msg_num              VARCHAR(20) NOT NULL,
       msg_date             DATE ,
       create_date          DATE NOT NULL,
       subject              VARCHAR(255) NOT NULL,
       body                 LONG VARCHAR ,
       status_doc           NUM(1) NOT NULL
);
COMMENT ON TABLE ildar.outbox IS '����������� ��� ��������';
COMMENT ON COLUMN ildar.outbox.msg_id IS '���������� � ������ ������� ������������� �����������';
COMMENT ON COLUMN ildar.outbox.msg_num IS '����� �����������';
COMMENT ON COLUMN ildar.outbox.msg_date IS '���� �������� �����������';
COMMENT ON COLUMN ildar.outbox.create_date IS '���� �������� �����������';
COMMENT ON COLUMN ildar.outbox.subject IS '��������� ���������� �����������';
COMMENT ON COLUMN ildar.outbox.body IS '���������� �����������';
COMMENT ON COLUMN ildar.outbox.status_doc IS '��������� �����������. ����� ��������� ��������:
0 - �����,
5 - ����������,
7 - �������';

ALTER TABLE ildar.outbox
       ADD  CONSTRAINT XPKoutbox PRIMARY KEY (msg_id) ;
------------------------------------------------------------------------
-------------------- '������� �� ����������' ----------------------------------- 
DROP TABLE ildar.docs_hist ;

CREATE TABLE ildar.docs_hist (
       subject_type         NUM(1) NOT NULL,
       subject_id           NUM(20) ,
       subject_owner        VARCHAR(160) ,
       subject_sign         LONG VARCHAR ,
       group_sign           NUM(1) ,
       doc_type             VARCHAR(20) NOT NULL,
       doc_id               NUM(28) NOT NULL,
       action               NUM(1) NOT NULL,
       act_time             DATE NOT NULL,
       doc_status           NUM(1) NOT NULL,
       doc_status_desc      VARCHAR(200) ,
       encoding             VARCHAR(10) 
);
COMMENT ON TABLE ildar.docs_hist IS '������� �� ����������.';
COMMENT ON COLUMN ildar.docs_hist.subject_type IS '��� ��������, ������������ ��������. ����� ��������� ��������:
0 - ������,
1 - ������������, 
2 - ���������';
COMMENT ON COLUMN ildar.docs_hist.subject_id IS '������������� ��������, ������������ �������� - ������������� ����� ���. (���� ������������� ������������, ���� ��� ������� c����������� �������� subject_type = 0 - ������)';
COMMENT ON COLUMN ildar.docs_hist.subject_owner IS '�������� ����� ���. �������, �� ������� ��������������� ���� ���(������������, ���� ��� ������� c����������� �������� subject_type = 0 - ������)';
COMMENT ON COLUMN ildar.docs_hist.subject_sign IS '������� �������� ��� ����������. (������������, ���� subject_type - ������ ��������� �������� - action ������� ���������)';
COMMENT ON COLUMN ildar.docs_hist.group_sign IS '������ ������� �������� ������������ ������� (������������, ���� subject_type - ������ ��������� �������� - action ������� ���������)';
COMMENT ON COLUMN ildar.docs_hist.doc_type IS '��� ���������, ��� ������� ��������� ��������. ����� ��������� ��������: 
1 - �������� ���������, 
2 - ��������� �� ������� ������, 
--3 - ��������� �� ������������ ������� ����������� ������, 
--4 - ��������� �� ������� ����������� ������, 
--5 - ��������� �� ������� ����������� ������, 
6 - ������, 
7 - �������� ����������,  
8 - ����������, 
9 - ���������� ���������, 
--10 - ��������� �� ������ �� �������, 
--11 - ��������� �� �������� ������� ����������� ������, 
20 - ���������';
COMMENT ON COLUMN ildar.docs_hist.doc_id IS '���������� ������������� ��������� � �������.';
COMMENT ON COLUMN ildar.docs_hist.action IS '��� �������� ��� ����������.����� ��������� ��������:
0 - ���������,
1 - ���������,
2 - �������������� �� ������� �������,
3 - ���������,
4 - ����������,
5 - �������.';
COMMENT ON COLUMN ildar.docs_hist.act_time IS '������ ������� ���������� ��������';
COMMENT ON COLUMN ildar.docs_hist.doc_status IS '��������� ��������(��������� ���������). ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ildar.docs_hist.doc_status_desc IS '�������� ��������� ���������.�������� ����������� �������� ��������� ���������, �������� ��������� ������ � ���������� ���������.';
COMMENT ON COLUMN ildar.docs_hist.encoding IS '��������� � ������� ��� �������� ��������';
------------------------------------------------------------------------
-------------------- '���� ����������' ----------------------------------- 
DROP TABLE ildar.doc_types ;

CREATE TABLE ildar.doc_types (
       id                   NUM(3) NOT NULL,
       type                 VARCHAR(20) NOT NULL,
       description          VARCHAR(255) NOT NULL,
       definition           LONG VARCHAR NOT NULL,
       database_table       VARCHAR(20) NOT NULL
);
COMMENT ON TABLE ildar.doc_types IS '���� ����������';

COMMENT ON COLUMN ildar.doc_types.ID IS '�������������';
COMMENT ON COLUMN ildar.doc_types.Type IS '��� ���������';
COMMENT ON COLUMN ildar.doc_types.Description IS '�������� ����';
COMMENT ON COLUMN ildar.doc_types.Definition IS '����������� ����';
COMMENT ON COLUMN ildar.doc_types.Database_Table IS '������� � ���� ������';

ALTER TABLE ildar.doc_types
       ADD  CONSTRAINT XPKdoc_types PRIMARY KEY (ID) ;
------------------------------------------------------------------------
-------------------- '���������� � ����������' ----------------------------------- 
DROP TABLE ildar.attachments ;

CREATE TABLE ildar.attachments (
       doc_id               NUM(28) NOT NULL,
       doc_type             VARCHAR(20) NOT NULL,
       name                 VARCHAR(128) NOT NULL,
       type                 VARCHAR(20) ,
       att_size             NUM(10) NOT NULL,
       content              LONG VARCHAR NOT NULL
);
COMMENT ON TABLE ildar.attachments IS '���������� � ����������';

COMMENT ON COLUMN ildar.attachments.doc_id IS '������������� ���������';
COMMENT ON COLUMN ildar.attachments.doc_type IS '��� ���������';
COMMENT ON COLUMN ildar.attachments.name IS '������������ ����������';
COMMENT ON COLUMN ildar.attachments.type IS '��� ����������';
COMMENT ON COLUMN ildar.attachments.att_size IS '������ ����������';
COMMENT ON COLUMN ildar.attachments.content IS '���������� ����������';

ALTER TABLE ildar.attachments
       ADD  CONSTRAINT XPKattachments PRIMARY KEY (doc_id, doc_type, name) ;
------------------------------------------------------------------------
-------------------- '����� ������.' ----------------------------------- 
ALTER TABLE ildar.keys_history
       ADD  CONSTRAINT R_27
              FOREIGN KEY (id_key)
                             REFERENCES ildar.keys
                             ON DELETE CASCADE ;

ALTER TABLE ildar.operator_keys
       ADD  CONSTRAINT R_26
              FOREIGN KEY (operator_id)
                             REFERENCES ildar.operators
                             ON DELETE CASCADE ;

ALTER TABLE ildar.refuse_accepts
       ADD  CONSTRAINT R_17
              FOREIGN KEY (client_id)
                             REFERENCES ildar.clients ;

ALTER TABLE ildar.accreditivs
       ADD  CONSTRAINT R_15
              FOREIGN KEY (client_id)
                             REFERENCES ildar.clients ;

ALTER TABLE ildar.payment_requests
       ADD  CONSTRAINT R_16
              FOREIGN KEY (client_id)
                             REFERENCES ildar.clients ;

ALTER TABLE ildar.encashed_contracts
       ADD  CONSTRAINT R_14
              FOREIGN KEY (client_id)
                             REFERENCES ildar.clients ;

ALTER TABLE ildar.profiles
       ADD  CONSTRAINT R_9
              FOREIGN KEY (id_key)
                             REFERENCES ildar.keys
                             ON DELETE CASCADE ;

ALTER TABLE ildar.recipients
       ADD  CONSTRAINT R_8
              FOREIGN KEY (client_id)
                             REFERENCES ildar.clients
                             ON DELETE CASCADE ;

ALTER TABLE ildar.new_accounts
       ADD   CONSTRAINT R_3
              FOREIGN KEY (branch_id)
                             REFERENCES ildar.init_as ;

ALTER TABLE ildar.new_accounts
       ADD  CONSTRAINT R_1
              FOREIGN KEY (id_key)
                             REFERENCES ildar.new_keys
                             ON DELETE CASCADE ;

ALTER TABLE ildar.new_clients
       ADD  CONSTRAINT R_2
              FOREIGN KEY (id_key)
                             REFERENCES ildar.new_keys
                             ON DELETE CASCADE ;

ALTER TABLE ildar.letters
       ADD  CONSTRAINT R_12
              FOREIGN KEY (client_id)
                             REFERENCES ildar.clients ;

ALTER TABLE ildar.payments
       ADD  CONSTRAINT R_13
              FOREIGN KEY (client_id)
                             REFERENCES ildar.clients ;

ALTER TABLE ildar.keys
       ADD  CONSTRAINT R_6
              FOREIGN KEY (client_id)
                             REFERENCES ildar.clients
                             ON DELETE CASCADE ;

ALTER TABLE ildar.accounts
       ADD  CONSTRAINT R_4
              FOREIGN KEY (branch_id)
                             REFERENCES ildar.init_as ;

ALTER TABLE ildar.accounts
       ADD  CONSTRAINT R_5
              FOREIGN KEY (client_id)
                             REFERENCES ildar.clients
                             ON DELETE CASCADE ;

ALTER TABLE ildar.currency_sale
       ADD  CONSTRAINT R_24
              FOREIGN KEY (client_id)
                             REFERENCES ildar.clients ;

ALTER TABLE ildar.currency_purchase
       ADD  CONSTRAINT R_19
              FOREIGN KEY (client_id)
                             REFERENCES ildar.clients ;

ALTER TABLE ildar.currency_rsale
       ADD  CONSTRAINT R_18
              FOREIGN KEY (client_id)
                             REFERENCES ildar.clients ;

ALTER TABLE ildar.currency_fsale
       ADD  CONSTRAINT R_21
              FOREIGN KEY (client_id)
                             REFERENCES ildar.clients ;

ALTER TABLE ildar.currency_payment
       ADD  CONSTRAINT R_20
              FOREIGN KEY (client_id)
                             REFERENCES ildar.clients ;

ALTER TABLE ildar.beneficiaries
       ADD  CONSTRAINT R_23
              FOREIGN KEY (client_id)
                             REFERENCES ildar.clients
                             ON DELETE CASCADE ;

ALTER TABLE ildar.clients_inbox
       ADD  CONSTRAINT R_22
              FOREIGN KEY (client_id)
                             REFERENCES ildar.clients
                             ON DELETE CASCADE ;

ALTER TABLE ildar.clients_inbox
       ADD  CONSTRAINT R_11
              FOREIGN KEY (msg_id)
                             REFERENCES ildar.outbox
                             ON DELETE CASCADE ;

ALTER TABLE ildar.swift
       ADD  CONSTRAINT R_25
              FOREIGN KEY (country_code)
                             REFERENCES ildar.countries ;
------------------------------------------------------------------------
