
-------------------- �������� ������ ----------------------------------- 

------------'������� �������� � ��������� ������� ��� ��������'---------
DROP TABLE ibank.keys_history;

CREATE TABLE ibank.keys_history (
       id_key               DEC(20) NOT NULL,
       status_key           DEC(1) DEFAULT 1 NOT NULL,
       action_type          DEC(1) NOT NULL,
       action_time          DATE NOT NULL,
       sign_group           DEC(1) NOT NULL
);

COMMENT ON TABLE ibank.keys_history IS '������� �������� � ��������� ������� ��� ��������';

COMMENT ON COLUMN ibank.keys_history.id_key IS '���������� ������������� ��������� ����� ��� �������(�������� ��������� �� ���� ��������)';
COMMENT ON COLUMN ibank.keys_history.status_key IS '������� ������ ����� ��� �������:
0 - ������,
1 - ����������,
2 - ��������';
COMMENT ON COLUMN ibank.keys_history.action_type IS '�������� �������� ��� ������ ��� �������
0 - ��������,
1 - ����������,
2 - �������������,
3 - ����� ������ �������,
4 - �����������';
COMMENT ON COLUMN ibank.keys_history.action_time IS '���� � ����� �������� � �������� ������  ��� �������';
COMMENT ON COLUMN ibank.keys_history.sign_group IS '������ ������� ����������.
0 - ��� ����� �������
1 - 1-� �������
2 - 2-� �������
...';
------------------------------------------------------------------------
------------'�������� ����� ��� ��������������'-------------------------
DROP TABLE ibank.operator_keys ;

CREATE TABLE ibank.operator_keys (
       id_key               DEC(20) NOT NULL,
       operator_id          DEC(20) NOT NULL,
       publ_key             LONG VARCHAR NOT NULL,
       status_key           DEC(1) DEFAULT 1 NOT NULL,
       begin_date           DATE NOT NULL,
       end_date             DATE NOT NULL,
       creation_date        DATE NOT NULL,
       notes                VARCHAR(200) 
);
COMMENT ON TABLE ibank.operator_keys IS '�������� ����� ��� ��������������';

COMMENT ON COLUMN ibank.operator_keys.id_key IS '���������� ������������� ��������� ����� ��� �������������';
COMMENT ON COLUMN ibank.operator_keys.operator_id IS '������������� �������������';
COMMENT ON COLUMN ibank.operator_keys.publ_key IS '�������� ���� ��� �������������';
COMMENT ON COLUMN ibank.operator_keys.status_key IS '������� ������ ����� ��� �������������:
0 - ������,
1 - ����������,
2 - ��������';
COMMENT ON COLUMN ibank.operator_keys.begin_date IS '���� ������ �������� ����� ��� �������������';
COMMENT ON COLUMN ibank.operator_keys.end_date IS '���� ��������� �������� ����� ��� �������������';
COMMENT ON COLUMN ibank.operator_keys.creation_date IS '���� �������� ����� ��� �������������';
COMMENT ON COLUMN ibank.operator_keys.notes IS '���������� ��������������';

ALTER TABLE ibank.operator_keys
       ADD CONSTRAINT ibank.XPKoperator_keys PRIMARY KEY (id_key) ;
------------------------------------------------------------------------
------------'���������� �� ��������������'------------------------------
DROP TABLE ibank.operators ;

CREATE TABLE ibank.operators (
       operator_id          DEC(20) NOT NULL,
       operator_name        VARCHAR(160) NOT NULL,
       operator_position    VARCHAR(160) NOT NULL,
       reg_date             DATE NOT NULL,
       perms                DEC(5) DEFAULT 0 NOT NULL,
       status               DEC(1) DEFAULT 1 NOT NULL,
       note                 VARCHAR(200) 
);
COMMENT ON TABLE ibank.operators IS '���������� �� ��������������';

COMMENT ON COLUMN ibank.operators.operator_id IS '������������� �������������';
COMMENT ON COLUMN ibank.operators.operator_name IS '�.�.�. �������������';
COMMENT ON COLUMN ibank.operators.operator_position IS '��������� �������������';
COMMENT ON COLUMN ibank.operators.reg_date IS '���� ����������� �������������';
COMMENT ON COLUMN ibank.operators.perms IS '����� ������������� (13 ����������� ����):
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
COMMENT ON COLUMN ibank.operators.status IS '������ �������������
0 - ������
1 - ������������
2 - �������';
COMMENT ON COLUMN ibank.operators.note IS '����������';

ALTER TABLE ibank.operators
       ADD  CONSTRAINT ibank.XPKoperators PRIMARY KEY (operator_id) ;
------------------------------------------------------------------------
------------'��������� �� ������ �� �������'----------------------------
DROP TABLE ibank.refuse_accepts ;

CREATE TABLE ibank.refuse_accepts (
       doc_id               DEC(28) NOT NULL,
       client_id            DEC(20) NOT NULL,
       date_doc             DATE NOT NULL,
       DEC_doc              DEC(5) NOT NULL,
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
       DEC_request          DEC(5) NOT NULL,
       date_request         DATE NOT NULL,
       request_amount       DECIMAL(17,2) NOT NULL,
       request_inbank_date  DATE NOT NULL,
       refuse_details       VARCHAR(210) NOT NULL,
       status_doc           DEC(1) NOT NULL,
       signers              DEC(3) 
);
COMMENT ON TABLE ibank.refuse_accepts IS '��������� �� ������ �� �������';

COMMENT ON COLUMN ibank.refuse_accepts.doc_id IS '���������� � ������ ������� ������������� ���������';
COMMENT ON COLUMN ibank.refuse_accepts.client_id IS '���������� � ������ ������� ������������� �������, ���������� ��������, �� ������� clients';
COMMENT ON COLUMN ibank.refuse_accepts.date_doc IS '���� ���������';
COMMENT ON COLUMN ibank.refuse_accepts.DEC_doc IS '����� ���������';
COMMENT ON COLUMN ibank.refuse_accepts.payer_name IS '������������ �����������';
COMMENT ON COLUMN ibank.refuse_accepts.payer_account IS '���� �����������';
COMMENT ON COLUMN ibank.refuse_accepts.amount IS '����� ������� (� �������� ������ - ������)';
COMMENT ON COLUMN ibank.refuse_accepts.payer_bank_name IS '������������ ����� �����������';
COMMENT ON COLUMN ibank.refuse_accepts.payer_bank_bic IS '��� ����� �����������';
COMMENT ON COLUMN ibank.refuse_accepts.payer_bank_acc IS '������� ����� �����������';
COMMENT ON COLUMN ibank.refuse_accepts.rcpt_name IS '������������ ����������';
COMMENT ON COLUMN ibank.refuse_accepts.rcpt_account IS '���� ����������';
COMMENT ON COLUMN ibank.refuse_accepts.rcpt_bank_name IS '������������ ����� ����������';
COMMENT ON COLUMN ibank.refuse_accepts.rcpt_bank_bic IS '��� ����� ����������';
COMMENT ON COLUMN ibank.refuse_accepts.DEC_request IS '����� ��������� ����������';
COMMENT ON COLUMN ibank.refuse_accepts.date_request IS '���� ��������� ����������';
COMMENT ON COLUMN ibank.refuse_accepts.request_amount IS '����� ��������� ����������';
COMMENT ON COLUMN ibank.refuse_accepts.request_inbank_date IS '���� ����������� ���������� � ���� �����������';
COMMENT ON COLUMN ibank.refuse_accepts.refuse_details IS '�������� ���������, �����, ����� , ���� ��������';
COMMENT ON COLUMN ibank.refuse_accepts.status_doc IS '������� (���������) ��������� ���������. ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ibank.refuse_accepts.signers IS '������ ����������� ������. �������� ������� ������� ������� ��������� ������ ����������� ������: 1 - ������� ����� ������ ������������, 0 - �����������. 0-� ������ ������������� ����� ������ 1, 1-� ������ 2 � �.�.';

ALTER TABLE ibank.refuse_accepts
       ADD  CONSTRAINT ibank.XPKrefuse_accepts PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
------------'�����������'-----------------------------------------------
DROP TABLE ibank.accreditivs ;

CREATE TABLE ibank.accreditivs (
       doc_id               DEC(28) NOT NULL,
       client_id            DEC(20) NOT NULL,
       date_doc             DATE NOT NULL,
       DEC_doc              DEC(5) NOT NULL,
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
       status_doc           DEC(1) NOT NULL,
       signers              DEC(3) 
);
COMMENT ON TABLE ibank.accreditivs IS '�����������';

COMMENT ON COLUMN ibank.accreditivs.doc_id IS '���������� � ������ ������� ������������� ���������';
COMMENT ON COLUMN ibank.accreditivs.client_id IS '���������� � ������ ������� ������������� �������, ���������� ��������, �� ������� clients';
COMMENT ON COLUMN ibank.accreditivs.date_doc IS '���� �����������';
COMMENT ON COLUMN ibank.accreditivs.DEC_doc IS '����� �����������';
COMMENT ON COLUMN ibank.accreditivs.accreditiv_type IS '��� �����������, ����� ��������� ��������:
"������",
"����������",
"����������"
��� �����������';
COMMENT ON COLUMN ibank.accreditivs.payer_inn IS '��� �����������';
COMMENT ON COLUMN ibank.accreditivs.payer_name IS '������������ �����������';
COMMENT ON COLUMN ibank.accreditivs.payer_account IS '���� �����������';
COMMENT ON COLUMN ibank.accreditivs.amount IS '����� ������� (� �������� ������ - ������)';
COMMENT ON COLUMN ibank.accreditivs.payer_bank_name IS '������������ ����� �����������';
COMMENT ON COLUMN ibank.accreditivs.payer_bank_bic IS '��� ����� �����������';
COMMENT ON COLUMN ibank.accreditivs.payer_bank_acc IS '������� ����� �����������';
COMMENT ON COLUMN ibank.accreditivs.rcpt_inn IS '��� ����������';
COMMENT ON COLUMN ibank.accreditivs.rcpt_name IS '������������ ����������';
COMMENT ON COLUMN ibank.accreditivs.rcpt_account IS '���� ����������';
COMMENT ON COLUMN ibank.accreditivs.rcpt_bank_name IS '������������ ����� ����������';
COMMENT ON COLUMN ibank.accreditivs.rcpt_bank_bic IS '��� ����� ����������';
COMMENT ON COLUMN ibank.accreditivs.rcpt_bank_acc IS '������� ����� ����������';
COMMENT ON COLUMN ibank.accreditivs.account_40901 IS '����� ����������� ����� N 40901 "����������� � ������".';
COMMENT ON COLUMN ibank.accreditivs.type_oper IS '��� ��������, ��� ������������ "08"';
COMMENT ON COLUMN ibank.accreditivs.term IS '���� �������� �����������';
COMMENT ON COLUMN ibank.accreditivs.type_accreditiv1 IS '��� ����������� 1, ����� ��������� �������� "��������" ��� "�����������"';
COMMENT ON COLUMN ibank.accreditivs.type_accreditiv2 IS '��� ����������� 2, ����� ��������� �������� "��������" ��� "����������"';
COMMENT ON COLUMN ibank.accreditivs.condition_pay IS '������� ������, ����� ��������� �������� "� ��������" ��� "��� �������"';
COMMENT ON COLUMN ibank.accreditivs.accreditiv_details IS '����������� ������������ ������� (�����, �����), ����� � ���� ��������, ���� �������� ������� (���������� �����, �������� �����), ��������������� � ����� ����������';
COMMENT ON COLUMN ibank.accreditivs.accreditiv_docs IS '������������ ����������, ������ ������� ������������ ������� �� �����������';
COMMENT ON COLUMN ibank.accreditivs.add_condition IS '�������������� �������';
COMMENT ON COLUMN ibank.accreditivs.status_doc IS '������� (���������) ��������� ���������. ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ibank.accreditivs.signers IS '������ ����������� ������. �������� ������� ������� ������� ��������� ������ ����������� ������: 1 - ������� ����� ������ ������������, 0 - �����������. 0-� ������ ������������� ����� ������ 1, 1-� ������ 2 � �.�.';

ALTER TABLE ibank.accreditivs
       ADD  CONSTRAINT ibank.XPKaccreditivs PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
------------'��������� ����������'--------------------------------------
DROP TABLE ibank.payment_requests ;

CREATE TABLE ibank.payment_requests (
       doc_id               DEC(28) NOT NULL,
       client_id            DEC(20) NOT NULL,
       date_doc             DATE NOT NULL,
       DEC_doc              DEC(5) NOT NULL,
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
       term_accept          DEC(3) ,
       documents_date       DATE ,
       status_doc           DEC(1) NOT NULL,
       signers              DEC(3) 
);
COMMENT ON TABLE ibank.payment_requests IS '��������� ����������';

