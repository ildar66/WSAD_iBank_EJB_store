package itso.ejb35.cmp;
import com.ibm.ejs.persistence.EJSFinder;
import javax.ejb.FinderException;
import java.rmi.RemoteException;
/**
 * EJSFinderBankAccountBean
 * @generated
 */
public interface EJSFinderBankAccountBean {
	/**
	 * findAccountsWithBalanceBetween
	 * @generated
	 */
	public EJSFinder findAccountsWithBalanceBetween(java.math.BigDecimal anAmount1, java.math.BigDecimal anAmount2) throws javax.ejb.FinderException, java.rmi.RemoteException;
	/**
	 * findAccountsWithBalanceGreaterThan
	 * @generated
	 */
	public EJSFinder findAccountsWithBalanceGreaterThan(java.math.BigDecimal anAmount) throws javax.ejb.FinderException, java.rmi.RemoteException;
	/**
	 * findAll
	 * @generated
	 */
	public EJSFinder findAll() throws javax.ejb.FinderException, java.rmi.RemoteException;
	/**
	 * findAccountsWithBalanceGreater
	 * @generated
	 */
	public EJSFinder findAccountsWithBalanceGreater(java.math.BigDecimal anAmount) throws javax.ejb.FinderException, java.rmi.RemoteException;
}
