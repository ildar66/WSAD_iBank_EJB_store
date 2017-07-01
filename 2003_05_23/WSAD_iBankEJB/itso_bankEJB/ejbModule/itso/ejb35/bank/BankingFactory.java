package itso.ejb35.bank;
import javax.ejb.*;
import java.rmi.RemoteException;
import javax.naming.NamingException;
import com.ibm.etools.ejb.client.runtime.*;
/**
 * BankingFactory
 * @generated
 */
public class BankingFactory extends AbstractEJBFactory {
	/**
	 * BankingFactory
	 * @generated
	 */
	public BankingFactory() {
		super();
	}
	/**
	 * _acquireBankingHome
	 * @generated
	 */
	protected itso.ejb35.bank.BankingHome _acquireBankingHome() throws java.rmi.RemoteException {
		return (itso.ejb35.bank.BankingHome) _acquireEJBHome();
	}
	/**
	 * acquireBankingHome
	 * @generated
	 */
	public itso.ejb35.bank.BankingHome acquireBankingHome() throws javax.naming.NamingException {
		return (itso.ejb35.bank.BankingHome) acquireEJBHome();
	}
	/**
	 * getDefaultJNDIName
	 * @generated
	 */
	public String getDefaultJNDIName() {
		return "itso/ejb35/bank/Banking";
	}
	/**
	 * getHomeInterface
	 * @generated
	 */
	protected Class getHomeInterface() {
		return itso.ejb35.bank.BankingHome.class;
	}
	/**
	 * resetBankingHome
	 * @generated
	 */
	public void resetBankingHome() {
		resetEJBHome();
	}
	/**
	 * setBankingHome
	 * @generated
	 */
	public void setBankingHome(itso.ejb35.bank.BankingHome home) {
		setEJBHome(home);
	}
	/**
	 * create
	 * @generated
	 */
	public itso.ejb35.bank.Banking create() throws CreateException, RemoteException {
		return _acquireBankingHome().create();
	}
}