COMMENT ON COLUMN ibank.payment_requests.doc_id IS '���������� � ������ ������� ������������� ���������';
COMMENT ON COLUMN ibank.payment_requests.client_id IS '���������� � ������ ������� ������������� �������, ���������� ��������, �� ������� clients';
COMMENT ON COLUMN ibank.payment_requests.date_doc IS '���� ���������� ����������';
COMMENT ON COLUMN ibank.payment_requests.DEC_doc IS '����� ���������� ����������';
COMMENT ON COLUMN ibank.payment_requests.payment_type IS '��� �������, ����� ��������� ��������:
"������",
"����������",
"����������"
��� �����������';
COMMENT ON COLUMN ibank.payment_requests.payer_inn IS '��� �����������';
COMMENT ON COLUMN ibank.payment_requests.payer_name IS '������������ �����������';
COMMENT ON COLUMN ibank.payment_requests.payer_account IS '���� �����������';
COMMENT ON COLUMN ibank.payment_requests.amount IS '����� ������� (� �������� ������ - ������)';
COMMENT ON COLUMN ibank.payment_requests.payer_bank_name IS '������������ ����� �����������';
COMMENT ON COLUMN ibank.payment_requests.payer_bank_bic IS '��� ����� �����������';
COMMENT ON COLUMN ibank.payment_requests.payer_bank_acc IS '������� ����� �����������';
COMMENT ON COLUMN ibank.payment_requests.rcpt_inn IS '��� ����������';
COMMENT ON COLUMN ibank.payment_requests.rcpt_name IS '������������ ����������';
COMMENT ON COLUMN ibank.payment_requests.rcpt_account IS '���� ����������';
COMMENT ON COLUMN ibank.payment_requests.rcpt_bank_name IS '������������ ����� ����������';
COMMENT ON COLUMN ibank.payment_requests.rcpt_bank_bic IS '��� ����� ����������';
COMMENT ON COLUMN ibank.payment_requests.rcpt_bank_acc IS '������� ����� ����������';
COMMENT ON COLUMN ibank.payment_requests.type_oper IS '��� ��������, ��� ��������� ���������� "02"';
COMMENT ON COLUMN ibank.payment_requests.queue IS '��� ����������� �������. ����� ��������� �������� "01", "02", "03", "04", "05" ��� "06", ��� �������������';
COMMENT ON COLUMN ibank.payment_requests.payment_details IS '���������� �������';
COMMENT ON COLUMN ibank.payment_requests.condition_pay_type IS '��� ������� ������. ����� ��������� ��������:
"� ��������",
"��� �������"';
COMMENT ON COLUMN ibank.payment_requests.condition_pay IS '��� �������� ������� ��� ������� ������ �� �����, ���� �������� � ������ ������ ��� �����, ���� � ����� ��������, ������������������ ����� ������������� ��������';
COMMENT ON COLUMN ibank.payment_requests.term_accept IS '���� ��� ������� ���������� � ����';
COMMENT ON COLUMN ibank.payment_requests.documents_date IS '���� ������� (��������) ����������� ��������������� ��������� ����������, ���� ������� ���������';
COMMENT ON COLUMN ibank.payment_requests.status_doc IS '������� (���������) ��������� ���������. ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ibank.payment_requests.signers IS '������ ����������� ������. �������� ������� ������� ������� ��������� ������ ����������� ������: 1 - ������� ����� ������ ������������, 0 - �����������. 0-� ������ ������������� ����� ������ 1, 1-� ������ 2 � �.�.';

ALTER TABLE ibank.payment_requests
       ADD   CONSTRAINT ibank.XPKpayment_request PRIMARY KEY (doc_id)  ;
------------------------------------------------------------------------
------------'���������� ���������'--------------------------------------
DROP TABLE ibank.encashed_contracts ;

CREATE TABLE ibank.encashed_contracts (
       doc_id               DEC(28) NOT NULL,
       client_id            DEC(20) NOT NULL,
       date_doc             DATE NOT NULL,
       DEC_doc              DEC(5) NOT NULL,
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
       status_doc           DEC(1) NOT NULL,
       signers              DEC(3) 
);
COMMENT ON TABLE ibank.encashed_contracts IS '���������� ���������';
COMMENT ON COLUMN ibank.encashed_contracts.doc_id IS '���������� � ������ ������� ������������� ���������';
COMMENT ON COLUMN ibank.encashed_contracts.client_id IS '���������� � ������ ������� ������������� �������, ���������� ��������, �� ������� clients';
COMMENT ON COLUMN ibank.encashed_contracts.date_doc IS '���� ����������� ���������';
COMMENT ON COLUMN ibank.encashed_contracts.DEC_doc IS '����� ����������� ���������';
COMMENT ON COLUMN ibank.encashed_contracts.payment_type IS '��� �������, ����� ��������� ��������:
"������",
"����������",
"����������"
 ��� �����������';
COMMENT ON COLUMN ibank.encashed_contracts.payer_inn IS '��� �����������';
COMMENT ON COLUMN ibank.encashed_contracts.payer_name IS '������������ �����������';
COMMENT ON COLUMN ibank.encashed_contracts.payer_account IS '���� �����������';
COMMENT ON COLUMN ibank.encashed_contracts.amount IS '����� ������� (� �������� ������ - ������)';
COMMENT ON COLUMN ibank.encashed_contracts.payer_bank_name IS '������������ ����� �����������';
COMMENT ON COLUMN ibank.encashed_contracts.payer_bank_bic IS '��� ����� �����������';
COMMENT ON COLUMN ibank.encashed_contracts.payer_bank_acc IS '������� ����� �����������';
COMMENT ON COLUMN ibank.encashed_contracts.rcpt_inn IS '��� ����������';
COMMENT ON COLUMN ibank.encashed_contracts.rcpt_name IS '������������ ����������';
COMMENT ON COLUMN ibank.encashed_contracts.rcpt_account IS '���� ����������';
COMMENT ON COLUMN ibank.encashed_contracts.rcpt_bank_name IS '������������ ����� ����������';
COMMENT ON COLUMN ibank.encashed_contracts.rcpt_bank_bic IS '��� ����� ����������';
COMMENT ON COLUMN ibank.encashed_contracts.rcpt_bank_acc IS '������� ����� ����������';
COMMENT ON COLUMN ibank.encashed_contracts.type_oper IS '��� ��������, ��� ���������� ��������� "06"';
COMMENT ON COLUMN ibank.encashed_contracts.queue IS '��� ����������� �������. ����� ��������� �������� "01", "02", "03", "04", "05" ��� "06", ��� �������������';
COMMENT ON COLUMN ibank.encashed_contracts.contract_details IS '���������� �������';
COMMENT ON COLUMN ibank.encashed_contracts.status_doc IS '������� (���������) ��������� ���������. ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ibank.encashed_contracts.signers IS '������ ����������� ������. �������� ������� ������� ������� ��������� ������ ����������� ������: 1 - ������� ����� ������ ������������, 0 - �����������. 0-� ������ ������������� ����� ������ 1, 1-� ������ 2 � �.�.';

ALTER TABLE ibank.encashed_contracts
       ADD  CONSTRAINT ibank.XPKencashed_contr PRIMARY KEY (doc_id)  ;
------------------------------------------------------------------------
------------'������� ����������'----------------------------------------
DROP TABLE ibank.resources ;

CREATE TABLE ibank.resources (
       app_name             VARCHAR(30) NOT NULL,
       resource_name        VARCHAR(128) NOT NULL,
       version              VARCHAR(20) NOT NULL,
       locale               VARCHAR(30) ,
       valid_from           DATE ,
       valid_to             DATE ,
       type                 VARCHAR(30) NOT NULL,
       content              LONG VARCHAR NOT NULL
);
COMMENT ON TABLE ibank.resources IS '������� ����������';

COMMENT ON COLUMN ibank.resources.app_name IS '������������ ����������';
COMMENT ON COLUMN ibank.resources.resource_name IS '������������ �������';
COMMENT ON COLUMN ibank.resources.version IS '������ �������. ���������, ��� ���������� ��������, ��������, �������� ������ ���� �� ���������, ����� � ��� �� �����.';
COMMENT ON COLUMN ibank.resources.locale IS '������ �������. �������������� �������.';
COMMENT ON COLUMN ibank.resources.valid_from IS '���� ������ �������� �������. �������������� �������, ������� ����� ���� �������� ��� �������� ���� ����������� ���������, �������� �����.';
COMMENT ON COLUMN ibank.resources.valid_to IS '���� ��������� �������� �������. �������������� �������, ������� ����� ���� �������� ��� �������� ���� ����������� ���������, �������� �����.';
COMMENT ON COLUMN ibank.resources.type IS '��� �������';
COMMENT ON COLUMN ibank.resources.content IS '���������� �������';

ALTER TABLE ibank.resources
       ADD   CONSTRAINT ibank.XPKresources PRIMARY KEY (app_name, resource_name, version) ;
------------------------------------------------------------------------
------------'������� ���������� �������������.'-------------------------


DROP TABLE ibank.profiles ;

CREATE TABLE ibank.profiles (
       app_name             VARCHAR(30) NOT NULL,
       profile_name         VARCHAR(30) NOT NULL,
       id_key               DEC(20) NOT NULL,
       content              LONG VARCHAR NOT NULL,
       store_date           DATE NOT NULL 
);
COMMENT ON TABLE ibank.profiles IS '������� ���������� �������������.';
COMMENT ON COLUMN ibank.profiles.app_name IS '������������ ����������.';
COMMENT ON COLUMN ibank.profiles.profile_name IS '������������ �������.';
COMMENT ON COLUMN ibank.profiles.id_key IS '���������� ������������� ��������� ����� ��� �������(�������� ��������� �� ���� ��������)';
COMMENT ON COLUMN ibank.profiles.content IS '���������� �������.';
COMMENT ON COLUMN ibank.profiles.store_date IS '���� ����������';

ALTER TABLE ibank.profiles
       ADD  CONSTRAINT ibank.XPKprofiles PRIMARY KEY (app_name, profile_name, id_key) ;
------------------------------------------------------------------------
------------'WAP-�������'--------------------------------------
DROP TABLE ibank.mobile_clients ;

CREATE TABLE ibank.mobile_clients (
       login                VARCHAR(60) NOT NULL,
       client_id            DEC(20) NOT NULL,
       password             VARCHAR(60) NOT NULL,
       begin_date           DATE ,
       end_date             DATE ,
       state                DEC(1) NOT NULL
);
COMMENT ON TABLE ibank.mobile_clients IS 'WAP-�������';
COMMENT ON COLUMN ibank.mobile_clients.login IS '����� WAP-�������';
COMMENT ON COLUMN ibank.mobile_clients.client_id IS '������������� �������';
COMMENT ON COLUMN ibank.mobile_clients.password IS '������ WAP-�������';
COMMENT ON COLUMN ibank.mobile_clients.begin_date IS '���� ������ �������� ������';
COMMENT ON COLUMN ibank.mobile_clients.end_date IS '���� ����� �������� ������';
COMMENT ON COLUMN ibank.mobile_clients.state IS '��������� ��������';

ALTER TABLE ibank.mobile_clients
       ADD CONSTRAINT ibank.XPKmobile_clients PRIMARY KEY (login) ;
------------------------------------------------------------------------
------------'���������� �����������'--------------------------------------
DROP TABLE ibank.recipients ;

CREATE TABLE ibank.recipients (
       id                   DEC(20) NOT NULL,
       client_id            DEC(20) NOT NULL,
       inn                  VARCHAR(12) ,
       name                 VARCHAR(160) NOT NULL,
       bic                  CHAR(9) ,
       bill                 VARCHAR(20) ,
       comments             VARCHAR(210) 
);
COMMENT ON TABLE ibank.recipients IS '���������� �����������';

COMMENT ON COLUMN ibank.recipients.id IS '���������� ������������� ����������';
COMMENT ON COLUMN ibank.recipients.client_id IS '������������� �������';
COMMENT ON COLUMN ibank.recipients.inn IS '��� ����������';
COMMENT ON COLUMN ibank.recipients.name IS '������������ ����������';
COMMENT ON COLUMN ibank.recipients.bic IS '��� ����� ����������';
COMMENT ON COLUMN ibank.recipients.bill IS '���� ����������';
COMMENT ON COLUMN ibank.recipients.comments IS '����� ���������� �������';

