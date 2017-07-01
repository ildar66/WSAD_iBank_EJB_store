
-------------------- Создание таблиц ----------------------------------- 

------------'История действий с открытыми ключами ЭЦП клиентов'---------
DROP TABLE ibank.keys_history;

CREATE TABLE ibank.keys_history (
       id_key               DEC(20) NOT NULL,
       status_key           DEC(1) DEFAULT 1 NOT NULL,
       action_type          DEC(1) NOT NULL,
       action_time          DATE NOT NULL,
       sign_group           DEC(1) NOT NULL
);

COMMENT ON TABLE ibank.keys_history IS 'История действий с открытыми ключами ЭЦП клиентов';

COMMENT ON COLUMN ibank.keys_history.id_key IS 'Уникальный идентификатор открытого ключа ЭЦП клиента(сквозная нумерация по всем клиентам)';
COMMENT ON COLUMN ibank.keys_history.status_key IS 'Текущий статус ключа ЭЦП клиента:
0 - удален,
1 - блокирован,
2 - разрешен';
COMMENT ON COLUMN ibank.keys_history.action_type IS 'Описание действия над ключем ЭЦП клиента
0 - удаление,
1 - блокировка,
2 - активирование,
3 - смена группы подписи,
4 - регистрация';
COMMENT ON COLUMN ibank.keys_history.action_time IS 'Дата и время операции с открытым ключем  ЭЦП клиента';
COMMENT ON COLUMN ibank.keys_history.sign_group IS 'Группа подписи документов.
0 - нет права подписи
1 - 1-я подпись
2 - 2-я подпись
...';
------------------------------------------------------------------------
------------'Открытые ключи ЭЦП операционистов'-------------------------
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
COMMENT ON TABLE ibank.operator_keys IS 'Открытые ключи ЭЦП операционистов';

COMMENT ON COLUMN ibank.operator_keys.id_key IS 'Уникальный идентификатор открытого ключа ЭЦП операциониста';
COMMENT ON COLUMN ibank.operator_keys.operator_id IS 'Идентификатор операциониста';
COMMENT ON COLUMN ibank.operator_keys.publ_key IS 'Открытый ключ ЭЦП операциониста';
COMMENT ON COLUMN ibank.operator_keys.status_key IS 'Текущий статус ключа ЭЦП операциониста:
0 - удален,
1 - блокирован,
2 - разрешен';
COMMENT ON COLUMN ibank.operator_keys.begin_date IS 'Дата начала действия ключа ЭЦП операциониста';
COMMENT ON COLUMN ibank.operator_keys.end_date IS 'Дата окончания действия ключа ЭЦП операциониста';
COMMENT ON COLUMN ibank.operator_keys.creation_date IS 'Дата создания ключа ЭЦП операциониста';
COMMENT ON COLUMN ibank.operator_keys.notes IS 'Примечание администратора';

ALTER TABLE ibank.operator_keys
       ADD CONSTRAINT ibank.XPKoperator_keys PRIMARY KEY (id_key) ;
------------------------------------------------------------------------
------------'Информация об операционистах'------------------------------
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
COMMENT ON TABLE ibank.operators IS 'Информация об операционистах';

COMMENT ON COLUMN ibank.operators.operator_id IS 'Идентификатор операциониста';
COMMENT ON COLUMN ibank.operators.operator_name IS 'Ф.И.О. операциониста';
COMMENT ON COLUMN ibank.operators.operator_position IS 'Должность операциониста';
COMMENT ON COLUMN ibank.operators.reg_date IS 'Дата регистрации операциониста';
COMMENT ON COLUMN ibank.operators.perms IS 'Права операциониста (13 независимых прав):
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
COMMENT ON COLUMN ibank.operators.status IS 'Статус операциониста
0 - удален
1 - заблокирован
2 - активен';
COMMENT ON COLUMN ibank.operators.note IS 'Примечание';

ALTER TABLE ibank.operators
       ADD  CONSTRAINT ibank.XPKoperators PRIMARY KEY (operator_id) ;
------------------------------------------------------------------------
------------'Заявление об отказе от акцепта'----------------------------
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
COMMENT ON TABLE ibank.refuse_accepts IS 'Заявление об отказе от акцепта';

COMMENT ON COLUMN ibank.refuse_accepts.doc_id IS 'Уникальный в рамках системы идентификатор документа';
COMMENT ON COLUMN ibank.refuse_accepts.client_id IS 'Уникальный в рамках системы идентификатор клиента, создавшего документ, из таблицы clients';
COMMENT ON COLUMN ibank.refuse_accepts.date_doc IS 'Дата заявления';
COMMENT ON COLUMN ibank.refuse_accepts.DEC_doc IS 'Номер заявления';
COMMENT ON COLUMN ibank.refuse_accepts.payer_name IS 'Наименование плательщика';
COMMENT ON COLUMN ibank.refuse_accepts.payer_account IS 'Счет плательщика';
COMMENT ON COLUMN ibank.refuse_accepts.amount IS 'Сумма платежа (в единицах валюты - рублях)';
COMMENT ON COLUMN ibank.refuse_accepts.payer_bank_name IS 'Наименование банка плательщика';
COMMENT ON COLUMN ibank.refuse_accepts.payer_bank_bic IS 'БИК банка плательщика';
COMMENT ON COLUMN ibank.refuse_accepts.payer_bank_acc IS 'Корсчет банка плательщика';
COMMENT ON COLUMN ibank.refuse_accepts.rcpt_name IS 'Наименование получателя';
COMMENT ON COLUMN ibank.refuse_accepts.rcpt_account IS 'Счет получателя';
COMMENT ON COLUMN ibank.refuse_accepts.rcpt_bank_name IS 'Наименование банка получателя';
COMMENT ON COLUMN ibank.refuse_accepts.rcpt_bank_bic IS 'БИК банка получателя';
COMMENT ON COLUMN ibank.refuse_accepts.DEC_request IS 'Номер платёжного требования';
COMMENT ON COLUMN ibank.refuse_accepts.date_request IS 'Дата платёжного требования';
COMMENT ON COLUMN ibank.refuse_accepts.request_amount IS 'Сумма платёжного требования';
COMMENT ON COLUMN ibank.refuse_accepts.request_inbank_date IS 'Дата поступления требования в банк плательщика';
COMMENT ON COLUMN ibank.refuse_accepts.refuse_details IS 'Характер нарушения, пункт, номер , дата договора';
COMMENT ON COLUMN ibank.refuse_accepts.status_doc IS 'Текущее (последнее) состояние документа. Может принимать значения:
0 - новый,
1 - подписан,
2 - доставлен,
3 - на обработке,
4 - на исполнении,
5 - исполнен,
6 - отвергнут,
7 - удалён';
COMMENT ON COLUMN ibank.refuse_accepts.signers IS 'Группы подписавших персон. Содержит признак наличия подписи документа ключом определённой группы: 1 - подпись ключа группы присутствует, 0 - отсутствует. 0-й разряд соответствует ключу группы 1, 1-й группы 2 и т.д.';

ALTER TABLE ibank.refuse_accepts
       ADD  CONSTRAINT ibank.XPKrefuse_accepts PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
------------'Аккредитивы'-----------------------------------------------
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
COMMENT ON TABLE ibank.accreditivs IS 'Аккредитивы';

COMMENT ON COLUMN ibank.accreditivs.doc_id IS 'Уникальный в рамках системы идентификатор документа';
COMMENT ON COLUMN ibank.accreditivs.client_id IS 'Уникальный в рамках системы идентификатор клиента, создавшего документ, из таблицы clients';
COMMENT ON COLUMN ibank.accreditivs.date_doc IS 'Дата аккредитива';
COMMENT ON COLUMN ibank.accreditivs.DEC_doc IS 'Номер аккредитива';
COMMENT ON COLUMN ibank.accreditivs.accreditiv_type IS 'Вид аккредитива, может принимать значения:
"Почтой",
"Телеграфом",
"Электронно"
или отсутствует';
COMMENT ON COLUMN ibank.accreditivs.payer_inn IS 'ИНН плательщика';
COMMENT ON COLUMN ibank.accreditivs.payer_name IS 'Наименование плательщика';
COMMENT ON COLUMN ibank.accreditivs.payer_account IS 'Счет плательщика';
COMMENT ON COLUMN ibank.accreditivs.amount IS 'Сумма платежа (в единицах валюты - рублях)';
COMMENT ON COLUMN ibank.accreditivs.payer_bank_name IS 'Наименование банка плательщика';
COMMENT ON COLUMN ibank.accreditivs.payer_bank_bic IS 'БИК банка плательщика';
COMMENT ON COLUMN ibank.accreditivs.payer_bank_acc IS 'Корсчет банка плательщика';
COMMENT ON COLUMN ibank.accreditivs.rcpt_inn IS 'ИНН получателя';
COMMENT ON COLUMN ibank.accreditivs.rcpt_name IS 'Наименование получателя';
COMMENT ON COLUMN ibank.accreditivs.rcpt_account IS 'Счет получателя';
COMMENT ON COLUMN ibank.accreditivs.rcpt_bank_name IS 'Наименование банка получателя';
COMMENT ON COLUMN ibank.accreditivs.rcpt_bank_bic IS 'БИК банка получателя';
COMMENT ON COLUMN ibank.accreditivs.rcpt_bank_acc IS 'Корсчет банка получателя';
COMMENT ON COLUMN ibank.accreditivs.account_40901 IS 'Номер балансового счета N 40901 "Аккредитивы к оплате".';
COMMENT ON COLUMN ibank.accreditivs.type_oper IS 'Вид операции, для аккредитивов "08"';
COMMENT ON COLUMN ibank.accreditivs.term IS 'Срок действия аккредитива';
COMMENT ON COLUMN ibank.accreditivs.type_accreditiv1 IS 'Вид аккредитива 1, может принимать значения "Отзывный" или "Безотзывный"';
COMMENT ON COLUMN ibank.accreditivs.type_accreditiv2 IS 'Вид аккредитива 2, может принимать значения "Покрытый" или "Непокрытый"';
COMMENT ON COLUMN ibank.accreditivs.condition_pay IS 'Условие оплаты, может принимать значения "С акцептом" или "Без акцепта"';
COMMENT ON COLUMN ibank.accreditivs.accreditiv_details IS 'Указываются наименование товаров (работ, услуг), номер и дата договора, срок отгрузки товаров (выполнения работ, оказания услуг), грузополучатель и место назначения';
COMMENT ON COLUMN ibank.accreditivs.accreditiv_docs IS 'Наименование документов, против которых производится выплата по аккредитиву';
COMMENT ON COLUMN ibank.accreditivs.add_condition IS 'Дополнительные условия';
COMMENT ON COLUMN ibank.accreditivs.status_doc IS 'Текущее (последнее) состояние документа. Может принимать значения:
0 - новый,
1 - подписан,
2 - доставлен,
3 - на обработке,
4 - на исполнении,
5 - исполнен,
6 - отвергнут,
7 - удалён';
COMMENT ON COLUMN ibank.accreditivs.signers IS 'Группы подписавших персон. Содержит признак наличия подписи документа ключом определённой группы: 1 - подпись ключа группы присутствует, 0 - отсутствует. 0-й разряд соответствует ключу группы 1, 1-й группы 2 и т.д.';

