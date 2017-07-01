package itso.ejb35.bank;

/**
 * This is an Enterprise Java Bean Remote Interface
 */
public interface BankAccount extends com.ibm.ivj.ejb.runtime.CopyHelper, javax.ejb.EJBObject {
/**
 * This method was generated for supporting the association named AccountTransactions.  
 * 	It will be deleted/edited when the association is deleted/edited.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
void addBankTransactions(itso.ejb35.bank.TransRecord aBankTransactions) throws java.rmi.RemoteException;
/**
 * 
 * @return void
 * @param amount java.math.BigDecimal
 * @exception String The exception description.
 */
void deposit(java.math.BigDecimal amount) throws java.rmi.RemoteException;
/**
 * Getter method for balance
 * @return java.math.BigDecimal
 * @exception java.rmi.RemoteException The exception description.
 */
java.math.BigDecimal getBalance() throws java.rmi.RemoteException;
/**
 * This method was generated for supporting the association named AccountTransactions.  
 * 	It will be deleted/edited when the association is deleted/edited.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
java.util.Enumeration getBankTransactions() throws java.rmi.RemoteException, javax.ejb.FinderException;
/**
 * This method was generated for supporting the association named AccountToCustomer.  
 * 	It will be deleted/edited when the association is deleted/edited.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public java.util.Enumeration getCustAcct() throws java.rmi.RemoteException, javax.ejb.FinderException;
/**
 * This method was generated for supporting the association named AccountTransactions.  
 * 	It will be deleted/edited when the association is deleted/edited.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
void secondaryAddBankTransactions(itso.ejb35.bank.TransRecord aBankTransactions) throws java.rmi.RemoteException;
/**
 * This method was generated for supporting the association named AccountToCustomer.  
 * 	It will be deleted/edited when the association is deleted/edited.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void secondaryAddCustAcct(itso.ejb35.bank.CustAcct aCustAcct) throws java.rmi.RemoteException;
/**
 * This method was generated for supporting the association named AccountTransactions.  
 * 	It will be deleted/edited when the association is deleted/edited.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
void secondaryRemoveBankTransactions(itso.ejb35.bank.TransRecord aBankTransactions) throws java.rmi.RemoteException;
/**
 * This method was generated for supporting the association named AccountToCustomer.  
 * 	It will be deleted/edited when the association is deleted/edited.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void secondaryRemoveCustAcct(itso.ejb35.bank.CustAcct aCustAcct) throws java.rmi.RemoteException;
/**
 * Setter method for balance
 * @param newValue java.math.BigDecimal
 * @exception java.rmi.RemoteException The exception description.
 */
void setBalance(java.math.BigDecimal newValue) throws java.rmi.RemoteException;
/**
 * 
 * @return void
 * @param amount java.math.BigDecimal
 * @exception String The exception description.
 * @exception String The exception description.
 */
void withdraw(java.math.BigDecimal amount) throws java.rmi.RemoteException, itso.ejb35.util.InsufficientFundException;
}
