--------------------------- Создание таблиц IBANK-----------------------

CONNECT RESET;

-------------------- Создание базы IBANK-------------------------------- 

CONNECT TO IBANK user db2admin using ildar66;

------------------------------------------------------------------------
-------------------- Создание таблиц ----------------------------------- 

-------------------- 'Заявление на перевод валюты' --------------------- 
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

COMMENT ON TABLE ildar.currency_payment IS 'Заявление на перевод валюты';

COMMENT ON COLUMN ildar.currency_payment.doc_id IS 'Уникальный в рамках системы идентификатор документа';
COMMENT ON COLUMN ildar.currency_payment.client_id IS 'Уникальный в рамках системы идентификатор клиента, создавшего документ, из таблицы clients';
COMMENT ON COLUMN ildar.currency_payment.date_doc IS 'Дата документа';
COMMENT ON COLUMN ildar.currency_payment.num_doc IS 'Номер документа';
COMMENT ON COLUMN ildar.currency_payment.payment_speed IS 'Вид перевода. Определяет срочность перевода. Может принимать значения "Обычный" или "Срочный"';
COMMENT ON COLUMN ildar.currency_payment.amount IS 'Сумма перевода';
COMMENT ON COLUMN ildar.currency_payment.amount_currency IS 'Буквенный код (USD, DEM и т.д.) валюты платежа';
COMMENT ON COLUMN ildar.currency_payment.conv_rate IS 'Курс конверсии';
COMMENT ON COLUMN ildar.currency_payment.cln_name IS 'Наименование перевододателя';
COMMENT ON COLUMN ildar.currency_payment.cln_account IS 'Счет перевододателя';
COMMENT ON COLUMN ildar.currency_payment.cln_inn IS 'ИНН перевододателя';
COMMENT ON COLUMN ildar.currency_payment.cln_country_code IS 'Код страны перевододателя';
COMMENT ON COLUMN ildar.currency_payment.cln_country IS 'Страна перевододателя';
COMMENT ON COLUMN ildar.currency_payment.cln_city IS 'Город перевододателя';
COMMENT ON COLUMN ildar.currency_payment.cln_addr IS 'Адрес перевододателя';
COMMENT ON COLUMN ildar.currency_payment.cln_employee_fio IS 'Ф.И.О. ответственного сотрудника перевододателя';
COMMENT ON COLUMN ildar.currency_payment.cln_employee_phones IS 'Контактные телефоны ответственного сотрудника перевододателя';
COMMENT ON COLUMN ildar.currency_payment.cln_bnk_name IS 'Наименование банка перевододателя';
COMMENT ON COLUMN ildar.currency_payment.cln_bnk_bic IS 'Идентификационный код банка перевододателя';
COMMENT ON COLUMN ildar.currency_payment.cln_bnk_bic_type IS 'Тип идентификационного кода банка перевододателя';
COMMENT ON COLUMN ildar.currency_payment.cln_bnk_country_code IS 'Код страны банка перевододателя';
COMMENT ON COLUMN ildar.currency_payment.cln_bnk_country IS 'Страна банка перевододателя';
COMMENT ON COLUMN ildar.currency_payment.cln_bnk_city IS 'Город банка перевододателя';
COMMENT ON COLUMN ildar.currency_payment.cln_bnk_addr IS 'Адрес банка перевододателя';
COMMENT ON COLUMN ildar.currency_payment.intermed_bnk_name IS 'Наименование банка-посредника';
COMMENT ON COLUMN ildar.currency_payment.intermed_bnk_bic IS 'Идентификационный код банка-посредника';
COMMENT ON COLUMN ildar.currency_payment.intermed_bnk_bic_type IS 'Тип идентификационного кода банка-посредника';
COMMENT ON COLUMN ildar.currency_payment.intermed_bnk_country_code IS 'Код страны банка-посредника';
COMMENT ON COLUMN ildar.currency_payment.intermed_bnk_country IS 'Страна банка-посредника';
COMMENT ON COLUMN ildar.currency_payment.intermed_bnk_city IS 'Город банка-посредника';
COMMENT ON COLUMN ildar.currency_payment.intermed_bnk_addr IS 'Адрес банка-посредника';
COMMENT ON COLUMN ildar.currency_payment.rcpt_bnk_name IS 'Наименование банка бенефициара';
COMMENT ON COLUMN ildar.currency_payment.rcpt_bnk_account IS 'Номер счета банка бенефициара';
COMMENT ON COLUMN ildar.currency_payment.rcpt_bnk_bic IS 'Идентификационный код банка бенефициара';
COMMENT ON COLUMN ildar.currency_payment.rcpt_bnk_bic_type IS 'Тип идентификационного кода банка бенефициара';
COMMENT ON COLUMN ildar.currency_payment.rcpt_bnk_country_code IS 'Код страны банка бенефициара';
COMMENT ON COLUMN ildar.currency_payment.rcpt_bnk_country IS 'Страна банка бенефициара';
COMMENT ON COLUMN ildar.currency_payment.rcpt_bnk_city IS 'Город банка бенефициара';
COMMENT ON COLUMN ildar.currency_payment.rcpt_bnk_addr IS 'Адрес банка бенефициара';
COMMENT ON COLUMN ildar.currency_payment.rcpt_name IS 'Наименование бенефициара';
COMMENT ON COLUMN ildar.currency_payment.rcpt_account IS 'Номер счета бенефициара';
COMMENT ON COLUMN ildar.currency_payment.rcpt_country_code IS 'Код страны бенефициара';
COMMENT ON COLUMN ildar.currency_payment.rcpt_country IS 'Страна бенефициара';
COMMENT ON COLUMN ildar.currency_payment.rcpt_city IS 'Город бенефициара';
COMMENT ON COLUMN ildar.currency_payment.rcpt_addr IS 'Адрес бенефициара';
COMMENT ON COLUMN ildar.currency_payment.expense_type IS 'Способ оплаты расходов по переводу. Может принимать значения:
"за наш счет",
"за счет бенефициара",
"банка за наш счёт, банков-корр. - за счет бенефициара"';
COMMENT ON COLUMN ildar.currency_payment.expense_account IS 'Счет оплаты расходов по переводу. Заполняется в случае, если расходы по переводу лежат на перевододателе';
COMMENT ON COLUMN ildar.currency_payment.payment_details IS 'Назначение платежа';
COMMENT ON COLUMN ildar.currency_payment.payment_added_info IS 'Дополнительная информация';
COMMENT ON COLUMN ildar.currency_payment.payment_kind_code IS 'Код вида платежа';
COMMENT ON COLUMN ildar.currency_payment.payment_kind_info IS 'Код вида платежа - текстовая информация';
COMMENT ON COLUMN ildar.currency_payment.render_kind_code IS 'Код вида оплаты';
COMMENT ON COLUMN ildar.currency_payment.render_kind_info IS 'Код вида оплаты - текстовая информация';
COMMENT ON COLUMN ildar.currency_payment.xchg_oper_type IS 'Вид валютной операции';
COMMENT ON COLUMN ildar.currency_payment.contract IS 'Вся информация о Договоре, контракте, соглашении, в соответствии с которым происходит покупка валюты. Как правило, указываются номер, дата и общая сумма Договора';
COMMENT ON COLUMN ildar.currency_payment.reg_form IS 'Учетная карта импортера. Указывается номер и дата Учетной карты импортера';
COMMENT ON COLUMN ildar.currency_payment.bargain_passport IS 'Паспорт сделки';
COMMENT ON COLUMN ildar.currency_payment.gtd IS 'Номера ГТД';
COMMENT ON COLUMN ildar.currency_payment.cxr_added_info IS 'Дополнительная информация для валютного контроля';
COMMENT ON COLUMN ildar.currency_payment.status_doc IS 'Текущее (последнее) состояние документа. Может принимать значения:
0 - новый,
1 - подписан,
2 - доставлен,
3 - на обработке,
4 - на исполнении,
5 - исполнен,
6 - отвергнут,
7 - удалён';
COMMENT ON COLUMN ildar.currency_payment.signers IS 'Группы подписавших персон. Содержит признак наличия подписи документа ключом определённой группы: 1 - подпись ключа группы присутствует, 0 - отсутствует. 0-й разряд соответствует ключу группы 1, 1-й группы 2 и т.д.';

