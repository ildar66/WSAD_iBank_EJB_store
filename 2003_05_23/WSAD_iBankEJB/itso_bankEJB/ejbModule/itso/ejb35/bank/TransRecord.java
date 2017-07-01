package itso.ejb35.bank;

/**
 * This is an Enterprise Java Bean Remote Interface
 */
public interface TransRecord extends com.ibm.ivj.ejb.runtime.CopyHelper, javax.ejb.EJBObject {
/**
 * This method was generated for supporting the association named AccountTransactions.  
 * 	It will be deleted/edited when the association is deleted/edited.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
itso.ejb35.bank.BankAccount getOwningAccount() throws java.rmi.RemoteException, javax.ejb.FinderException;
/**
 * This method was generated for supporting the association named AccountTransactions.  
 * 	It will be deleted/edited when the association is deleted/edited.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
itso.ejb35.bank.BankAccountKey getOwningAccountKey() throws java.rmi.RemoteException;
/**
 * Getter method for transamt
 * @return java.math.BigDecimal
 * @exception java.rmi.RemoteException The exception description.
 */
java.math.BigDecimal getTransamt() throws java.rmi.RemoteException;
/**
 * Getter method for transtype
 * @return java.lang.String
 * @exception java.rmi.RemoteException The exception description.
 */
java.lang.String getTranstype() throws java.rmi.RemoteException;
/**
 * This method was generated for supporting the association named AccountTransactions.  
 * 	It will be deleted/edited when the association is deleted/edited.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
void privateSetOwningAccountKey(itso.ejb35.bank.BankAccountKey inKey) throws java.rmi.RemoteException;
/**
 * This method was generated for supporting the association named AccountTransactions.  
 * 	It will be deleted/edited when the association is deleted/edited.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
void secondarySetOwningAccount(itso.ejb35.bank.BankAccount anOwningAccount) throws java.rmi.RemoteException;
/**
 * This method was generated for supporting the association named AccountTransactions.  
 * 	It will be deleted/edited when the association is deleted/edited.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
void setOwningAccount(itso.ejb35.bank.BankAccount anOwningAccount) throws java.rmi.RemoteException;
/**
 * Setter method for transamt
 * @param newValue java.math.BigDecimal
 * @exception java.rmi.RemoteException The exception description.
 */
void setTransamt(java.math.BigDecimal newValue) throws java.rmi.RemoteException;
/**
 * Setter method for transtype
 * @param newValue java.lang.String
 * @exception java.rmi.RemoteException The exception description.
 */
void setTranstype(java.lang.String newValue) throws java.rmi.RemoteException;
}
