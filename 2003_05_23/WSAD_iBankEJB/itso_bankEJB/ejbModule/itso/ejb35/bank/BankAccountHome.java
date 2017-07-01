package itso.ejb35.bank;

import java.util.Enumeration;
import java.math.BigDecimal;
/**
 * This is a Home interface for the Entity Bean
 */
public interface BankAccountHome extends javax.ejb.EJBHome {
/**
 * 
 * @return itso.ejb35.bank.BankAccount
 * @param argAccID java.lang.String
 * @param argBalance java.math.BigDecimal
 * @exception String The exception description.
 * @exception String The exception description.
 */
itso.ejb35.bank.BankAccount create(java.lang.String argAccID, java.math.BigDecimal argBalance) throws javax.ejb.CreateException, java.rmi.RemoteException;
    public Enumeration findAccountsWithBalanceBetween(BigDecimal anAmount1, BigDecimal anAmount2)
        throws javax.ejb.FinderException, java.rmi.RemoteException;
    public Enumeration findAccountsWithBalanceGreater(BigDecimal anAmount)
        throws javax.ejb.FinderException, java.rmi.RemoteException;
    public Enumeration findAccountsWithBalanceGreaterThan(BigDecimal anAmount)
        throws javax.ejb.FinderException, java.rmi.RemoteException;
    public Enumeration findAll() throws javax.ejb.FinderException, java.rmi.RemoteException;
/**
 * findByPrimaryKey method comment
 * @return itso.ejb35.util.BankAccount
 * @param key itso.ejb35.util.BankAccountKey
 * @exception java.rmi.RemoteException The exception description.
 * @exception javax.ejb.FinderException The exception description.
 */
itso.ejb35.bank.BankAccount findByPrimaryKey(itso.ejb35.bank.BankAccountKey key) throws java.rmi.RemoteException, javax.ejb.FinderException;
    public Enumeration findGoldAccounts(java.math.BigDecimal balance)
        throws java.rmi.RemoteException, javax.ejb.FinderException;

    public java.util.Enumeration findAccountsForCustomer(int aCustomerId) throws java.rmi.RemoteException, javax.ejb.FinderException;
}
