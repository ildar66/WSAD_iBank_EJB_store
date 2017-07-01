package itso.ejb35.cmp;
/**
 * Remote interface for Enterprise Bean: BankAccount
 */
public interface BankAccount extends javax.ejb.EJBObject {
	/**
	 * Get accessor for persistent attribute: balance
	 */
	public java.math.BigDecimal getBalance() throws java.rmi.RemoteException;
	/**
	 * Set accessor for persistent attribute: balance
	 */
	public void setBalance(java.math.BigDecimal newBalance)
		throws java.rmi.RemoteException;

	public void withdraw(java.math.BigDecimal amount)
		throws itso.ejb35.util.InsufficientFundException, java.rmi.RemoteException;

	public void deposit(java.math.BigDecimal amount)
		throws java.rmi.RemoteException;

	/**
	 * getBankAccountData
	 */
	public itso.ejb35.cmp.BankAccountData getBankAccountData() throws java.rmi.RemoteException;
	/**
	 * setBankAccountData
	 */
	public void setBankAccountData(itso.ejb35.cmp.BankAccountData data) throws java.rmi.RemoteException, com.ibm.etools.ejb.client.runtime.FieldChangedException;
	/**
	 * syncBankAccountData
	 */
	public itso.ejb35.cmp.BankAccountData syncBankAccountData(itso.ejb35.cmp.BankAccountData data) throws java.rmi.RemoteException;
}