ALTER TABLE ibank.accreditivs
       ADD  CONSTRAINT ibank.XPKaccreditivs PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
------------'Платежные требования'--------------------------------------
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
COMMENT ON TABLE ibank.payment_requests IS 'Платежные требования';

COMMENT ON COLUMN ibank.payment_requests.doc_id IS 'Уникальный в рамках системы идентификатор документа';
COMMENT ON COLUMN ibank.payment_requests.client_id IS 'Уникальный в рамках системы идентификатор клиента, создавшего документ, из таблицы clients';
COMMENT ON COLUMN ibank.payment_requests.date_doc IS 'Дата платежного требования';
COMMENT ON COLUMN ibank.payment_requests.DEC_doc IS 'Номер платежного требования';
COMMENT ON COLUMN ibank.payment_requests.payment_type IS 'Вид платежа, может принимать значения:
"Почтой",
"Телеграфом",
"Электронно"
или отсутствует';
COMMENT ON COLUMN ibank.payment_requests.payer_inn IS 'ИНН плательщика';
COMMENT ON COLUMN ibank.payment_requests.payer_name IS 'Наименование плательщика';
COMMENT ON COLUMN ibank.payment_requests.payer_account IS 'Счет плательщика';
COMMENT ON COLUMN ibank.payment_requests.amount IS 'Сумма платежа (в единицах валюты - рублях)';
COMMENT ON COLUMN ibank.payment_requests.payer_bank_name IS 'Наименование банка плательщика';
COMMENT ON COLUMN ibank.payment_requests.payer_bank_bic IS 'БИК банка плательщика';
COMMENT ON COLUMN ibank.payment_requests.payer_bank_acc IS 'Корсчет банка плательщика';
COMMENT ON COLUMN ibank.payment_requests.rcpt_inn IS 'ИНН получателя';
COMMENT ON COLUMN ibank.payment_requests.rcpt_name IS 'Наименование получателя';
COMMENT ON COLUMN ibank.payment_requests.rcpt_account IS 'Счет получателя';
COMMENT ON COLUMN ibank.payment_requests.rcpt_bank_name IS 'Наименование банка получателя';
COMMENT ON COLUMN ibank.payment_requests.rcpt_bank_bic IS 'БИК банка получателя';
COMMENT ON COLUMN ibank.payment_requests.rcpt_bank_acc IS 'Корсчет банка получателя';
COMMENT ON COLUMN ibank.payment_requests.type_oper IS 'Вид операции, для платежных требований "02"';
COMMENT ON COLUMN ibank.payment_requests.queue IS 'Код очередности платежа. Может принимать значения "01", "02", "03", "04", "05" или "06", или отсутствовать';
COMMENT ON COLUMN ibank.payment_requests.payment_details IS 'Назначение платежа';
COMMENT ON COLUMN ibank.payment_requests.condition_pay_type IS 'Вид условия оплаты. Может принимать значения:
"С акцептом",
"Без акцепта"';
COMMENT ON COLUMN ibank.payment_requests.condition_pay IS 'При списании средств без акцепта ссылка на номер, дату принятия и статью закона или номер, дату и пункт договора, предусматривающего право безакцептного списания';
COMMENT ON COLUMN ibank.payment_requests.term_accept IS 'Срок для акцепта требования в днях';
COMMENT ON COLUMN ibank.payment_requests.documents_date IS 'Дата отсылки (вручения) плательщику предусмотренных договором документов, если таковые вручались';
COMMENT ON COLUMN ibank.payment_requests.status_doc IS 'Текущее (последнее) состояние документа. Может принимать значения:
0 - новый,
1 - подписан,
2 - доставлен,
3 - на обработке,
4 - на исполнении,
5 - исполнен,
6 - отвергнут,
7 - удалён';
COMMENT ON COLUMN ibank.payment_requests.signers IS 'Группы подписавших персон. Содержит признак наличия подписи документа ключом определённой группы: 1 - подпись ключа группы присутствует, 0 - отсутствует. 0-й разряд соответствует ключу группы 1, 1-й группы 2 и т.д.';

ALTER TABLE ibank.payment_requests
       ADD   CONSTRAINT ibank.XPKpayment_request PRIMARY KEY (doc_id)  ;
------------------------------------------------------------------------
------------'Инкассовые поручения'--------------------------------------
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
COMMENT ON TABLE ibank.encashed_contracts IS 'Инкассовые поручения';
COMMENT ON COLUMN ibank.encashed_contracts.doc_id IS 'Уникальный в рамках системы идентификатор документа';
COMMENT ON COLUMN ibank.encashed_contracts.client_id IS 'Уникальный в рамках системы идентификатор клиента, создавшего документ, из таблицы clients';
COMMENT ON COLUMN ibank.encashed_contracts.date_doc IS 'Дата инкассового поручения';
COMMENT ON COLUMN ibank.encashed_contracts.DEC_doc IS 'Номер инкассового поручения';
COMMENT ON COLUMN ibank.encashed_contracts.payment_type IS 'Вид платежа, может принимать значения:
"Почтой",
"Телеграфом",
"Электронно"
 или отсутствует';
COMMENT ON COLUMN ibank.encashed_contracts.payer_inn IS 'ИНН плательщика';
COMMENT ON COLUMN ibank.encashed_contracts.payer_name IS 'Наименование плательщика';
COMMENT ON COLUMN ibank.encashed_contracts.payer_account IS 'Счет плательщика';
COMMENT ON COLUMN ibank.encashed_contracts.amount IS 'Сумма платежа (в единицах валюты - рублях)';
COMMENT ON COLUMN ibank.encashed_contracts.payer_bank_name IS 'Наименование банка плательщика';
COMMENT ON COLUMN ibank.encashed_contracts.payer_bank_bic IS 'БИК банка плательщика';
COMMENT ON COLUMN ibank.encashed_contracts.payer_bank_acc IS 'Корсчет банка плательщика';
COMMENT ON COLUMN ibank.encashed_contracts.rcpt_inn IS 'ИНН получателя';
COMMENT ON COLUMN ibank.encashed_contracts.rcpt_name IS 'Наименование получателя';
COMMENT ON COLUMN ibank.encashed_contracts.rcpt_account IS 'Счет получателя';
COMMENT ON COLUMN ibank.encashed_contracts.rcpt_bank_name IS 'Наименование банка получателя';
COMMENT ON COLUMN ibank.encashed_contracts.rcpt_bank_bic IS 'БИК банка получателя';
COMMENT ON COLUMN ibank.encashed_contracts.rcpt_bank_acc IS 'Корсчет банка получателя';
COMMENT ON COLUMN ibank.encashed_contracts.type_oper IS 'Вид операции, для инкассовых поручений "06"';
COMMENT ON COLUMN ibank.encashed_contracts.queue IS 'Код очередности платежа. Может принимать значения "01", "02", "03", "04", "05" или "06", или отсутствовать';
COMMENT ON COLUMN ibank.encashed_contracts.contract_details IS 'Назначение платежа';
COMMENT ON COLUMN ibank.encashed_contracts.status_doc IS 'Текущее (последнее) состояние документа. Может принимать значения:
0 - новый,
1 - подписан,
2 - доставлен,
3 - на обработке,
4 - на исполнении,
5 - исполнен,
6 - отвергнут,
7 - удалён';
COMMENT ON COLUMN ibank.encashed_contracts.signers IS 'Группы подписавших персон. Содержит признак наличия подписи документа ключом определённой группы: 1 - подпись ключа группы присутствует, 0 - отсутствует. 0-й разряд соответствует ключу группы 1, 1-й группы 2 и т.д.';

ALTER TABLE ibank.encashed_contracts
       ADD  CONSTRAINT ibank.XPKencashed_contr PRIMARY KEY (doc_id)  ;
------------------------------------------------------------------------
------------'Ресурсы приложений'----------------------------------------
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
COMMENT ON TABLE ibank.resources IS 'Ресурсы приложений';

COMMENT ON COLUMN ibank.resources.app_name IS 'Наименование приложения';
COMMENT ON COLUMN ibank.resources.resource_name IS 'Наименование ресурса';
COMMENT ON COLUMN ibank.resources.version IS 'Версия ресурса. Актуальна, для однотипных ресурсов, например, описания одного того же документа, одной и той же формы.';
COMMENT ON COLUMN ibank.resources.locale IS 'Локаль ресурса. Необязательный атрибут.';
COMMENT ON COLUMN ibank.resources.valid_from IS 'Дата начала действия ресурса. Необязательный атрибут, который может быть значимым для ресурсов типа определения документа, описания формы.';
COMMENT ON COLUMN ibank.resources.valid_to IS 'Дата окончания действия ресурса. Необязательный атрибут, который может быть значимым для ресурсов типа определения документа, описания формы.';
COMMENT ON COLUMN ibank.resources.type IS 'Тип ресурса';
COMMENT ON COLUMN ibank.resources.content IS 'Содержимое ресурса';

ALTER TABLE ibank.resources
       ADD   CONSTRAINT ibank.XPKresources PRIMARY KEY (app_name, resource_name, version) ;
------------------------------------------------------------------------
------------'Профили приложений пользователей.'-------------------------


DROP TABLE ibank.profiles ;

CREATE TABLE ibank.profiles (
       app_name             VARCHAR(30) NOT NULL,
       profile_name         VARCHAR(30) NOT NULL,
       id_key               DEC(20) NOT NULL,
       content              LONG VARCHAR NOT NULL,
       store_date           DATE NOT NULL 
);
COMMENT ON TABLE ibank.profiles IS 'Профили приложений пользователей.';
COMMENT ON COLUMN ibank.profiles.app_name IS 'Наименование приложения.';
COMMENT ON COLUMN ibank.profiles.profile_name IS 'Наименование профиля.';
COMMENT ON COLUMN ibank.profiles.id_key IS 'Уникальный идентификатор открытого ключа ЭЦП клиента(сквозная нумерация по всем клиентам)';
COMMENT ON COLUMN ibank.profiles.content IS 'Содержимое профиля.';
COMMENT ON COLUMN ibank.profiles.store_date IS 'Дата сохранения';

ALTER TABLE ibank.profiles
       ADD  CONSTRAINT ibank.XPKprofiles PRIMARY KEY (app_name, profile_name, id_key) ;
------------------------------------------------------------------------
------------'WAP-клиенты'--------------------------------------
DROP TABLE ibank.mobile_clients ;

CREATE TABLE ibank.mobile_clients (
       login                VARCHAR(60) NOT NULL,
       client_id            DEC(20) NOT NULL,
       password             VARCHAR(60) NOT NULL,
       begin_date           DATE ,
       end_date             DATE ,
       state                DEC(1) NOT NULL
);
COMMENT ON TABLE ibank.mobile_clients IS 'WAP-клиенты';
COMMENT ON COLUMN ibank.mobile_clients.login IS 'Логин WAP-Клиента';
COMMENT ON COLUMN ibank.mobile_clients.client_id IS 'Идентификатор клиента';
COMMENT ON COLUMN ibank.mobile_clients.password IS 'Пароль WAP-клиента';
COMMENT ON COLUMN ibank.mobile_clients.begin_date IS 'Дата начала действия логина';
COMMENT ON COLUMN ibank.mobile_clients.end_date IS 'Дата конца действия логина';
COMMENT ON COLUMN ibank.mobile_clients.state IS 'Состояние аккаунта';

