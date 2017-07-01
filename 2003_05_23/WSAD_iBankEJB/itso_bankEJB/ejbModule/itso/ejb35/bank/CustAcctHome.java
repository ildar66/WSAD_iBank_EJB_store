package itso.ejb35.bank;

/**
 * This is a Home interface for the Entity Bean
 */
public interface CustAcctHome extends javax.ejb.EJBHome {

/**
 * create method for a CMP entity bean
 * @return itso.ejb35.bank.CustAcct
 * @exception javax.ejb.CreateException The exception description.
 * @exception java.rmi.RemoteException The exception description.
 */
itso.ejb35.bank.CustAcct create() throws javax.ejb.CreateException, java.rmi.RemoteException;
/**
 * findByPrimaryKey method comment
 * @return itso.ejb35.bank.CustAcct
 * @param key itso.ejb35.bank.CustAcctKey
 * @exception java.rmi.RemoteException The exception description.
 * @exception javax.ejb.FinderException The exception description.
 */
itso.ejb35.bank.CustAcct findByPrimaryKey(itso.ejb35.bank.CustAcctKey key) throws java.rmi.RemoteException, javax.ejb.FinderException;
/**
 * This method was generated for supporting the association named AccountToCustomer.  
 * 	It will be deleted/edited when the association is deleted/edited.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public java.util.Enumeration findCustAcctByAccount(itso.ejb35.bank.BankAccountKey inKey) throws java.rmi.RemoteException, javax.ejb.FinderException;
/**
 * This method was generated for supporting the association named CustomerToAccount.  
 * 	It will be deleted/edited when the association is deleted/edited.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public java.util.Enumeration findCustAcctByCustomer(itso.ejb35.bank.CustomerKey inKey) throws java.rmi.RemoteException, javax.ejb.FinderException;
}
