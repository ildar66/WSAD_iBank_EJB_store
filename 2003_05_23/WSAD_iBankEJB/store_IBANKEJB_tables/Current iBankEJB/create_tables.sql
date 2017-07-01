--------------------------- Создание таблиц IBANK-----------------------

CONNECT RESET;

-------------------- Создание базы IBANK-------------------------------- 

CREATE DATABASE IBANKEJB;

CONNECT TO IBANKEJB;

CREATE SCHEMA ILDAR;
------------------------------------------------------------------------

-------------------- Создание таблиц ----------------------------------- 
-------------------- 'Информация о клиентах' ---------------------------
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
COMMENT ON TABLE ildar.clients IS 'Информация о клиентах';

COMMENT ON COLUMN ildar.clients.client_id IS 'Идентификатор клиента';
COMMENT ON COLUMN ildar.clients.inn_cln IS 'ИНН клиента';
COMMENT ON COLUMN ildar.clients.okpo IS 'ОКПО клиента';
COMMENT ON COLUMN ildar.clients.name_cln IS 'Наименование клиента';
COMMENT ON COLUMN ildar.clients.fio_cln IS 'Ф.И.О. ответственного лица у клиента';
COMMENT ON COLUMN ildar.clients.phone_cln IS 'Телефон клиента';
COMMENT ON COLUMN ildar.clients.fax_cln IS 'Факс клиента';
COMMENT ON COLUMN ildar.clients.email_cln IS 'E-mail клиента';
COMMENT ON COLUMN ildar.clients.num_dogov IS 'Номер договора Банка с Клиентом по ИКБ';
COMMENT ON COLUMN ildar.clients.reg_date IS 'Дата подключения клиента к ИКБ';
COMMENT ON COLUMN ildar.clients.perms IS 'Права клиента (13 независимых прав):
1 бит - Рублёвые выписки
2 бит - Рублёвые платёжки
3 бит - Письма
4 бит - Валютные выписки
5 бит - Заявление на перевод
6 бит - Поручение на обязательную продажу
7 бит - Заявка на покупку валюты ';
--8 бит - Заявка на продажу валюты
--9 бит - Платежные требования
--10 бит - Аккредитивы 
--11 бит - Инкассовые поручения
--12 бит - Заявления об отказе от акцепта
--13 бит - Поручения на обратную продажу валюты';
COMMENT ON COLUMN ildar.clients.lock_word IS 'Блокировочное слово для блокирования клиента по телефону';
COMMENT ON COLUMN ildar.clients.ordering_customer IS 'Наименование клиента на английском языке';
COMMENT ON COLUMN ildar.clients.status IS 'Статус клиента
0 - удален
1 - заблокирован
2 - активен';
COMMENT ON COLUMN ildar.clients.cln_type IS 'Тип клиента
1 - Физическое лицо 
0 - Юридическое лицо';
COMMENT ON COLUMN ildar.clients.kpp IS 'КПП (Код постановки на учет)';
COMMENT ON COLUMN ildar.clients.doc_sign_num IS 'Число подписей под различными типами документов. Представлено в виде битовой маски, где на каждый тип документа отведено по три бита.
1) рублевое платежное поручение - 0-2
2) письма - 3-5
--3) заявление на перевод - 6-8
--4) поручение на покупку - 9-11
--5) поручение на продажу - 12-14
--6) поручение на обязат. продажу - 15-17
Соответственно 000 - 1 подпись, 001 - 2 подписи и т.д.';
COMMENT ON COLUMN ildar.clients.ext_client_id IS 'Идентификатор клиента во внешней системе';
COMMENT ON COLUMN ildar.clients.soato IS 'СОАТО клиента';
COMMENT ON COLUMN ildar.clients.resident_flag IS 'Признак резидента';

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
COMMENT ON TABLE ildar.address IS 'Адресс клиента';

COMMENT ON COLUMN ildar.address.client_id IS 'Идентификатор клиента';
COMMENT ON COLUMN ildar.address.addr_cln IS 'Адрес клиента';
COMMENT ON COLUMN ildar.address.country_code IS 'Код страны клиента';
COMMENT ON COLUMN ildar.address.city IS 'Город местоположения клиента';
COMMENT ON COLUMN ildar.address.city_latin IS 'Город местоположения клиента на английском';
COMMENT ON COLUMN ildar.address.address_latin IS 'Адрес клиента на английском языке';