ALTER TABLE ildar.currency_payment
       ADD   CONSTRAINT XPKcurrency_pay PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
-------------------- 'Справочник бенефициаров' ----------------------------------- 
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
COMMENT ON TABLE ildar.beneficiaries IS 'Справочник бенефициаров';

COMMENT ON COLUMN ildar.beneficiaries.id IS 'Уникальный идентификатор бенефициара';
COMMENT ON COLUMN ildar.beneficiaries.client_id IS 'Идентификатор клиента';
COMMENT ON COLUMN ildar.beneficiaries.intermed_bnk_name IS 'Наименование банка-посредника';
COMMENT ON COLUMN ildar.beneficiaries.intermed_bnk_bic IS 'Идентификационный код банка-посредника';
COMMENT ON COLUMN ildar.beneficiaries.intermed_bnk_bic_type IS 'Тип идентификационного кода банка-посредника';
COMMENT ON COLUMN ildar.beneficiaries.intermed_bnk_country_code IS 'Код страны банка-посредника';
COMMENT ON COLUMN ildar.beneficiaries.intermed_bnk_country IS 'Страна банка-посредника';
COMMENT ON COLUMN ildar.beneficiaries.intermed_bnk_city IS 'Город банка-посредника';
COMMENT ON COLUMN ildar.beneficiaries.intermed_bnk_addr IS 'Адрес банка-посредника';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_bnk_name IS 'Наименование банка бенефициара';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_bnk_account IS 'Номер счета банка бенефициара';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_bnk_bic IS 'Идентификационный код банка бенефициара';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_bnk_bic_type IS 'Тип идентификационного кода банка бенефициара';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_bnk_country_code IS 'Код страны банка бенефициара';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_bnk_country IS 'Страна банка бенефициара';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_bnk_city IS 'Город банка бенефициара';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_bnk_addr IS 'Адрес банка бенефициара';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_name IS 'Наименование бенефициара';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_account IS 'Номер счета бенефициара';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_country_code IS 'Код страны бенефициара';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_country IS 'Страна бенефициара';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_city IS 'Город бенефициара';
COMMENT ON COLUMN ildar.beneficiaries.rcpt_addr IS 'Адрес бенефициара';

