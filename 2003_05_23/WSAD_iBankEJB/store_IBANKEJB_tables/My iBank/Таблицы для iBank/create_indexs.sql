--------------------------- Создание индексов таблиц IBANK-----------------------

CONNECT RESET;

CONNECT TO IBANK;

------------------------------------------------------------------------


CREATE UNIQUE INDEX XAK1clients ON ildar.clients
(
       name_cln                       ASC
);

CREATE UNIQUE INDEX XAK2clients ON ildar.clients
(
       num_dogov                      ASC
);

CREATE UNIQUE INDEX XAK1operators ON ildar.operators
(
       operator_name                  ASC
);

CREATE INDEX XIE1refuse_accepts ON ildar.refuse_accepts
(
       client_id                      ASC
);

CREATE INDEX XIE2refuse_accepts ON ildar.refuse_accepts
(
       num_doc                        ASC,
       date_doc                       ASC
);

CREATE INDEX XIE3refuse_accepts ON ildar.refuse_accepts
(
       date_doc                       ASC
);

CREATE INDEX XIE4refuse_accepts ON ildar.refuse_accepts
(
       status_doc                     ASC
);

CREATE INDEX XIE1accreditivs ON ildar.accreditivs
(
       client_id                      ASC
);

CREATE INDEX XIE2accreditivs ON ildar.accreditivs
(
       num_doc                        ASC,
       date_doc                       ASC
);

CREATE INDEX XIE3accreditivs ON ildar.accreditivs
(
       date_doc                       ASC
);

CREATE INDEX XIE4accreditivs ON ildar.accreditivs
(
       status_doc                     ASC
);

CREATE INDEX XIE1payment_requests ON ildar.payment_requests
(
       client_id                      ASC
);

CREATE INDEX XIE2payment_requests ON ildar.payment_requests
(
       num_doc                        ASC,
       date_doc                       ASC
);

CREATE INDEX XIE3payment_requests ON ildar.payment_requests
(
       date_doc                       ASC
);

CREATE INDEX XIE4payment_requests ON ildar.payment_requests
(
       status_doc                     ASC
);

CREATE INDEX XIE1encashed_contracts ON ildar.encashed_contracts
(
       client_id                      ASC
);

CREATE INDEX XIE2encashed_contracts ON ildar.encashed_contracts
(
       num_doc                        ASC,
       date_doc                       ASC
);

CREATE INDEX XIE3encashed_contracts ON ildar.encashed_contracts
(
       date_doc                       ASC
);

CREATE INDEX XIE4encashed_contracts ON ildar.encashed_contracts
(
       status_doc                     ASC
);

CREATE INDEX XIE1resources ON ildar.resources
(
       app_name                       ASC
);

CREATE INDEX XIE2resources ON ildar.resources
(
       Resource_Name                  ASC
);

CREATE INDEX XIE1keys ON ildar.keys
(
       client_id                      ASC
);

CREATE INDEX XIE2keys ON ildar.keys
(
       status_key                     ASC
);

CREATE INDEX XIE1operator_keys ON ildar.operator_keys
(
       operator_id                    ASC
);

CREATE INDEX XIE2operator_keys ON ildar.operator_keys
(
       status_key                     ASC
);

CREATE INDEX XIE1profiles ON ildar.profiles
(
       app_name                       ASC
);

CREATE INDEX XIE2profiles ON ildar.profiles
(
       id_key                         ASC
);

CREATE INDEX XIE1keys_history ON ildar.keys_history
(
       id_key                         ASC
);

CREATE INDEX XIE2keys_history ON ildar.keys_history
(
       id_key                         ASC,
       action_time                    ASC
);

CREATE UNIQUE INDEX XAK1mobile_clients ON ildar.mobile_clients
(
       client_id                      ASC
);

CREATE INDEX XIE1mobile_clients ON ildar.mobile_clients
(
       state                          ASC
);

CREATE INDEX XIE1recipients ON ildar.recipients
(
       client_id                      ASC
);

CREATE INDEX XIE2recipients ON ildar.recipients
(
       name                           ASC
);

CREATE INDEX XIE1beneficiaries ON ildar.beneficiaries
(
       client_id                      ASC
);

CREATE INDEX XIE2beneficiaries ON ildar.beneficiaries
(
       rcpt_name                      ASC
);

CREATE INDEX XIE1new_accounts ON ildar.new_accounts
(
       id_key                         ASC
);

CREATE INDEX XIE2new_accounts ON ildar.new_accounts
(
       account                        ASC
);

CREATE UNIQUE INDEX XAK1new_clients ON ildar.new_clients
(
       id_key                         ASC
);

CREATE INDEX XIE1new_clients ON ildar.new_clients
(
       name_cln                       ASC
);

CREATE INDEX XIE1currency_sale ON ildar.currency_sale
(
       client_id                      ASC
);

CREATE INDEX XIE2currency_sale ON ildar.currency_sale
(
       num_doc                        ASC,
       date_doc                       ASC
);

CREATE INDEX XIE3currency_sale ON ildar.currency_sale
(
       date_doc                       ASC
);