ALTER TABLE ildar.address
       ADD  CONSTRAINT XPKaddress PRIMARY KEY (client_id) ;

ALTER TABLE ildar.adress
       ADD  CONSTRAINT "AddressClient" FOREIGN KEY (client_id)
       REFERENCES ildar.clients ON DELETE RESTRICT;
------------------------------------------------------------------------
------------'Справочник банков'-----------------------------------------
--DROP TABLE ildar.banks ;

CREATE TABLE ildar.banks (
       bik                  CHAR(9) NOT NULL,
       bill_corr            CHAR(20) ,
       bank_name            VARCHAR(80) NOT NULL,
       city                 VARCHAR(40) ,
       delivery             VARCHAR(10) 
);
COMMENT ON TABLE ildar.banks IS 'Справочник банков';

COMMENT ON COLUMN ildar.banks.bik IS 'БИК банка';
COMMENT ON COLUMN ildar.banks.bill_corr IS 'Корсчет банка';
COMMENT ON COLUMN ildar.banks.bank_name IS 'Наименование банка';
COMMENT ON COLUMN ildar.banks.city IS 'Местонахождение банка';
COMMENT ON COLUMN ildar.banks.delivery IS 'Вид платежа (почта, телеграф, электронный)';

ALTER TABLE ildar.banks
       ADD  CONSTRAINT XPKbanks PRIMARY KEY (bik) ;
------------------------------------------------------------------------
------------'Справочник получателей'------------------------------------
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
COMMENT ON TABLE ildar.recipients IS 'Справочник получателей';

COMMENT ON COLUMN ildar.recipients.id IS 'Уникальный идентификатор получателя';
COMMENT ON COLUMN ildar.recipients.client_id IS 'Идентификатор клиента';
COMMENT ON COLUMN ildar.recipients.inn IS 'ИНН получателя';
COMMENT ON COLUMN ildar.recipients.name IS 'Наименование получателя';
COMMENT ON COLUMN ildar.recipients.bic IS 'БИК банка получателя';
COMMENT ON COLUMN ildar.recipients.bill IS 'Счет получателя';
COMMENT ON COLUMN ildar.recipients.comments IS 'Текст назначения платежа';

ALTER TABLE ildar.recipients
       ADD  CONSTRAINT XPKrecipients PRIMARY KEY (id) ;

ALTER TABLE ildar.recipients
       ADD  CONSTRAINT "RecipientsClient" FOREIGN KEY (client_id)
       REFERENCES ildar.clients ON DELETE CASCADE ;
------------------------------------------------------------------------
-------------------- 'Свойства системы' -------------------------------- 
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
COMMENT ON TABLE ildar.init_as IS 'Свойства системы';

COMMENT ON COLUMN ildar.init_as.branch_id IS 'Идентификатор банка в рамках системы';
COMMENT ON COLUMN ildar.init_as.bik IS 'БИК банка';
COMMENT ON COLUMN ildar.init_as.version IS 'Версия системы iBank';
COMMENT ON COLUMN ildar.init_as.eng_name IS 'Наименование банка на английском';
COMMENT ON COLUMN ildar.init_as.app_name IS 'Наименование приложения';
COMMENT ON COLUMN ildar.init_as.content_type IS 'Тип содержимого';
COMMENT ON COLUMN ildar.init_as.content IS 'Содержимое (профиль приложения по умолчанию)';
COMMENT ON COLUMN ildar.init_as.swift IS 'SWIFT код банка';
COMMENT ON COLUMN ildar.init_as.address IS 'Адрес банка';
COMMENT ON COLUMN ildar.init_as.city_latin IS 'Город банка на английском языке (Требуется указывать если отсутствует SWIFT код банка)';
COMMENT ON COLUMN ildar.init_as.address_latin IS 'Адрес банка на английском языке (требуется указывать если отсутствует SWIFT код банка)';

ALTER TABLE ildar.init_as
       ADD  CONSTRAINT XPKinit_as PRIMARY KEY (branch_id) ;
------------------------------------------------------------------------
------------'Счета клиентов системы'------------------------------------
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
COMMENT ON TABLE ildar.accounts IS 'Счета клиентов системы';