ALTER TABLE ibank.recipients
       ADD  CONSTRAINT ibank.XPKrecipients PRIMARY KEY (id) ;
------------------------------------------------------------------------
------------'����� ����� ��������� ��������'---------------------------
DROP TABLE ibank.new_accounts ;

CREATE TABLE ibank.new_accounts (
       branch_id            VARCHAR(20) NOT NULL,
       account              CHAR(20) NOT NULL,
       id_key               DEC(20) NOT NULL,
       create_date          DATE NOT NULL
);
COMMENT ON TABLE ibank.new_accounts IS '����� ����� ��������� ��������';

COMMENT ON COLUMN ibank.new_accounts.branch_id IS '������������� ����� � ������ �������';
COMMENT ON COLUMN ibank.new_accounts.account IS '���� �������';
COMMENT ON COLUMN ibank.new_accounts.id_key IS '���������� ������������� ��������� �����';
COMMENT ON COLUMN ibank.new_accounts.create_date IS '���� ��������� ����� �������';
------------------------------------------------------------------------
------------'����� ������� ������� iBank'--------------------------------------
DROP TABLE ibank.new_clients ;

CREATE TABLE ibank.new_clients (
       id_key               DEC(20) NOT NULL,
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
       cln_type             DEC(1) NOT NULL,
       kpp                  VARCHAR(9) ,
       sign_count           DEC(1) NOT NULL
);
COMMENT ON TABLE ibank.new_clients IS '����� ������� ������� iBank';
COMMENT ON COLUMN ibank.new_clients.id_key IS '���������� ������������� ��������� �����';
COMMENT ON COLUMN ibank.new_clients.date_input IS '���� � ����� ��������������� �����������';
COMMENT ON COLUMN ibank.new_clients.name_cln IS '������������ �������';
COMMENT ON COLUMN ibank.new_clients.inn_cln IS '��� �������';
COMMENT ON COLUMN ibank.new_clients.fio_cln IS '�.�.�. �������������� ���� � �������';
COMMENT ON COLUMN ibank.new_clients.phone_cln IS '������� �������';
COMMENT ON COLUMN ibank.new_clients.fax_cln IS '���� �������';
COMMENT ON COLUMN ibank.new_clients.email_cln IS 'E-mail �������';
COMMENT ON COLUMN ibank.new_clients.addr_cln IS '����� �������';
COMMENT ON COLUMN ibank.new_clients.okpo IS '���� �������';
COMMENT ON COLUMN ibank.new_clients.lock_word IS '������������� ����� ��� ������������ ������� �� ��������';
COMMENT ON COLUMN ibank.new_clients.ordering_customer IS '������������ ������� �� ���������� �����';
COMMENT ON COLUMN ibank.new_clients.cln_type IS '��� �������
0 - ���������� ���� 
1 - ����������� ����';
COMMENT ON COLUMN ibank.new_clients.kpp IS '��� (��� ���������� �� ����)';
COMMENT ON COLUMN ibank.new_clients.sign_count IS '����� �������� ��� �����������';
------------------------------------------------------------------------
------------'����� ����� ��������'--------------------------------------
DROP TABLE ibank.new_keys ;

CREATE TABLE ibank.new_keys (
       id_key               DEC(20) NOT NULL,
       publ_key             LONG VARCHAR NOT NULL,
       creation_date        DATE NOT NULL,
       algorithm            VARCHAR(20) NOT NULL,
       provider             VARCHAR(20) ,
       keyspec              VARCHAR(200) NOT NULL
);
COMMENT ON TABLE ibank.new_keys IS '����� ����� ��������';
COMMENT ON COLUMN ibank.new_keys.id_key IS '���������� ������������� ��������� �����';
COMMENT ON COLUMN ibank.new_keys.publ_key IS '�������� ���� ��� �������';
COMMENT ON COLUMN ibank.new_keys.creation_date IS '���� � ����� ��������������� �����������';
COMMENT ON COLUMN ibank.new_keys.algorithm IS '������������ ��������� ��������� �����';
COMMENT ON COLUMN ibank.new_keys.provider IS '������������ ���������� ���������';
COMMENT ON COLUMN ibank.new_keys.keyspec IS '������������ �����';

ALTER TABLE ibank.new_keys
       ADD  CONSTRAINT ibank.XPKnew_keys PRIMARY KEY (id_key) ;
------------------------------------------------------------------------
------------'���������� ������'-----------------------------------------
DROP TABLE ibank.banks ;

CREATE TABLE ibank.banks (
       bik                  CHAR(9) NOT NULL,
       bill_corr            CHAR(20) ,
       bank_name            VARCHAR(80) NOT NULL,
       city                 VARCHAR(40) ,
       delivery             VARCHAR(10) 
);
COMMENT ON TABLE ibank.banks IS '���������� ������';

COMMENT ON COLUMN ibank.banks.bik IS '��� �����';
COMMENT ON COLUMN ibank.banks.bill_corr IS '������� �����';
COMMENT ON COLUMN ibank.banks.bank_name IS '������������ �����';
COMMENT ON COLUMN ibank.banks.city IS '��������������� �����';
COMMENT ON COLUMN ibank.banks.delivery IS '��� ������� (�����, ��������, �����������)';

ALTER TABLE ibank.banks
       ADD  CONSTRAINT ibank.XPKbanks PRIMARY KEY (bik) ;
------------------------------------------------------------------------
------------'������'----------------------------------------------------
DROP TABLE ibank.letters ;

CREATE TABLE ibank.letters (
       doc_id               DEC(28) NOT NULL,
       client_id            DEC(20) NOT NULL,
       date_doc             DATE NOT NULL,
       subj_letter          VARCHAR(255) NOT NULL,
       letter_body          LONG VARCHAR ,
       status_doc           DEC(1) NOT NULL,
       signers              DEC(3) 
);
COMMENT ON TABLE ibank.letters IS '������';
COMMENT ON COLUMN ibank.letters.doc_id IS '���������� � ������ ������� ������������� ���������';
COMMENT ON COLUMN ibank.letters.client_id IS '���������� � ������ ������� ������������� �������, ���������� ��������, �� ������� clients';
COMMENT ON COLUMN ibank.letters.date_doc IS '���� ������';
COMMENT ON COLUMN ibank.letters.subj_letter IS '���� ������';
COMMENT ON COLUMN ibank.letters.letter_body IS '���������� ������';
COMMENT ON COLUMN ibank.letters.status_doc IS '������� (���������) ��������� ���������. ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ibank.letters.signers IS '������ ����������� ������. �������� ������� ������� ������� ��������� ������ ����������� ������: 1 - ������� ����� ������ ������������, 0 - �����������. 0-� ������ ������������� ����� ������ 1, 1-� ������ 2 � �.�.';

ALTER TABLE ibank.letters
       ADD  CONSTRAINT ibank.XPKletters PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
------------'��������� ���������'--------------------------------------
DROP TABLE ibank.payments;

CREATE TABLE ibank.payments (
       doc_id               DEC(28) NOT NULL,
       client_id            DEC(20) NOT NULL,
       date_doc             DATE NOT NULL,
       DEC_doc              DEC(5) NOT NULL,
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
       status_doc           DEC(1) NOT NULL,
       signers              DEC(3) 
);
COMMENT ON TABLE ibank.payments IS '��������� ���������';

COMMENT ON COLUMN ibank.payments.doc_id IS '���������� � ������ ������� ������������� ���������';
COMMENT ON COLUMN ibank.payments.client_id IS '���������� � ������ ������� ������������� �������, ���������� ��������, �� ������� clients';
COMMENT ON COLUMN ibank.payments.date_doc IS '���� ���������� ���������';
COMMENT ON COLUMN ibank.payments.DEC_doc IS '����� ���������� ���������';
COMMENT ON COLUMN ibank.payments.payment_type IS '��� �������, ����� ��������� ��������:
"������",
"����������",
"����������"
��� �����������';
COMMENT ON COLUMN ibank.payments.payer_inn IS '��� �����������';
COMMENT ON COLUMN ibank.payments.payer_name IS '������������ �����������';
COMMENT ON COLUMN ibank.payments.payer_account IS '���� �����������';
COMMENT ON COLUMN ibank.payments.amount IS '����� ������� (� �������� ������ - ������)';
COMMENT ON COLUMN ibank.payments.payer_bank_name IS '������������ ����� �����������';
COMMENT ON COLUMN ibank.payments.payer_bank_bic IS '��� ����� �����������';
COMMENT ON COLUMN ibank.payments.payer_bank_acc IS '������� ����� �����������';
COMMENT ON COLUMN ibank.payments.rcpt_inn IS '��� ����������';
COMMENT ON COLUMN ibank.payments.rcpt_name IS '������������ ����������';
COMMENT ON COLUMN ibank.payments.rcpt_account IS '���� ����������';
COMMENT ON COLUMN ibank.payments.rcpt_bank_name IS '������������ ����� ����������';
COMMENT ON COLUMN ibank.payments.rcpt_bank_bic IS '��� ����� ����������';
COMMENT ON COLUMN ibank.payments.rcpt_bank_acc IS '������� ����� ����������';
COMMENT ON COLUMN ibank.payments.type_oper IS '��� ��������, ��� ��������� ��������� "01"';
COMMENT ON COLUMN ibank.payments.queue IS '��� ����������� �������. ����� ��������� �������� "01", "02", "03", "04", "05" ��� "06", ��� �������������';
COMMENT ON COLUMN ibank.payments.term IS '���� �������';
COMMENT ON COLUMN ibank.payments.payment_details IS '���������� �������';
COMMENT ON COLUMN ibank.payments.kpp IS '��� �����������';
COMMENT ON COLUMN ibank.payments.status_doc IS '������� (���������) ��������� ���������. ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ibank.payments.signers IS '������ ����������� ������. �������� ������� ������� ������� ��������� ������ ����������� ������: 1 - ������� ����� ������ ������������, 0 - �����������. 0-� ������ ������������� ����� ������ 1, 1-� ������ 2 � �.�.';

ALTER TABLE ibank.payments
       ADD   CONSTRAINT ibank.XPKpayments PRIMARY KEY (doc_id)  ;
------------------------------------------------------------------------
------------'�������� ����� ��� ��������'--------------------------------------
DROP TABLE ibank.keys ;

CREATE TABLE ibank.keys (
       id_key               DEC(20) NOT NULL,
       client_id            DEC(20) NOT NULL,
       publ_key             LONG VARCHAR NOT NULL,
       status_key           DEC(1) DEFAULT 1 NOT NULL,
       begin_date           DATE NOT NULL,
       end_date             DATE NOT NULL,
       sign_group           DEC(1) NOT NULL,
       creation_date        DATE NOT NULL,
       notes                VARCHAR(200) 
);
COMMENT ON TABLE ibank.keys IS '�������� ����� ��� ��������';

COMMENT ON COLUMN ibank.keys.id_key IS '���������� ������������� ��������� ����� ��� �������(�������� ��������� �� ���� ��������)';
COMMENT ON COLUMN ibank.keys.client_id IS '������������� �������';
COMMENT ON COLUMN ibank.keys.publ_key IS '�������� ���� ��� �������';
COMMENT ON COLUMN ibank.keys.status_key IS '������� ������ ����� ��� �������:
0 - ������,
1 - ����������,
2 - ��������';
COMMENT ON COLUMN ibank.keys.begin_date IS '���� ������ �������� ����� ��� �������';
COMMENT ON COLUMN ibank.keys.end_date IS '���� ��������� �������� ����� ��� �������';
COMMENT ON COLUMN ibank.keys.sign_group IS '������ ������� ����������.
0 - ��� ����� �������
1 - 1-� �������
2 - 2-� �������';
COMMENT ON COLUMN ibank.keys.creation_date IS '���� �������� ����� ��� �������';
COMMENT ON COLUMN ibank.keys.notes IS '���������� ��������������';

ALTER TABLE ibank.keys
       ADD  CONSTRAINT ibank.XPKkeys PRIMARY KEY (id_key) ;
------------------------------------------------------------------------
------------'����� �������� �������'--------------------------------------
DROP TABLE ibank.accounts ;

CREATE TABLE ibank.accounts (
       branch_id            VARCHAR(20) NOT NULL,
       account              CHAR(20) NOT NULL,
       client_id            DEC(20) NOT NULL,
       type_account         DEC(1) NOT NULL,
       create_date          DATE NOT NULL,
       create_amount        DEC(28,10) NOT NULL,
       currency             VARCHAR(3) NOT NULL
);
COMMENT ON TABLE ibank.accounts IS '����� �������� �������';