ALTER TABLE ibank.mobile_clients
       ADD CONSTRAINT ibank.XPKmobile_clients PRIMARY KEY (login) ;
------------------------------------------------------------------------
------------'Справочник получателей'--------------------------------------
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
COMMENT ON TABLE ibank.recipients IS 'Справочник получателей';

COMMENT ON COLUMN ibank.recipients.id IS 'Уникальный идентификатор получателя';
COMMENT ON COLUMN ibank.recipients.client_id IS 'Идентификатор клиента';
COMMENT ON COLUMN ibank.recipients.inn IS 'ИНН получателя';
COMMENT ON COLUMN ibank.recipients.name IS 'Наименование получателя';
COMMENT ON COLUMN ibank.recipients.bic IS 'БИК банка получателя';
COMMENT ON COLUMN ibank.recipients.bill IS 'Счет получателя';
COMMENT ON COLUMN ibank.recipients.comments IS 'Текст назначения платежа';

ALTER TABLE ibank.recipients
       ADD  CONSTRAINT ibank.XPKrecipients PRIMARY KEY (id) ;
------------------------------------------------------------------------
------------'Счета новых заведённых клиентов'---------------------------
DROP TABLE ibank.new_accounts ;

CREATE TABLE ibank.new_accounts (
       branch_id            VARCHAR(20) NOT NULL,
       account              CHAR(20) NOT NULL,
       id_key               DEC(20) NOT NULL,
       create_date          DATE NOT NULL
);
COMMENT ON TABLE ibank.new_accounts IS 'Счета новых заведённых клиентов';

COMMENT ON COLUMN ibank.new_accounts.branch_id IS 'Идентификатор банка в рамках системы';
COMMENT ON COLUMN ibank.new_accounts.account IS 'Счет клиента';
COMMENT ON COLUMN ibank.new_accounts.id_key IS 'Уникальный идентификатор открытого ключа';
COMMENT ON COLUMN ibank.new_accounts.create_date IS 'Дата заведения счета клиента';
------------------------------------------------------------------------
------------'Новые клиенты системы iBank'--------------------------------------
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
COMMENT ON TABLE ibank.new_clients IS 'Новые клиенты системы iBank';
COMMENT ON COLUMN ibank.new_clients.id_key IS 'Уникальный идентификатор открытого ключа';
COMMENT ON COLUMN ibank.new_clients.date_input IS 'Дата и время предварительной регистрации';
COMMENT ON COLUMN ibank.new_clients.name_cln IS 'Наименование клиента';
COMMENT ON COLUMN ibank.new_clients.inn_cln IS 'ИНН клиента';
COMMENT ON COLUMN ibank.new_clients.fio_cln IS 'Ф.И.О. ответственного лица у клиента';
COMMENT ON COLUMN ibank.new_clients.phone_cln IS 'Телефон клиента';
COMMENT ON COLUMN ibank.new_clients.fax_cln IS 'Факс клиента';
COMMENT ON COLUMN ibank.new_clients.email_cln IS 'E-mail клиента';
COMMENT ON COLUMN ibank.new_clients.addr_cln IS 'Адрес клиента';
COMMENT ON COLUMN ibank.new_clients.okpo IS 'ОКПО клиента';
COMMENT ON COLUMN ibank.new_clients.lock_word IS 'Блокировочное слово для блокирования клиента по телефону';
COMMENT ON COLUMN ibank.new_clients.ordering_customer IS 'Наименование клиента на английском языке';
COMMENT ON COLUMN ibank.new_clients.cln_type IS 'Тип клиента
0 - Физическое лицо 
1 - Юридическое лицо';
COMMENT ON COLUMN ibank.new_clients.kpp IS 'КПП (Код постановки на учет)';
COMMENT ON COLUMN ibank.new_clients.sign_count IS 'Число подписей под документами';
------------------------------------------------------------------------
------------'Новые ключи клиентов'--------------------------------------
DROP TABLE ibank.new_keys ;

CREATE TABLE ibank.new_keys (
       id_key               DEC(20) NOT NULL,
       publ_key             LONG VARCHAR NOT NULL,
       creation_date        DATE NOT NULL,
       algorithm            VARCHAR(20) NOT NULL,
       provider             VARCHAR(20) ,
       keyspec              VARCHAR(200) NOT NULL
);
COMMENT ON TABLE ibank.new_keys IS 'Новые ключи клиентов';
COMMENT ON COLUMN ibank.new_keys.id_key IS 'Уникальный идентификатор открытого ключа';
COMMENT ON COLUMN ibank.new_keys.publ_key IS 'Открытый ключ ЭЦП клиента';
COMMENT ON COLUMN ibank.new_keys.creation_date IS 'Дата и время предварительной регистрации';
COMMENT ON COLUMN ibank.new_keys.algorithm IS 'Наименование алгоритма генерации ключа';
COMMENT ON COLUMN ibank.new_keys.provider IS 'Наименование поставщика алгоритма';
COMMENT ON COLUMN ibank.new_keys.keyspec IS 'Спецификация ключа';

ALTER TABLE ibank.new_keys
       ADD  CONSTRAINT ibank.XPKnew_keys PRIMARY KEY (id_key) ;
------------------------------------------------------------------------
------------'Справочник банков'-----------------------------------------
DROP TABLE ibank.banks ;

CREATE TABLE ibank.banks (
       bik                  CHAR(9) NOT NULL,
       bill_corr            CHAR(20) ,
       bank_name            VARCHAR(80) NOT NULL,
       city                 VARCHAR(40) ,
       delivery             VARCHAR(10) 
);
COMMENT ON TABLE ibank.banks IS 'Справочник банков';

COMMENT ON COLUMN ibank.banks.bik IS 'БИК банка';
COMMENT ON COLUMN ibank.banks.bill_corr IS 'Корсчет банка';
COMMENT ON COLUMN ibank.banks.bank_name IS 'Наименование банка';
COMMENT ON COLUMN ibank.banks.city IS 'Местонахождение банка';
COMMENT ON COLUMN ibank.banks.delivery IS 'Вид платежа (почта, телеграф, электронный)';

ALTER TABLE ibank.banks
       ADD  CONSTRAINT ibank.XPKbanks PRIMARY KEY (bik) ;
------------------------------------------------------------------------
------------'Письма'----------------------------------------------------
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
COMMENT ON TABLE ibank.letters IS 'Письма';
COMMENT ON COLUMN ibank.letters.doc_id IS 'Уникальный в рамках системы идентификатор документа';
COMMENT ON COLUMN ibank.letters.client_id IS 'Уникальный в рамках системы идентификатор клиента, создавшего документ, из таблицы clients';
COMMENT ON COLUMN ibank.letters.date_doc IS 'Дата письма';
COMMENT ON COLUMN ibank.letters.subj_letter IS 'Тема письма';
COMMENT ON COLUMN ibank.letters.letter_body IS 'Содержимое письма';
COMMENT ON COLUMN ibank.letters.status_doc IS 'Текущее (последнее) состояние документа. Может принимать значения:
0 - новый,
1 - подписан,
2 - доставлен,
3 - на обработке,
4 - на исполнении,
5 - исполнен,
6 - отвергнут,
7 - удалён';
COMMENT ON COLUMN ibank.letters.signers IS 'Группы подписавших персон. Содержит признак наличия подписи документа ключом определённой группы: 1 - подпись ключа группы присутствует, 0 - отсутствует. 0-й разряд соответствует ключу группы 1, 1-й группы 2 и т.д.';

ALTER TABLE ibank.letters
       ADD  CONSTRAINT ibank.XPKletters PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
------------'Платежные поручения'--------------------------------------
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
COMMENT ON TABLE ibank.payments IS 'Платежные поручения';

COMMENT ON COLUMN ibank.payments.doc_id IS 'Уникальный в рамках системы идентификатор документа';
COMMENT ON COLUMN ibank.payments.client_id IS 'Уникальный в рамках системы идентификатор клиента, создавшего документ, из таблицы clients';
COMMENT ON COLUMN ibank.payments.date_doc IS 'Дата платежного поручения';
COMMENT ON COLUMN ibank.payments.DEC_doc IS 'Номер платежного поручения';
COMMENT ON COLUMN ibank.payments.payment_type IS 'Вид платежа, может принимать значения:
"Почтой",
"Телеграфом",
"Электронно"
или отсутствует';
COMMENT ON COLUMN ibank.payments.payer_inn IS 'ИНН плательщика';
COMMENT ON COLUMN ibank.payments.payer_name IS 'Наименование плательщика';
COMMENT ON COLUMN ibank.payments.payer_account IS 'Счет плательщика';
COMMENT ON COLUMN ibank.payments.amount IS 'Сумма платежа (в единицах валюты - рублях)';
COMMENT ON COLUMN ibank.payments.payer_bank_name IS 'Наименование банка плательщика';
COMMENT ON COLUMN ibank.payments.payer_bank_bic IS 'БИК банка плательщика';
COMMENT ON COLUMN ibank.payments.payer_bank_acc IS 'Корсчет банка плательщика';
COMMENT ON COLUMN ibank.payments.rcpt_inn IS 'ИНН получателя';
COMMENT ON COLUMN ibank.payments.rcpt_name IS 'Наименование получателя';
COMMENT ON COLUMN ibank.payments.rcpt_account IS 'Счет получателя';
COMMENT ON COLUMN ibank.payments.rcpt_bank_name IS 'Наименование банка получателя';
COMMENT ON COLUMN ibank.payments.rcpt_bank_bic IS 'БИК банка получателя';
COMMENT ON COLUMN ibank.payments.rcpt_bank_acc IS 'Корсчет банка получателя';
COMMENT ON COLUMN ibank.payments.type_oper IS 'Вид операции, для платежных поручений "01"';
COMMENT ON COLUMN ibank.payments.queue IS 'Код очередности платежа. Может принимать значения "01", "02", "03", "04", "05" или "06", или отсутствовать';
COMMENT ON COLUMN ibank.payments.term IS 'Срок платежа';
COMMENT ON COLUMN ibank.payments.payment_details IS 'Назначение платежа';
COMMENT ON COLUMN ibank.payments.kpp IS 'КПП плательщика';
COMMENT ON COLUMN ibank.payments.status_doc IS 'Текущее (последнее) состояние документа. Может принимать значения:
0 - новый,
1 - подписан,
2 - доставлен,
3 - на обработке,
4 - на исполнении,
5 - исполнен,
6 - отвергнут,
7 - удалён';
COMMENT ON COLUMN ibank.payments.signers IS 'Группы подписавших персон. Содержит признак наличия подписи документа ключом определённой группы: 1 - подпись ключа группы присутствует, 0 - отсутствует. 0-й разряд соответствует ключу группы 1, 1-й группы 2 и т.д.';

ALTER TABLE ibank.payments
       ADD   CONSTRAINT ibank.XPKpayments PRIMARY KEY (doc_id)  ;
------------------------------------------------------------------------
------------'Открытые ключи ЭЦП клиентов'--------------------------------------
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
COMMENT ON TABLE ibank.keys IS 'Открытые ключи ЭЦП клиентов';