ALTER TABLE ildar.beneficiaries
       ADD   CONSTRAINT XPKbeneficiaries PRIMARY KEY (id) ;
------------------------------------------------------------------------
-------------------- 'Назначение уведомлений клиентам' ----------------------------------- 
DROP TABLE ildar.clients_inbox ;

CREATE TABLE ildar.clients_inbox (
       msg_id               NUM(28) NOT NULL,
       client_id            NUM(20) NOT NULL,
       read_date            DATE 
);
COMMENT ON TABLE ildar.clients_inbox IS 'Назначение уведомлений клиентам';

COMMENT ON COLUMN ildar.clients_inbox.msg_id IS 'Идентификатор уведомления';
COMMENT ON COLUMN ildar.clients_inbox.client_id IS 'Идентификатор клиента';
COMMENT ON COLUMN ildar.clients_inbox.read_date IS 'Дата прочтения уведомления клиентом';

ALTER TABLE ildar.clients_inbox
       ADD   CONSTRAINT XPKclients_inbox PRIMARY KEY (msg_id, client_id) ;
------------------------------------------------------------------------
-------------------- 'Информация о клиентах' ---------------------------
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
COMMENT ON TABLE ildar.clients IS 'Информация о клиентах';
COMMENT ON COLUMN ildar.clients.client_id IS 'Идентификатор клиента';
COMMENT ON COLUMN ildar.clients.inn_cln IS 'ИНН клиента';
COMMENT ON COLUMN ildar.clients.okpo IS 'ОКПО клиента';
COMMENT ON COLUMN ildar.clients.name_cln IS 'Наименование клиента';
COMMENT ON COLUMN ildar.clients.fio_cln IS 'Ф.И.О. ответственного лица у клиента';
COMMENT ON COLUMN ildar.clients.phone_cln IS 'Телефон клиента';
COMMENT ON COLUMN ildar.clients.fax_cln IS 'Факс клиента';
COMMENT ON COLUMN ildar.clients.email_cln IS 'E-mail клиента';
COMMENT ON COLUMN ildar.clients.addr_cln IS 'Адрес клиента';
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
COMMENT ON COLUMN ildar.clients.country_code IS 'Код страны клиента';
COMMENT ON COLUMN ildar.clients.city IS 'Город местоположения клиента';
COMMENT ON COLUMN ildar.clients.city_latin IS 'Город местоположения клиента на английском';
COMMENT ON COLUMN ildar.clients.address_latin IS 'Адрес клиента на английском языке';
COMMENT ON COLUMN ildar.clients.soato IS 'СОАТО клиента';
COMMENT ON COLUMN ildar.clients.resident_flag IS 'Признак резидента';

ALTER TABLE ildar.clients
       ADD  CONSTRAINT XPKclients PRIMARY KEY (client_id) ;