COMMENT ON COLUMN ibank.accounts.branch_id IS '���������� ������������� ����� ��� �������, ������������������ � �������';
COMMENT ON COLUMN ibank.accounts.account IS '���� �������';
COMMENT ON COLUMN ibank.accounts.client_id IS '���������� � ������ ������� ������������� �������, �� ������� ��������������� ���� �� ������� clients';
COMMENT ON COLUMN ibank.accounts.type_account IS '��� �����. ����� ��������� ��������:
0 - ���������,
1 - �������,
2 - ����������,
3 - ��������������';
COMMENT ON COLUMN ibank.accounts.create_date IS '���� ��������� �����';
COMMENT ON COLUMN ibank.accounts.create_amount IS '����� �� ������ ��������� ����� (� �������� ������)';
COMMENT ON COLUMN ibank.accounts.currency IS '��������� ��� (USD, DEM � �.�.) ������ �����';

ALTER TABLE ibank.accounts
       ADD   CONSTRAINT ibank.XPKaccounts PRIMARY KEY (branch_id, account)  ;
------------------------------------------------------------------------
------------'����������� ����� �������� �������'------------------------
DROP TABLE ibank.spec_accounts ;

CREATE TABLE ibank.spec_accounts (
       branch_id            VARCHAR(20) NOT NULL,
       account              CHAR(20) NOT NULL,
       client_id            DEC(20) NOT NULL,
       type_account         DEC(1) NOT NULL,
       currency             VARCHAR(3) NOT NULL
);
COMMENT ON TABLE ibank.spec_accounts IS '����������� ����� �������� �������';
COMMENT ON COLUMN ibank.spec_accounts.branch_id IS '���������� ������������� ����� ��� �������, ������������������ � �������';
COMMENT ON COLUMN ibank.spec_accounts.account IS '���� �������';
COMMENT ON COLUMN ibank.spec_accounts.client_id IS '���������� � ������ ������� ������������� �������, �� ������� ��������������� ���� �� ������� clients';
COMMENT ON COLUMN ibank.spec_accounts.type_account IS '��� �����. ����� ��������� ��������:
5 - ��� ������������ �������';
COMMENT ON COLUMN ibank.spec_accounts.currency IS '��������� ��� (USD, DEM � �.�.) ������ �����';
------------------------------------------------------------------------
------------'��������� �� ������� ����������� ������'-------------------
DROP TABLE ibank.currency_sale ;

CREATE TABLE ibank.currency_sale (
       doc_id               DEC(28) NOT NULL,
       client_id            DEC(20) NOT NULL,
       date_doc             DATE NOT NULL,
       DEC_doc              DEC(5) NOT NULL,
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
       status_doc           DEC(1) NOT NULL,
       signers              DEC(3) 
);
COMMENT ON TABLE ibank.currency_sale IS '��������� �� ������� ����������� ������';
COMMENT ON COLUMN ibank.currency_sale.doc_id IS '���������� � ������ ������� ������������� ���������';
COMMENT ON COLUMN ibank.currency_sale.client_id IS '���������� � ������ ������� ������������� �������, ���������� ��������, �� ������� clients';
COMMENT ON COLUMN ibank.currency_sale.date_doc IS '���� ���������';
COMMENT ON COLUMN ibank.currency_sale.DEC_doc IS '����� ���������';
COMMENT ON COLUMN ibank.currency_sale.cln_bnk_name IS '������������ ����� �������';
COMMENT ON COLUMN ibank.currency_sale.cln_name IS '������������ �������';
COMMENT ON COLUMN ibank.currency_sale.cln_inn IS '��� �������';
COMMENT ON COLUMN ibank.currency_sale.cln_okpo IS '���� �������';
COMMENT ON COLUMN ibank.currency_sale.cln_addr IS '����� �������';
COMMENT ON COLUMN ibank.currency_sale.cln_employee_fio IS '�.�.�. �������������� ���������� �������';
COMMENT ON COLUMN ibank.currency_sale.cln_employee_phones IS '���������� �������� �������������� ���������� �������';
COMMENT ON COLUMN ibank.currency_sale.sale_sum IS '����� ����������� ������';
COMMENT ON COLUMN ibank.currency_sale.sale_currency IS '��������� ��� (USD, DEM � �.�.) ����������� ������';
COMMENT ON COLUMN ibank.currency_sale.sale_account IS '���� ��� �������� ����������� ������';
COMMENT ON COLUMN ibank.currency_sale.sale_rate_kind IS '������� ������ ����� ������� ������. ����� ��������� ��������:
"�� ����� �����", 
"�� ����� �����",
"�� ����� �� ���� ���"';
COMMENT ON COLUMN ibank.currency_sale.sale_rate IS '���� ������� ������. ����������� � ����������� �� �������� ���� �������� ������ ����� ������� - SALE_RATE_KIND';
COMMENT ON COLUMN ibank.currency_sale.received_sum IS '����������� ����� ������, ���������� �� ������� ������';
COMMENT ON COLUMN ibank.currency_sale.received_account IS '���� ��� ���������� ������, ���������� �� ������� ������. ���� ���� ����� ���������� � ������ �����';
COMMENT ON COLUMN ibank.currency_sale.received_bnk_bic IS '��� �����, � ������� ������ ���� ��� ���������� ������.';
COMMENT ON COLUMN ibank.currency_sale.received_bnk_account IS '������� �����, � ������� ������ ���� ��� ���������� ������.';
COMMENT ON COLUMN ibank.currency_sale.received_bnk_name IS '������������ �����, � ������� ������ ���� ��� ����������';
COMMENT ON COLUMN ibank.currency_sale.commission_account IS '���� �������, � �������� ����������� ������������ �������. ���� ���� ��������� � �����, � ������� ������ ���� ��� �������� ������';
COMMENT ON COLUMN ibank.currency_sale.commission_kind IS '��� ��������. ����� ��������� ��������:
"�������� �� ���������", 
"� ������������ � �������� �����",
"�� ����� "';
COMMENT ON COLUMN ibank.currency_sale.commission_sum IS '����� ��������. ����������� � ����������� �� �������� ���� ���� �������� - COMMISSION_KIND';
COMMENT ON COLUMN ibank.currency_sale.commission_currency IS '��������� ��� ������ (USD, DEM � ��.) ����� ��������';
COMMENT ON COLUMN ibank.currency_sale.experience_date IS '���� �������� ��������� - ���� ������������, �� ������� ������������� ��������� �� ������� ������';
COMMENT ON COLUMN ibank.currency_sale.added_cond IS '�������������� ������� �� ������� ������.';
COMMENT ON COLUMN ibank.currency_sale.status_doc IS '������� (���������) ��������� ���������. ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ibank.currency_sale.signers IS '������ ����������� ������. �������� ������� ������� ������� ��������� ������ ����������� ������: 1 - ������� ����� ������ ������������, 0 - �����������. 0-� ������ ������������� ����� ������ 1, 1-� ������ 2 � �.�.';

ALTER TABLE ibank.currency_sale
       ADD  CONSTRAINT ibank.XPKcurrency_sale PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
------------'��������� �� ������� ����������� ������'--------------------------------------
DROP TABLE ibank.currency_purchase ;

CREATE TABLE ibank.currency_purchase (
       doc_id               DEC(28) NOT NULL,
       client_id            DEC(20) NOT NULL,
       date_doc             DATE NOT NULL,
       DEC_doc              DEC(5) NOT NULL,
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
       merge_doc_DEC        DEC(5) ,
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
       depo_contract_DEC    VARCHAR(10) ,
       depo_contract_date   DATE ,  
       depo_sum             DECIMAL(28,10) ,
       depo_kind            VARCHAR(40) ,
       depo_from_account    VARCHAR(20) ,
       depo_to_account      VARCHAR(20) ,
       status_doc           DEC(1) NOT NULL,
       signers              DEC(3) 
);
COMMENT ON TABLE ibank.currency_purchase IS '��������� �� ������� ����������� ������';

COMMENT ON COLUMN ibank.currency_purchase.doc_id IS '���������� � ������ ������� ������������� ���������';
COMMENT ON COLUMN ibank.currency_purchase.client_id IS '���������� � ������ ������� ������������� �������, ���������� ��������, �� ������� clients';
COMMENT ON COLUMN ibank.currency_purchase.date_doc IS '���� ���������';
COMMENT ON COLUMN ibank.currency_purchase.DEC_doc IS '����� ���������';
COMMENT ON COLUMN ibank.currency_purchase.cln_bnk_name IS '������������ ����� �������';
COMMENT ON COLUMN ibank.currency_purchase.cln_name IS '������������ �������';
COMMENT ON COLUMN ibank.currency_purchase.cln_inn IS '��� �������';
COMMENT ON COLUMN ibank.currency_purchase.cln_okpo IS '���� �������';
COMMENT ON COLUMN ibank.currency_purchase.cln_addr IS '����� �������';
COMMENT ON COLUMN ibank.currency_purchase.cln_employee_fio IS '�.�.�. �������������� ���������� �������';
COMMENT ON COLUMN ibank.currency_purchase.cln_employee_phones IS '���������� �������� �������������� ���������� �������';
COMMENT ON COLUMN ibank.currency_purchase.sale_sum IS '����� ������ ��� ������� ������';
COMMENT ON COLUMN ibank.currency_purchase.sale_kind IS '������� ��������-�������� �������� ������� ��� ������� ������. ����� ��� ��������: 
"WRITING"  - �������� �������� ����� � ��������� ����� ������� ���
"TRANSFER"' ;
--"TRANSFER"- ������ �������������� ������� �������� �������� �� ������� ������ �� �������� ���� � ������������ ����������� ���������� ���������';
COMMENT ON COLUMN ibank.currency_purchase.sale_account IS '�������� ����, � �������� ���������� �������� �������� ����� ��� ������� ������';
COMMENT ON COLUMN ibank.currency_purchase.merge_doc_DEC IS '����� ���������� ���������, ������� ���� ����������� �������� �������� ��� ������� ������.';
COMMENT ON COLUMN ibank.currency_purchase.merge_doc_date IS '���� ���������� ���������, ������� ���� ����������� �������� �������� ��� ������� ������.';
COMMENT ON COLUMN ibank.currency_purchase.purchase_rate_kind IS '������� ������ ����� ������� ������. ����� ��������� ��������: 
"�� ����� �����", 
"�� ����� �����",
"�� ����� �� ���� ���"';
COMMENT ON COLUMN ibank.currency_purchase.purchase_rate IS '���� ������� ������. ����������� � ����������� �� �������� ������ ����� - PURCHASE_RATE_KIND';
COMMENT ON COLUMN ibank.currency_purchase.purchase_sum IS '����� ���������� ������, ����������� �� �������������� �������� ���� (��� ����������) ��� ������� �������� ���� (��� ������������) ��������� ������';
COMMENT ON COLUMN ibank.currency_purchase.purchase_currency IS '��������� ��� (USD, DEM � �.�.) ���������� ������';
COMMENT ON COLUMN ibank.currency_purchase.purchase_account IS '���� ��� ���������� ���������� ������ (�������������� ��� ���������� � ������� ��� ������������)';
COMMENT ON COLUMN ibank.currency_purchase.commission_account IS '���� �������, � �������� ����������� ������� � ������� ����� �� ������� ������. ���� ���� ��������� � ����� �������.';
COMMENT ON COLUMN ibank.currency_purchase.commission_kind IS '��� ��������. ����� ��������� ��������:
"�������� �� ���������", 
"� ������������ � �������� �����",
"�� �����"';
COMMENT ON COLUMN ibank.currency_purchase.commission_sum IS '����� ��������. ����������� � ����������� �� �������� ���� ���� �������� - COMMISSION_KIND';
COMMENT ON COLUMN ibank.currency_purchase.commission_currency IS '��������� ��� ������ (USD, DEM � ��.) ����� ��������';
COMMENT ON COLUMN ibank.currency_purchase.experience_date IS '���� �������� ��������� - ���� ������������, �� ������� ������������� ��������� �� ������� ������';
COMMENT ON COLUMN ibank.currency_purchase.added_cond IS '�������������� ������� �� ������� ������';
COMMENT ON COLUMN ibank.currency_purchase.purchase_basis_code IS '��� ��������� ������� ������';
COMMENT ON COLUMN ibank.currency_purchase.purchase_basis IS '��� ��������� ������� ������ - ��������� ����������';
COMMENT ON COLUMN ibank.currency_purchase.contract IS '��� ���������� � ��������, ���������, ����������, � ������������ � ������� ���������� ������� ������. ��� �������, ����������� �����, ���� � ����� ����� ��������';
COMMENT ON COLUMN ibank.currency_purchase.reg_form IS '������� ����� ���������. ����������� ����� � ���� ������� ����� ���������';
COMMENT ON COLUMN ibank.currency_purchase.bargain_passport IS '������� ������';
COMMENT ON COLUMN ibank.currency_purchase.gtd IS '������ ���';
COMMENT ON COLUMN ibank.currency_purchase.cxr_added_info IS '�������������� ���������� ��� ��������� ��������, �� �������� � ������������ ����';
COMMENT ON COLUMN ibank.currency_purchase.use_depo_contract IS '������� ��������� ��� ��� �� ���������� �������. ����� ��������� �������� "true" ��� "false"';
COMMENT ON COLUMN ibank.currency_purchase.depo_contract_DEC IS '����� ����������� ��������';
COMMENT ON COLUMN ibank.currency_purchase.depo_contract_date IS '���� ����������� ��������';
COMMENT ON COLUMN ibank.currency_purchase.depo_sum IS '������������ ����� ������';
COMMENT ON COLUMN ibank.currency_purchase.depo_kind IS '������ ������������. ����� ��������� ��������:
"������� �� ���������� ����",
"�������� ������������ �� �����"';
COMMENT ON COLUMN ibank.currency_purchase.depo_from_account IS '���� ��� �������� ������������ ����� ������';
COMMENT ON COLUMN ibank.currency_purchase.depo_to_account IS '����, �� ������� ������������ ����� �������� ����������� ��������';
COMMENT ON COLUMN ibank.currency_purchase.status_doc IS '������� (���������) ��������� ���������. ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ibank.currency_purchase.signers IS '������ ����������� ������. �������� ������� ������� ������� ��������� ������ ����������� ������: 1 - ������� ����� ������ ������������, 0 - �����������. 0-� ������ ������������� ����� ������ 1, 1-� ������ 2 � �.�.';

