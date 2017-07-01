package itso.ejb35.bank;

/**
 * This is an Enterprise Java Bean Remote Interface
 */
public interface Customer extends com.ibm.ivj.ejb.runtime.CopyHelper, javax.ejb.EJBObject {
/**
 * 
 * @return itso.ejb35.util.CustomerAddress
 * @exception String The exception description.
 */
itso.ejb35.util.CustomerAddress getAddress() throws java.rmi.RemoteException;
/**
 * This method was generated for supporting the association named CustomerToAccount.  
 * 	It will be deleted/edited when the association is deleted/edited.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public java.util.Enumeration getCustAcct() throws java.rmi.RemoteException, javax.ejb.FinderException;
/**
 * 
 * @return int
 * @exception String The exception description.
 */
int getCustomerID() throws java.rmi.RemoteException;
/**
 * Getter method for firstName
 * @return java.lang.String
 * @exception java.rmi.RemoteException The exception description.
 */
java.lang.String getFirstName() throws java.rmi.RemoteException;
/**
 * Getter method for lastName
 * @return java.lang.String
 * @exception java.rmi.RemoteException The exception description.
 */
java.lang.String getLastName() throws java.rmi.RemoteException;
/**
 * 
 * @return java.lang.String
 * @exception String The exception description.
 */
java.lang.String getName() throws java.rmi.RemoteException;
/**
 * Getter method for password
 * @return java.lang.String
 * @exception java.rmi.RemoteException The exception description.
 */
java.lang.String getPassword() throws java.rmi.RemoteException;
/**
 * Getter method for title
 * @return java.lang.String
 * @exception java.rmi.RemoteException The exception description.
 */
java.lang.String getTitle() throws java.rmi.RemoteException;
/**
 * Getter method for userID
 * @return java.lang.String
 * @exception java.rmi.RemoteException The exception description.
 */
java.lang.String getUserID() throws java.rmi.RemoteException;
/**
 * This method was generated for supporting the association named CustomerToAccount.  
 * 	It will be deleted/edited when the association is deleted/edited.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void secondaryAddCustAcct(itso.ejb35.bank.CustAcct aCustAcct) throws java.rmi.RemoteException;
/**
 * This method was generated for supporting the association named CustomerToAccount.  
 * 	It will be deleted/edited when the association is deleted/edited.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void secondaryRemoveCustAcct(itso.ejb35.bank.CustAcct aCustAcct) throws java.rmi.RemoteException;
/**
 * 
 * @return void
 * @param newValue itso.ejb35.util.CustomerAddress
 * @exception String The exception description.
 */
void setAddress(itso.ejb35.util.CustomerAddress newValue) throws java.rmi.RemoteException;
/**
 * Setter method for firstName
 * @param newValue java.lang.String
 * @exception java.rmi.RemoteException The exception description.
 */
void setFirstName(java.lang.String newValue) throws java.rmi.RemoteException;
/**
 * Setter method for lastName
 * @param newValue java.lang.String
 * @exception java.rmi.RemoteException The exception description.
 */
void setLastName(java.lang.String newValue) throws java.rmi.RemoteException;
/**
 * Setter method for password
 * @param newValue java.lang.String
 * @exception java.rmi.RemoteException The exception description.
 */
void setPassword(java.lang.String newValue) throws java.rmi.RemoteException;
/**
 * Setter method for title
 * @param newValue java.lang.String
 * @exception java.rmi.RemoteException The exception description.
 */
void setTitle(java.lang.String newValue) throws java.rmi.RemoteException;
/**
 * Setter method for userID
 * @param newValue java.lang.String
 * @exception java.rmi.RemoteException The exception description.
 */
void setUserID(java.lang.String newValue) throws java.rmi.RemoteException;
}