COMMENT ON COLUMN ibank.keys.id_key IS 'Уникальный идентификатор открытого ключа ЭЦП клиента(сквозная нумерация по всем клиентам)';
COMMENT ON COLUMN ibank.keys.client_id IS 'Идентификатор клиента';
COMMENT ON COLUMN ibank.keys.publ_key IS 'Открытый ключ ЭЦП клиента';
COMMENT ON COLUMN ibank.keys.status_key IS 'Текущий статус ключа ЭЦП клиента:
0 - удален,
1 - блокирован,
2 - разрешен';
COMMENT ON COLUMN ibank.keys.begin_date IS 'Дата начала действия ключа ЭЦП клиента';
COMMENT ON COLUMN ibank.keys.end_date IS 'Дата окончания действия ключа ЭЦП клиента';
COMMENT ON COLUMN ibank.keys.sign_group IS 'Группа подписи документов.
0 - нет права подписи
1 - 1-я подпись
2 - 2-я подпись';
COMMENT ON COLUMN ibank.keys.creation_date IS 'Дата создания ключа ЭЦП клиента';
COMMENT ON COLUMN ibank.keys.notes IS 'Примечание администратора';

ALTER TABLE ibank.keys
       ADD  CONSTRAINT ibank.XPKkeys PRIMARY KEY (id_key) ;
------------------------------------------------------------------------
------------'Счета клиентов системы'--------------------------------------
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
COMMENT ON TABLE ibank.accounts IS 'Счета клиентов системы';

COMMENT ON COLUMN ibank.accounts.branch_id IS 'Уникальный идентификатор банка или филиала, зарегистрированных в системе';
COMMENT ON COLUMN ibank.accounts.account IS 'Счет клиента';
COMMENT ON COLUMN ibank.accounts.client_id IS 'Уникальный в рамках системы идентификатор клиента, за которым зарегистрирован счёт из таблицы clients';
COMMENT ON COLUMN ibank.accounts.type_account IS 'Тип счета. Может принимать значения:
0 - расчетный,
1 - текущий,
2 - транзитный,
3 - спецтранзитный';
COMMENT ON COLUMN ibank.accounts.create_date IS 'Дата заведения счета';
COMMENT ON COLUMN ibank.accounts.create_amount IS 'Сумма на момент заведения счета (в единицах валюты)';
COMMENT ON COLUMN ibank.accounts.currency IS 'Буквенный код (USD, DEM и т.д.) валюты счёта';

ALTER TABLE ibank.accounts
       ADD   CONSTRAINT ibank.XPKaccounts PRIMARY KEY (branch_id, account)  ;
------------------------------------------------------------------------
------------'Специальные счета клиентов системы'------------------------
DROP TABLE ibank.spec_accounts ;

CREATE TABLE ibank.spec_accounts (
       branch_id            VARCHAR(20) NOT NULL,
       account              CHAR(20) NOT NULL,
       client_id            DEC(20) NOT NULL,
       type_account         DEC(1) NOT NULL,
       currency             VARCHAR(3) NOT NULL
);
COMMENT ON TABLE ibank.spec_accounts IS 'Специальные счета клиентов системы';
COMMENT ON COLUMN ibank.spec_accounts.branch_id IS 'Уникальный идентификатор банка или филиала, зарегистрированных в системе';
COMMENT ON COLUMN ibank.spec_accounts.account IS 'Счет клиента';
COMMENT ON COLUMN ibank.spec_accounts.client_id IS 'Уникальный в рамках системы идентификатор клиента, за которым зарегистрирован счёт из таблицы clients';
COMMENT ON COLUMN ibank.spec_accounts.type_account IS 'Тип счета. Может принимать значения:
5 - для обязательной продажи';
COMMENT ON COLUMN ibank.spec_accounts.currency IS 'Буквенный код (USD, DEM и т.д.) валюты счёта';
------------------------------------------------------------------------
------------'Поручение на продажу иностранной валюты'-------------------
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
COMMENT ON TABLE ibank.currency_sale IS 'Поручение на продажу иностранной валюты';
COMMENT ON COLUMN ibank.currency_sale.doc_id IS 'Уникальный в рамках системы идентификатор документа';
COMMENT ON COLUMN ibank.currency_sale.client_id IS 'Уникальный в рамках системы идентификатор клиента, создавшего документ, из таблицы clients';
COMMENT ON COLUMN ibank.currency_sale.date_doc IS 'Дата документа';
COMMENT ON COLUMN ibank.currency_sale.DEC_doc IS 'Номер документа';
COMMENT ON COLUMN ibank.currency_sale.cln_bnk_name IS 'Наименование банка клиента';
COMMENT ON COLUMN ibank.currency_sale.cln_name IS 'Наименование клиента';
COMMENT ON COLUMN ibank.currency_sale.cln_inn IS 'ИНН клиента';
COMMENT ON COLUMN ibank.currency_sale.cln_okpo IS 'ОКПО клиента';
COMMENT ON COLUMN ibank.currency_sale.cln_addr IS 'Адрес клиента';
COMMENT ON COLUMN ibank.currency_sale.cln_employee_fio IS 'Ф.И.О. ответственного сотрудника клиента';
COMMENT ON COLUMN ibank.currency_sale.cln_employee_phones IS 'Контактные телефоны ответственного сотрудника клиента';
COMMENT ON COLUMN ibank.currency_sale.sale_sum IS 'Сумма продаваемой валюты';
COMMENT ON COLUMN ibank.currency_sale.sale_currency IS 'Буквенный код (USD, DEM и т.д.) продаваемой валюты';
COMMENT ON COLUMN ibank.currency_sale.sale_account IS 'Счёт для списания продаваемой валюты';
COMMENT ON COLUMN ibank.currency_sale.sale_rate_kind IS 'Вариант выбора курса продажи валюты. Может принимать значения:
"по курсу банка", 
"по курсу биржи",
"по курсу не ниже чем"';
COMMENT ON COLUMN ibank.currency_sale.sale_rate IS 'Курс продажи валюты. Заполняется в зависимости от значения поля варианта выбора курса продажи - SALE_RATE_KIND';
COMMENT ON COLUMN ibank.currency_sale.received_sum IS 'Зачисляемая сумма рублей, вырученная от продажи валюты';
COMMENT ON COLUMN ibank.currency_sale.received_account IS 'Счет для зачисления рублей, полученных от продажи валюты. Этот счет может находиться в другом банке';
COMMENT ON COLUMN ibank.currency_sale.received_bnk_bic IS 'БИК банка, в котором открыт счет для зачисления рублей.';
COMMENT ON COLUMN ibank.currency_sale.received_bnk_account IS 'Корсчет банка, в котором открыт счет для зачисления рублей.';
COMMENT ON COLUMN ibank.currency_sale.received_bnk_name IS 'Наименование банка, в котором открыт счет для зачисления';
COMMENT ON COLUMN ibank.currency_sale.commission_account IS 'Счёт клиента, с которого списываются комиссионные расходы. Этот счёт находится в банке, в котором открыт счёт для списания валюты';
COMMENT ON COLUMN ibank.currency_sale.commission_kind IS 'Вид комиссии. Может принимать значения:
"комиссия не взимается", 
"в соответствии с тарифами банка",
"на сумму "';
COMMENT ON COLUMN ibank.currency_sale.commission_sum IS 'Сумма комиссии. Заполняется в зависимости от значения поля вида комиссии - COMMISSION_KIND';
COMMENT ON COLUMN ibank.currency_sale.commission_currency IS 'Буквенный код валюты (USD, DEM и пр.) суммы комиссии';
COMMENT ON COLUMN ibank.currency_sale.experience_date IS 'Срок действия поручения - дата включительно, до которой действительно поручение на продажу валюты';
COMMENT ON COLUMN ibank.currency_sale.added_cond IS 'Дополнительные условия по продаже валюты.';
COMMENT ON COLUMN ibank.currency_sale.status_doc IS 'Текущее (последнее) состояние документа. Может принимать значения:
0 - новый,
1 - подписан,
2 - доставлен,
3 - на обработке,
4 - на исполнении,
5 - исполнен,
6 - отвергнут,
7 - удалён';
COMMENT ON COLUMN ibank.currency_sale.signers IS 'Группы подписавших персон. Содержит признак наличия подписи документа ключом определённой группы: 1 - подпись ключа группы присутствует, 0 - отсутствует. 0-й разряд соответствует ключу группы 1, 1-й группы 2 и т.д.';

ALTER TABLE ibank.currency_sale
       ADD  CONSTRAINT ibank.XPKcurrency_sale PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
------------'Поручение на покупку иностранной валюты'--------------------------------------
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
COMMENT ON TABLE ibank.currency_purchase IS 'Поручение на покупку иностранной валюты';