ALTER TABLE ibank.currency_purchase
       ADD  CONSTRAINT ibank.XPKcurrency_purch PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
------------'��������� �� �������� ������� ����������� ������'----------
DROP TABLE ibank.currency_rsale ;

CREATE TABLE ibank.currency_rsale (
       doc_id               DEC(28) NOT NULL,
       client_id            DEC(20) NOT NULL,
       date_doc             DATE NOT NULL,
       DEC_doc              DEC(5) NOT NULL,
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
       status_doc           DEC(1) NOT NULL,
       signers              DEC(3) 
);
COMMENT ON TABLE ibank.currency_rsale IS '��������� �� �������� ������� ����������� ������';
COMMENT ON COLUMN ibank.currency_rsale.doc_id IS '���������� � ������ ������� ������������� ���������';
COMMENT ON COLUMN ibank.currency_rsale.client_id IS '���������� � ������ ������� ������������� �������, ���������� ��������, �� ������� clients';
COMMENT ON COLUMN ibank.currency_rsale.date_doc IS '���� ���������';
COMMENT ON COLUMN ibank.currency_rsale.DEC_doc IS '����� ���������';
COMMENT ON COLUMN ibank.currency_rsale.cln_bnk_name IS '������������ ����� �������';
COMMENT ON COLUMN ibank.currency_rsale.cln_name IS '������������ �������';
COMMENT ON COLUMN ibank.currency_rsale.cln_inn IS '��� �������';
COMMENT ON COLUMN ibank.currency_rsale.cln_okpo IS '���� �������';
COMMENT ON COLUMN ibank.currency_rsale.cln_addr IS '����� �������';
COMMENT ON COLUMN ibank.currency_rsale.cln_employee_fio IS '�.�.�. �������������� ���������� �������';
COMMENT ON COLUMN ibank.currency_rsale.cln_employee_phones IS '���������� �������� �������������� ���������� �������';
COMMENT ON COLUMN ibank.currency_rsale.rsale_sum IS '����� ������� ����������� ������';
COMMENT ON COLUMN ibank.currency_rsale.rsale_currency IS '��������� ��� (USD, DEM � �.�.) ������� ����������� ������';
COMMENT ON COLUMN ibank.currency_rsale.rsale_account IS '���� ��� �������� ������� ����������� ������';
COMMENT ON COLUMN ibank.currency_rsale.rsale_rate_kind IS '������� ������ ����� �������� �������. ����� ��������� ��������:
"�� ����� �����", 
"�� ����� �����",
"�� ����� �� ���� ���"';
COMMENT ON COLUMN ibank.currency_rsale.rsale_rate IS '���� �������� ������� ������. ����������� � ����������� �� �������� ���� �������� ������ ����� ������� - RSALE_RATE_KIND';
COMMENT ON COLUMN ibank.currency_rsale.received_sum IS '����������� ����� ������, ���������� �� ������� ������';
COMMENT ON COLUMN ibank.currency_rsale.received_account IS '���� ��� ���������� ������, ���������� �� �������� ������� ������. ���� ���� ����� ���������� � ������ �����';
COMMENT ON COLUMN ibank.currency_rsale.received_bnk_bic IS '��� �����, � ������� ������ �������� ���� ��� ����������';
COMMENT ON COLUMN ibank.currency_rsale.received_bnk_account IS '������� �����, � ������� ������ �������� ���� ��� ����������';
COMMENT ON COLUMN ibank.currency_rsale.received_bnk_name IS '������������ �����, � ������� ������ �������� ���� ��� ����������';
COMMENT ON COLUMN ibank.currency_rsale.commission_account IS '���� �������, � �������� ����������� ������������ �������. ���� ���� ��������� � �����, � ������� ������ ���� ��� �������� ������';
COMMENT ON COLUMN ibank.currency_rsale.commission_kind IS '��� ��������. ����� ��������� ��������:
"�������� �� ���������", 
"� ������������ � �������� �����",
"�� �����"';
COMMENT ON COLUMN ibank.currency_rsale.commission_sum IS '����� ��������. ����������� � ����������� �� �������� ���� ���� �������� - COMMISSION_KIND';
COMMENT ON COLUMN ibank.currency_rsale.commission_currency IS '��������� ��� ������ (USD, DEM � ��.) ����� ��������';
COMMENT ON COLUMN ibank.currency_rsale.experience_date IS '���� �������� ��������� - ���� ������������, �� ������� ������������� ��������� �� �������� ������� ������';
COMMENT ON COLUMN ibank.currency_rsale.added_cond IS '�������������� ������� �� �������� ������� ������';
COMMENT ON COLUMN ibank.currency_rsale.currency_purchase_info IS '���������� � ����� ��������� � ������� ����������� ������';
COMMENT ON COLUMN ibank.currency_rsale.status_doc IS '������� (���������) ��������� ���������. ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ibank.currency_rsale.signers IS '������ ����������� ������. �������� ������� ������� ������� ��������� ������ ����������� ������: 1 - ������� ����� ������ ������������, 0 - �����������. 0-� ������ ������������� ����� ������ 1, 1-� ������ 2 � �.�.';

ALTER TABLE ibank.currency_rsale
       ADD  CONSTRAINT ibank.XPKcurrency_rsale PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
------------'��������� �� ������������ ������� ����������� ������'------
DROP TABLE ibank.currency_fsale ;

CREATE TABLE ibank.currency_fsale (
       doc_id               DEC(28) NOT NULL,
       client_id            DEC(20) ,
       date_doc             DATE NOT NULL,
       DEC_doc              DEC(5) NOT NULL,
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
       status_doc           DEC(1) NOT NULL,
       signers              DEC(3) 
);
COMMENT ON TABLE ibank.currency_fsale IS '��������� �� ������������ ������� ����������� ������';
COMMENT ON COLUMN ibank.currency_fsale.doc_id IS '���������� � ������ ������� ������������� ���������';
COMMENT ON COLUMN ibank.currency_fsale.client_id IS '���������� � ������ ������� ������������� �������, ���������� ��������, �� ������� clients';
COMMENT ON COLUMN ibank.currency_fsale.date_doc IS '���� ���������';
COMMENT ON COLUMN ibank.currency_fsale.DEC_doc IS '����� ���������';
COMMENT ON COLUMN ibank.currency_fsale.cln_bnk_name IS '������������ ����� �������';
COMMENT ON COLUMN ibank.currency_fsale.cln_name IS '������������ �������';
COMMENT ON COLUMN ibank.currency_fsale.cln_inn IS '��� �������';
COMMENT ON COLUMN ibank.currency_fsale.cln_okpo IS '���� �������';
COMMENT ON COLUMN ibank.currency_fsale.cln_addr IS '����� �������';
COMMENT ON COLUMN ibank.currency_fsale.cln_employee_fio IS '�.�.�. �������������� ���������� �������';
COMMENT ON COLUMN ibank.currency_fsale.cln_employee_phones IS '���������� �������� �������������� ���������� �������';
COMMENT ON COLUMN ibank.currency_fsale.total_sum IS '����� ����� �������� �������';
COMMENT ON COLUMN ibank.currency_fsale.total_currency IS '��������� ��� (USD, DEM � �.�.) ������ ����� ����� �������� �������';
COMMENT ON COLUMN ibank.currency_fsale.refs_1 IS '������ ��������. �������� ����� ���������, ����, �����, ��� ������.';
COMMENT ON COLUMN ibank.currency_fsale.refs_2 IS '������ ��������. �������� ����� ���������, ����, �����, ��� ������.';
COMMENT ON COLUMN ibank.currency_fsale.refs_3 IS '������ ��������. �������� ����� ���������, ����, �����, ��� ������.';
COMMENT ON COLUMN ibank.currency_fsale.refs_4 IS '��������� ��������. �������� ����� ���������, ����, �����, ��� ������.';
COMMENT ON COLUMN ibank.currency_fsale.refs_5 IS '����� ��������. �������� ����� ���������, ����, �����, ��� ������.';
COMMENT ON COLUMN ibank.currency_fsale.sale_account IS '���� ��� �������� ���������� �������. ���������� ���� ������� � �����.';
COMMENT ON COLUMN ibank.currency_fsale.transfer_sum IS '����������� ����� ������ - ����� �������� �������, ������� ����������� �� ������� �������� ����.';
COMMENT ON COLUMN ibank.currency_fsale.transfer_currency IS '��������� ��� (USD, DEM � �.�.) ������ ����������� ����� ������';
COMMENT ON COLUMN ibank.currency_fsale.transfer_account IS '������� �������� ����, �� ������� ����������� ����� transfer_sum - ����� ����� �������� �������';
COMMENT ON COLUMN ibank.currency_fsale.force_sale_sum IS '����� ����� �������� �������, ������� ����������� �� ���� 47405xxxxxxxxxxxxxxx ��� ������������ ������� �� �������� �����';
COMMENT ON COLUMN ibank.currency_fsale.force_sale_currency IS '��������� ��� (USD, DEM � �.�.) ������ ����� ��� ������������ �������';
COMMENT ON COLUMN ibank.currency_fsale.force_sale_rate_kind IS '������� ������ ����� �������.����� ��������� ��������:
"�� ����� �����",
"�� ����� �����",
"�� ����� �� ���� ���"';
COMMENT ON COLUMN ibank.currency_fsale.force_sale_rate IS '���� ������� ������. ����������� � ����������� �� �������� ���� �������� ������ ����� ������� - FORCE_SALE_RATE_KIND';
COMMENT ON COLUMN ibank.currency_fsale.received_account IS '���� ��� ���������� ������. ����� ���������� � ������ �����.';
COMMENT ON COLUMN ibank.currency_fsale.received_bnk_bic IS '��� �����, � ������� ������ ���� ��� ���������� ������.';
COMMENT ON COLUMN ibank.currency_fsale.received_bnk_account IS '������� �����, � ������� ������ ���� ��� ���������� ������.';
COMMENT ON COLUMN ibank.currency_fsale.received_bnk_name IS '������������ �����, � ������� ������ ���� ��� ���������� ������.';
COMMENT ON COLUMN ibank.currency_fsale.commission_account IS '���� �������, � �������� ����������� ������������ �������. ���� ���� ��������� � �����, � ������� ������ ���� ��� �������� ������';
COMMENT ON COLUMN ibank.currency_fsale.commission_kind IS '��� ��������. ����� ��������� ��������:
"�������� �� ���������", 
"� ������������ � �������� �����",
"�� �����"';
COMMENT ON COLUMN ibank.currency_fsale.commission_sum IS '����� ��������. ����������� � ����������� �� �������� ���� ���� �������� - COMMISSION_KIND';
COMMENT ON COLUMN ibank.currency_fsale.commission_currency IS '��������� ��� ������ (USD, DEM � ��.) ����� ��������';
COMMENT ON COLUMN ibank.currency_fsale.experience_date IS '���� �������� ��������� - ���� ������������, �� ������� ������������� ��������� �� ������������ ������� ������';
COMMENT ON COLUMN ibank.currency_fsale.added_cond IS '�������������� ������� �� ������� ������';
COMMENT ON COLUMN ibank.currency_fsale.payment_kind_code IS '��� ���� �������';
COMMENT ON COLUMN ibank.currency_fsale.payment_kind_info IS '��� ���� ������� - ��������� ����������';
COMMENT ON COLUMN ibank.currency_fsale.xchg_oper_type IS '��� �������� ��������';
COMMENT ON COLUMN ibank.currency_fsale.contract IS '��� ���������� � ��������, ���������, ����������, � ������������ � ������� ���������� ������� ������. ��� �������, ����������� �����, ���� � ����� ����� ��������';
COMMENT ON COLUMN ibank.currency_fsale.reg_form IS '������� ����� ���������. ����������� ����� � ���� ������� ����� ���������';
COMMENT ON COLUMN ibank.currency_fsale.bargain_passport IS '������� ������';
COMMENT ON COLUMN ibank.currency_fsale.gtd IS '������ ���';
COMMENT ON COLUMN ibank.currency_fsale.cxr_added_info IS '�������������� ���������� ��� ��������� ��������, �� �������� � ������������ ����';
COMMENT ON COLUMN ibank.currency_fsale.force_sale_account IS '���� ��� ������������ �������';
COMMENT ON COLUMN ibank.currency_fsale.status_doc IS '������� (���������) ��������� ���������. ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ibank.currency_fsale.signers IS '������ ����������� ������. �������� ������� ������� ������� ��������� ������ ����������� ������: 1 - ������� ����� ������ ������������, 0 - �����������. 0-� ������ ������������� ����� ������ 1, 1-� ������ 2 � �.�.';