COMMENT ON COLUMN ildar.accounts.branch_id IS 'Уникальный идентификатор банка или филиала, зарегистрированных в системе';
COMMENT ON COLUMN ildar.accounts.account IS 'Счет клиента';
COMMENT ON COLUMN ildar.accounts.client_id IS 'Уникальный в рамках системы идентификатор клиента, за которым зарегистрирован счёт из таблицы clients';
COMMENT ON COLUMN ildar.accounts.type_account IS 'Тип счета. Может принимать значения:
0 - расчетный,
1 - текущий,
2 - транзитный,
3 - спецтранзитный';
COMMENT ON COLUMN ildar.accounts.create_date IS 'Дата заведения счета';
COMMENT ON COLUMN ildar.accounts.create_amount IS 'Сумма на момент заведения счета (в единицах валюты)';
COMMENT ON COLUMN ildar.accounts.currency IS 'Буквенный код (USD, DEM и т.д.) валюты счёта';

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
------------'Платежные поручения'--------------------------------------
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
COMMENT ON TABLE ildar.payments IS 'Платежные поручения';

COMMENT ON COLUMN ildar.payments.doc_id IS 'Уникальный в рамках системы идентификатор документа';
COMMENT ON COLUMN ildar.payments.client_id IS 'Уникальный в рамках системы идентификатор клиента, создавшего документ, из таблицы clients';
COMMENT ON COLUMN ildar.payments.date_doc IS 'Дата платежного поручения';
COMMENT ON COLUMN ildar.payments.num_doc IS 'Номер платежного поручения';
COMMENT ON COLUMN ildar.payments.payment_type IS 'Вид платежа, может принимать значения:
"Почтой",
"Телеграфом",
"Электронно"
или отсутствует';
COMMENT ON COLUMN ildar.payments.payer_inn IS 'ИНН плательщика';
COMMENT ON COLUMN ildar.payments.payer_name IS 'Наименование плательщика';
COMMENT ON COLUMN ildar.payments.payer_account IS 'Счет плательщика';
COMMENT ON COLUMN ildar.payments.amount IS 'Сумма платежа (в единицах валюты - рублях)';
COMMENT ON COLUMN ildar.payments.payer_bank_name IS 'Наименование банка плательщика';
COMMENT ON COLUMN ildar.payments.payer_bank_bic IS 'БИК банка плательщика';
COMMENT ON COLUMN ildar.payments.payer_bank_acc IS 'Корсчет банка плательщика';
COMMENT ON COLUMN ildar.payments.rcpt_inn IS 'ИНН получателя';
COMMENT ON COLUMN ildar.payments.rcpt_name IS 'Наименование получателя';
COMMENT ON COLUMN ildar.payments.rcpt_account IS 'Счет получателя';
COMMENT ON COLUMN ildar.payments.rcpt_bank_name IS 'Наименование банка получателя';
COMMENT ON COLUMN ildar.payments.rcpt_bank_bic IS 'БИК банка получателя';
COMMENT ON COLUMN ildar.payments.rcpt_bank_acc IS 'Корсчет банка получателя';
COMMENT ON COLUMN ildar.payments.type_oper IS 'Вид операции, для платежных поручений "01"';
COMMENT ON COLUMN ildar.payments.queue IS 'Код очередности платежа. Может принимать значения "01", "02", "03", "04", "05" или "06", или отсутствовать';
COMMENT ON COLUMN ildar.payments.term IS 'Срок платежа';
COMMENT ON COLUMN ildar.payments.payment_details IS 'Назначение платежа';
COMMENT ON COLUMN ildar.payments.kpp IS 'КПП плательщика';
COMMENT ON COLUMN ildar.payments.status_doc IS 'Текущее (последнее) состояние документа. Может принимать значения:
0 - новый,
1 - подписан,
2 - доставлен,
3 - на обработке,
4 - на исполнении,
5 - исполнен,
6 - отвергнут,
7 - удалён';
COMMENT ON COLUMN ildar.payments.signers IS 'Группы подписавших персон. Содержит признак наличия подписи документа ключом определённой группы: 1 - подпись ключа группы присутствует, 0 - отсутствует. 0-й разряд соответствует ключу группы 1, 1-й группы 2 и т.д.';

ALTER TABLE ildar.payments
       ADD   CONSTRAINT XPKpayments PRIMARY KEY (doc_id)  ;