COMMENT ON COLUMN ibank.currency_purchase.doc_id IS 'Уникальный в рамках системы идентификатор документа';
COMMENT ON COLUMN ibank.currency_purchase.client_id IS 'Уникальный в рамках системы идентификатор клиента, создавшего документ, из таблицы clients';
COMMENT ON COLUMN ibank.currency_purchase.date_doc IS 'Дата документа';
COMMENT ON COLUMN ibank.currency_purchase.DEC_doc IS 'Номер документа';
COMMENT ON COLUMN ibank.currency_purchase.cln_bnk_name IS 'Наименование банка клиента';
COMMENT ON COLUMN ibank.currency_purchase.cln_name IS 'Наименование клиента';
COMMENT ON COLUMN ibank.currency_purchase.cln_inn IS 'ИНН клиента';
COMMENT ON COLUMN ibank.currency_purchase.cln_okpo IS 'ОКПО клиента';
COMMENT ON COLUMN ibank.currency_purchase.cln_addr IS 'Адрес клиента';
COMMENT ON COLUMN ibank.currency_purchase.cln_employee_fio IS 'Ф.И.О. ответственного сотрудника клиента';
COMMENT ON COLUMN ibank.currency_purchase.cln_employee_phones IS 'Контактные телефоны ответственного сотрудника клиента';
COMMENT ON COLUMN ibank.currency_purchase.sale_sum IS 'Сумма рублей для покупки валюты';
COMMENT ON COLUMN ibank.currency_purchase.sale_kind IS 'Признак списания-перевода рублевых средств для покупки валюты. Имеет два значения: 
"WRITING"  - списание рублевой суммы с рублевого счёта клиента или
"TRANSFER"' ;
--"TRANSFER"- клиент предварительно перевел рублевые средства дл покупки валюты на заданный счёт с указываемыми реквизитами платежного документа';
COMMENT ON COLUMN ibank.currency_purchase.sale_account IS 'Рублевый счёт, с которого происходит списание рублевой суммы для покупки валюты';
COMMENT ON COLUMN ibank.currency_purchase.merge_doc_DEC IS 'Номер платежного документа, которым были перечислены рублевые средства для покупки валюты.';
COMMENT ON COLUMN ibank.currency_purchase.merge_doc_date IS 'Дата платежного документа, которым были перечислены рублевые средства для покупки валюты.';
COMMENT ON COLUMN ibank.currency_purchase.purchase_rate_kind IS 'Вариант выбора курса покупки валюты. Может принимать значения: 
"по курсу банка", 
"по курсу биржи",
"по курсу не выше чем"';
COMMENT ON COLUMN ibank.currency_purchase.purchase_rate IS 'Курс покупки валюты. Заполняется в зависимости от варианта выбора курса - PURCHASE_RATE_KIND';
COMMENT ON COLUMN ibank.currency_purchase.purchase_sum IS 'Сумма покупаемой валюты, зачисляемой на спецтранзитный валютный счёт (для резидентов) или текущий валютный счёт (для нерезидентов) купленной валюты';
COMMENT ON COLUMN ibank.currency_purchase.purchase_currency IS 'Буквенный код (USD, DEM и т.д.) покупаемой валюты';
COMMENT ON COLUMN ibank.currency_purchase.purchase_account IS 'Счет для зачисления покупаемой валюты (спецтранзитный для резидентов и текущий для нерезидентов)';
COMMENT ON COLUMN ibank.currency_purchase.commission_account IS 'Счет клиента, с которого списываются комисси и расходы банка на покупку валюты. Этот счет находится в банке клиента.';
COMMENT ON COLUMN ibank.currency_purchase.commission_kind IS 'Вид комиссии. Может принимать значения:
"комиссия не взимается", 
"в соответствии с тарифами банка",
"на сумму"';
COMMENT ON COLUMN ibank.currency_purchase.commission_sum IS 'Сумма комиссии. Заполняется в зависимости от значения поля вида комиссии - COMMISSION_KIND';
COMMENT ON COLUMN ibank.currency_purchase.commission_currency IS 'Буквенный код валюты (USD, DEM и пр.) суммы комиссии';
COMMENT ON COLUMN ibank.currency_purchase.experience_date IS 'Срок действия поручения - дата включительно, до которой действительно поручение на покупку валюты';
COMMENT ON COLUMN ibank.currency_purchase.added_cond IS 'Дополнительные условия по покупке валюты';
COMMENT ON COLUMN ibank.currency_purchase.purchase_basis_code IS 'Код основания покупки валюты';
COMMENT ON COLUMN ibank.currency_purchase.purchase_basis IS 'Код основания покупки валюты - текстовая информация';
COMMENT ON COLUMN ibank.currency_purchase.contract IS 'Вся информация о Договоре, контракте, соглашении, в соответствии с которым происходит покупка валюты. Как правило, указываются номер, дата и общая сумма Договора';
COMMENT ON COLUMN ibank.currency_purchase.reg_form IS 'Учетная карта импортера. Указывается номер и дата Учетной карты импортера';
COMMENT ON COLUMN ibank.currency_purchase.bargain_passport IS 'Паспорт сделки';
COMMENT ON COLUMN ibank.currency_purchase.gtd IS 'Номера ГТД';
COMMENT ON COLUMN ibank.currency_purchase.cxr_added_info IS 'Дополнительная информация для валютного контроля, не вошедшая в существующие поля';
COMMENT ON COLUMN ibank.currency_purchase.use_depo_contract IS 'Признак ссылаться или нет на депозитный договор. Может принимать значения "true" или "false"';
COMMENT ON COLUMN ibank.currency_purchase.depo_contract_DEC IS 'Номер депозитного договора';
COMMENT ON COLUMN ibank.currency_purchase.depo_contract_date IS 'Дата депозитного договора';
COMMENT ON COLUMN ibank.currency_purchase.depo_sum IS 'Депонируемая сумма рублей';
COMMENT ON COLUMN ibank.currency_purchase.depo_kind IS 'Способ депонировани. Может принимать значения:
"внесена на депозитный счет",
"поручаем депонировать со счета"';
COMMENT ON COLUMN ibank.currency_purchase.depo_from_account IS 'Счёт для списания депонируемой суммы рублей';
COMMENT ON COLUMN ibank.currency_purchase.depo_to_account IS 'Счет, на который депонируется сумма согласно депозитному договору';
COMMENT ON COLUMN ibank.currency_purchase.status_doc IS 'Текущее (последнее) состояние документа. Может принимать значения:
0 - новый,
1 - подписан,
2 - доставлен,
3 - на обработке,
4 - на исполнении,
5 - исполнен,
6 - отвергнут,
7 - удалён';
COMMENT ON COLUMN ibank.currency_purchase.signers IS 'Группы подписавших персон. Содержит признак наличия подписи документа ключом определённой группы: 1 - подпись ключа группы присутствует, 0 - отсутствует. 0-й разряд соответствует ключу группы 1, 1-й группы 2 и т.д.';

ALTER TABLE ibank.currency_purchase
       ADD  CONSTRAINT ibank.XPKcurrency_purch PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
------------'Поручение на обратную продажу иностранной валюты'----------
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
COMMENT ON TABLE ibank.currency_rsale IS 'Поручение на обратную продажу иностранной валюты';
COMMENT ON COLUMN ibank.currency_rsale.doc_id IS 'Уникальный в рамках системы идентификатор документа';
COMMENT ON COLUMN ibank.currency_rsale.client_id IS 'Уникальный в рамках системы идентификатор клиента, создавшего документ, из таблицы clients';
COMMENT ON COLUMN ibank.currency_rsale.date_doc IS 'Дата документа';
COMMENT ON COLUMN ibank.currency_rsale.DEC_doc IS 'Номер документа';
COMMENT ON COLUMN ibank.currency_rsale.cln_bnk_name IS 'Наименование банка клиента';
COMMENT ON COLUMN ibank.currency_rsale.cln_name IS 'Наименование клиента';
COMMENT ON COLUMN ibank.currency_rsale.cln_inn IS 'ИНН клиента';
COMMENT ON COLUMN ibank.currency_rsale.cln_okpo IS 'ОКПО клиента';
COMMENT ON COLUMN ibank.currency_rsale.cln_addr IS 'Адрес клиента';
COMMENT ON COLUMN ibank.currency_rsale.cln_employee_fio IS 'Ф.И.О. ответственного сотрудника клиента';
COMMENT ON COLUMN ibank.currency_rsale.cln_employee_phones IS 'Контактные телефоны ответственного сотрудника клиента';
COMMENT ON COLUMN ibank.currency_rsale.rsale_sum IS 'Сумма обратно продаваемой валюты';
COMMENT ON COLUMN ibank.currency_rsale.rsale_currency IS 'Буквенный код (USD, DEM и т.д.) обратно продаваемой валюты';
COMMENT ON COLUMN ibank.currency_rsale.rsale_account IS 'Счёт для списания обратно продаваемой валюты';
COMMENT ON COLUMN ibank.currency_rsale.rsale_rate_kind IS 'Вариант выбора курса обратной продажи. Может принимать значения:
"по курсу банка", 
"по курсу биржи",
"по курсу не ниже чем"';
COMMENT ON COLUMN ibank.currency_rsale.rsale_rate IS 'Курс обратной продажи валюты. Заполняется в зависимости от значения поля варианта выбора курса продажи - RSALE_RATE_KIND';
COMMENT ON COLUMN ibank.currency_rsale.received_sum IS 'Зачисляемая сумма рублей, вырученная от продажи валюты';
COMMENT ON COLUMN ibank.currency_rsale.received_account IS 'Счет для зачисления рублей, полученных от обратной продажи валюты. Этот счет может находиться в другом банке';
COMMENT ON COLUMN ibank.currency_rsale.received_bnk_bic IS 'БИК банка, в котором открыт рублевый счет для зачисления';
COMMENT ON COLUMN ibank.currency_rsale.received_bnk_account IS 'Корсчет банка, в котором открыт рублевый счет для зачисления';
COMMENT ON COLUMN ibank.currency_rsale.received_bnk_name IS 'Наименование банка, в котором открыт рублевый счет для зачисления';
COMMENT ON COLUMN ibank.currency_rsale.commission_account IS 'Счёт клиента, с которого списываются комиссионные расходы. Этот счёт находится в банке, в котором открыт счёт для списания валюты';
COMMENT ON COLUMN ibank.currency_rsale.commission_kind IS 'Вид комиссии. Может принимать значения:
"комиссия не взимается", 
"в соответствии с тарифами банка",
"на сумму"';
COMMENT ON COLUMN ibank.currency_rsale.commission_sum IS 'Сумма комиссии. Заполняется в зависимости от значения поля вида комиссии - COMMISSION_KIND';
COMMENT ON COLUMN ibank.currency_rsale.commission_currency IS 'Буквенный код валюты (USD, DEM и пр.) суммы комиссии';
COMMENT ON COLUMN ibank.currency_rsale.experience_date IS 'Срок действия поручения - дата включительно, до которой действительно поручение на обратную продажу валюты';
COMMENT ON COLUMN ibank.currency_rsale.added_cond IS 'Дополнительные условия по обратной продаже валюты';
COMMENT ON COLUMN ibank.currency_rsale.currency_purchase_info IS 'Информация о ранее купленной и обратно продаваемой валюте';
COMMENT ON COLUMN ibank.currency_rsale.status_doc IS 'Текущее (последнее) состояние документа. Может принимать значения:
0 - новый,
1 - подписан,
2 - доставлен,
3 - на обработке,
4 - на исполнении,
5 - исполнен,
6 - отвергнут,
7 - удалён';
COMMENT ON COLUMN ibank.currency_rsale.signers IS 'Группы подписавших персон. Содержит признак наличия подписи документа ключом определённой группы: 1 - подпись ключа группы присутствует, 0 - отсутствует. 0-й разряд соответствует ключу группы 1, 1-й группы 2 и т.д.';

ALTER TABLE ibank.currency_rsale
       ADD  CONSTRAINT ibank.XPKcurrency_rsale PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