CREATE INDEX XIE4currency_sale ON ildar.currency_sale
(
       status_doc                     ASC
);

CREATE INDEX XIE1currency_purchase ON ildar.currency_purchase
(
       client_id                      ASC
);

CREATE INDEX XIE2currency_purchase ON ildar.currency_purchase
(
       num_doc                        ASC,
       date_doc                       ASC
);

CREATE INDEX XIE3currency_purchase ON ildar.currency_purchase
(
       date_doc                       ASC
);

CREATE INDEX XIE4currency_purchase ON ildar.currency_purchase
(
       status_doc                     ASC
);

CREATE INDEX XIE1currency_rsale ON ildar.currency_rsale
(
       client_id                      ASC
);

CREATE INDEX XIE2currency_rsale ON ildar.currency_rsale
(
       num_doc                        ASC,
       date_doc                       ASC
);

CREATE INDEX XIE3currency_rsale ON ildar.currency_rsale
(
       date_doc                       ASC
);

CREATE INDEX XIE4currency_rsale ON ildar.currency_rsale
(
       status_doc                     ASC
);

CREATE INDEX XIE1currency_payment ON ildar.currency_payment
(
       client_id                      ASC
);

CREATE INDEX XIE2currency_payment ON ildar.currency_payment
(
       num_doc                        ASC,
       date_doc                       ASC
);

CREATE INDEX XIE3currency_payment ON ildar.currency_payment
(
       date_doc                       ASC
);

CREATE INDEX XIE4currency_payment ON ildar.currency_payment
(
       status_doc                     ASC
);

CREATE INDEX XIE1currency_fsale ON ildar.currency_fsale
(
       client_id                      ASC
);

CREATE INDEX XIE2currency_fsale ON ildar.currency_fsale
(
       num_doc                        ASC,
       date_doc                       ASC
);

CREATE INDEX XIE3currency_fsale ON ildar.currency_fsale
(
       date_doc                       ASC
);

CREATE INDEX XIE4currency_fsale ON ildar.currency_fsale
(
       status_doc                     ASC
);

CREATE INDEX XIE1letters ON ildar.letters
(
       client_id                      ASC
);

CREATE INDEX XIE2letters ON ildar.letters
(
       date_doc                       ASC
);

CREATE INDEX XIE3letters ON ildar.letters
(
       status_doc                     ASC
);

CREATE INDEX XIE1payments ON ildar.payments
(
       client_id                      ASC
);

CREATE INDEX XIE2payments ON ildar.payments
(
       num_doc                        ASC,
       date_doc                       ASC
);

CREATE INDEX XIE3payments ON ildar.payments
(
       date_doc                       ASC
);

CREATE INDEX XIE4payments ON ildar.payments
(
       status_doc                     ASC
);

CREATE INDEX XIE1accounts ON ildar.accounts
(
       client_id                      ASC
);

CREATE INDEX XIE2accounts ON ildar.accounts
(
       account                        ASC
);

CREATE INDEX XIE1spec_accounts ON ildar.spec_accounts
(
       branch_id                      ASC,
       account                        ASC
);

CREATE INDEX XIE2spec_accounts ON ildar.spec_accounts
(
       client_id                      ASC
);

CREATE INDEX XIE1currency ON ildar.currency
(
       currency                       ASC
);

CREATE INDEX XIE1currency_rates ON ildar.currency_rates
(
       code                           ASC
);

CREATE INDEX XIE1opers ON ildar.opers
(
       branch_id                      ASC,
       account                        ASC
);

CREATE INDEX XIE2opers ON ildar.opers
(
       oper_date                      ASC
);

CREATE INDEX XIE3opers ON ildar.opers
(
       account                        ASC,
       oper_date                      ASC
);

CREATE UNIQUE INDEX XAK1outbox ON ildar.outbox
(
       msg_num                        ASC,
       msg_date                       ASC
);

CREATE INDEX XIE1outbox ON ildar.outbox
(
       msg_num                        ASC
);

CREATE INDEX XIE1clients_inbox ON ildar.clients_inbox
(
       client_id                      ASC
);

CREATE INDEX XIE1docs_hist ON ildar.docs_hist
(
       doc_id                         ASC
);

CREATE INDEX XIE2docs_hist ON ildar.docs_hist
(
       act_time                       ASC
);

CREATE INDEX XIE3docs_hist ON ildar.docs_hist
(
       doc_status                     ASC
);

CREATE INDEX XIE4docs_hist ON ildar.docs_hist
(
       doc_type                       ASC
);

CREATE INDEX XIE1attachments ON ildar.attachments
(
       doc_id                         ASC,
       doc_type                       ASC
);

CREATE INDEX XIE1swift ON ildar.swift
(
       country_code                   ASC
);

CREATE INDEX XIE2swift ON ildar.swift
(
       name                           ASC
);

CREATE UNIQUE INDEX XAK1countries ON ildar.countries
(
       iso_code                       ASC
);

CREATE UNIQUE INDEX XAK2countries ON ildar.countries
(
       country                        ASC
);

CREATE UNIQUE INDEX XAK3countries ON ildar.countries
(
       eng_name                       ASC
);

commit;


