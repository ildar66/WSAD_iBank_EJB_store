--------------------------- �������� ������ IBANK-----------------------

CONNECT RESET;

-------------------- �������� ���� IBANK-------------------------------- 

CREATE DATABASE IBANK;

CONNECT TO IBANK;

CREATE SCHEMA ILDAR;
------------------------------------------------------------------------
-------------------- �������� ������ ----------------------------------- 

------------'������� �������� � ��������� ������� ��� ��������'---------
DROP TABLE ildar.keys_history;

CREATE TABLE ildar.keys_history (
       id_key               NUM(20) NOT NULL,
       status_key           NUM(1) DEFAULT 1 NOT NULL,
       action_type          NUM(1) NOT NULL,
       action_time          DATE NOT NULL,
       sign_group           NUM(1) NOT NULL
);

COMMENT ON TABLE ildar.keys_history IS '������� �������� � ��������� ������� ��� ��������';

COMMENT ON COLUMN ildar.keys_history.id_key IS '���������� ������������� ��������� ����� ��� �������(�������� ��������� �� ���� ��������)';
COMMENT ON COLUMN ildar.keys_history.status_key IS '������� ������ ����� ��� �������:
0 - ������,
1 - ����������,
2 - ��������';
COMMENT ON COLUMN ildar.keys_history.action_type IS '�������� �������� ��� ������ ��� �������
0 - ��������,
1 - ����������,
2 - �������������,
3 - ����� ������ �������,
4 - �����������';
COMMENT ON COLUMN ildar.keys_history.action_time IS '���� � ����� �������� � �������� ������  ��� �������';
COMMENT ON COLUMN ildar.keys_history.sign_group IS '������ ������� ����������.
0 - ��� ����� �������
1 - 1-� �������
2 - 2-� �������
...';
------------------------------------------------------------------------
------------'�������� ����� ��� ��������������'-------------------------
DROP TABLE ildar.operator_keys ;

CREATE TABLE ildar.operator_keys (
       id_key               NUM(20) NOT NULL,
       operator_id          NUM(20) NOT NULL,
       publ_key             LONG VARCHAR NOT NULL,
       status_key           NUM(1) DEFAULT 1 NOT NULL,
       begin_date           DATE NOT NULL,
       end_date             DATE NOT NULL,
       creation_date        DATE NOT NULL,
       notes                VARCHAR(200) 
);
COMMENT ON TABLE ildar.operator_keys IS '�������� ����� ��� ��������������';

COMMENT ON COLUMN ildar.operator_keys.id_key IS '���������� ������������� ��������� ����� ��� �������������';
COMMENT ON COLUMN ildar.operator_keys.operator_id IS '������������� �������������';
COMMENT ON COLUMN ildar.operator_keys.publ_key IS '�������� ���� ��� �������������';
COMMENT ON COLUMN ildar.operator_keys.status_key IS '������� ������ ����� ��� �������������:
0 - ������,
1 - ����������,
2 - ��������';
COMMENT ON COLUMN ildar.operator_keys.begin_date IS '���� ������ �������� ����� ��� �������������';
COMMENT ON COLUMN ildar.operator_keys.end_date IS '���� ��������� �������� ����� ��� �������������';
COMMENT ON COLUMN ildar.operator_keys.creation_date IS '���� �������� ����� ��� �������������';
COMMENT ON COLUMN ildar.operator_keys.notes IS '���������� ��������������';

ALTER TABLE ildar.operator_keys
       ADD CONSTRAINT XPKoperator_keys PRIMARY KEY (id_key) ;
------------------------------------------------------------------------
------------'���������� �� ��������������'------------------------------
DROP TABLE ildar.operators ;

CREATE TABLE ildar.operators (
       operator_id          NUM(20) NOT NULL,
       operator_name        VARCHAR(160) NOT NULL,
       operator_position    VARCHAR(160) NOT NULL,
       reg_date             DATE NOT NULL,
       perms                NUM(5) DEFAULT 0 NOT NULL,
       status               NUM(1) DEFAULT 1 NOT NULL,
       note                 VARCHAR(200) 
);
COMMENT ON TABLE ildar.operators IS '���������� �� ��������������';

COMMENT ON COLUMN ildar.operators.operator_id IS '������������� �������������';
COMMENT ON COLUMN ildar.operators.operator_name IS '�.�.�. �������������';
COMMENT ON COLUMN ildar.operators.operator_position IS '��������� �������������';
COMMENT ON COLUMN ildar.operators.reg_date IS '���� ����������� �������������';
COMMENT ON COLUMN ildar.operators.perms IS '����� ������������� (13 ����������� ����):
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
COMMENT ON COLUMN ildar.operators.status IS '������ �������������
0 - ������
1 - ������������
2 - �������';
COMMENT ON COLUMN ildar.operators.note IS '����������';

ALTER TABLE ildar.operators
       ADD  CONSTRAINT XPKoperators PRIMARY KEY (operator_id) ;
------------------------------------------------------------------------
------------'��������� �� ������ �� �������'----------------------------
DROP TABLE ildar.refuse_accepts ;

CREATE TABLE ildar.refuse_accepts (
       doc_id               NUM(28) NOT NULL,
       client_id            NUM(20) NOT NULL,
       date_doc             DATE NOT NULL,
       num_doc              NUM(5) NOT NULL,
       payer_name           VARCHAR(160) NOT NULL,
       payer_account        CHAR(20) NOT NULL,
       amount               DECIMAL(17,2) NOT NULL,
       payer_bank_name      VARCHAR(80) NOT NULL,
       payer_bank_bic       CHAR(9) NOT NULL,
       payer_bank_acc       CHAR(20) NOT NULL,
       rcpt_name            VARCHAR(160) NOT NULL,
       rcpt_account         CHAR(20) NOT NULL,
       rcpt_bank_name       VARCHAR(80) NOT NULL,
       rcpt_bank_bic        CHAR(9) NOT NULL,
       num_request          NUM(5) NOT NULL,
       date_request         DATE NOT NULL,
       request_amount       DECIMAL(17,2) NOT NULL,
       request_inbank_date  DATE NOT NULL,
       refuse_details       VARCHAR(210) NOT NULL,
       status_doc           NUM(1) NOT NULL,
       signers              NUM(3) 
);
COMMENT ON TABLE ildar.refuse_accepts IS '��������� �� ������ �� �������';

COMMENT ON COLUMN ildar.refuse_accepts.doc_id IS '���������� � ������ ������� ������������� ���������';
COMMENT ON COLUMN ildar.refuse_accepts.client_id IS '���������� � ������ ������� ������������� �������, ���������� ��������, �� ������� clients';
COMMENT ON COLUMN ildar.refuse_accepts.date_doc IS '���� ���������';
COMMENT ON COLUMN ildar.refuse_accepts.num_doc IS '����� ���������';
COMMENT ON COLUMN ildar.refuse_accepts.payer_name IS '������������ �����������';
COMMENT ON COLUMN ildar.refuse_accepts.payer_account IS '���� �����������';
COMMENT ON COLUMN ildar.refuse_accepts.amount IS '����� ������� (� �������� ������ - ������)';
COMMENT ON COLUMN ildar.refuse_accepts.payer_bank_name IS '������������ ����� �����������';
COMMENT ON COLUMN ildar.refuse_accepts.payer_bank_bic IS '��� ����� �����������';
COMMENT ON COLUMN ildar.refuse_accepts.payer_bank_acc IS '������� ����� �����������';
COMMENT ON COLUMN ildar.refuse_accepts.rcpt_name IS '������������ ����������';
COMMENT ON COLUMN ildar.refuse_accepts.rcpt_account IS '���� ����������';
COMMENT ON COLUMN ildar.refuse_accepts.rcpt_bank_name IS '������������ ����� ����������';
COMMENT ON COLUMN ildar.refuse_accepts.rcpt_bank_bic IS '��� ����� ����������';
COMMENT ON COLUMN ildar.refuse_accepts.num_request IS '����� ��������� ����������';
COMMENT ON COLUMN ildar.refuse_accepts.date_request IS '���� ��������� ����������';
COMMENT ON COLUMN ildar.refuse_accepts.request_amount IS '����� ��������� ����������';
COMMENT ON COLUMN ildar.refuse_accepts.request_inbank_date IS '���� ����������� ���������� � ���� �����������';
COMMENT ON COLUMN ildar.refuse_accepts.refuse_details IS '�������� ���������, �����, ����� , ���� ��������';
COMMENT ON COLUMN ildar.refuse_accepts.status_doc IS '������� (���������) ��������� ���������. ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ildar.refuse_accepts.signers IS '������ ����������� ������. �������� ������� ������� ������� ��������� ������ ����������� ������: 1 - ������� ����� ������ ������������, 0 - �����������. 0-� ������ ������������� ����� ������ 1, 1-� ������ 2 � �.�.';