ALTER TABLE ibank.currency_fsale
       ADD  CONSTRAINT ibank.XPKcurrency_fsale PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
-------------------- '��������� �� ������� ������' --------------------- 
DROP TABLESPACE ibank_data;
DROP BUFFERPOOL ibank_bufer;
CREATE BUFFERPOOL ibank_bufer size 50 PAGESIZE 8k;
CREATE TABLESPACE ibank_data PAGESIZE 8k  MANAGED BY DATABASE USING (FILE 'c:\db2\database\ibank.tsd' 100M) BUFFERPOOL ibank_bufer; 

CREATE TABLE ibank.currency_payment (
       doc_id               DEC(28) NOT NULL,
       client_id            DEC(20) NOT NULL,
       date_doc             DATE NOT NULL,
       DEC_doc              DEC(5) NOT NULL,
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
       status_doc           DEC(1) NOT NULL,
       signers              DEC(3));

COMMENT ON TABLE ibank.currency_payment IS '��������� �� ������� ������';

COMMENT ON COLUMN ibank.currency_payment.doc_id IS '���������� � ������ ������� ������������� ���������';
COMMENT ON COLUMN ibank.currency_payment.client_id IS '���������� � ������ ������� ������������� �������, ���������� ��������, �� ������� clients';
COMMENT ON COLUMN ibank.currency_payment.date_doc IS '���� ���������';
COMMENT ON COLUMN ibank.currency_payment.DEC_doc IS '����� ���������';
COMMENT ON COLUMN ibank.currency_payment.payment_speed IS '��� ��������. ���������� ��������� ��������. ����� ��������� �������� "�������" ��� "�������"';
COMMENT ON COLUMN ibank.currency_payment.amount IS '����� ��������';
COMMENT ON COLUMN ibank.currency_payment.amount_currency IS '��������� ��� (USD, DEM � �.�.) ������ �������';
COMMENT ON COLUMN ibank.currency_payment.conv_rate IS '���� ���������';
COMMENT ON COLUMN ibank.currency_payment.cln_name IS '������������ ��������������';
COMMENT ON COLUMN ibank.currency_payment.cln_account IS '���� ��������������';
COMMENT ON COLUMN ibank.currency_payment.cln_inn IS '��� ��������������';
COMMENT ON COLUMN ibank.currency_payment.cln_country_code IS '��� ������ ��������������';
COMMENT ON COLUMN ibank.currency_payment.cln_country IS '������ ��������������';
COMMENT ON COLUMN ibank.currency_payment.cln_city IS '����� ��������������';
COMMENT ON COLUMN ibank.currency_payment.cln_addr IS '����� ��������������';
COMMENT ON COLUMN ibank.currency_payment.cln_employee_fio IS '�.�.�. �������������� ���������� ��������������';
COMMENT ON COLUMN ibank.currency_payment.cln_employee_phones IS '���������� �������� �������������� ���������� ��������������';
COMMENT ON COLUMN ibank.currency_payment.cln_bnk_name IS '������������ ����� ��������������';
COMMENT ON COLUMN ibank.currency_payment.cln_bnk_bic IS '����������������� ��� ����� ��������������';
COMMENT ON COLUMN ibank.currency_payment.cln_bnk_bic_type IS '��� ������������������ ���� ����� ��������������';
COMMENT ON COLUMN ibank.currency_payment.cln_bnk_country_code IS '��� ������ ����� ��������������';
COMMENT ON COLUMN ibank.currency_payment.cln_bnk_country IS '������ ����� ��������������';
COMMENT ON COLUMN ibank.currency_payment.cln_bnk_city IS '����� ����� ��������������';
COMMENT ON COLUMN ibank.currency_payment.cln_bnk_addr IS '����� ����� ��������������';
COMMENT ON COLUMN ibank.currency_payment.intermed_bnk_name IS '������������ �����-����������';
COMMENT ON COLUMN ibank.currency_payment.intermed_bnk_bic IS '����������������� ��� �����-����������';
COMMENT ON COLUMN ibank.currency_payment.intermed_bnk_bic_type IS '��� ������������������ ���� �����-����������';
COMMENT ON COLUMN ibank.currency_payment.intermed_bnk_country_code IS '��� ������ �����-����������';
COMMENT ON COLUMN ibank.currency_payment.intermed_bnk_country IS '������ �����-����������';
COMMENT ON COLUMN ibank.currency_payment.intermed_bnk_city IS '����� �����-����������';
COMMENT ON COLUMN ibank.currency_payment.intermed_bnk_addr IS '����� �����-����������';
COMMENT ON COLUMN ibank.currency_payment.rcpt_bnk_name IS '������������ ����� �����������';
COMMENT ON COLUMN ibank.currency_payment.rcpt_bnk_account IS '����� ����� ����� �����������';
COMMENT ON COLUMN ibank.currency_payment.rcpt_bnk_bic IS '����������������� ��� ����� �����������';
COMMENT ON COLUMN ibank.currency_payment.rcpt_bnk_bic_type IS '��� ������������������ ���� ����� �����������';
COMMENT ON COLUMN ibank.currency_payment.rcpt_bnk_country_code IS '��� ������ ����� �����������';
COMMENT ON COLUMN ibank.currency_payment.rcpt_bnk_country IS '������ ����� �����������';
COMMENT ON COLUMN ibank.currency_payment.rcpt_bnk_city IS '����� ����� �����������';
COMMENT ON COLUMN ibank.currency_payment.rcpt_bnk_addr IS '����� ����� �����������';
COMMENT ON COLUMN ibank.currency_payment.rcpt_name IS '������������ �����������';
COMMENT ON COLUMN ibank.currency_payment.rcpt_account IS '����� ����� �����������';
COMMENT ON COLUMN ibank.currency_payment.rcpt_country_code IS '��� ������ �����������';
COMMENT ON COLUMN ibank.currency_payment.rcpt_country IS '������ �����������';
COMMENT ON COLUMN ibank.currency_payment.rcpt_city IS '����� �����������';
COMMENT ON COLUMN ibank.currency_payment.rcpt_addr IS '����� �����������';
COMMENT ON COLUMN ibank.currency_payment.expense_type IS '������ ������ �������� �� ��������. ����� ��������� ��������:
"�� ��� ����",
"�� ���� �����������",
"����� �� ��� ����, ������-����. - �� ���� �����������"';
COMMENT ON COLUMN ibank.currency_payment.expense_account IS '���� ������ �������� �� ��������. ����������� � ������, ���� ������� �� �������� ����� �� ��������������';
COMMENT ON COLUMN ibank.currency_payment.payment_details IS '���������� �������';
COMMENT ON COLUMN ibank.currency_payment.payment_added_info IS '�������������� ����������';
COMMENT ON COLUMN ibank.currency_payment.payment_kind_code IS '��� ���� �������';
COMMENT ON COLUMN ibank.currency_payment.payment_kind_info IS '��� ���� ������� - ��������� ����������';
COMMENT ON COLUMN ibank.currency_payment.render_kind_code IS '��� ���� ������';
COMMENT ON COLUMN ibank.currency_payment.render_kind_info IS '��� ���� ������ - ��������� ����������';
COMMENT ON COLUMN ibank.currency_payment.xchg_oper_type IS '��� �������� ��������';
COMMENT ON COLUMN ibank.currency_payment.contract IS '��� ���������� � ��������, ���������, ����������, � ������������ � ������� ���������� ������� ������. ��� �������, ����������� �����, ���� � ����� ����� ��������';
COMMENT ON COLUMN ibank.currency_payment.reg_form IS '������� ����� ���������. ����������� ����� � ���� ������� ����� ���������';
COMMENT ON COLUMN ibank.currency_payment.bargain_passport IS '������� ������';
COMMENT ON COLUMN ibank.currency_payment.gtd IS '������ ���';
COMMENT ON COLUMN ibank.currency_payment.cxr_added_info IS '�������������� ���������� ��� ��������� ��������';
COMMENT ON COLUMN ibank.currency_payment.status_doc IS '������� (���������) ��������� ���������. ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ibank.currency_payment.signers IS '������ ����������� ������. �������� ������� ������� ������� ��������� ������ ����������� ������: 1 - ������� ����� ������ ������������, 0 - �����������. 0-� ������ ������������� ����� ������ 1, 1-� ������ 2 � �.�.';

ALTER TABLE ibank.currency_payment
       ADD   CONSTRAINT ibank.XPKcurrency_pay PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
-------------------- '���������� ������������' ----------------------------------- 
DROP TABLE ibank.beneficiaries ;

