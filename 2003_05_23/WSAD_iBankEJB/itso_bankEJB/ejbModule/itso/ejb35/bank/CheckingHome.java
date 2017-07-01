package itso.ejb35.bank;

/**
 * This is a Home interface for the Enterprise JavaBean
 */
public interface CheckingHome extends javax.ejb.EJBHome {

/**
 * 
 * @return itso.ejb35.bank.Checking
 * @param argAccID java.lang.String
 * @param argBalance java.math.BigDecimal
 * @exception javax.ejb.CreateException The exception description.
 * @exception java.rmi.RemoteException The exception description.
 */
itso.ejb35.bank.Checking create(String argAccID, java.math.BigDecimal argBalance) throws javax.ejb.CreateException, java.rmi.RemoteException;
/**
 * 
 * @return java.util.Enumeration
 * @param aCustomerId java.lang.String
 * @exception java.rmi.RemoteException The exception description.
 * @exception javax.ejb.FinderException The exception description.
 */
java.util.Enumeration findAccountsForCustomer(int aCustomerId) throws java.rmi.RemoteException, javax.ejb.FinderException;
/**
 * 
 * @return java.util.Enumeration
 * @param anAmount1 java.math.BigDecimal
 * @param anAmount2 java.math.BigDecimal
 * @exception java.rmi.RemoteException The exception description.
 * @exception javax.ejb.FinderException The exception description.
 */
java.util.Enumeration findAccountsWithBalanceBetween(java.math.BigDecimal anAmount1, java.math.BigDecimal anAmount2) throws java.rmi.RemoteException, javax.ejb.FinderException;
/**
 * 
 * @return java.util.Enumeration
 * @param anAmount java.math.BigDecimal
 * @exception java.rmi.RemoteException The exception description.
 * @exception javax.ejb.FinderException The exception description.
 */
java.util.Enumeration findAccountsWithBalanceGreater(java.math.BigDecimal anAmount) throws java.rmi.RemoteException, javax.ejb.FinderException;
/**
 * 
 * @return java.util.Enumeration
 * @param anAmount java.math.BigDecimal
 * @exception java.rmi.RemoteException The exception description.
 * @exception javax.ejb.FinderException The exception description.
 */
java.util.Enumeration findAccountsWithBalanceGreaterThan(java.math.BigDecimal anAmount) throws java.rmi.RemoteException, javax.ejb.FinderException;
/**
 * 
 * @return java.util.Enumeration
 * @exception java.rmi.RemoteException The exception description.
 * @exception javax.ejb.FinderException The exception description.
 */
java.util.Enumeration findAll() throws java.rmi.RemoteException, javax.ejb.FinderException;
/**
 * 
 * @return itso.ejb35.bank.Checking
 * @param key itso.ejb35.bank.BankAccountKey
 * @exception java.rmi.RemoteException The exception description.
 * @exception javax.ejb.FinderException The exception description.
 */
itso.ejb35.bank.Checking findByPrimaryKey(BankAccountKey key) throws java.rmi.RemoteException, javax.ejb.FinderException;
/**
 * 
 * @return java.util.Enumeration
 * @param balance java.math.BigDecimal
 * @exception java.rmi.RemoteException The exception description.
 * @exception javax.ejb.FinderException The exception description.
 */
java.util.Enumeration findGoldAccounts(java.math.BigDecimal balance) throws java.rmi.RemoteException, javax.ejb.FinderException;
}