ALTER TABLE ildar.payments
       ADD  CONSTRAINT R_13
              FOREIGN KEY (client_id)
                             REFERENCES ildar.clients ;
------------------------------------------------------------------------
-------------------- 'Справочник стран' -------------------------------- 

--DROP TABLE ildar.countries ;
CREATE TABLE ildar.countries (
       code                 CHAR(3) NOT NULL,
       country              VARCHAR(70) NOT NULL,
       iso_code             CHAR(2) NOT NULL,
       eng_name             VARCHAR(70) NOT NULL
);
COMMENT ON TABLE ildar.countries IS 'Справочник стран';

COMMENT ON COLUMN ildar.countries.code IS 'Код страны';
COMMENT ON COLUMN ildar.countries.country IS 'Наименование страны';
COMMENT ON COLUMN ildar.countries.iso_code IS 'Код страны ISO';
COMMENT ON COLUMN ildar.countries.eng_name IS 'Наименование страны на английском';

ALTER TABLE ildar.countries
       ADD  CONSTRAINT XPKcountries PRIMARY KEY (code) ;

------------------------------------------------------------------------
-------------------- 'Справочник валют' -------------------------------- 

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
COMMENT ON TABLE ildar.currency IS 'Справочник валют';
COMMENT ON COLUMN ildar.currency.code_currency IS 'Буквенный код валюты (USD, DEM и пр.)';
COMMENT ON COLUMN ildar.currency.currency IS 'Валюта (обозначение - USD, DEM и пр.)';
COMMENT ON COLUMN ildar.currency.name IS 'Наименование - именительный падеж';
COMMENT ON COLUMN ildar.currency.namev IS 'Наименование - винительный падеж';
COMMENT ON COLUMN ildar.currency.namer IS 'Наименование - родительынй падеж';
COMMENT ON COLUMN ildar.currency.namep IS 'Наименование - предложный падеж';
COMMENT ON COLUMN ildar.currency.recalc IS 'Банковский счет пересчета курса для валюты';
COMMENT ON COLUMN ildar.currency.decimals IS 'Число знаков после запятой';

ALTER TABLE ildar.currency
       ADD  CONSTRAINT XPKcurrency PRIMARY KEY (code_currency) ;
------------------------------------------------------------------------
-------------------- 'Операции по счетам клиентов' ----------------------------------- 

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
COMMENT ON TABLE ildar.opers IS 'Операции по счетам клиентов';

COMMENT ON COLUMN ildar.opers.branch_id IS 'Уникальный идентификатор банка или филиала, зарегистрированных в системе';
COMMENT ON COLUMN ildar.opers.account IS 'Счет клиента';
COMMENT ON COLUMN ildar.opers.id_oper IS 'Идентификатор проводки';
COMMENT ON COLUMN ildar.opers.oper_date IS 'Дата операции';
COMMENT ON COLUMN ildar.opers.oper_code IS 'Код операции';
COMMENT ON COLUMN ildar.opers.doc_num IS 'Номер документа';
COMMENT ON COLUMN ildar.opers.doc_date IS 'Дата документа';
COMMENT ON COLUMN ildar.opers.corr_inn IS 'ИНН корреспондента';
COMMENT ON COLUMN ildar.opers.corr_name IS 'Наименование корреспондента';
COMMENT ON COLUMN ildar.opers.corr_acc IS 'Счет корреспондента';
COMMENT ON COLUMN ildar.opers.corr_bank_bic IS 'БИК банка корреспондента';
COMMENT ON COLUMN ildar.opers.corr_bank_acc IS 'Корсчет банка корреспондента';
COMMENT ON COLUMN ildar.opers.corr_bank_name IS 'Наименование банка корреспондента';
COMMENT ON COLUMN ildar.opers.oper_amount IS 'Сумма операции (+ кредит, - дебет)';
COMMENT ON COLUMN ildar.opers.oper_details IS 'Назначение платежа';
COMMENT ON COLUMN ildar.opers.rur_oper_amount IS 'Рублёвое покрытие операции';
------------------------------------------------------------------------
------------'Аккредитивы'-----------------------------------------------
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
COMMENT ON TABLE ildar.accreditivs IS 'Аккредитивы';

