package itso.ejb35.cmp;
import javax.ejb.*;
import java.rmi.RemoteException;
import javax.naming.NamingException;
import com.ibm.etools.ejb.client.runtime.*;
/**
 * BankAccountFactory
 * @generated
 */
public class BankAccountFactory extends AbstractEJBFactory {
	/**
	 * BankAccountFactory
	 * @generated
	 */
	public BankAccountFactory() {
		super();
	}
	/**
	 * _acquireBankAccountHome
	 * @generated
	 */
	protected itso.ejb35.cmp.BankAccountHome _acquireBankAccountHome() throws java.rmi.RemoteException {
		return (itso.ejb35.cmp.BankAccountHome) _acquireEJBHome();
	}
	/**
	 * acquireBankAccountHome
	 * @generated
	 */
	public itso.ejb35.cmp.BankAccountHome acquireBankAccountHome() throws javax.naming.NamingException {
		return (itso.ejb35.cmp.BankAccountHome) acquireEJBHome();
	}
	/**
	 * getDefaultJNDIName
	 * @generated
	 */
	public String getDefaultJNDIName() {
		return "ejb/itso/ejb35/cmp/BankAccountHome";
	}
	/**
	 * getHomeInterface
	 * @generated
	 */
	protected Class getHomeInterface() {
		return itso.ejb35.cmp.BankAccountHome.class;
	}
	/**
	 * resetBankAccountHome
	 * @generated
	 */
	public void resetBankAccountHome() {
		resetEJBHome();
	}
	/**
	 * setBankAccountHome
	 * @generated
	 */
	public void setBankAccountHome(itso.ejb35.cmp.BankAccountHome home) {
		setEJBHome(home);
	}
	/**
	 * create
	 * @generated
	 */
	public itso.ejb35.cmp.BankAccount create(java.lang.String accID, java.math.BigDecimal argBalance) throws CreateException, RemoteException {
		return _acquireBankAccountHome().create(accID, argBalance);
	}
	/**
	 * findAccountsWithBalanceBetween
	 * @generated
	 */
	public java.util.Enumeration findAccountsWithBalanceBetween(java.math.BigDecimal anAmount1, java.math.BigDecimal anAmount2) throws FinderException, RemoteException {
		return _acquireBankAccountHome().findAccountsWithBalanceBetween(anAmount1, anAmount2);
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public itso.ejb35.cmp.BankAccount findByPrimaryKey(itso.ejb35.cmp.BankAccountKey primaryKey) throws FinderException, RemoteException {
		return _acquireBankAccountHome().findByPrimaryKey(primaryKey);
	}
	/**
	 * findAccountsWithBalanceGreaterThan
	 * @generated
	 */
	public java.util.Enumeration findAccountsWithBalanceGreaterThan(java.math.BigDecimal anAmount) throws FinderException, RemoteException {
		return _acquireBankAccountHome().findAccountsWithBalanceGreaterThan(anAmount);
	}
	/**
	 * findAll
	 * @generated
	 */
	public java.util.Enumeration findAll() throws FinderException, RemoteException {
		return _acquireBankAccountHome().findAll();
	}
	/**
	 * create
	 * @generated
	 */
	public itso.ejb35.cmp.BankAccount create(java.lang.String accID) throws CreateException, RemoteException {
		return _acquireBankAccountHome().create(accID);
	}
	/**
	 * findAccountsWithBalanceGreater
	 * @generated
	 */
	public java.util.Enumeration findAccountsWithBalanceGreater(java.math.BigDecimal anAmount) throws FinderException, RemoteException {
		return _acquireBankAccountHome().findAccountsWithBalanceGreater(anAmount);
	}
}