------------'Поручение на обязательную продажу иностранной валюты'------
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
COMMENT ON TABLE ibank.currency_fsale IS 'Поручение на обязательную продажу иностранной валюты';
COMMENT ON COLUMN ibank.currency_fsale.doc_id IS 'Уникальный в рамках системы идентификатор документа';
COMMENT ON COLUMN ibank.currency_fsale.client_id IS 'Уникальный в рамках системы идентификатор клиента, создавшего документ, из таблицы clients';
COMMENT ON COLUMN ibank.currency_fsale.date_doc IS 'Дата документа';
COMMENT ON COLUMN ibank.currency_fsale.DEC_doc IS 'Номер документа';
COMMENT ON COLUMN ibank.currency_fsale.cln_bnk_name IS 'Наименование банка клиента';
COMMENT ON COLUMN ibank.currency_fsale.cln_name IS 'Наименование клиента';
COMMENT ON COLUMN ibank.currency_fsale.cln_inn IS 'ИНН клиента';
COMMENT ON COLUMN ibank.currency_fsale.cln_okpo IS 'ОКПО клиента';
COMMENT ON COLUMN ibank.currency_fsale.cln_addr IS 'Адрес клиента';
COMMENT ON COLUMN ibank.currency_fsale.cln_employee_fio IS 'Ф.И.О. ответственного сотрудника клиента';
COMMENT ON COLUMN ibank.currency_fsale.cln_employee_phones IS 'Контактные телефоны ответственного сотрудника клиента';
COMMENT ON COLUMN ibank.currency_fsale.total_sum IS 'Общая сумма валютной выручки';
COMMENT ON COLUMN ibank.currency_fsale.total_currency IS 'Буквенный код (USD, DEM и т.д.) валюты общей суммы валютной выручки';
COMMENT ON COLUMN ibank.currency_fsale.refs_1 IS 'Первый референс. Содержит номер референса, дату, сумму, код валюты.';
COMMENT ON COLUMN ibank.currency_fsale.refs_2 IS 'Второй референс. Содержит номер референса, дату, сумму, код валюты.';
COMMENT ON COLUMN ibank.currency_fsale.refs_3 IS 'Третий референс. Содержит номер референса, дату, сумму, код валюты.';
COMMENT ON COLUMN ibank.currency_fsale.refs_4 IS 'Четвертый референс. Содержит номер референса, дату, сумму, код валюты.';
COMMENT ON COLUMN ibank.currency_fsale.refs_5 IS 'Пятый референс. Содержит номер референса, дату, сумму, код валюты.';
COMMENT ON COLUMN ibank.currency_fsale.sale_account IS 'Счёт для списания экспортной выручки. Транзитный счет клиента в банке.';
COMMENT ON COLUMN ibank.currency_fsale.transfer_sum IS 'Зачисляемая сумма валюты - часть валютной выручки, которая зачисляется на текущий валютный счет.';
COMMENT ON COLUMN ibank.currency_fsale.transfer_currency IS 'Буквенный код (USD, DEM и т.д.) валюты зачисляемой суммы валюты';
COMMENT ON COLUMN ibank.currency_fsale.transfer_account IS 'Текущий валютный счет, на который зачисляется сумма transfer_sum - часть суммы валютной выручки';
COMMENT ON COLUMN ibank.currency_fsale.force_sale_sum IS 'Часть общей валютной выручки, которая зачисляется на счёт 47405xxxxxxxxxxxxxxx для обязательной продажи на валютном рынке';
COMMENT ON COLUMN ibank.currency_fsale.force_sale_currency IS 'Буквенный код (USD, DEM и т.д.) валюты суммы для обязательной продажи';
COMMENT ON COLUMN ibank.currency_fsale.force_sale_rate_kind IS 'Вариант выбора курса продажи.Может принимать значения:
"по курсу банка",
"по курсу биржи",
"по курсу не ниже чем"';
COMMENT ON COLUMN ibank.currency_fsale.force_sale_rate IS 'Курс продажи валюты. Заполняется в зависимости от значения поля варианта выбора курса продажи - FORCE_SALE_RATE_KIND';
COMMENT ON COLUMN ibank.currency_fsale.received_account IS 'Счет для зачисления рублей. Может находиться в другом банке.';
COMMENT ON COLUMN ibank.currency_fsale.received_bnk_bic IS 'БИК банка, в котором открыт счет для зачисления рублей.';
COMMENT ON COLUMN ibank.currency_fsale.received_bnk_account IS 'Корсчёт банка, в котором открыт счёт для зачисления рублей.';
COMMENT ON COLUMN ibank.currency_fsale.received_bnk_name IS 'Наименование банка, в котором открыт счёт для зачисления рублей.';
COMMENT ON COLUMN ibank.currency_fsale.commission_account IS 'Счёт клиента, с которого списываются комиссионные расходы. Этот счёт находится в банке, в котором открыт счёт для списания валюты';
COMMENT ON COLUMN ibank.currency_fsale.commission_kind IS 'Вид комиссии. Может принимать значения:
"комиссия не взимается", 
"в соответствии с тарифами банка",
"на сумму"';
COMMENT ON COLUMN ibank.currency_fsale.commission_sum IS 'Сумма комиссии. Заполняется в зависимости от значения поля вида комиссии - COMMISSION_KIND';
COMMENT ON COLUMN ibank.currency_fsale.commission_currency IS 'Буквенный код валюты (USD, DEM и пр.) суммы комиссии';
COMMENT ON COLUMN ibank.currency_fsale.experience_date IS 'Срок действия поручения - дата включительно, до которой действительно поручение на обязательную продажу валюты';
COMMENT ON COLUMN ibank.currency_fsale.added_cond IS 'Дополнительные условия по продаже валюты';
COMMENT ON COLUMN ibank.currency_fsale.payment_kind_code IS 'Код вида платежа';
COMMENT ON COLUMN ibank.currency_fsale.payment_kind_info IS 'Код вида платежа - текстовая информация';
COMMENT ON COLUMN ibank.currency_fsale.xchg_oper_type IS 'Вид валютной операции';
COMMENT ON COLUMN ibank.currency_fsale.contract IS 'Вся информация о Договоре, контракте, соглашении, в соответствии с которым происходит покупка валюты. Как правило, указываются номер, дата и общая сумма Договора';
COMMENT ON COLUMN ibank.currency_fsale.reg_form IS 'Учетная карта импортера. Указывается номер и дата Учетной карты импортера';
COMMENT ON COLUMN ibank.currency_fsale.bargain_passport IS 'Паспорт сделки';
COMMENT ON COLUMN ibank.currency_fsale.gtd IS 'Номера ГТД';
COMMENT ON COLUMN ibank.currency_fsale.cxr_added_info IS 'Дополнительная информация для валютного контроля, не вошедшая в существующие поля';
COMMENT ON COLUMN ibank.currency_fsale.force_sale_account IS 'Счет для обязательной продажи';
COMMENT ON COLUMN ibank.currency_fsale.status_doc IS 'Текущее (последнее) состояние документа. Может принимать значения:
0 - новый,
1 - подписан,
2 - доставлен,
3 - на обработке,
4 - на исполнении,
5 - исполнен,
6 - отвергнут,
7 - удалён';
COMMENT ON COLUMN ibank.currency_fsale.signers IS 'Группы подписавших персон. Содержит признак наличия подписи документа ключом определённой группы: 1 - подпись ключа группы присутствует, 0 - отсутствует. 0-й разряд соответствует ключу группы 1, 1-й группы 2 и т.д.';

ALTER TABLE ibank.currency_fsale
       ADD  CONSTRAINT ibank.XPKcurrency_fsale PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
-------------------- 'Заявление на перевод валюты' --------------------- 
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

COMMENT ON TABLE ibank.currency_payment IS 'Заявление на перевод валюты';

COMMENT ON COLUMN ibank.currency_payment.doc_id IS 'Уникальный в рамках системы идентификатор документа';
COMMENT ON COLUMN ibank.currency_payment.client_id IS 'Уникальный в рамках системы идентификатор клиента, создавшего документ, из таблицы clients';
COMMENT ON COLUMN ibank.currency_payment.date_doc IS 'Дата документа';
COMMENT ON COLUMN ibank.currency_payment.DEC_doc IS 'Номер документа';
COMMENT ON COLUMN ibank.currency_payment.payment_speed IS 'Вид перевода. Определяет срочность перевода. Может принимать значения "Обычный" или "Срочный"';
COMMENT ON COLUMN ibank.currency_payment.amount IS 'Сумма перевода';
COMMENT ON COLUMN ibank.currency_payment.amount_currency IS 'Буквенный код (USD, DEM и т.д.) валюты платежа';
COMMENT ON COLUMN ibank.currency_payment.conv_rate IS 'Курс конверсии';
COMMENT ON COLUMN ibank.currency_payment.cln_name IS 'Наименование перевододателя';
COMMENT ON COLUMN ibank.currency_payment.cln_account IS 'Счет перевододателя';
COMMENT ON COLUMN ibank.currency_payment.cln_inn IS 'ИНН перевододателя';
COMMENT ON COLUMN ibank.currency_payment.cln_country_code IS 'Код страны перевододателя';
COMMENT ON COLUMN ibank.currency_payment.cln_country IS 'Страна перевододателя';
COMMENT ON COLUMN ibank.currency_payment.cln_city IS 'Город перевододателя';
COMMENT ON COLUMN ibank.currency_payment.cln_addr IS 'Адрес перевододателя';
COMMENT ON COLUMN ibank.currency_payment.cln_employee_fio IS 'Ф.И.О. ответственного сотрудника перевододателя';
COMMENT ON COLUMN ibank.currency_payment.cln_employee_phones IS 'Контактные телефоны ответственного сотрудника перевододателя';
COMMENT ON COLUMN ibank.currency_payment.cln_bnk_name IS 'Наименование банка перевододателя';
COMMENT ON COLUMN ibank.currency_payment.cln_bnk_bic IS 'Идентификационный код банка перевододателя';
COMMENT ON COLUMN ibank.currency_payment.cln_bnk_bic_type IS 'Тип идентификационного кода банка перевододателя';
COMMENT ON COLUMN ibank.currency_payment.cln_bnk_country_code IS 'Код страны банка перевододателя';
COMMENT ON COLUMN ibank.currency_payment.cln_bnk_country IS 'Страна банка перевододателя';
COMMENT ON COLUMN ibank.currency_payment.cln_bnk_city IS 'Город банка перевододателя';
COMMENT ON COLUMN ibank.currency_payment.cln_bnk_addr IS 'Адрес банка перевододателя';
COMMENT ON COLUMN ibank.currency_payment.intermed_bnk_name IS 'Наименование банка-посредника';
COMMENT ON COLUMN ibank.currency_payment.intermed_bnk_bic IS 'Идентификационный код банка-посредника';
COMMENT ON COLUMN ibank.currency_payment.intermed_bnk_bic_type IS 'Тип идентификационного кода банка-посредника';
COMMENT ON COLUMN ibank.currency_payment.intermed_bnk_country_code IS 'Код страны банка-посредника';
COMMENT ON COLUMN ibank.currency_payment.intermed_bnk_country IS 'Страна банка-посредника';
COMMENT ON COLUMN ibank.currency_payment.intermed_bnk_city IS 'Город банка-посредника';
COMMENT ON COLUMN ibank.currency_payment.intermed_bnk_addr IS 'Адрес банка-посредника';
COMMENT ON COLUMN ibank.currency_payment.rcpt_bnk_name IS 'Наименование банка бенефициара';
COMMENT ON COLUMN ibank.currency_payment.rcpt_bnk_account IS 'Номер счета банка бенефициара';
COMMENT ON COLUMN ibank.currency_payment.rcpt_bnk_bic IS 'Идентификационный код банка бенефициара';
COMMENT ON COLUMN ibank.currency_payment.rcpt_bnk_bic_type IS 'Тип идентификационного кода банка бенефициара';
COMMENT ON COLUMN ibank.currency_payment.rcpt_bnk_country_code IS 'Код страны банка бенефициара';
COMMENT ON COLUMN ibank.currency_payment.rcpt_bnk_country IS 'Страна банка бенефициара';
COMMENT ON COLUMN ibank.currency_payment.rcpt_bnk_city IS 'Город банка бенефициара';
COMMENT ON COLUMN ibank.currency_payment.rcpt_bnk_addr IS 'Адрес банка бенефициара';
COMMENT ON COLUMN ibank.currency_payment.rcpt_name IS 'Наименование бенефициара';
COMMENT ON COLUMN ibank.currency_payment.rcpt_account IS 'Номер счета бенефициара';
COMMENT ON COLUMN ibank.currency_payment.rcpt_country_code IS 'Код страны бенефициара';
COMMENT ON COLUMN ibank.currency_payment.rcpt_country IS 'Страна бенефициара';
COMMENT ON COLUMN ibank.currency_payment.rcpt_city IS 'Город бенефициара';
COMMENT ON COLUMN ibank.currency_payment.rcpt_addr IS 'Адрес бенефициара';
COMMENT ON COLUMN ibank.currency_payment.expense_type IS 'Способ оплаты расходов по переводу. Может принимать значения:
"за наш счет",
"за счет бенефициара",
"банка за наш счёт, банков-корр. - за счет бенефициара"';
COMMENT ON COLUMN ibank.currency_payment.expense_account IS 'Счет оплаты расходов по переводу. Заполняется в случае, если расходы по переводу лежат на перевододателе';
COMMENT ON COLUMN ibank.currency_payment.payment_details IS 'Назначение платежа';
COMMENT ON COLUMN ibank.currency_payment.payment_added_info IS 'Дополнительная информация';
COMMENT ON COLUMN ibank.currency_payment.payment_kind_code IS 'Код вида платежа';
COMMENT ON COLUMN ibank.currency_payment.payment_kind_info IS 'Код вида платежа - текстовая информация';
COMMENT ON COLUMN ibank.currency_payment.render_kind_code IS 'Код вида оплаты';
COMMENT ON COLUMN ibank.currency_payment.render_kind_info IS 'Код вида оплаты - текстовая информация';
COMMENT ON COLUMN ibank.currency_payment.xchg_oper_type IS 'Вид валютной операции';
COMMENT ON COLUMN ibank.currency_payment.contract IS 'Вся информация о Договоре, контракте, соглашении, в соответствии с которым происходит покупка валюты. Как правило, указываются номер, дата и общая сумма Договора';
COMMENT ON COLUMN ibank.currency_payment.reg_form IS 'Учетная карта импортера. Указывается номер и дата Учетной карты импортера';
COMMENT ON COLUMN ibank.currency_payment.bargain_passport IS 'Паспорт сделки';
COMMENT ON COLUMN ibank.currency_payment.gtd IS 'Номера ГТД';
COMMENT ON COLUMN ibank.currency_payment.cxr_added_info IS 'Дополнительная информация для валютного контроля';
COMMENT ON COLUMN ibank.currency_payment.status_doc IS 'Текущее (последнее) состояние документа. Может принимать значения:
0 - новый,
1 - подписан,
2 - доставлен,
3 - на обработке,
4 - на исполнении,
5 - исполнен,
6 - отвергнут,
7 - удалён';
COMMENT ON COLUMN ibank.currency_payment.signers IS 'Группы подписавших персон. Содержит признак наличия подписи документа ключом определённой группы: 1 - подпись ключа группы присутствует, 0 - отсутствует. 0-й разряд соответствует ключу группы 1, 1-й группы 2 и т.д.';

