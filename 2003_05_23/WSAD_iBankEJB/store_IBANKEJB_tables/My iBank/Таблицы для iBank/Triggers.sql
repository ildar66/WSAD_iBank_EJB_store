-----------------------------------------
connect to elevator user admin using 8080;
--------------------------------------------------------------

drop trigger ildar.Delivery_NewLine; 

create trigger ildar.Delivery_NewLine 
no cascade before insert on Ildar.Delivery
referencing new as n
for each row mode db2sql
set n.Line = (select value(max(Line),0)+1 from Ildar.Delivery);
---------------------------------------------------------------
drop trigger ildar.Record_NewLine; 

create trigger ildar.Record_NewLine 
no cascade before insert on Ildar.Record
referencing new as n
for each row mode db2sql
set n.Line = (select value(max(Line),0)+1 from Ildar.Record);
-------------------------------------------------------------
drop trigger ildar.Form_NewLine; 

create trigger ildar.Form_NewLine 
no cascade before insert on Ildar.Form
referencing new as n
for each row mode db2sql
set n.Line = (select value(max(Line),0)+1 from Ildar.Form);
------------------------------------------------------------
drop trigger ildar.Form_Update;

create trigger ildar.Form_Update
after update of contract on ildar.Agreement
referencing new as n old as o 
for each row mode db2sql
update ildar.Form 
set contract = n.contract 
where contract = o.contract;

------------------------------------------------------------
drop trigger ildar.Record_Update;

create trigger ildar.Record_Update
after update of contract on ildar.Agreement
referencing new as n old as o 
for each row mode db2sql
update ildar.Record 
set contract = n.contract 
where contract = o.contract;

------------------------------------------------------------
drop trigger ildar.Delivery_Update;

create trigger ildar.Delivery_Update
after update of contract on ildar.Agreement
referencing new as n old as o 
for each row mode db2sql
update ildar.Delivery 
set contract = n.contract 
where contract = o.contract;
------------------------------------------------------------
drop trigger ildar.Payment_Update;

create trigger ildar.Payment_Update
after update of contract on ildar.Agreement
referencing new as n old as o 
for each row mode db2sql
update ildar.Payment 
set contract = n.contract 
where contract = o.contract;
--------------------------------------------------------------