CREATE TABLE ibank.beneficiaries (
       id                   DEC(20) NOT NULL,
       client_id            DEC(20) NOT NULL,
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
COMMENT ON TABLE ibank.beneficiaries IS '���������� ������������';

COMMENT ON COLUMN ibank.beneficiaries.id IS '���������� ������������� �����������';
COMMENT ON COLUMN ibank.beneficiaries.client_id IS '������������� �������';
COMMENT ON COLUMN ibank.beneficiaries.intermed_bnk_name IS '������������ �����-����������';
COMMENT ON COLUMN ibank.beneficiaries.intermed_bnk_bic IS '����������������� ��� �����-����������';
COMMENT ON COLUMN ibank.beneficiaries.intermed_bnk_bic_type IS '��� ������������������ ���� �����-����������';
COMMENT ON COLUMN ibank.beneficiaries.intermed_bnk_country_code IS '��� ������ �����-����������';
COMMENT ON COLUMN ibank.beneficiaries.intermed_bnk_country IS '������ �����-����������';
COMMENT ON COLUMN ibank.beneficiaries.intermed_bnk_city IS '����� �����-����������';
COMMENT ON COLUMN ibank.beneficiaries.intermed_bnk_addr IS '����� �����-����������';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_bnk_name IS '������������ ����� �����������';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_bnk_account IS '����� ����� ����� �����������';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_bnk_bic IS '����������������� ��� ����� �����������';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_bnk_bic_type IS '��� ������������������ ���� ����� �����������';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_bnk_country_code IS '��� ������ ����� �����������';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_bnk_country IS '������ ����� �����������';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_bnk_city IS '����� ����� �����������';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_bnk_addr IS '����� ����� �����������';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_name IS '������������ �����������';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_account IS '����� ����� �����������';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_country_code IS '��� ������ �����������';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_country IS '������ �����������';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_city IS '����� �����������';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_addr IS '����� �����������';

ALTER TABLE ibank.beneficiaries
       ADD   CONSTRAINT ibank.XPKbeneficiaries PRIMARY KEY (id) ;
------------------------------------------------------------------------
-------------------- '���������� ����������� ��������' ----------------------------------- 
DROP TABLE ibank.clients_inbox ;

CREATE TABLE ibank.clients_inbox (
       msg_id               DEC(28) NOT NULL,
       client_id            DEC(20) NOT NULL,
       read_date            DATE 
);
COMMENT ON TABLE ibank.clients_inbox IS '���������� ����������� ��������';

COMMENT ON COLUMN ibank.clients_inbox.msg_id IS '������������� �����������';
COMMENT ON COLUMN ibank.clients_inbox.client_id IS '������������� �������';
COMMENT ON COLUMN ibank.clients_inbox.read_date IS '���� ��������� ����������� ��������';

ALTER TABLE ibank.clients_inbox
       ADD   CONSTRAINT ibank.XPKclients_inbox PRIMARY KEY (msg_id, client_id) ;
------------------------------------------------------------------------
-------------------- '���������� � ��������' ---------------------------
DROP TABLE ibank.clients ;

CREATE TABLE ibank.clients (
       client_id            DEC(20) NOT NULL,
       inn_cln              VARCHAR(12) ,
       okpo                 VARCHAR(8) ,
       name_cln             VARCHAR(160) NOT NULL,
       fio_cln              VARCHAR(160) NOT NULL,
       phone_cln            VARCHAR(40) NOT NULL,
       fax_cln              VARCHAR(40) ,
       email_cln            VARCHAR(256) ,
       addr_cln             VARCHAR(200) NOT NULL,
       DEC_dogov            VARCHAR(10) NOT NULL,
       reg_date             DATE NOT NULL,
       perms                DEC(5) DEFAULT 0 NOT NULL,
       lock_word            VARCHAR(20) NOT NULL,
       ordering_customer    VARCHAR(160) ,
       status               DEC(1) DEFAULT 1 NOT NULL,
       cln_type             DEC(1) NOT NULL,
       kpp                  VARCHAR(9) ,
       doc_sign_DEC         DEC(20) NOT NULL,
       ext_client_id        VARCHAR(20) ,
       country_code         CHAR(3) ,
       city                 VARCHAR(40) ,
       city_latin           VARCHAR(40) ,
       address_latin        VARCHAR(200) ,
       soato                VARCHAR(20) ,
       resident_flag        DEC(1) 
);
COMMENT ON TABLE ibank.clients IS '���������� � ��������';
COMMENT ON COLUMN ibank.clients.client_id IS '������������� �������';
COMMENT ON COLUMN ibank.clients.inn_cln IS '��� �������';
COMMENT ON COLUMN ibank.clients.okpo IS '���� �������';
COMMENT ON COLUMN ibank.clients.name_cln IS '������������ �������';
COMMENT ON COLUMN ibank.clients.fio_cln IS '�.�.�. �������������� ���� � �������';
COMMENT ON COLUMN ibank.clients.phone_cln IS '������� �������';
COMMENT ON COLUMN ibank.clients.fax_cln IS '���� �������';
COMMENT ON COLUMN ibank.clients.email_cln IS 'E-mail �������';
COMMENT ON COLUMN ibank.clients.addr_cln IS '����� �������';
COMMENT ON COLUMN ibank.clients.DEC_dogov IS '����� �������� ����� � �������� �� ���';
COMMENT ON COLUMN ibank.clients.reg_date IS '���� ����������� ������� � ���';
COMMENT ON COLUMN ibank.clients.perms IS '����� ������� (13 ����������� ����):
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
COMMENT ON COLUMN ibank.clients.lock_word IS '������������� ����� ��� ������������ ������� �� ��������';
COMMENT ON COLUMN ibank.clients.ordering_customer IS '������������ ������� �� ���������� �����';
COMMENT ON COLUMN ibank.clients.status IS '������ �������
0 - ������
1 - ������������
2 - �������';
COMMENT ON COLUMN ibank.clients.cln_type IS '��� �������
1 - ���������� ���� 
0 - ����������� ����';
COMMENT ON COLUMN ibank.clients.kpp IS '��� (��� ���������� �� ����)';
COMMENT ON COLUMN ibank.clients.doc_sign_DEC IS '����� �������� ��� ���������� ������ ����������. ������������ � ���� ������� �����, ��� �� ������ ��� ��������� �������� �� ��� ����.
1) �������� ��������� ��������� - 0-2
2) ������ - 3-5
--3) ��������� �� ������� - 6-8
--4) ��������� �� ������� - 9-11
--5) ��������� �� ������� - 12-14
--6) ��������� �� ������. ������� - 15-17
�������������� 000 - 1 �������, 001 - 2 ������� � �.�.';
COMMENT ON COLUMN ibank.clients.ext_client_id IS '������������� ������� �� ������� �������';
COMMENT ON COLUMN ibank.clients.country_code IS '��� ������ �������';
COMMENT ON COLUMN ibank.clients.city IS '����� �������������� �������';
COMMENT ON COLUMN ibank.clients.city_latin IS '����� �������������� ������� �� ����������';
COMMENT ON COLUMN ibank.clients.address_latin IS '����� ������� �� ���������� �����';
COMMENT ON COLUMN ibank.clients.soato IS '����� �������';
COMMENT ON COLUMN ibank.clients.resident_flag IS '������� ���������';

ALTER TABLE ibank.clients
       ADD  CONSTRAINT ibank.XPKclients PRIMARY KEY (client_id) ;
------------------------------------------------------------------------
-------------------- '���������� ������ SWIFT' ------------------------- 
DROP TABLE ibank.swift ;

CREATE TABLE ibank.swift (
       bic                  CHAR(11) NOT NULL,
       name                 VARCHAR(105) NOT NULL,
       city                 VARCHAR(40) ,
       address              VARCHAR(255) ,
       country_code         CHAR(3) 
);
COMMENT ON TABLE ibank.swift IS '���������� ������ SWIFT';

COMMENT ON COLUMN ibank.swift.bic IS 'SWIFT ��� �����';
COMMENT ON COLUMN ibank.swift.name IS '������������ �����';
COMMENT ON COLUMN ibank.swift.city IS '������������ ������ �������������� �����';
COMMENT ON COLUMN ibank.swift.address IS '����� �����';
COMMENT ON COLUMN ibank.swift.country_code IS '��� ������';

ALTER TABLE ibank.swift
       ADD  CONSTRAINT ibank.XPKswift PRIMARY KEY (bic) ;

------------------------------------------------------------------------
-------------------- '���������� �����' -------------------------------- 

DROP TABLE ibank.countries ;

CREATE TABLE ibank.countries (
       code                 CHAR(3) NOT NULL,
       country              VARCHAR(70) NOT NULL,
       iso_code             CHAR(2) NOT NULL,
       eng_name             VARCHAR(70) NOT NULL
);
COMMENT ON TABLE ibank.countries IS '���������� �����';

COMMENT ON COLUMN ibank.countries.code IS '��� ������';
COMMENT ON COLUMN ibank.countries.country IS '������������ ������';
COMMENT ON COLUMN ibank.countries.iso_code IS '��� ������ ISO';
COMMENT ON COLUMN ibank.countries.eng_name IS '������������ ������ �� ����������';

ALTER TABLE ibank.countries
       ADD  CONSTRAINT ibank.XPKcountries PRIMARY KEY (code) ;

------------------------------------------------------------------------
-------------------- '���������� �����' ----------------------------------- 

DROP TABLE ibank.currency ;

CREATE TABLE ibank.currency (
       code_currency        CHAR(3) NOT NULL,
       currency             CHAR(3) NOT NULL,
       name                 VARCHAR(64) NOT NULL,
       namev                VARCHAR(64) ,
       namer                VARCHAR(64) ,
       namep                VARCHAR(64) ,
       recalc               CHAR(20) ,
       decimals             DEC(2) DEFAULT 02 NOT NULL
);
COMMENT ON TABLE ibank.currency IS '���������� �����';
COMMENT ON COLUMN ibank.currency.code_currency IS '��������� ��� ������ (USD, DEM � ��.)';
COMMENT ON COLUMN ibank.currency.currency IS '������ (����������� - USD, DEM � ��.)';
COMMENT ON COLUMN ibank.currency.name IS '������������ - ������������ �����';
COMMENT ON COLUMN ibank.currency.namev IS '������������ - ����������� �����';
COMMENT ON COLUMN ibank.currency.namer IS '������������ - ����������� �����';
COMMENT ON COLUMN ibank.currency.namep IS '������������ - ���������� �����';
COMMENT ON COLUMN ibank.currency.recalc IS '���������� ���� ��������� ����� ��� ������';
COMMENT ON COLUMN ibank.currency.decimals IS '����� ������ ����� �������';

ALTER TABLE ibank.currency
       ADD  CONSTRAINT ibank.XPKcurrency PRIMARY KEY (code_currency) ;
------------------------------------------------------------------------
-------------------- '���� �����' ----------------------------------- 
DROP TABLE ibank.currency_rates ;

CREATE TABLE ibank.currency_rates (
       rate_date            DATE NOT NULL,
       code                 CHAR(3) NOT NULL,
       cbr_rate             DEC(6,4) ,
       mmvb_rate            DEC(6,4) 
);
COMMENT ON TABLE ibank.currency_rates IS '���� �����';
COMMENT ON COLUMN ibank.currency_rates.rate_date IS '���� �����';
COMMENT ON COLUMN ibank.currency_rates.code IS '��� ������';
COMMENT ON COLUMN ibank.currency_rates.cbr_rate IS '���� �����������';
COMMENT ON COLUMN ibank.currency_rates.mmvb_rate IS '���� ����';

ALTER TABLE ibank.currency_rates
       ADD  CONSTRAINT ibank.XPKcurrency_rates PRIMARY KEY (rate_date, code) ;

------------------------------------------------------------------------
-------------------- '�������� �� ������ ��������' ----------------------------------- 

DROP TABLE ibank.opers ;

CREATE TABLE ibank.opers (
       branch_id            VARCHAR(20) NOT NULL,
       account              CHAR(20) NOT NULL,
       id_oper              VARCHAR(20) ,
       oper_date            DATE NOT NULL,
       oper_code            CHAR(3) ,
       doc_DEC              VARCHAR(5) ,
       doc_date             DATE ,
       corr_inn             VARCHAR(12) ,
       corr_name            VARCHAR(160) ,
       corr_acc             CHAR(20) ,
       corr_bank_bic        CHAR(9) ,
       corr_bank_acc        CHAR(20) ,
       corr_bank_name       VARCHAR(80) ,
       oper_amount          DEC(28,10) NOT NULL,
       oper_details         VARCHAR(210) ,
       rur_oper_amount      DEC(17,2) 
);
COMMENT ON TABLE ibank.opers IS '�������� �� ������ ��������';

COMMENT ON COLUMN ibank.opers.branch_id IS '���������� ������������� ����� ��� �������, ������������������ � �������';
COMMENT ON COLUMN ibank.opers.account IS '���� �������';
COMMENT ON COLUMN ibank.opers.id_oper IS '������������� ��������';
COMMENT ON COLUMN ibank.opers.oper_date IS '���� ��������';
COMMENT ON COLUMN ibank.opers.oper_code IS '��� ��������';
COMMENT ON COLUMN ibank.opers.doc_DEC IS '����� ���������';
COMMENT ON COLUMN ibank.opers.doc_date IS '���� ���������';
COMMENT ON COLUMN ibank.opers.corr_inn IS '��� ��������������';
COMMENT ON COLUMN ibank.opers.corr_name IS '������������ ��������������';
COMMENT ON COLUMN ibank.opers.corr_acc IS '���� ��������������';
COMMENT ON COLUMN ibank.opers.corr_bank_bic IS '��� ����� ��������������';
COMMENT ON COLUMN ibank.opers.corr_bank_acc IS '������� ����� ��������������';
COMMENT ON COLUMN ibank.opers.corr_bank_name IS '������������ ����� ��������������';
COMMENT ON COLUMN ibank.opers.oper_amount IS '����� �������� (+ ������, - �����)';
COMMENT ON COLUMN ibank.opers.oper_details IS '���������� �������';
COMMENT ON COLUMN ibank.opers.rur_oper_amount IS '������� �������� ��������';
------------------------------------------------------------------------
-------------------- '�������� �������' ----------------------------------- 
DROP TABLE ibank.init_as ;