ALTER TABLE ibank.currency_payment
       ADD   CONSTRAINT ibank.XPKcurrency_pay PRIMARY KEY (doc_id) ;
------------------------------------------------------------------------
-------------------- 'Справочник бенефициаров' ----------------------------------- 
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
COMMENT ON TABLE ibank.beneficiaries IS 'Справочник бенефициаров';

COMMENT ON COLUMN ibank.beneficiaries.id IS 'Уникальный идентификатор бенефициара';
COMMENT ON COLUMN ibank.beneficiaries.client_id IS 'Идентификатор клиента';
COMMENT ON COLUMN ibank.beneficiaries.intermed_bnk_name IS 'Наименование банка-посредника';
COMMENT ON COLUMN ibank.beneficiaries.intermed_bnk_bic IS 'Идентификационный код банка-посредника';
COMMENT ON COLUMN ibank.beneficiaries.intermed_bnk_bic_type IS 'Тип идентификационного кода банка-посредника';
COMMENT ON COLUMN ibank.beneficiaries.intermed_bnk_country_code IS 'Код страны банка-посредника';
COMMENT ON COLUMN ibank.beneficiaries.intermed_bnk_country IS 'Страна банка-посредника';
COMMENT ON COLUMN ibank.beneficiaries.intermed_bnk_city IS 'Город банка-посредника';
COMMENT ON COLUMN ibank.beneficiaries.intermed_bnk_addr IS 'Адрес банка-посредника';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_bnk_name IS 'Наименование банка бенефициара';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_bnk_account IS 'Номер счета банка бенефициара';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_bnk_bic IS 'Идентификационный код банка бенефициара';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_bnk_bic_type IS 'Тип идентификационного кода банка бенефициара';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_bnk_country_code IS 'Код страны банка бенефициара';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_bnk_country IS 'Страна банка бенефициара';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_bnk_city IS 'Город банка бенефициара';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_bnk_addr IS 'Адрес банка бенефициара';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_name IS 'Наименование бенефициара';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_account IS 'Номер счета бенефициара';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_country_code IS 'Код страны бенефициара';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_country IS 'Страна бенефициара';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_city IS 'Город бенефициара';
COMMENT ON COLUMN ibank.beneficiaries.rcpt_addr IS 'Адрес бенефициара';

ALTER TABLE ibank.beneficiaries
       ADD   CONSTRAINT ibank.XPKbeneficiaries PRIMARY KEY (id) ;
------------------------------------------------------------------------
-------------------- 'Назначение уведомлений клиентам' ----------------------------------- 
DROP TABLE ibank.clients_inbox ;

CREATE TABLE ibank.clients_inbox (
       msg_id               DEC(28) NOT NULL,
       client_id            DEC(20) NOT NULL,
       read_date            DATE 
);
COMMENT ON TABLE ibank.clients_inbox IS 'Назначение уведомлений клиентам';

COMMENT ON COLUMN ibank.clients_inbox.msg_id IS 'Идентификатор уведомления';
COMMENT ON COLUMN ibank.clients_inbox.client_id IS 'Идентификатор клиента';
COMMENT ON COLUMN ibank.clients_inbox.read_date IS 'Дата прочтения уведомления клиентом';

ALTER TABLE ibank.clients_inbox
       ADD   CONSTRAINT ibank.XPKclients_inbox PRIMARY KEY (msg_id, client_id) ;
------------------------------------------------------------------------
-------------------- 'Информация о клиентах' ---------------------------
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
COMMENT ON TABLE ibank.clients IS 'Информация о клиентах';
COMMENT ON COLUMN ibank.clients.client_id IS 'Идентификатор клиента';
COMMENT ON COLUMN ibank.clients.inn_cln IS 'ИНН клиента';
COMMENT ON COLUMN ibank.clients.okpo IS 'ОКПО клиента';
COMMENT ON COLUMN ibank.clients.name_cln IS 'Наименование клиента';
COMMENT ON COLUMN ibank.clients.fio_cln IS 'Ф.И.О. ответственного лица у клиента';
COMMENT ON COLUMN ibank.clients.phone_cln IS 'Телефон клиента';
COMMENT ON COLUMN ibank.clients.fax_cln IS 'Факс клиента';
COMMENT ON COLUMN ibank.clients.email_cln IS 'E-mail клиента';
COMMENT ON COLUMN ibank.clients.addr_cln IS 'Адрес клиента';
COMMENT ON COLUMN ibank.clients.DEC_dogov IS 'Номер договора Банка с Клиентом по ИКБ';
COMMENT ON COLUMN ibank.clients.reg_date IS 'Дата подключения клиента к ИКБ';
COMMENT ON COLUMN ibank.clients.perms IS 'Права клиента (13 независимых прав):
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
COMMENT ON COLUMN ibank.clients.lock_word IS 'Блокировочное слово для блокирования клиента по телефону';
COMMENT ON COLUMN ibank.clients.ordering_customer IS 'Наименование клиента на английском языке';
COMMENT ON COLUMN ibank.clients.status IS 'Статус клиента
0 - удален
1 - заблокирован
2 - активен';
COMMENT ON COLUMN ibank.clients.cln_type IS 'Тип клиента
1 - Физическое лицо 
0 - Юридическое лицо';
COMMENT ON COLUMN ibank.clients.kpp IS 'КПП (Код постановки на учет)';
COMMENT ON COLUMN ibank.clients.doc_sign_DEC IS 'Число подписей под различными типами документов. Представлено в виде битовой маски, где на каждый тип документа отведено по три бита.
1) рублевое платежное поручение - 0-2
2) письма - 3-5
--3) заявление на перевод - 6-8
--4) поручение на покупку - 9-11
--5) поручение на продажу - 12-14
--6) поручение на обязат. продажу - 15-17
Соответственно 000 - 1 подпись, 001 - 2 подписи и т.д.';
COMMENT ON COLUMN ibank.clients.ext_client_id IS 'Идентификатор клиента во внешней системе';
COMMENT ON COLUMN ibank.clients.country_code IS 'Код страны клиента';
COMMENT ON COLUMN ibank.clients.city IS 'Город местоположения клиента';
COMMENT ON COLUMN ibank.clients.city_latin IS 'Город местоположения клиента на английском';
COMMENT ON COLUMN ibank.clients.address_latin IS 'Адрес клиента на английском языке';
COMMENT ON COLUMN ibank.clients.soato IS 'СОАТО клиента';
COMMENT ON COLUMN ibank.clients.resident_flag IS 'Признак резидента';

ALTER TABLE ibank.clients
       ADD  CONSTRAINT ibank.XPKclients PRIMARY KEY (client_id) ;
------------------------------------------------------------------------
-------------------- 'Справочник банков SWIFT' ------------------------- 
DROP TABLE ibank.swift ;

CREATE TABLE ibank.swift (
       bic                  CHAR(11) NOT NULL,
       name                 VARCHAR(105) NOT NULL,
       city                 VARCHAR(40) ,
       address              VARCHAR(255) ,
       country_code         CHAR(3) 
);
COMMENT ON TABLE ibank.swift IS 'Справочник банков SWIFT';

COMMENT ON COLUMN ibank.swift.bic IS 'SWIFT код банка';
COMMENT ON COLUMN ibank.swift.name IS 'Наименование банка';
COMMENT ON COLUMN ibank.swift.city IS 'Наименование города метонахождения банка';
COMMENT ON COLUMN ibank.swift.address IS 'Адрес банка';
COMMENT ON COLUMN ibank.swift.country_code IS 'Код страны';

ALTER TABLE ibank.swift
       ADD  CONSTRAINT ibank.XPKswift PRIMARY KEY (bic) ;

------------------------------------------------------------------------
-------------------- 'Справочник стран' -------------------------------- 

DROP TABLE ibank.countries ;

CREATE TABLE ibank.countries (
       code                 CHAR(3) NOT NULL,
       country              VARCHAR(70) NOT NULL,
       iso_code             CHAR(2) NOT NULL,
       eng_name             VARCHAR(70) NOT NULL
);
COMMENT ON TABLE ibank.countries IS 'Справочник стран';

COMMENT ON COLUMN ibank.countries.code IS 'Код страны';
COMMENT ON COLUMN ibank.countries.country IS 'Наименование страны';
COMMENT ON COLUMN ibank.countries.iso_code IS 'Код страны ISO';
COMMENT ON COLUMN ibank.countries.eng_name IS 'Наименование страны на английском';

ALTER TABLE ibank.countries
       ADD  CONSTRAINT ibank.XPKcountries PRIMARY KEY (code) ;