------------------------------------------------------------------------
-------------------- 'Справочник банков SWIFT' ------------------------- 
DROP TABLE ildar.swift ;

CREATE TABLE ildar.swift (
       bic                  CHAR(11) NOT NULL,
       name                 VARCHAR(105) NOT NULL,
       city                 VARCHAR(40) ,
       address              VARCHAR(255) ,
       country_code         CHAR(3) 
);
COMMENT ON TABLE ildar.swift IS 'Справочник банков SWIFT';

COMMENT ON COLUMN ildar.swift.bic IS 'SWIFT код банка';
COMMENT ON COLUMN ildar.swift.name IS 'Наименование банка';
COMMENT ON COLUMN ildar.swift.city IS 'Наименование города метонахождения банка';
COMMENT ON COLUMN ildar.swift.address IS 'Адрес банка';
COMMENT ON COLUMN ildar.swift.country_code IS 'Код страны';

ALTER TABLE ildar.swift
       ADD  CONSTRAINT XPKswift PRIMARY KEY (bic) ;

------------------------------------------------------------------------
-------------------- 'Справочник стран' -------------------------------- 

DROP TABLE ildar.countries ;

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
-------------------- 'Дата курса' ----------------------------------- 
DROP TABLE ildar.currency_rates ;

CREATE TABLE ildar.currency_rates (
       rate_date            DATE NOT NULL,
       code                 CHAR(3) NOT NULL,
       cbr_rate             NUM(6,4) ,
       mmvb_rate            NUM(6,4) 
);
COMMENT ON COLUMN ildar.currency_rates.rate_date IS 'Дата курса';
COMMENT ON COLUMN ildar.currency_rates.code IS 'Код валюты';
COMMENT ON COLUMN ildar.currency_rates.cbr_rate IS 'Курс Центробанка';
COMMENT ON COLUMN ildar.currency_rates.mmvb_rate IS 'Курс ММВБ';

ALTER TABLE ildar.currency_rates
       ADD  CONSTRAINT XPKcurrency_rates PRIMARY KEY (rate_date, code) ;

------------------------------------------------------------------------
-------------------- 'Операции по счетам клиентов' ----------------------------------- 

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
-------------------- 'Свойства системы' ----------------------------------- 
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
-------------------- 'Уведомления для клиентов' ----------------------------------- 
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
COMMENT ON TABLE ildar.outbox IS 'Уведомления для клиентов';
COMMENT ON COLUMN ildar.outbox.msg_id IS 'Уникальный в рамках системы идентификатор уведомления';
COMMENT ON COLUMN ildar.outbox.msg_num IS 'Номер уведомления';
COMMENT ON COLUMN ildar.outbox.msg_date IS 'Дата отправки уведомления';
COMMENT ON COLUMN ildar.outbox.create_date IS 'Дата создания уведомления';
COMMENT ON COLUMN ildar.outbox.subject IS 'Заголовок созданного уведомления';
COMMENT ON COLUMN ildar.outbox.body IS 'Содержимое уведомления';
COMMENT ON COLUMN ildar.outbox.status_doc IS 'Состояние уведомления. Может принимать значения:
0 - новое,
5 - отправлено,
7 - удалено';

ALTER TABLE ildar.outbox
       ADD  CONSTRAINT XPKoutbox PRIMARY KEY (msg_id) ;
