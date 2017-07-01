package itso.ejb35.bank;

/**
 * This is a Home interface for the Entity Bean
 */
public interface TransRecordHome extends javax.ejb.EJBHome {

/**
 * 
 * @return itso.ejb35.bank.TransRecord
 * @param anAccID java.lang.String
 * @param anAmount java.math.BigDecimal
 * @param aTranstype java.lang.String
 * @exception String The exception description.
 * @exception String The exception description.
 */
itso.ejb35.bank.TransRecord create(java.lang.String anAccID, java.math.BigDecimal anAmount, java.lang.String aTranstype) throws javax.ejb.CreateException, java.rmi.RemoteException;
/**
 * findByPrimaryKey method comment
 * @return itso.ejb35.bank.TransRecord
 * @param key itso.ejb35.bank.TransRecordKey
 * @exception java.rmi.RemoteException The exception description.
 * @exception javax.ejb.FinderException The exception description.
 */
itso.ejb35.bank.TransRecord findByPrimaryKey(itso.ejb35.bank.TransRecordKey key) throws java.rmi.RemoteException, javax.ejb.FinderException;

/**
 * 
 * @return itso.ejb35.bank.TransRecord
 * @param acct itso.ejb35.bank.BankAccount
 * @param anAmount java.math.BigDecimal
 * @param aTranstype java.lang.String
 * @exception String The exception description.
 * @exception String The exception description.
 */
itso.ejb35.bank.TransRecord create(itso.ejb35.bank.BankAccount acct, java.math.BigDecimal anAmount, java.lang.String aTranstype) throws javax.ejb.CreateException, java.rmi.RemoteException;

/**
 * This method was generated for supporting the association named AccountTransactions.  
 * 	It will be deleted/edited when the association is deleted/edited.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
java.util.Enumeration findBankTransactionsByOwningAccount(itso.ejb35.bank.BankAccountKey inKey) throws java.rmi.RemoteException, javax.ejb.FinderException;
}