------------------------------------------------------------------------
-------------------- 'Справочник валют' ----------------------------------- 

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
COMMENT ON TABLE ibank.currency IS 'Справочник валют';
COMMENT ON COLUMN ibank.currency.code_currency IS 'Буквенный код валюты (USD, DEM и пр.)';
COMMENT ON COLUMN ibank.currency.currency IS 'Валюта (обозначение - USD, DEM и пр.)';
COMMENT ON COLUMN ibank.currency.name IS 'Наименование - именительный падеж';
COMMENT ON COLUMN ibank.currency.namev IS 'Наименование - винительный падеж';
COMMENT ON COLUMN ibank.currency.namer IS 'Наименование - родительынй падеж';
COMMENT ON COLUMN ibank.currency.namep IS 'Наименование - предложный падеж';
COMMENT ON COLUMN ibank.currency.recalc IS 'Банковский счет пересчета курса для валюты';
COMMENT ON COLUMN ibank.currency.decimals IS 'Число знаков после запятой';

ALTER TABLE ibank.currency
       ADD  CONSTRAINT ibank.XPKcurrency PRIMARY KEY (code_currency) ;
------------------------------------------------------------------------
-------------------- 'Курс валют' ----------------------------------- 
DROP TABLE ibank.currency_rates ;

CREATE TABLE ibank.currency_rates (
       rate_date            DATE NOT NULL,
       code                 CHAR(3) NOT NULL,
       cbr_rate             DEC(6,4) ,
       mmvb_rate            DEC(6,4) 
);
COMMENT ON TABLE ibank.currency_rates IS 'Курс валют';
COMMENT ON COLUMN ibank.currency_rates.rate_date IS 'Дата курса';
COMMENT ON COLUMN ibank.currency_rates.code IS 'Код валюты';
COMMENT ON COLUMN ibank.currency_rates.cbr_rate IS 'Курс Центробанка';
COMMENT ON COLUMN ibank.currency_rates.mmvb_rate IS 'Курс ММВБ';

ALTER TABLE ibank.currency_rates
       ADD  CONSTRAINT ibank.XPKcurrency_rates PRIMARY KEY (rate_date, code) ;

------------------------------------------------------------------------
-------------------- 'Операции по счетам клиентов' ----------------------------------- 

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
COMMENT ON TABLE ibank.opers IS 'Операции по счетам клиентов';

COMMENT ON COLUMN ibank.opers.branch_id IS 'Уникальный идентификатор банка или филиала, зарегистрированных в системе';
COMMENT ON COLUMN ibank.opers.account IS 'Счет клиента';
COMMENT ON COLUMN ibank.opers.id_oper IS 'Идентификатор проводки';
COMMENT ON COLUMN ibank.opers.oper_date IS 'Дата операции';
COMMENT ON COLUMN ibank.opers.oper_code IS 'Код операции';
COMMENT ON COLUMN ibank.opers.doc_DEC IS 'Номер документа';
COMMENT ON COLUMN ibank.opers.doc_date IS 'Дата документа';
COMMENT ON COLUMN ibank.opers.corr_inn IS 'ИНН корреспондента';
COMMENT ON COLUMN ibank.opers.corr_name IS 'Наименование корреспондента';
COMMENT ON COLUMN ibank.opers.corr_acc IS 'Счет корреспондента';
COMMENT ON COLUMN ibank.opers.corr_bank_bic IS 'БИК банка корреспондента';
COMMENT ON COLUMN ibank.opers.corr_bank_acc IS 'Корсчет банка корреспондента';
COMMENT ON COLUMN ibank.opers.corr_bank_name IS 'Наименование банка корреспондента';
COMMENT ON COLUMN ibank.opers.oper_amount IS 'Сумма операции (+ кредит, - дебет)';
COMMENT ON COLUMN ibank.opers.oper_details IS 'Назначение платежа';
COMMENT ON COLUMN ibank.opers.rur_oper_amount IS 'Рублёвое покрытие операции';
------------------------------------------------------------------------
-------------------- 'Свойства системы' ----------------------------------- 
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
COMMENT ON TABLE ibank.init_as IS 'Свойства системы';

COMMENT ON COLUMN ibank.init_as.branch_id IS 'Идентификатор банка в рамках системы';
COMMENT ON COLUMN ibank.init_as.bik IS 'БИК банка';
COMMENT ON COLUMN ibank.init_as.version IS 'Версия системы iBank';
COMMENT ON COLUMN ibank.init_as.eng_name IS 'Наименование банка на английском';
COMMENT ON COLUMN ibank.init_as.app_name IS 'Наименование приложения';
COMMENT ON COLUMN ibank.init_as.content_type IS 'Тип содержимого';
COMMENT ON COLUMN ibank.init_as.content IS 'Содержимое (профиль приложения по умолчанию)';
COMMENT ON COLUMN ibank.init_as.swift IS 'SWIFT код банка';
COMMENT ON COLUMN ibank.init_as.address IS 'Адрес банка';
COMMENT ON COLUMN ibank.init_as.city_latin IS 'Город банка на английском языке (Требуется указывать если отсутствует SWIFT код банка)';
COMMENT ON COLUMN ibank.init_as.address_latin IS 'Адрес банка на английском языке (требуется указывать если отсутствует SWIFT код банка)';

ALTER TABLE ibank.init_as
       ADD  CONSTRAINT ibank.XPKinit_as PRIMARY KEY (branch_id) ;
------------------------------------------------------------------------
-------------------- 'Уведомления для клиентов' ----------------------------------- 
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
COMMENT ON TABLE ibank.outbox IS 'Уведомления для клиентов';
COMMENT ON COLUMN ibank.outbox.msg_id IS 'Уникальный в рамках системы идентификатор уведомления';
COMMENT ON COLUMN ibank.outbox.msg_DEC IS 'Номер уведомления';
COMMENT ON COLUMN ibank.outbox.msg_date IS 'Дата отправки уведомления';
COMMENT ON COLUMN ibank.outbox.create_date IS 'Дата создания уведомления';
COMMENT ON COLUMN ibank.outbox.subject IS 'Заголовок созданного уведомления';
COMMENT ON COLUMN ibank.outbox.body IS 'Содержимое уведомления';
COMMENT ON COLUMN ibank.outbox.status_doc IS 'Состояние уведомления. Может принимать значения:
0 - новое,
5 - отправлено,
7 - удалено';

ALTER TABLE ibank.outbox
       ADD  CONSTRAINT ibank.XPKoutbox PRIMARY KEY (msg_id) ;
------------------------------------------------------------------------
-------------------- 'История по документам' ----------------------------------- 
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
COMMENT ON TABLE ibank.docs_hist IS 'История по документам.';
COMMENT ON COLUMN ibank.docs_hist.subject_type IS 'Тип субъекта, совершившего действие. Может принимать значения:
0 - Клиент,
1 - Операционист, 
2 - Конвертор';
COMMENT ON COLUMN ibank.docs_hist.subject_id IS 'Идентификатор субъекта, совершившего действие - идентификатор ключа ЭЦП. (Этот идентификатор присутствует, если тип клиента cовершившего действие subject_type = 0 - Клиент)';
COMMENT ON COLUMN ibank.docs_hist.subject_owner IS 'Владелец ключа ЭЦП. Персона, за которой зарегистрирован ключ ЭЦП(Присутствует, если тип клиента cовершившего действие subject_type = 0 - Клиент)';
COMMENT ON COLUMN ibank.docs_hist.subject_sign IS 'Подпись субъекта под документом. (Присутствует, если subject_type - Клиент совершает действие - action подпись документа)';
COMMENT ON COLUMN ibank.docs_hist.group_sign IS 'Группа подписи субъекта совершившего подпись (Присутствует, если subject_type - Клиент совершает действие - action подпись документа)';
COMMENT ON COLUMN ibank.docs_hist.doc_type IS 'Тип документа, над которым совершено действие. Может принимать значения: 
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
COMMENT ON COLUMN ibank.docs_hist.doc_id IS 'Уникальный идентификатор документа в системе.';
COMMENT ON COLUMN ibank.docs_hist.action IS 'Тип действия над документом.Может принимать значения:
0 - сохранить,
1 - подписать,
2 - экспортировать во внешнюю систему,
3 - исполнить,
4 - отвергнуть,
5 - удалить.';
COMMENT ON COLUMN ibank.docs_hist.act_time IS 'Момент времени совершения действия';
COMMENT ON COLUMN ibank.docs_hist.doc_status IS 'Результат действия(состояние документа). Может принимать значения:
0 - новый,
1 - подписан,
2 - доставлен,
3 - на обработке,
4 - на исполнении,
5 - исполнен,
6 - отвергнут,
7 - удалён';
COMMENT ON COLUMN ibank.docs_hist.doc_status_desc IS 'Описание состояния документа.Содержит расширенное описание состояния документа, например основание отказа в исполнении документа.';
COMMENT ON COLUMN ibank.docs_hist.encoding IS 'Кодировка в которой был подписан документ';
------------------------------------------------------------------------
-------------------- 'Типы документов' ----------------------------------- 
DROP TABLE ibank.doc_types ;

CREATE TABLE ibank.doc_types (
       id                   DEC(3) NOT NULL,
       type                 VARCHAR(20) NOT NULL,
       description          VARCHAR(255) NOT NULL,
       definition           LONG VARCHAR NOT NULL,
       database_table       VARCHAR(20) NOT NULL
);
COMMENT ON TABLE ibank.doc_types IS 'Типы документов';

COMMENT ON COLUMN ibank.doc_types.ID IS 'Идентификатор';
COMMENT ON COLUMN ibank.doc_types.Type IS 'Тип документа';
COMMENT ON COLUMN ibank.doc_types.Description IS 'Описание типа';
COMMENT ON COLUMN ibank.doc_types.Definition IS 'Определение типа';
COMMENT ON COLUMN ibank.doc_types.Database_Table IS 'Таблица в базе данных';

ALTER TABLE ibank.doc_types
       ADD  CONSTRAINT ibank.XPKdoc_types PRIMARY KEY (ID) ;
------------------------------------------------------------------------
-------------------- 'Аттачменты к документам' ----------------------------------- 
DROP TABLE ibank.attachments ;

CREATE TABLE ibank.attachments (
       doc_id               DEC(28) NOT NULL,
       doc_type             VARCHAR(20) NOT NULL,
       name                 VARCHAR(128) NOT NULL,
       type                 VARCHAR(20) ,
       att_size             DEC(10) NOT NULL,
       content              LONG VARCHAR NOT NULL
);
COMMENT ON TABLE ibank.attachments IS 'Аттачменты к документам';

COMMENT ON COLUMN ibank.attachments.doc_id IS 'Идентификатор документа';
COMMENT ON COLUMN ibank.attachments.doc_type IS 'Тип документа';
COMMENT ON COLUMN ibank.attachments.name IS 'Наименование аттачмента';
COMMENT ON COLUMN ibank.attachments.type IS 'Тип аттачмента';
COMMENT ON COLUMN ibank.attachments.att_size IS 'Размер аттачмента';
COMMENT ON COLUMN ibank.attachments.content IS 'Содержимое аттачмента';

ALTER TABLE ibank.attachments
       ADD  CONSTRAINT ibank.XPKattachments PRIMARY KEY (doc_id, doc_type, name) ;
------------------------------------------------------------------------
-------------------- Связи таблиц. ----------------------------------- 
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
