package itso.ejb35.bank;

/**
 * This is an Enterprise Java Bean Remote Interface
 */
public interface CustAcct extends com.ibm.ivj.ejb.runtime.CopyHelper, javax.ejb.EJBObject {
/**
 * This method was generated for supporting the association named AccountToCustomer.  
 * 	It will be deleted/edited when the association is deleted/edited.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public itso.ejb35.bank.BankAccount getAccount() throws java.rmi.RemoteException, javax.ejb.FinderException;
/**
 * This method was generated for supporting the association named AccountToCustomer.  
 * 	It will be deleted/edited when the association is deleted/edited.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public itso.ejb35.bank.BankAccountKey getAccountKey() throws java.rmi.RemoteException;
/**
 * This method was generated for supporting the association named CustomerToAccount.  
 * 	It will be deleted/edited when the association is deleted/edited.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public itso.ejb35.bank.Customer getCustomer() throws java.rmi.RemoteException, javax.ejb.FinderException;
/**
 * This method was generated for supporting the association named CustomerToAccount.  
 * 	It will be deleted/edited when the association is deleted/edited.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public itso.ejb35.bank.CustomerKey getCustomerKey() throws java.rmi.RemoteException;
}