COMMENT ON COLUMN ildar.accreditivs.doc_id IS 'Уникальный в рамках системы идентификатор документа';
COMMENT ON COLUMN ildar.accreditivs.client_id IS 'Уникальный в рамках системы идентификатор клиента, создавшего документ, из таблицы clients';
COMMENT ON COLUMN ildar.accreditivs.date_doc IS 'Дата аккредитива';
COMMENT ON COLUMN ildar.accreditivs.num_doc IS 'Номер аккредитива';
COMMENT ON COLUMN ildar.accreditivs.accreditiv_type IS 'Вид аккредитива, может принимать значения:
"Почтой",
"Телеграфом",
"Электронно"
или отсутствует';
COMMENT ON COLUMN ildar.accreditivs.payer_inn IS 'ИНН плательщика';
COMMENT ON COLUMN ildar.accreditivs.payer_name IS 'Наименование плательщика';
COMMENT ON COLUMN ildar.accreditivs.payer_account IS 'Счет плательщика';
COMMENT ON COLUMN ildar.accreditivs.amount IS 'Сумма платежа (в единицах валюты - рублях)';
COMMENT ON COLUMN ildar.accreditivs.payer_bank_name IS 'Наименование банка плательщика';
COMMENT ON COLUMN ildar.accreditivs.payer_bank_bic IS 'БИК банка плательщика';
COMMENT ON COLUMN ildar.accreditivs.payer_bank_acc IS 'Корсчет банка плательщика';
COMMENT ON COLUMN ildar.accreditivs.rcpt_inn IS 'ИНН получателя';
COMMENT ON COLUMN ildar.accreditivs.rcpt_name IS 'Наименование получателя';
COMMENT ON COLUMN ildar.accreditivs.rcpt_account IS 'Счет получателя';
COMMENT ON COLUMN ildar.accreditivs.rcpt_bank_name IS 'Наименование банка получателя';
COMMENT ON COLUMN ildar.accreditivs.rcpt_bank_bic IS 'БИК банка получателя';
COMMENT ON COLUMN ildar.accreditivs.rcpt_bank_acc IS 'Корсчет банка получателя';
COMMENT ON COLUMN ildar.accreditivs.account_40901 IS 'Номер балансового счета N 40901 "Аккредитивы к оплате".';
COMMENT ON COLUMN ildar.accreditivs.type_oper IS 'Вид операции, для аккредитивов "08"';
COMMENT ON COLUMN ildar.accreditivs.term IS 'Срок действия аккредитива';
COMMENT ON COLUMN ildar.accreditivs.type_accreditiv1 IS 'Вид аккредитива 1, может принимать значения "Отзывный" или "Безотзывный"';
COMMENT ON COLUMN ildar.accreditivs.type_accreditiv2 IS 'Вид аккредитива 2, может принимать значения "Покрытый" или "Непокрытый"';
COMMENT ON COLUMN ildar.accreditivs.condition_pay IS 'Условие оплаты, может принимать значения "С акцептом" или "Без акцепта"';
COMMENT ON COLUMN ildar.accreditivs.accreditiv_details IS 'Указываются наименование товаров (работ, услуг), номер и дата договора, срок отгрузки товаров (выполнения работ, оказания услуг), грузополучатель и место назначения';
COMMENT ON COLUMN ildar.accreditivs.accreditiv_docs IS 'Наименование документов, против которых производится выплата по аккредитиву';
COMMENT ON COLUMN ildar.accreditivs.add_condition IS 'Дополнительные условия';
COMMENT ON COLUMN ildar.accreditivs.status_doc IS 'Текущее (последнее) состояние документа. Может принимать значения:
0 - новый,
1 - подписан,
2 - доставлен,
3 - на обработке,
4 - на исполнении,
5 - исполнен,
6 - отвергнут,
7 - удалён';
COMMENT ON COLUMN ildar.accreditivs.signers IS 'Группы подписавших персон. Содержит признак наличия подписи документа ключом определённой группы: 1 - подпись ключа группы присутствует, 0 - отсутствует. 0-й разряд соответствует ключу группы 1, 1-й группы 2 и т.д.';

ALTER TABLE ildar.accreditivs
       ADD  CONSTRAINT XPKaccreditivs PRIMARY KEY (doc_id) ;

ALTER TABLE ildar.accreditivs
       ADD  CONSTRAINT R_15
              FOREIGN KEY (client_id)
                             REFERENCES ildar.clients ;
-----------------------------------------------------------------------------------------------------