CREATE TABLE ibank.init_as (
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
COMMENT ON TABLE ibank.init_as IS '�������� �������';

COMMENT ON COLUMN ibank.init_as.branch_id IS '������������� ����� � ������ �������';
COMMENT ON COLUMN ibank.init_as.bik IS '��� �����';
COMMENT ON COLUMN ibank.init_as.version IS '������ ������� iBank';
COMMENT ON COLUMN ibank.init_as.eng_name IS '������������ ����� �� ����������';
COMMENT ON COLUMN ibank.init_as.app_name IS '������������ ����������';
COMMENT ON COLUMN ibank.init_as.content_type IS '��� �����������';
COMMENT ON COLUMN ibank.init_as.content IS '���������� (������� ���������� �� ���������)';
COMMENT ON COLUMN ibank.init_as.swift IS 'SWIFT ��� �����';
COMMENT ON COLUMN ibank.init_as.address IS '����� �����';
COMMENT ON COLUMN ibank.init_as.city_latin IS '����� ����� �� ���������� ����� (��������� ��������� ���� ����������� SWIFT ��� �����)';
COMMENT ON COLUMN ibank.init_as.address_latin IS '����� ����� �� ���������� ����� (��������� ��������� ���� ����������� SWIFT ��� �����)';

ALTER TABLE ibank.init_as
       ADD  CONSTRAINT ibank.XPKinit_as PRIMARY KEY (branch_id) ;
------------------------------------------------------------------------
-------------------- '����������� ��� ��������' ----------------------------------- 
DROP TABLE ibank.outbox ;

CREATE TABLE ibank.outbox (
       msg_id               DEC(28) NOT NULL,
       msg_DEC              VARCHAR(20) NOT NULL,
       msg_date             DATE ,
       create_date          DATE NOT NULL,
       subject              VARCHAR(255) NOT NULL,
       body                 LONG VARCHAR ,
       status_doc           DEC(1) NOT NULL
);
COMMENT ON TABLE ibank.outbox IS '����������� ��� ��������';
COMMENT ON COLUMN ibank.outbox.msg_id IS '���������� � ������ ������� ������������� �����������';
COMMENT ON COLUMN ibank.outbox.msg_DEC IS '����� �����������';
COMMENT ON COLUMN ibank.outbox.msg_date IS '���� �������� �����������';
COMMENT ON COLUMN ibank.outbox.create_date IS '���� �������� �����������';
COMMENT ON COLUMN ibank.outbox.subject IS '��������� ���������� �����������';
COMMENT ON COLUMN ibank.outbox.body IS '���������� �����������';
COMMENT ON COLUMN ibank.outbox.status_doc IS '��������� �����������. ����� ��������� ��������:
0 - �����,
5 - ����������,
7 - �������';

ALTER TABLE ibank.outbox
       ADD  CONSTRAINT ibank.XPKoutbox PRIMARY KEY (msg_id) ;
------------------------------------------------------------------------
-------------------- '������� �� ����������' ----------------------------------- 
DROP TABLE ibank.docs_hist ;

CREATE TABLE ibank.docs_hist (
       subject_type         DEC(1) NOT NULL,
       subject_id           DEC(20) ,
       subject_owner        VARCHAR(160) ,
       subject_sign         LONG VARCHAR ,
       group_sign           DEC(1) ,
       doc_type             VARCHAR(20) NOT NULL,
       doc_id               DEC(28) NOT NULL,
       action               DEC(1) NOT NULL,
       act_time             DATE NOT NULL,
       doc_status           DEC(1) NOT NULL,
       doc_status_desc      VARCHAR(200) ,
       encoding             VARCHAR(10) 
);
COMMENT ON TABLE ibank.docs_hist IS '������� �� ����������.';
COMMENT ON COLUMN ibank.docs_hist.subject_type IS '��� ��������, ������������ ��������. ����� ��������� ��������:
0 - ������,
1 - ������������, 
2 - ���������';
COMMENT ON COLUMN ibank.docs_hist.subject_id IS '������������� ��������, ������������ �������� - ������������� ����� ���. (���� ������������� ������������, ���� ��� ������� c����������� �������� subject_type = 0 - ������)';
COMMENT ON COLUMN ibank.docs_hist.subject_owner IS '�������� ����� ���. �������, �� ������� ��������������� ���� ���(������������, ���� ��� ������� c����������� �������� subject_type = 0 - ������)';
COMMENT ON COLUMN ibank.docs_hist.subject_sign IS '������� �������� ��� ����������. (������������, ���� subject_type - ������ ��������� �������� - action ������� ���������)';
COMMENT ON COLUMN ibank.docs_hist.group_sign IS '������ ������� �������� ������������ ������� (������������, ���� subject_type - ������ ��������� �������� - action ������� ���������)';
COMMENT ON COLUMN ibank.docs_hist.doc_type IS '��� ���������, ��� ������� ��������� ��������. ����� ��������� ��������: 
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
COMMENT ON COLUMN ibank.docs_hist.doc_id IS '���������� ������������� ��������� � �������.';
COMMENT ON COLUMN ibank.docs_hist.action IS '��� �������� ��� ����������.����� ��������� ��������:
0 - ���������,
1 - ���������,
2 - �������������� �� ������� �������,
3 - ���������,
4 - ����������,
5 - �������.';
COMMENT ON COLUMN ibank.docs_hist.act_time IS '������ ������� ���������� ��������';
COMMENT ON COLUMN ibank.docs_hist.doc_status IS '��������� ��������(��������� ���������). ����� ��������� ��������:
0 - �����,
1 - ��������,
2 - ���������,
3 - �� ���������,
4 - �� ����������,
5 - ��������,
6 - ���������,
7 - �����';
COMMENT ON COLUMN ibank.docs_hist.doc_status_desc IS '�������� ��������� ���������.�������� ����������� �������� ��������� ���������, �������� ��������� ������ � ���������� ���������.';
COMMENT ON COLUMN ibank.docs_hist.encoding IS '��������� � ������� ��� �������� ��������';
------------------------------------------------------------------------
-------------------- '���� ����������' ----------------------------------- 
DROP TABLE ibank.doc_types ;

CREATE TABLE ibank.doc_types (
       id                   DEC(3) NOT NULL,
       type                 VARCHAR(20) NOT NULL,
       description          VARCHAR(255) NOT NULL,
       definition           LONG VARCHAR NOT NULL,
       database_table       VARCHAR(20) NOT NULL
);
COMMENT ON TABLE ibank.doc_types IS '���� ����������';

COMMENT ON COLUMN ibank.doc_types.ID IS '�������������';
COMMENT ON COLUMN ibank.doc_types.Type IS '��� ���������';
COMMENT ON COLUMN ibank.doc_types.Description IS '�������� ����';
COMMENT ON COLUMN ibank.doc_types.Definition IS '����������� ����';
COMMENT ON COLUMN ibank.doc_types.Database_Table IS '������� � ���� ������';

ALTER TABLE ibank.doc_types
       ADD  CONSTRAINT ibank.XPKdoc_types PRIMARY KEY (ID) ;
------------------------------------------------------------------------
-------------------- '���������� � ����������' ----------------------------------- 
DROP TABLE ibank.attachments ;

CREATE TABLE ibank.attachments (
       doc_id               DEC(28) NOT NULL,
       doc_type             VARCHAR(20) NOT NULL,
       name                 VARCHAR(128) NOT NULL,
       type                 VARCHAR(20) ,
       att_size             DEC(10) NOT NULL,
       content              LONG VARCHAR NOT NULL
);
COMMENT ON TABLE ibank.attachments IS '���������� � ����������';

COMMENT ON COLUMN ibank.attachments.doc_id IS '������������� ���������';
COMMENT ON COLUMN ibank.attachments.doc_type IS '��� ���������';
COMMENT ON COLUMN ibank.attachments.name IS '������������ ����������';
COMMENT ON COLUMN ibank.attachments.type IS '��� ����������';
COMMENT ON COLUMN ibank.attachments.att_size IS '������ ����������';
COMMENT ON COLUMN ibank.attachments.content IS '���������� ����������';

ALTER TABLE ibank.attachments
       ADD  CONSTRAINT ibank.XPKattachments PRIMARY KEY (doc_id, doc_type, name) ;
------------------------------------------------------------------------
-------------------- ����� ������. ----------------------------------- 
ALTER TABLE ibank.keys_history
       ADD  CONSTRAINT ibank.R_27
              FOREIGN KEY (id_key)
                             REFERENCES ibank.keys
                             ON DELETE CASCADE ;

ALTER TABLE ibank.operator_keys
       ADD  CONSTRAINT ibank.R_26
              FOREIGN KEY (operator_id)
                             REFERENCES ibank.operators
                             ON DELETE CASCADE ;

ALTER TABLE ibank.refuse_accepts
       ADD  CONSTRAINT ibank.R_17
              FOREIGN KEY (client_id)
                             REFERENCES ibank.clients ;

ALTER TABLE ibank.accreditivs
       ADD  CONSTRAINT ibank.R_15
              FOREIGN KEY (client_id)
                             REFERENCES ibank.clients ;

ALTER TABLE ibank.payment_requests
       ADD  CONSTRAINT ibank.R_16
              FOREIGN KEY (client_id)
                             REFERENCES ibank.clients ;

ALTER TABLE ibank.encashed_contracts
       ADD  CONSTRAINT ibank.R_14
              FOREIGN KEY (client_id)
                             REFERENCES ibank.clients ;

ALTER TABLE ibank.profiles
       ADD  CONSTRAINT ibank.R_9
              FOREIGN KEY (id_key)
                             REFERENCES ibank.keys
                             ON DELETE CASCADE ;

ALTER TABLE ibank.recipients
       ADD  CONSTRAINT ibank.R_8
              FOREIGN KEY (client_id)
                             REFERENCES ibank.clients
                             ON DELETE CASCADE ;

ALTER TABLE ibank.new_accounts
       ADD   CONSTRAINT ibank.R_3
              FOREIGN KEY (branch_id)
                             REFERENCES ibank.init_as ;

ALTER TABLE ibank.new_accounts
       ADD  CONSTRAINT ibank.R_1
              FOREIGN KEY (id_key)
                             REFERENCES ibank.new_keys
                             ON DELETE CASCADE ;

ALTER TABLE ibank.new_clients
       ADD  CONSTRAINT ibank.R_2
              FOREIGN KEY (id_key)
                             REFERENCES ibank.new_keys
                             ON DELETE CASCADE ;

ALTER TABLE ibank.letters
       ADD  CONSTRAINT ibank.R_12
              FOREIGN KEY (client_id)
                             REFERENCES ibank.clients ;

ALTER TABLE ibank.payments
       ADD  CONSTRAINT ibank.R_13
              FOREIGN KEY (client_id)
                             REFERENCES ibank.clients ;

ALTER TABLE ibank.keys
       ADD  CONSTRAINT ibank.R_6
              FOREIGN KEY (client_id)
                             REFERENCES ibank.clients
                             ON DELETE CASCADE ;

ALTER TABLE ibank.accounts
       ADD  CONSTRAINT ibank.R_4
              FOREIGN KEY (branch_id)
                             REFERENCES ibank.init_as ;

ALTER TABLE ibank.accounts
       ADD  CONSTRAINT ibank.R_5
              FOREIGN KEY (client_id)
                             REFERENCES ibank.clients
                             ON DELETE CASCADE ;

ALTER TABLE ibank.currency_sale
       ADD  CONSTRAINT ibank.R_24
              FOREIGN KEY (client_id)
                             REFERENCES ibank.clients ;

ALTER TABLE ibank.currency_purchase
       ADD  CONSTRAINT ibank.R_19
              FOREIGN KEY (client_id)
                             REFERENCES ibank.clients ;

ALTER TABLE ibank.currency_rsale
       ADD  CONSTRAINT ibank.R_18
              FOREIGN KEY (client_id)
                             REFERENCES ibank.clients ;

ALTER TABLE ibank.currency_fsale
       ADD  CONSTRAINT ibank.R_21
              FOREIGN KEY (client_id)
                             REFERENCES ibank.clients ;

ALTER TABLE ibank.currency_payment
       ADD  CONSTRAINT ibank.R_20
              FOREIGN KEY (client_id)
                             REFERENCES ibank.clients ;

ALTER TABLE ibank.beneficiaries
       ADD  CONSTRAINT ibank.R_23
              FOREIGN KEY (client_id)
                             REFERENCES ibank.clients
                             ON DELETE CASCADE ;

ALTER TABLE ibank.clients_inbox
       ADD  CONSTRAINT ibank.R_22
              FOREIGN KEY (client_id)
                             REFERENCES ibank.clients
                             ON DELETE CASCADE ;

ALTER TABLE ibank.clients_inbox
       ADD  CONSTRAINT ibank.R_11
              FOREIGN KEY (msg_id)
                             REFERENCES ibank.outbox
                             ON DELETE CASCADE ;

ALTER TABLE ibank.swift
       ADD  CONSTRAINT ibank.R_25
              FOREIGN KEY (country_code)
                             REFERENCES ibank.countries ;
------------------------------------------------------------------------