ALTER TABLE ildar.refuse_accepts
       ADD  CONSTRAINT XPKrefuse_accepts PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
------------'�����������'-----------------------------------------------
DROP TABLE ildar.accreditivs ;

CREATE TABLE ildar.accreditivs (
       doc_id               NUM(28) NOT NULL,
       client_id            NUM(20) NOT NULL,
       date_doc             DATE NOT NULL,
       num_doc              NUM(5) NOT NULL,
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
       status_doc           NUM(1) NOT NULL,
       signers              NUM(3) 
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
------------------------------------------------------------------------
------------'��������� ����������'--------------------------------------
DROP TABLE ildar.payment_requests ;

CREATE TABLE ildar.payment_requests (
       doc_id               NUM(28) NOT NULL,
       client_id            NUM(20) NOT NULL,
       date_doc             DATE NOT NULL,
       num_doc              NUM(5) NOT NULL,
       payment_type         VARCHAR(10) ,
       payer_inn            VARCHAR(12) ,
       payer_name           VARCHAR(160) NOT NULL,
       payer_account        CHAR(20) NOT NULL,
       amount               DECIMAL(17,2) NOT NULL,
       payer_bank_name      VARCHAR(80) NOT NULL,
       payer_bank_bic       CHAR(9) NOT NULL,
       payer_bank_acc       CHAR(20) ,
       rcpt_inn             VARCHAR(12) ,
       rcpt_name            VARCHAR(160) NOT NULL,
       rcpt_account         CHAR(20) NOT NULL,
       rcpt_bank_name       VARCHAR(80) NOT NULL,
       rcpt_bank_bic        CHAR(9) NOT NULL,
       rcpt_bank_acc        CHAR(20) NOT NULL,
       type_oper            CHAR(2) DEFAULT '02' NOT NULL,
       queue                CHAR(2) ,
       payment_details      VARCHAR(210) NOT NULL,
       condition_pay_type   VARCHAR(20) NOT NULL,
       condition_pay        VARCHAR(250) ,
       term_accept          NUM(3) ,
       documents_date       DATE ,
       status_doc           NUM(1) NOT NULL,
       signers              NUM(3) 
);
COMMENT ON TABLE ildar.payment_requests IS '��������� ����������';

COMMENT ON COLUMN ildar.payment_requests.doc_id IS '���������� � ������ ������� ������������� ���������';
COMMENT ON COLUMN ildar.payment_requests.client_id IS '���������� � ������ ������� ������������� �������, ���������� ��������, �� ������� clients';
COMMENT ON COLUMN ildar.payment_requests.date_doc IS '���� ���������� ����������';
COMMENT ON COLUMN ildar.payment_requests.num_doc IS '����� ���������� ����������';
COMMENT ON COLUMN ildar.payment_requests.payment_type IS '��� �������, ����� ��������� ��������:
"������",
"����������",
"����������"
��� �����������';
COMMENT ON COLUMN ildar.payment_requests.payer_inn IS '��� �����������';
COMMENT ON COLUMN ildar.payment_requests.payer_name IS '������������ �����������';
COMMENT ON COLUMN ildar.payment_requests.payer_account IS '���� �����������';
COMMENT ON COLUMN ildar.payment_requests.amount IS '����� ������� (� �������� ������ - ������)';
COMMENT ON COLUMN ildar.payment_requests.payer_bank_name IS '������������ ����� �����������';
COMMENT ON COLUMN ildar.payment_requests.payer_bank_bic IS '��� ����� �����������';
COMMENT ON COLUMN ildar.payment_requests.payer_bank_acc IS '������� ����� �����������';
COMMENT ON COLUMN ildar.payment_requests.rcpt_inn IS '��� ����������';
COMMENT ON COLUMN ildar.payment_requests.rcpt_name IS '������������ ����������';
COMMENT ON COLUMN ildar.payment_requests.rcpt_account IS '���� ����������';
COMMENT ON COLUMN ildar.payment_requests.rcpt_bank_name IS '������������ ����� ����������';
COMMENT ON COLUMN ildar.payment_requests.rcpt_bank_bic IS '��� ����� ����������';
COMMENT ON COLUMN ildar.payment_requests.rcpt_bank_acc IS '������� ����� ����������';
COMMENT ON COLUMN ildar.payment_requests.type_oper IS '��� ��������, ��� ��������� ���������� "02"';
COMMENT ON COLUMN ildar.payment_requests.queue IS '��� ����������� �������. ����� ��������� �������� "01", "02", "03", "04", "05" ��� "06", ��� �������������';
COMMENT ON COLUMN ildar.payment_requests.payment_details IS '���������� �������';
COMMENT ON COLUMN ildar.payment_requests.condition_pay_type IS '��� ������� ������. ����� ��������� ��������:
"� ��������",
"��� �������"';
COMMENT ON COLUMN ildar.payment_requests.condition_pay IS '��� �������� ������� ��� ������� ������ �� �����, ���� �������� � ������ ������ ��� �����, ���� � ����� ��������, ������������������ ����� ������������� ��������';
COMMENT ON COLUMN ildar.payment_requests.term_accept IS '���� ��� ������� ���������� � ����';
COMMENT ON COLUMN ildar.payment_requests.documents_date IS '���� ������� (��������) ����������� ��������������� ��������� ����������, ���� ������� ���������';
COMMENT ON COLUMN ildar.payment_requests.status_doc IS '������� (���������) ��������� ���������. ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ildar.payment_requests.signers IS '������ ����������� ������. �������� ������� ������� ������� ��������� ������ ����������� ������: 1 - ������� ����� ������ ������������, 0 - �����������. 0-� ������ ������������� ����� ������ 1, 1-� ������ 2 � �.�.';

ALTER TABLE ildar.payment_requests
       ADD   CONSTRAINT XPKpayment_request PRIMARY KEY (doc_id)  ;
------------------------------------------------------------------------
------------'���������� ���������'--------------------------------------
DROP TABLE ildar.encashed_contracts ;

CREATE TABLE ildar.encashed_contracts (
       doc_id               NUM(28) NOT NULL,
       client_id            NUM(20) NOT NULL,
       date_doc             DATE NOT NULL,
       num_doc              NUM(5) NOT NULL,
       payment_type         VARCHAR(10) ,
       payer_inn            VARCHAR(12) ,
       payer_name           VARCHAR(160) NOT NULL,
       payer_account        CHAR(20) NOT NULL,
       amount               DECIMAL(17,2) NOT NULL,
       payer_bank_name      VARCHAR(80) NOT NULL,
       payer_bank_bic       CHAR(9) NOT NULL,
       payer_bank_acc       CHAR(20) ,
       rcpt_inn             VARCHAR(12) ,
       rcpt_name            VARCHAR(160) NOT NULL,
       rcpt_account         CHAR(20) NOT NULL,
       rcpt_bank_name       VARCHAR(80) NOT NULL,
       rcpt_bank_bic        CHAR(9) NOT NULL,
       rcpt_bank_acc        CHAR(20) NOT NULL,
       type_oper            CHAR(2) DEFAULT '06' NOT NULL,
       queue                CHAR(2) ,
       contract_details     VARCHAR(210) NOT NULL,
       status_doc           NUM(1) NOT NULL,
       signers              NUM(3) 
);
COMMENT ON TABLE ildar.encashed_contracts IS '���������� ���������';
COMMENT ON COLUMN ildar.encashed_contracts.doc_id IS '���������� � ������ ������� ������������� ���������';
COMMENT ON COLUMN ildar.encashed_contracts.client_id IS '���������� � ������ ������� ������������� �������, ���������� ��������, �� ������� clients';
COMMENT ON COLUMN ildar.encashed_contracts.date_doc IS '���� ����������� ���������';
COMMENT ON COLUMN ildar.encashed_contracts.num_doc IS '����� ����������� ���������';
COMMENT ON COLUMN ildar.encashed_contracts.payment_type IS '��� �������, ����� ��������� ��������:
"������",
"����������",
"����������"
 ��� �����������';
COMMENT ON COLUMN ildar.encashed_contracts.payer_inn IS '��� �����������';
COMMENT ON COLUMN ildar.encashed_contracts.payer_name IS '������������ �����������';
COMMENT ON COLUMN ildar.encashed_contracts.payer_account IS '���� �����������';
COMMENT ON COLUMN ildar.encashed_contracts.amount IS '����� ������� (� �������� ������ - ������)';
COMMENT ON COLUMN ildar.encashed_contracts.payer_bank_name IS '������������ ����� �����������';
COMMENT ON COLUMN ildar.encashed_contracts.payer_bank_bic IS '��� ����� �����������';
COMMENT ON COLUMN ildar.encashed_contracts.payer_bank_acc IS '������� ����� �����������';
COMMENT ON COLUMN ildar.encashed_contracts.rcpt_inn IS '��� ����������';
COMMENT ON COLUMN ildar.encashed_contracts.rcpt_name IS '������������ ����������';
COMMENT ON COLUMN ildar.encashed_contracts.rcpt_account IS '���� ����������';
COMMENT ON COLUMN ildar.encashed_contracts.rcpt_bank_name IS '������������ ����� ����������';
COMMENT ON COLUMN ildar.encashed_contracts.rcpt_bank_bic IS '��� ����� ����������';
COMMENT ON COLUMN ildar.encashed_contracts.rcpt_bank_acc IS '������� ����� ����������';
COMMENT ON COLUMN ildar.encashed_contracts.type_oper IS '��� ��������, ��� ���������� ��������� "06"';
COMMENT ON COLUMN ildar.encashed_contracts.queue IS '��� ����������� �������. ����� ��������� �������� "01", "02", "03", "04", "05" ��� "06", ��� �������������';
COMMENT ON COLUMN ildar.encashed_contracts.contract_details IS '���������� �������';
COMMENT ON COLUMN ildar.encashed_contracts.status_doc IS '������� (���������) ��������� ���������. ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ildar.encashed_contracts.signers IS '������ ����������� ������. �������� ������� ������� ������� ��������� ������ ����������� ������: 1 - ������� ����� ������ ������������, 0 - �����������. 0-� ������ ������������� ����� ������ 1, 1-� ������ 2 � �.�.';

ALTER TABLE ildar.encashed_contracts
       ADD  CONSTRAINT XPKencashed_contr PRIMARY KEY (doc_id)  ;
------------------------------------------------------------------------
------------'������� ����������'----------------------------------------
DROP TABLE ildar.resources ;

CREATE TABLE ildar.resources (
       app_name             VARCHAR(30) NOT NULL,
       resource_name        VARCHAR(128) NOT NULL,
       version              VARCHAR(20) NOT NULL,
       locale               VARCHAR(30) ,
       valid_from           DATE ,
       valid_to             DATE ,
       type                 VARCHAR(30) NOT NULL,
       content              LONG VARCHAR NOT NULL
);
COMMENT ON TABLE ildar.resources IS '������� ����������';

COMMENT ON COLUMN ildar.resources.app_name IS '������������ ����������';
COMMENT ON COLUMN ildar.resources.resource_name IS '������������ �������';
COMMENT ON COLUMN ildar.resources.version IS '������ �������. ���������, ��� ���������� ��������, ��������, �������� ������ ���� �� ���������, ����� � ��� �� �����.';
COMMENT ON COLUMN ildar.resources.locale IS '������ �������. �������������� �������.';
COMMENT ON COLUMN ildar.resources.valid_from IS '���� ������ �������� �������. �������������� �������, ������� ����� ���� �������� ��� �������� ���� ����������� ���������, �������� �����.';
COMMENT ON COLUMN ildar.resources.valid_to IS '���� ��������� �������� �������. �������������� �������, ������� ����� ���� �������� ��� �������� ���� ����������� ���������, �������� �����.';
COMMENT ON COLUMN ildar.resources.type IS '��� �������';
COMMENT ON COLUMN ildar.resources.content IS '���������� �������';

ALTER TABLE ildar.resources
       ADD   CONSTRAINT XPKresources PRIMARY KEY (app_name, resource_name, version) ;
------------------------------------------------------------------------
------------'������� ���������� �������������.'-------------------------


DROP TABLE ildar.profiles ;

CREATE TABLE ildar.profiles (
       app_name             VARCHAR(30) NOT NULL,
       profile_name         VARCHAR(30) NOT NULL,
       id_key               NUM(20) NOT NULL,
       content              LONG VARCHAR NOT NULL,
       store_date           DATE NOT NULL 
);
COMMENT ON TABLE ildar.profiles IS '������� ���������� �������������.';
COMMENT ON COLUMN ildar.profiles.app_name IS '������������ ����������.';
COMMENT ON COLUMN ildar.profiles.profile_name IS '������������ �������.';
COMMENT ON COLUMN ildar.profiles.id_key IS '���������� ������������� ��������� ����� ��� �������(�������� ��������� �� ���� ��������)';
COMMENT ON COLUMN ildar.profiles.content IS '���������� �������.';
COMMENT ON COLUMN ildar.profiles.store_date IS '���� ����������';

ALTER TABLE ildar.profiles
       ADD  CONSTRAINT XPKprofiles PRIMARY KEY (app_name, profile_name, id_key) ;
------------------------------------------------------------------------
------------'WAP-�������'--------------------------------------
DROP TABLE ildar.mobile_clients ;

CREATE TABLE ildar.mobile_clients (
       login                VARCHAR(60) NOT NULL,
       client_id            NUM(20) NOT NULL,
       password             VARCHAR(60) NOT NULL,
       begin_date           DATE ,
       end_date             DATE ,
       state                NUM(1) NOT NULL
);
COMMENT ON TABLE ildar.mobile_clients IS 'WAP-�������';
COMMENT ON COLUMN ildar.mobile_clients.login IS '����� WAP-�������';
COMMENT ON COLUMN ildar.mobile_clients.client_id IS '������������� �������';
COMMENT ON COLUMN ildar.mobile_clients.password IS '������ WAP-�������';
COMMENT ON COLUMN ildar.mobile_clients.begin_date IS '���� ������ �������� ������';
COMMENT ON COLUMN ildar.mobile_clients.end_date IS '���� ����� �������� ������';
COMMENT ON COLUMN ildar.mobile_clients.state IS '��������� ��������';

ALTER TABLE ildar.mobile_clients
       ADD CONSTRAINT XPKmobile_clients PRIMARY KEY (login) ;
------------------------------------------------------------------------
------------'���������� �����������'--------------------------------------
DROP TABLE ildar.recipients ;

CREATE TABLE ildar.recipients (
       id                   NUM(20) NOT NULL,
       client_id            NUM(20) NOT NULL,
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
------------------------------------------------------------------------
------------'����� ����� ��������� ��������'---------------------------
DROP TABLE ildar.new_accounts ;

CREATE TABLE ildar.new_accounts (
       branch_id            VARCHAR(20) NOT NULL,
       account              CHAR(20) NOT NULL,
       id_key               NUM(20) NOT NULL,
       create_date          DATE NOT NULL
);
COMMENT ON TABLE ildar.new_accounts IS '����� ����� ��������� ��������';

COMMENT ON COLUMN ildar.new_accounts.branch_id IS '������������� ����� � ������ �������';
COMMENT ON COLUMN ildar.new_accounts.account IS '���� �������';
COMMENT ON COLUMN ildar.new_accounts.id_key IS '���������� ������������� ��������� �����';
COMMENT ON COLUMN ildar.new_accounts.create_date IS '���� ��������� ����� �������';
------------------------------------------------------------------------
------------'����� ������� ������� iBank'--------------------------------------
DROP TABLE ildar.new_clients ;

CREATE TABLE ildar.new_clients (
       id_key               NUM(20) NOT NULL,
       date_input           DATE NOT NULL,
       name_cln             VARCHAR(160) NOT NULL,
       inn_cln              VARCHAR(12) ,
       fio_cln              VARCHAR(160) NOT NULL,
       phone_cln            VARCHAR(40) NOT NULL,
       fax_cln              VARCHAR(40) ,
       email_cln            VARCHAR(255) ,
       addr_cln             VARCHAR(200) NOT NULL,
       okpo                 VARCHAR(8) ,
       lock_word            VARCHAR(20) NOT NULL,
       ordering_customer    VARCHAR(160) ,
       cln_type             NUM(1) NOT NULL,
       kpp                  VARCHAR(9) ,
       sign_count           NUM(1) NOT NULL
);
COMMENT ON TABLE ildar.new_clients IS '����� ������� ������� iBank';
COMMENT ON COLUMN ildar.new_clients.id_key IS '���������� ������������� ��������� �����';
COMMENT ON COLUMN ildar.new_clients.date_input IS '���� � ����� ��������������� �����������';
COMMENT ON COLUMN ildar.new_clients.name_cln IS '������������ �������';
COMMENT ON COLUMN ildar.new_clients.inn_cln IS '��� �������';
COMMENT ON COLUMN ildar.new_clients.fio_cln IS '�.�.�. �������������� ���� � �������';
COMMENT ON COLUMN ildar.new_clients.phone_cln IS '������� �������';
COMMENT ON COLUMN ildar.new_clients.fax_cln IS '���� �������';
COMMENT ON COLUMN ildar.new_clients.email_cln IS 'E-mail �������';
COMMENT ON COLUMN ildar.new_clients.addr_cln IS '����� �������';
COMMENT ON COLUMN ildar.new_clients.okpo IS '���� �������';
COMMENT ON COLUMN ildar.new_clients.lock_word IS '������������� ����� ��� ������������ ������� �� ��������';
COMMENT ON COLUMN ildar.new_clients.ordering_customer IS '������������ ������� �� ���������� �����';
COMMENT ON COLUMN ildar.new_clients.cln_type IS '��� �������
0 - ���������� ���� 
1 - ����������� ����';
COMMENT ON COLUMN ildar.new_clients.kpp IS '��� (��� ���������� �� ����)';
COMMENT ON COLUMN ildar.new_clients.sign_count IS '����� �������� ��� �����������';
------------------------------------------------------------------------
------------'����� ����� ��������'--------------------------------------
DROP TABLE ildar.new_keys ;

CREATE TABLE ildar.new_keys (
       id_key               NUM(20) NOT NULL,
       publ_key             LONG VARCHAR NOT NULL,
       creation_date        DATE NOT NULL,
       algorithm            VARCHAR(20) NOT NULL,
       provider             VARCHAR(20) ,
       keyspec              VARCHAR(200) NOT NULL
);
COMMENT ON TABLE ildar.new_keys IS '����� ����� ��������';
COMMENT ON COLUMN ildar.new_keys.id_key IS '���������� ������������� ��������� �����';
COMMENT ON COLUMN ildar.new_keys.publ_key IS '�������� ���� ��� �������';
COMMENT ON COLUMN ildar.new_keys.creation_date IS '���� � ����� ��������������� �����������';
COMMENT ON COLUMN ildar.new_keys.algorithm IS '������������ ��������� ��������� �����';
COMMENT ON COLUMN ildar.new_keys.provider IS '������������ ���������� ���������';
COMMENT ON COLUMN ildar.new_keys.keyspec IS '������������ �����';

ALTER TABLE ildar.new_keys
       ADD  CONSTRAINT XPKnew_keys PRIMARY KEY (id_key) ;
------------------------------------------------------------------------
------------'���������� ������'-----------------------------------------
DROP TABLE ildar.banks ;

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
------------'������'----------------------------------------------------
DROP TABLE ildar.letters ;

CREATE TABLE ildar.letters (
       doc_id               NUM(28) NOT NULL,
       client_id            NUM(20) NOT NULL,
       date_doc             DATE NOT NULL,
       subj_letter          VARCHAR(255) NOT NULL,
       letter_body          LONG VARCHAR ,
       status_doc           NUM(1) NOT NULL,
       signers              NUM(3) 
);
COMMENT ON TABLE ildar.letters IS '������';
COMMENT ON COLUMN ildar.letters.doc_id IS '���������� � ������ ������� ������������� ���������';
COMMENT ON COLUMN ildar.letters.client_id IS '���������� � ������ ������� ������������� �������, ���������� ��������, �� ������� clients';
COMMENT ON COLUMN ildar.letters.date_doc IS '���� ������';
COMMENT ON COLUMN ildar.letters.subj_letter IS '���� ������';
COMMENT ON COLUMN ildar.letters.letter_body IS '���������� ������';
COMMENT ON COLUMN ildar.letters.status_doc IS '������� (���������) ��������� ���������. ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ildar.letters.signers IS '������ ����������� ������. �������� ������� ������� ������� ��������� ������ ����������� ������: 1 - ������� ����� ������ ������������, 0 - �����������. 0-� ������ ������������� ����� ������ 1, 1-� ������ 2 � �.�.';

ALTER TABLE ildar.letters
       ADD  CONSTRAINT XPKletters PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
------------'��������� ���������'--------------------------------------
DROP TABLE ildar.payments;

CREATE TABLE ildar.payments (
       doc_id               NUM(28) NOT NULL,
       client_id            NUM(20) NOT NULL,
       date_doc             DATE NOT NULL,
       num_doc              NUM(5) NOT NULL,
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
       status_doc           NUM(1) NOT NULL,
       signers              NUM(3) 
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
------------------------------------------------------------------------
------------'�������� ����� ��� ��������'--------------------------------------
DROP TABLE ildar.keys ;

CREATE TABLE ildar.keys (
       id_key               NUM(20) NOT NULL,
       client_id            NUM(20) NOT NULL,
       publ_key             LONG VARCHAR NOT NULL,
       status_key           NUM(1) DEFAULT 1 NOT NULL,
       begin_date           DATE NOT NULL,
       end_date             DATE NOT NULL,
       sign_group           NUM(1) NOT NULL,
       creation_date        DATE NOT NULL,
       notes                VARCHAR(200) 
);
COMMENT ON TABLE ildar.keys IS '�������� ����� ��� ��������';

COMMENT ON COLUMN ildar.keys.id_key IS '���������� ������������� ��������� ����� ��� �������(�������� ��������� �� ���� ��������)';
COMMENT ON COLUMN ildar.keys.client_id IS '������������� �������';
COMMENT ON COLUMN ildar.keys.publ_key IS '�������� ���� ��� �������';
COMMENT ON COLUMN ildar.keys.status_key IS '������� ������ ����� ��� �������:
0 - ������,
1 - ����������,
2 - ��������';
COMMENT ON COLUMN ildar.keys.begin_date IS '���� ������ �������� ����� ��� �������';
COMMENT ON COLUMN ildar.keys.end_date IS '���� ��������� �������� ����� ��� �������';
COMMENT ON COLUMN ildar.keys.sign_group IS '������ ������� ����������.
0 - ��� ����� �������
1 - 1-� �������
2 - 2-� �������';
COMMENT ON COLUMN ildar.keys.creation_date IS '���� �������� ����� ��� �������';
COMMENT ON COLUMN ildar.keys.notes IS '���������� ��������������';

ALTER TABLE ildar.keys
       ADD  CONSTRAINT XPKkeys PRIMARY KEY (id_key) ;
------------------------------------------------------------------------
------------'����� �������� �������'--------------------------------------
DROP TABLE ildar.accounts ;

CREATE TABLE ildar.accounts (
       branch_id            VARCHAR(20) NOT NULL,
       account              CHAR(20) NOT NULL,
       client_id            NUM(20) NOT NULL,
       type_account         NUM(1) NOT NULL,
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
------------------------------------------------------------------------
------------'����������� ����� �������� �������'------------------------
DROP TABLE ildar.spec_accounts ;

CREATE TABLE ildar.spec_accounts (
       branch_id            VARCHAR(20) NOT NULL,
       account              CHAR(20) NOT NULL,
       client_id            NUM(20) NOT NULL,
       type_account         NUM(1) NOT NULL,
       currency             VARCHAR(3) NOT NULL
);
COMMENT ON TABLE ildar.spec_accounts IS '����������� ����� �������� �������';
COMMENT ON COLUMN ildar.spec_accounts.branch_id IS '���������� ������������� ����� ��� �������, ������������������ � �������';
COMMENT ON COLUMN ildar.spec_accounts.account IS '���� �������';
COMMENT ON COLUMN ildar.spec_accounts.client_id IS '���������� � ������ ������� ������������� �������, �� ������� ��������������� ���� �� ������� clients';
COMMENT ON COLUMN ildar.spec_accounts.type_account IS '��� �����. ����� ��������� ��������:
5 - ��� ������������ �������';
COMMENT ON COLUMN spec_accounts.currency IS '��������� ��� (USD, DEM � �.�.) ������ �����';
------------------------------------------------------------------------
------------'��������� �� ������� ����������� ������'-------------------
DROP TABLE ildar.currency_sale ;

CREATE TABLE ildar.currency_sale (
       doc_id               NUM(28) NOT NULL,
       client_id            NUM(20) NOT NULL,
       date_doc             DATE NOT NULL,
       num_doc              NUM(5) NOT NULL,
       cln_bnk_name         VARCHAR(80) NOT NULL,
       cln_name             VARCHAR(160) NOT NULL,
       cln_inn              VARCHAR(12) ,
       cln_okpo             VARCHAR(8) ,
       cln_addr             VARCHAR(255) ,
       cln_employee_fio     VARCHAR(80) ,
       cln_employee_phones  VARCHAR(40) ,
       sale_sum             DECIMAL(28,10) ,
       sale_currency        VARCHAR(3) NOT NULL,
       sale_account         VARCHAR(20) NOT NULL,
       sale_rate_kind       VARCHAR(40) NOT NULL,
       sale_rate            DECIMAL(28,10) ,
       received_sum         DECIMAL(28,10) ,
       received_account     VARCHAR(20) NOT NULL,
       received_bnk_bic     VARCHAR(9) NOT NULL,
       received_bnk_account VARCHAR(20) NOT NULL,
       received_bnk_name    VARCHAR(80) NOT NULL,
       commission_account   VARCHAR(20) ,
       commission_kind      VARCHAR(40) NOT NULL,
       commission_sum       DECIMAL(28,10) ,
       commission_currency  VARCHAR(3) ,
       experience_date      DATE ,
       added_cond           VARCHAR(255) ,
       status_doc           NUM(1) NOT NULL,
       signers              NUM(3) 
);
COMMENT ON TABLE ildar.currency_sale IS '��������� �� ������� ����������� ������';
COMMENT ON COLUMN ildar.currency_sale.doc_id IS '���������� � ������ ������� ������������� ���������';
COMMENT ON COLUMN ildar.currency_sale.client_id IS '���������� � ������ ������� ������������� �������, ���������� ��������, �� ������� clients';
COMMENT ON COLUMN ildar.currency_sale.date_doc IS '���� ���������';
COMMENT ON COLUMN ildar.currency_sale.num_doc IS '����� ���������';
COMMENT ON COLUMN ildar.currency_sale.cln_bnk_name IS '������������ ����� �������';
COMMENT ON COLUMN ildar.currency_sale.cln_name IS '������������ �������';
COMMENT ON COLUMN ildar.currency_sale.cln_inn IS '��� �������';
COMMENT ON COLUMN ildar.currency_sale.cln_okpo IS '���� �������';
COMMENT ON COLUMN ildar.currency_sale.cln_addr IS '����� �������';
COMMENT ON COLUMN ildar.currency_sale.cln_employee_fio IS '�.�.�. �������������� ���������� �������';
COMMENT ON COLUMN ildar.currency_sale.cln_employee_phones IS '���������� �������� �������������� ���������� �������';
COMMENT ON COLUMN ildar.currency_sale.sale_sum IS '����� ����������� ������';
COMMENT ON COLUMN ildar.currency_sale.sale_currency IS '��������� ��� (USD, DEM � �.�.) ����������� ������';
COMMENT ON COLUMN ildar.currency_sale.sale_account IS '���� ��� �������� ����������� ������';
COMMENT ON COLUMN ildar.currency_sale.sale_rate_kind IS '������� ������ ����� ������� ������. ����� ��������� ��������:
"�� ����� �����", 
"�� ����� �����",
"�� ����� �� ���� ���"';
COMMENT ON COLUMN ildar.currency_sale.sale_rate IS '���� ������� ������. ����������� � ����������� �� �������� ���� �������� ������ ����� ������� - SALE_RATE_KIND';
COMMENT ON COLUMN ildar.currency_sale.received_sum IS '����������� ����� ������, ���������� �� ������� ������';
COMMENT ON COLUMN ildar.currency_sale.received_account IS '���� ��� ���������� ������, ���������� �� ������� ������. ���� ���� ����� ���������� � ������ �����';
COMMENT ON COLUMN ildar.currency_sale.received_bnk_bic IS '��� �����, � ������� ������ ���� ��� ���������� ������.';
COMMENT ON COLUMN ildar.currency_sale.received_bnk_account IS '������� �����, � ������� ������ ���� ��� ���������� ������.';
COMMENT ON COLUMN ildar.currency_sale.received_bnk_name IS '������������ �����, � ������� ������ ���� ��� ����������';
COMMENT ON COLUMN ildar.currency_sale.commission_account IS '���� �������, � �������� ����������� ������������ �������. ���� ���� ��������� � �����, � ������� ������ ���� ��� �������� ������';
COMMENT ON COLUMN ildar.currency_sale.commission_kind IS '��� ��������. ����� ��������� ��������:
"�������� �� ���������", 
"� ������������ � �������� �����",
"�� ����� "';
COMMENT ON COLUMN ildar.currency_sale.commission_sum IS '����� ��������. ����������� � ����������� �� �������� ���� ���� �������� - COMMISSION_KIND';
COMMENT ON COLUMN ildar.currency_sale.commission_currency IS '��������� ��� ������ (USD, DEM � ��.) ����� ��������';
COMMENT ON COLUMN ildar.currency_sale.experience_date IS '���� �������� ��������� - ���� ������������, �� ������� ������������� ��������� �� ������� ������';
COMMENT ON COLUMN ildar.currency_sale.added_cond IS '�������������� ������� �� ������� ������.';
COMMENT ON COLUMN ildar.currency_sale.status_doc IS '������� (���������) ��������� ���������. ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ildar.currency_sale.signers IS '������ ����������� ������. �������� ������� ������� ������� ��������� ������ ����������� ������: 1 - ������� ����� ������ ������������, 0 - �����������. 0-� ������ ������������� ����� ������ 1, 1-� ������ 2 � �.�.';

ALTER TABLE ildar.currency_sale
       ADD  CONSTRAINT XPKcurrency_sale PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
------------'��������� �� ������� ����������� ������'--------------------------------------
DROP TABLE ildar.currency_purchase ;

CREATE TABLE ildar.currency_purchase (
       doc_id               NUM(28) NOT NULL,
       client_id            NUM(20) NOT NULL,
       date_doc             DATE NOT NULL,
       num_doc              NUM(5) NOT NULL,
       cln_bnk_name         VARCHAR(80) NOT NULL,
       cln_name             VARCHAR(160) NOT NULL,
       cln_inn              VARCHAR(12) ,
       cln_okpo             VARCHAR(8) ,
       cln_addr             VARCHAR(255) ,
       cln_employee_fio     VARCHAR(80) ,
       cln_employee_phones  VARCHAR(40) ,
       sale_sum             DECIMAL(28,10) ,
       sale_kind            VARCHAR(8) NOT NULL,
       sale_account         VARCHAR(20) NOT NULL,
       merge_doc_num        NUM(5) ,
       merge_doc_date       DATE ,
       purchase_rate_kind   VARCHAR(40) NOT NULL,
       purchase_rate        DECIMAL(28,10) ,
       purchase_sum         DECIMAL(28,10) ,
       purchase_currency    VARCHAR(3) NOT NULL,
       purchase_account     VARCHAR(20) NOT NULL,
       commission_account   VARCHAR(20) ,
       commission_kind      VARCHAR(40) NOT NULL,
       commission_sum       DECIMAL(28,10) ,
       commission_currency  VARCHAR(3) ,
       experience_date      DATE ,
       added_cond           VARCHAR(255) ,
       purchase_basis_code  VARCHAR(2) ,
       purchase_basis       VARCHAR(255) ,
       contract             VARCHAR(100) ,
       reg_form             VARCHAR(100) ,
       bargain_passport     VARCHAR(255) ,
       gtd                  VARCHAR(255) ,
       cxr_added_info       VARCHAR(255) ,
       use_depo_contract    VARCHAR(5) NOT NULL,
       depo_contract_num    VARCHAR(10) ,
       depo_contract_date   DATE ,  
       depo_sum             DECIMAL(28,10) ,
       depo_kind            VARCHAR(40) ,
       depo_from_account    VARCHAR(20) ,
       depo_to_account      VARCHAR(20) ,
       status_doc           NUM(1) NOT NULL,
       signers              NUM(3) 
);
COMMENT ON TABLE ildar.currency_purchase IS '��������� �� ������� ����������� ������';

COMMENT ON COLUMN ildar.currency_purchase.doc_id IS '���������� � ������ ������� ������������� ���������';
COMMENT ON COLUMN ildar.currency_purchase.client_id IS '���������� � ������ ������� ������������� �������, ���������� ��������, �� ������� clients';
COMMENT ON COLUMN ildar.currency_purchase.date_doc IS '���� ���������';
COMMENT ON COLUMN ildar.currency_purchase.num_doc IS '����� ���������';
COMMENT ON COLUMN ildar.currency_purchase.cln_bnk_name IS '������������ ����� �������';
COMMENT ON COLUMN ildar.currency_purchase.cln_name IS '������������ �������';
COMMENT ON COLUMN ildar.currency_purchase.cln_inn IS '��� �������';
COMMENT ON COLUMN ildar.currency_purchase.cln_okpo IS '���� �������';
COMMENT ON COLUMN ildar.currency_purchase.cln_addr IS '����� �������';
COMMENT ON COLUMN ildar.currency_purchase.cln_employee_fio IS '�.�.�. �������������� ���������� �������';
COMMENT ON COLUMN ildar.currency_purchase.cln_employee_phones IS '���������� �������� �������������� ���������� �������';
COMMENT ON COLUMN ildar.currency_purchase.sale_sum IS '����� ������ ��� ������� ������';
COMMENT ON COLUMN ildar.currency_purchase.sale_kind IS '������� ��������-�������� �������� ������� ��� ������� ������. ����� ��� ��������: 
"WRITING"  - �������� �������� ����� � ��������� ����� ������� ���
"TRANSFER"' ;
--"TRANSFER"- ������ �������������� ������� �������� �������� �� ������� ������ �� �������� ���� � ������������ ����������� ���������� ���������';
COMMENT ON COLUMN ildar.currency_purchase.sale_account IS '�������� ����, � �������� ���������� �������� �������� ����� ��� ������� ������';
COMMENT ON COLUMN ildar.currency_purchase.merge_doc_num IS '����� ���������� ���������, ������� ���� ����������� �������� �������� ��� ������� ������.';
COMMENT ON COLUMN ildar.currency_purchase.merge_doc_date IS '���� ���������� ���������, ������� ���� ����������� �������� �������� ��� ������� ������.';
COMMENT ON COLUMN ildar.currency_purchase.purchase_rate_kind IS '������� ������ ����� ������� ������. ����� ��������� ��������: 
"�� ����� �����", 
"�� ����� �����",
"�� ����� �� ���� ���"';
COMMENT ON COLUMN ildar.currency_purchase.purchase_rate IS '���� ������� ������. ����������� � ����������� �� �������� ������ ����� - PURCHASE_RATE_KIND';
COMMENT ON COLUMN ildar.currency_purchase.purchase_sum IS '����� ���������� ������, ����������� �� �������������� �������� ���� (��� ����������) ��� ������� �������� ���� (��� ������������) ��������� ������';
COMMENT ON COLUMN ildar.currency_purchase.purchase_currency IS '��������� ��� (USD, DEM � �.�.) ���������� ������';
COMMENT ON COLUMN ildar.currency_purchase.purchase_account IS '���� ��� ���������� ���������� ������ (�������������� ��� ���������� � ������� ��� ������������)';
COMMENT ON COLUMN ildar.currency_purchase.commission_account IS '���� �������, � �������� ����������� ������� � ������� ����� �� ������� ������. ���� ���� ��������� � ����� �������.';
COMMENT ON COLUMN ildar.currency_purchase.commission_kind IS '��� ��������. ����� ��������� ��������:
"�������� �� ���������", 
"� ������������ � �������� �����",
"�� �����"';
COMMENT ON COLUMN ildar.currency_purchase.commission_sum IS '����� ��������. ����������� � ����������� �� �������� ���� ���� �������� - COMMISSION_KIND';
COMMENT ON COLUMN ildar.currency_purchase.commission_currency IS '��������� ��� ������ (USD, DEM � ��.) ����� ��������';
COMMENT ON COLUMN ildar.currency_purchase.experience_date IS '���� �������� ��������� - ���� ������������, �� ������� ������������� ��������� �� ������� ������';
COMMENT ON COLUMN ildar.currency_purchase.added_cond IS '�������������� ������� �� ������� ������';
COMMENT ON COLUMN ildar.currency_purchase.purchase_basis_code IS '��� ��������� ������� ������';
COMMENT ON COLUMN ildar.currency_purchase.purchase_basis IS '��� ��������� ������� ������ - ��������� ����������';
COMMENT ON COLUMN ildar.currency_purchase.contract IS '��� ���������� � ��������, ���������, ����������, � ������������ � ������� ���������� ������� ������. ��� �������, ����������� �����, ���� � ����� ����� ��������';
COMMENT ON COLUMN ildar.currency_purchase.reg_form IS '������� ����� ���������. ����������� ����� � ���� ������� ����� ���������';
COMMENT ON COLUMN ildar.currency_purchase.bargain_passport IS '������� ������';
COMMENT ON COLUMN ildar.currency_purchase.gtd IS '������ ���';
COMMENT ON COLUMN ildar.currency_purchase.cxr_added_info IS '�������������� ���������� ��� ��������� ��������, �� �������� � ������������ ����';
COMMENT ON COLUMN ildar.currency_purchase.use_depo_contract IS '������� ��������� ��� ��� �� ���������� �������. ����� ��������� �������� "true" ��� "false"';
COMMENT ON COLUMN ildar.currency_purchase.depo_contract_num IS '����� ����������� ��������';
COMMENT ON COLUMN ildar.currency_purchase.depo_contract_date IS '���� ����������� ��������';
COMMENT ON COLUMN ildar.currency_purchase.depo_sum IS '������������ ����� ������';
COMMENT ON COLUMN ildar.currency_purchase.depo_kind IS '������ ������������. ����� ��������� ��������:
"������� �� ���������� ����",
"�������� ������������ �� �����"';
COMMENT ON COLUMN ildar.currency_purchase.depo_from_account IS '���� ��� �������� ������������ ����� ������';
COMMENT ON COLUMN ildar.currency_purchase.depo_to_account IS '����, �� ������� ������������ ����� �������� ����������� ��������';
COMMENT ON COLUMN ildar.currency_purchase.status_doc IS '������� (���������) ��������� ���������. ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ildar.currency_purchase.signers IS '������ ����������� ������. �������� ������� ������� ������� ��������� ������ ����������� ������: 1 - ������� ����� ������ ������������, 0 - �����������. 0-� ������ ������������� ����� ������ 1, 1-� ������ 2 � �.�.';

ALTER TABLE ildar.currency_purchase
       ADD  CONSTRAINT XPKcurrency_purch PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
------------'��������� �� �������� ������� ����������� ������'----------
DROP TABLE ildar.currency_rsale ;

CREATE TABLE ildar.currency_rsale (
       doc_id               NUM(28) NOT NULL,
       client_id            NUM(20) NOT NULL,
       date_doc             DATE NOT NULL,
       num_doc              NUM(5) NOT NULL,
       cln_bnk_name         VARCHAR(80) NOT NULL,
       cln_name             VARCHAR(160) NOT NULL,
       cln_inn              VARCHAR(12) ,
       cln_okpo             VARCHAR(8) ,
       cln_addr             VARCHAR(255) ,
       cln_employee_fio     VARCHAR(80) ,
       cln_employee_phones  VARCHAR(40) ,
       rsale_sum            DECIMAL(28,10) ,
       rsale_currency       VARCHAR(3) NOT NULL,
       rsale_account        VARCHAR(20) NOT NULL,
       rsale_rate_kind      VARCHAR(40) NOT NULL,
       rsale_rate           DECIMAL(28,10) ,
       received_sum         DECIMAL(28,10) ,
       received_account     VARCHAR(20) NOT NULL,
       received_bnk_bic     VARCHAR(9) NOT NULL,
       received_bnk_account VARCHAR(20) NOT NULL,
       received_bnk_name    VARCHAR(80) NOT NULL,
       commission_account   VARCHAR(20) ,
       commission_kind      VARCHAR(40) NOT NULL,
       commission_sum       DECIMAL(28,10) ,
       commission_currency  VARCHAR(3) ,
       experience_date      DATE ,
       added_cond           VARCHAR(255) ,
       currency_purchase_info VARCHAR(255) ,
       status_doc           NUM(1) NOT NULL,
       signers              NUM(3) 
);
COMMENT ON TABLE ildar.currency_rsale IS '��������� �� �������� ������� ����������� ������';
COMMENT ON COLUMN ildar.currency_rsale.doc_id IS '���������� � ������ ������� ������������� ���������';
COMMENT ON COLUMN ildar.currency_rsale.client_id IS '���������� � ������ ������� ������������� �������, ���������� ��������, �� ������� clients';
COMMENT ON COLUMN ildar.currency_rsale.date_doc IS '���� ���������';
COMMENT ON COLUMN ildar.currency_rsale.num_doc IS '����� ���������';
COMMENT ON COLUMN ildar.currency_rsale.cln_bnk_name IS '������������ ����� �������';
COMMENT ON COLUMN ildar.currency_rsale.cln_name IS '������������ �������';
COMMENT ON COLUMN ildar.currency_rsale.cln_inn IS '��� �������';
COMMENT ON COLUMN ildar.currency_rsale.cln_okpo IS '���� �������';
COMMENT ON COLUMN ildar.currency_rsale.cln_addr IS '����� �������';
COMMENT ON COLUMN ildar.currency_rsale.cln_employee_fio IS '�.�.�. �������������� ���������� �������';
COMMENT ON COLUMN ildar.currency_rsale.cln_employee_phones IS '���������� �������� �������������� ���������� �������';
COMMENT ON COLUMN ildar.currency_rsale.rsale_sum IS '����� ������� ����������� ������';
COMMENT ON COLUMN ildar.currency_rsale.rsale_currency IS '��������� ��� (USD, DEM � �.�.) ������� ����������� ������';
COMMENT ON COLUMN ildar.currency_rsale.rsale_account IS '���� ��� �������� ������� ����������� ������';
COMMENT ON COLUMN ildar.currency_rsale.rsale_rate_kind IS '������� ������ ����� �������� �������. ����� ��������� ��������:
"�� ����� �����", 
"�� ����� �����",
"�� ����� �� ���� ���"';
COMMENT ON COLUMN ildar.currency_rsale.rsale_rate IS '���� �������� ������� ������. ����������� � ����������� �� �������� ���� �������� ������ ����� ������� - RSALE_RATE_KIND';
COMMENT ON COLUMN ildar.currency_rsale.received_sum IS '����������� ����� ������, ���������� �� ������� ������';
COMMENT ON COLUMN ildar.currency_rsale.received_account IS '���� ��� ���������� ������, ���������� �� �������� ������� ������. ���� ���� ����� ���������� � ������ �����';
COMMENT ON COLUMN ildar.currency_rsale.received_bnk_bic IS '��� �����, � ������� ������ �������� ���� ��� ����������';
COMMENT ON COLUMN ildar.currency_rsale.received_bnk_account IS '������� �����, � ������� ������ �������� ���� ��� ����������';
COMMENT ON COLUMN ildar.currency_rsale.received_bnk_name IS '������������ �����, � ������� ������ �������� ���� ��� ����������';
COMMENT ON COLUMN ildar.currency_rsale.commission_account IS '���� �������, � �������� ����������� ������������ �������. ���� ���� ��������� � �����, � ������� ������ ���� ��� �������� ������';
COMMENT ON COLUMN ildar.currency_rsale.commission_kind IS '��� ��������. ����� ��������� ��������:
"�������� �� ���������", 
"� ������������ � �������� �����",
"�� �����"';
COMMENT ON COLUMN ildar.currency_rsale.commission_sum IS '����� ��������. ����������� � ����������� �� �������� ���� ���� �������� - COMMISSION_KIND';
COMMENT ON COLUMN ildar.currency_rsale.commission_currency IS '��������� ��� ������ (USD, DEM � ��.) ����� ��������';
COMMENT ON COLUMN ildar.currency_rsale.experience_date IS '���� �������� ��������� - ���� ������������, �� ������� ������������� ��������� �� �������� ������� ������';
COMMENT ON COLUMN ildar.currency_rsale.added_cond IS '�������������� ������� �� �������� ������� ������';
COMMENT ON COLUMN ildar.currency_rsale.currency_purchase_info IS '���������� � ����� ��������� � ������� ����������� ������';
COMMENT ON COLUMN ildar.currency_rsale.status_doc IS '������� (���������) ��������� ���������. ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ildar.currency_rsale.signers IS '������ ����������� ������. �������� ������� ������� ������� ��������� ������ ����������� ������: 1 - ������� ����� ������ ������������, 0 - �����������. 0-� ������ ������������� ����� ������ 1, 1-� ������ 2 � �.�.';

ALTER TABLE ildar.currency_rsale
       ADD  CONSTRAINT XPKcurrency_rsale PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
------------'��������� �� ������������ ������� ����������� ������'------
DROP TABLE ildar.currency_fsale ;

CREATE TABLE ildar.currency_fsale (
       doc_id               NUM(28) NOT NULL,
       client_id            NUM(20) ,
       date_doc             DATE NOT NULL,
       num_doc              NUM(5) NOT NULL,
       cln_bnk_name         VARCHAR(80) NOT NULL,
       cln_name             VARCHAR(160) NOT NULL,
       cln_inn              VARCHAR(12) ,
       cln_okpo             VARCHAR(8) ,
       cln_addr             VARCHAR(255) ,
       cln_employee_fio     VARCHAR(80) ,
       cln_employee_phones  VARCHAR(40) ,
       total_sum            DECIMAL(28,10) NOT NULL,
       total_currency       VARCHAR(3) NOT NULL,
       refs_1               VARCHAR(255),
       refs_2               VARCHAR(255) ,
       refs_3               VARCHAR(255) ,
       refs_4               VARCHAR(255) ,
       refs_5               VARCHAR(255) ,
       sale_account         VARCHAR(20) NOT NULL,
       transfer_sum         DECIMAL(28,10) NOT NULL,
       transfer_currency    VARCHAR(3) NOT NULL,
       transfer_account     VARCHAR(20) NOT NULL,
       force_sale_sum       DECIMAL(28,10) NOT NULL,
       force_sale_currency  VARCHAR(3) NOT NULL,
       force_sale_rate_kind VARCHAR(40) NOT NULL,
       force_sale_rate      DECIMAL(28,10) ,
       received_account     VARCHAR(20) NOT NULL,
       received_bnk_bic     VARCHAR(9) NOT NULL,
       received_bnk_account VARCHAR(20) NOT NULL,
       received_bnk_name    VARCHAR(80) NOT NULL,
       commission_account   VARCHAR(20) ,
       commission_kind      VARCHAR(40) NOT NULL,
       commission_sum       DECIMAL(28,10) ,
       commission_currency  VARCHAR(3) ,
       experience_date      DATE ,
       added_cond           VARCHAR(255) ,
       payment_kind_code    VARCHAR(2) ,
       payment_kind_info    VARCHAR(255) ,
       xchg_oper_type       VARCHAR(2) ,
       contract             VARCHAR(100) ,
       reg_form             VARCHAR(100) ,
       bargain_passport     VARCHAR(255) ,
       gtd                  VARCHAR(255) ,
       cxr_added_info       VARCHAR(255) ,
       force_sale_account   VARCHAR(20) NOT NULL,
       status_doc           NUM(1) NOT NULL,
       signers              NUM(3) 
);
COMMENT ON TABLE ildar.currency_fsale IS '��������� �� ������������ ������� ����������� ������';
COMMENT ON COLUMN ildar.currency_fsale.doc_id IS '���������� � ������ ������� ������������� ���������';
COMMENT ON COLUMN ildar.currency_fsale.client_id IS '���������� � ������ ������� ������������� �������, ���������� ��������, �� ������� clients';
COMMENT ON COLUMN ildar.currency_fsale.date_doc IS '���� ���������';
COMMENT ON COLUMN ildar.currency_fsale.num_doc IS '����� ���������';
COMMENT ON COLUMN ildar.currency_fsale.cln_bnk_name IS '������������ ����� �������';
COMMENT ON COLUMN ildar.currency_fsale.cln_name IS '������������ �������';
COMMENT ON COLUMN ildar.currency_fsale.cln_inn IS '��� �������';
COMMENT ON COLUMN ildar.currency_fsale.cln_okpo IS '���� �������';
COMMENT ON COLUMN ildar.currency_fsale.cln_addr IS '����� �������';
COMMENT ON COLUMN ildar.currency_fsale.cln_employee_fio IS '�.�.�. �������������� ���������� �������';
COMMENT ON COLUMN ildar.currency_fsale.cln_employee_phones IS '���������� �������� �������������� ���������� �������';
COMMENT ON COLUMN ildar.currency_fsale.total_sum IS '����� ����� �������� �������';
COMMENT ON COLUMN ildar.currency_fsale.total_currency IS '��������� ��� (USD, DEM � �.�.) ������ ����� ����� �������� �������';
COMMENT ON COLUMN ildar.currency_fsale.refs_1 IS '������ ��������. �������� ����� ���������, ����, �����, ��� ������.';
COMMENT ON COLUMN ildar.currency_fsale.refs_2 IS '������ ��������. �������� ����� ���������, ����, �����, ��� ������.';
COMMENT ON COLUMN ildar.currency_fsale.refs_3 IS '������ ��������. �������� ����� ���������, ����, �����, ��� ������.';
COMMENT ON COLUMN ildar.currency_fsale.refs_4 IS '��������� ��������. �������� ����� ���������, ����, �����, ��� ������.';
COMMENT ON COLUMN ildar.currency_fsale.refs_5 IS '����� ��������. �������� ����� ���������, ����, �����, ��� ������.';
COMMENT ON COLUMN ildar.currency_fsale.sale_account IS '���� ��� �������� ���������� �������. ���������� ���� ������� � �����.';
COMMENT ON COLUMN ildar.currency_fsale.transfer_sum IS '����������� ����� ������ - ����� �������� �������, ������� ����������� �� ������� �������� ����.';
COMMENT ON COLUMN ildar.currency_fsale.transfer_currency IS '��������� ��� (USD, DEM � �.�.) ������ ����������� ����� ������';
COMMENT ON COLUMN ildar.currency_fsale.transfer_account IS '������� �������� ����, �� ������� ����������� ����� transfer_sum - ����� ����� �������� �������';
COMMENT ON COLUMN ildar.currency_fsale.force_sale_sum IS '����� ����� �������� �������, ������� ����������� �� ���� 47405xxxxxxxxxxxxxxx ��� ������������ ������� �� �������� �����';
COMMENT ON COLUMN ildar.currency_fsale.force_sale_currency IS '��������� ��� (USD, DEM � �.�.) ������ ����� ��� ������������ �������';
COMMENT ON COLUMN ildar.currency_fsale.force_sale_rate_kind IS '������� ������ ����� �������.����� ��������� ��������:
"�� ����� �����",
"�� ����� �����",
"�� ����� �� ���� ���"';
COMMENT ON COLUMN ildar.currency_fsale.force_sale_rate IS '���� ������� ������. ����������� � ����������� �� �������� ���� �������� ������ ����� ������� - FORCE_SALE_RATE_KIND';
COMMENT ON COLUMN ildar.currency_fsale.received_account IS '���� ��� ���������� ������. ����� ���������� � ������ �����.';
COMMENT ON COLUMN ildar.currency_fsale.received_bnk_bic IS '��� �����, � ������� ������ ���� ��� ���������� ������.';
COMMENT ON COLUMN ildar.currency_fsale.received_bnk_account IS '������� �����, � ������� ������ ���� ��� ���������� ������.';
COMMENT ON COLUMN ildar.currency_fsale.received_bnk_name IS '������������ �����, � ������� ������ ���� ��� ���������� ������.';
COMMENT ON COLUMN ildar.currency_fsale.commission_account IS '���� �������, � �������� ����������� ������������ �������. ���� ���� ��������� � �����, � ������� ������ ���� ��� �������� ������';
COMMENT ON COLUMN ildar.currency_fsale.commission_kind IS '��� ��������. ����� ��������� ��������:
"�������� �� ���������", 
"� ������������ � �������� �����",
"�� �����"';
COMMENT ON COLUMN ildar.currency_fsale.commission_sum IS '����� ��������. ����������� � ����������� �� �������� ���� ���� �������� - COMMISSION_KIND';
COMMENT ON COLUMN ildar.currency_fsale.commission_currency IS '��������� ��� ������ (USD, DEM � ��.) ����� ��������';
COMMENT ON COLUMN ildar.currency_fsale.experience_date IS '���� �������� ��������� - ���� ������������, �� ������� ������������� ��������� �� ������������ ������� ������';
COMMENT ON COLUMN ildar.currency_fsale.added_cond IS '�������������� ������� �� ������� ������';
COMMENT ON COLUMN ildar.currency_fsale.payment_kind_code IS '��� ���� �������';
COMMENT ON COLUMN ildar.currency_fsale.payment_kind_info IS '��� ���� ������� - ��������� ����������';
COMMENT ON COLUMN ildar.currency_fsale.xchg_oper_type IS '��� �������� ��������';
COMMENT ON COLUMN ildar.currency_fsale.contract IS '��� ���������� � ��������, ���������, ����������, � ������������ � ������� ���������� ������� ������. ��� �������, ����������� �����, ���� � ����� ����� ��������';
COMMENT ON COLUMN ildar.currency_fsale.reg_form IS '������� ����� ���������. ����������� ����� � ���� ������� ����� ���������';
COMMENT ON COLUMN ildar.currency_fsale.bargain_passport IS '������� ������';
COMMENT ON COLUMN ildar.currency_fsale.gtd IS '������ ���';
COMMENT ON COLUMN ildar.currency_fsale.cxr_added_info IS '�������������� ���������� ��� ��������� ��������, �� �������� � ������������ ����';
COMMENT ON COLUMN ildar.currency_fsale.force_sale_account IS '���� ��� ������������ �������';
COMMENT ON COLUMN ildar.currency_fsale.status_doc IS '������� (���������) ��������� ���������. ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ildar.currency_fsale.signers IS '������ ����������� ������. �������� ������� ������� ������� ��������� ������ ����������� ������: 1 - ������� ����� ������ ������������, 0 - �����������. 0-� ������ ������������� ����� ������ 1, 1-� ������ 2 � �.�.';

ALTER TABLE ildar.currency_fsale
       ADD  CONSTRAINT XPKcurrency_fsale PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
------------''--------------------------------------
------------------------------------------------------------------------
------------''--------------------------------------
------------------------------------------------------------------------
------------''--------------------------------------
------------------------------------------------------------------------
------------''--------------------------------------
------------------------------------------------------------------------
------------''--------------------------------------
------------------------------------------------------------------------
------------''--------------------------------------
------------------------------------------------------------------------
------------''--------------------------------------
------------------------------------------------------------------------
------------''--------------------------------------
------------------------------------------------------------------------
------------''--------------------------------------
------------------------------------------------------------------------
------------''--------------------------------------
------------------------------------------------------------------------
------------''--------------------------------------
------------------------------------------------------------------------
------------''--------------------------------------


