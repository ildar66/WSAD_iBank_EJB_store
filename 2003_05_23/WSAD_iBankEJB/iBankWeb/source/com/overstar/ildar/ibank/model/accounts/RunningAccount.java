package com.overstar.ildar.ibank.model.accounts;

import com.overstar.ildar.ibank.model.Money;
import java.sql.Date;
import com.overstar.ildar.ibank.model.exceptions.*;
/**
 * Insert the type's description here.
 * Creation date: (31.10.2002 16:29:03)
 * 
 * @author  Shafigullin Ildar
 */
public class RunningAccount extends BankAccount 
{
   
   /**
    * RunningAccount constructor comment.
    * @roseuid 3E0041BE0251
    */
   public RunningAccount() 
   {
	super();    
   }
/**
 * RunningAccount constructor comment.
 * @param anId com.overstar.ildar.ibank.model.BankAccount.BankAccountPK
 * @param anClient_id java.lang.Integer
 * @param anCreate_date java.sql.Date
 * @param anCreate_amount com.overstar.ildar.ibank.model.Money
 * @roseuid 3E0041BE0337
 */
protected RunningAccount(
    BankAccount.BankAccountPK anId,
    Integer anClient_id,
    java.sql.Date anCreate_date,
    Money anCreate_amount) {
    super(anId, anClient_id, anCreate_date, anCreate_amount);
}
/**
 * RunningAccount constructor comment.
 * @param anId com.overstar.ildar.ibank.model.BankAccount.BankAccountPK
 * @param anClient_id java.lang.Integer
 * @param anCreate_date java.sql.Date
 * @param anCreate_amount com.overstar.ildar.ibank.model.Money
 * @param anCurrency java.lang.String
 * @roseuid 3E0041BE025B
 */
protected RunningAccount(
    BankAccount.BankAccountPK anId,
    Integer anClient_id,
    java.sql.Date anCreate_date,
    Money anCreate_amount,
    String anCurrency) {
    super(anId, anClient_id, anCreate_date, anCreate_amount, anCurrency);
}
   /**
    * Insert the method's description here.
    * Creation date: (01.11.2002 12:41:11)
    * @return java.lang.String
    * @roseuid 3E0041BF001A
    */
   public String getType() 
   {
	return "�������";    
   }
   /**
    * Insert the method's description here.
    * Creation date: (01.11.2002 12:24:11)
    * @return java.lang.String
    * @roseuid 3E0041BF002C
    */
   public String toString() 
   {
	return ("\nRunningAccount (" + super.toString() + ").\n");    
   }
}
