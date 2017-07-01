package itso.ejb35.cmp;
/**
 * Home interface for Enterprise Bean: BankAccount
 */
public interface BankAccountHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: BankAccount
	 */
	public itso.ejb35.cmp.BankAccount create(
		java.lang.String accID,
		java.math.BigDecimal argBalance)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: BankAccount
	 */
	public itso.ejb35.cmp.BankAccount findByPrimaryKey(
		itso.ejb35.cmp.BankAccountKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	/**
	 * Creates an instance from a key for Entity Bean: BankAccount
	 */
	public itso.ejb35.cmp.BankAccount create(java.lang.String accID)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
		
	public java.util.Enumeration findAccountsWithBalanceGreater(
		java.math.BigDecimal anAmount)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
		
	public java.util.Enumeration findAll()
		throws javax.ejb.FinderException, java.rmi.RemoteException;
		
	public java.util.Enumeration findAccountsWithBalanceBetween(
		java.math.BigDecimal anAmount1,
		java.math.BigDecimal anAmount2)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
		
	public java.util.Enumeration findAccountsWithBalanceGreaterThan(java.math.BigDecimal anAmount)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
}