------------------------------------------------------------------------
-------------------- 'История по документам' ----------------------------------- 
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
COMMENT ON TABLE ildar.docs_hist IS 'История по документам.';
COMMENT ON COLUMN ildar.docs_hist.subject_type IS 'Тип субъекта, совершившего действие. Может принимать значения:
0 - Клиент,
1 - Операционист, 
2 - Конвертор';
COMMENT ON COLUMN ildar.docs_hist.subject_id IS 'Идентификатор субъекта, совершившего действие - идентификатор ключа ЭЦП. (Этот идентификатор присутствует, если тип клиента cовершившего действие subject_type = 0 - Клиент)';
COMMENT ON COLUMN ildar.docs_hist.subject_owner IS 'Владелец ключа ЭЦП. Персона, за которой зарегистрирован ключ ЭЦП(Присутствует, если тип клиента cовершившего действие subject_type = 0 - Клиент)';
COMMENT ON COLUMN ildar.docs_hist.subject_sign IS 'Подпись субъекта под документом. (Присутствует, если subject_type - Клиент совершает действие - action подпись документа)';
COMMENT ON COLUMN ildar.docs_hist.group_sign IS 'Группа подписи субъекта совершившего подпись (Присутствует, если subject_type - Клиент совершает действие - action подпись документа)';
COMMENT ON COLUMN ildar.docs_hist.doc_type IS 'Тип документа, над которым совершено действие. Может принимать значения: 
1 - Платёжное поручение, 
2 - Заявление на перевод валюты, 
--3 - Поручение на обязательную продажу иностранной валюты, 
--4 - Поручение на покупку иностранной валюты, 
--5 - Поручение на продажу иностранной валюты, 
6 - Письмо, 
7 - Платёжное требование,  
8 - Аккредитив, 
9 - Инкассовое поручение, 
--10 - Заявление об отказе от акцепта, 
--11 - Поручение на обратную продажу иностранной валюты, 
20 - Извещение';
COMMENT ON COLUMN ildar.docs_hist.doc_id IS 'Уникальный идентификатор документа в системе.';
COMMENT ON COLUMN ildar.docs_hist.action IS 'Тип действия над документом.Может принимать значения:
0 - сохранить,
1 - подписать,
2 - экспортировать во внешнюю систему,
3 - исполнить,
4 - отвергнуть,
5 - удалить.';
COMMENT ON COLUMN ildar.docs_hist.act_time IS 'Момент времени совершения действия';
COMMENT ON COLUMN ildar.docs_hist.doc_status IS 'Результат действия(состояние документа). Может принимать значения:
0 - новый,
1 - подписан,
2 - доставлен,
3 - на обработке,
4 - на исполнении,
5 - исполнен,
6 - отвергнут,
7 - удалён';
COMMENT ON COLUMN ildar.docs_hist.doc_status_desc IS 'Описание состояния документа.Содержит расширенное описание состояния документа, например основание отказа в исполнении документа.';
COMMENT ON COLUMN ildar.docs_hist.encoding IS 'Кодировка в которой был подписан документ';
------------------------------------------------------------------------
-------------------- 'Типы документов' ----------------------------------- 
DROP TABLE ildar.doc_types ;

CREATE TABLE ildar.doc_types (
       id                   NUM(3) NOT NULL,
       type                 VARCHAR(20) NOT NULL,
       description          VARCHAR(255) NOT NULL,
       definition           LONG VARCHAR NOT NULL,
       database_table       VARCHAR(20) NOT NULL
);
COMMENT ON TABLE ildar.doc_types IS 'Типы документов';

COMMENT ON COLUMN ildar.doc_types.ID IS 'Идентификатор';
COMMENT ON COLUMN ildar.doc_types.Type IS 'Тип документа';
COMMENT ON COLUMN ildar.doc_types.Description IS 'Описание типа';
COMMENT ON COLUMN ildar.doc_types.Definition IS 'Определение типа';
COMMENT ON COLUMN ildar.doc_types.Database_Table IS 'Таблица в базе данных';

ALTER TABLE ildar.doc_types
       ADD  CONSTRAINT XPKdoc_types PRIMARY KEY (ID) ;
------------------------------------------------------------------------
-------------------- 'Аттачменты к документам' ----------------------------------- 
DROP TABLE ildar.attachments ;

CREATE TABLE ildar.attachments (
       doc_id               NUM(28) NOT NULL,
       doc_type             VARCHAR(20) NOT NULL,
       name                 VARCHAR(128) NOT NULL,
       type                 VARCHAR(20) ,
       att_size             NUM(10) NOT NULL,
       content              LONG VARCHAR NOT NULL
);
COMMENT ON TABLE ildar.attachments IS 'Аттачменты к документам';

COMMENT ON COLUMN ildar.attachments.doc_id IS 'Идентификатор документа';
COMMENT ON COLUMN ildar.attachments.doc_type IS 'Тип документа';
COMMENT ON COLUMN ildar.attachments.name IS 'Наименование аттачмента';
COMMENT ON COLUMN ildar.attachments.type IS 'Тип аттачмента';
COMMENT ON COLUMN ildar.attachments.att_size IS 'Размер аттачмента';
COMMENT ON COLUMN ildar.attachments.content IS 'Содержимое аттачмента';

ALTER TABLE ildar.attachments
       ADD  CONSTRAINT XPKattachments PRIMARY KEY (doc_id, doc_type, name) ;
------------------------------------------------------------------------
-------------------- 'Связи таблиц.' ----------------------------------- 
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
