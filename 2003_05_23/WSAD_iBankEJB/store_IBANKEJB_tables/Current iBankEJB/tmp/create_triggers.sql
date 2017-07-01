CONNECT RESET;
-----------------------------------------
connect to iBank;
--------------------------------------------------------------

--drop trigger ildar.Recipients_NewLine; 

--create trigger ildar.Recipients_NewLine 
--no cascade before insert on ildar.recipients
--referencing new as n
--for each row mode db2sql
--set n.id = (select value(max(id),0)+1 from ildar.recipients);
----------------------------------------------------------------
drop trigger ildar.clients_NewLine; 

--create trigger ildar.clients_NewLine 
--no cascade before insert on ildar.clients
--referencing new as n
--for each row mode db2sql
--set n.client_id = (select value(max(client_id),0)+1 from ildar.clients);
--------------------------------------------------------------------
