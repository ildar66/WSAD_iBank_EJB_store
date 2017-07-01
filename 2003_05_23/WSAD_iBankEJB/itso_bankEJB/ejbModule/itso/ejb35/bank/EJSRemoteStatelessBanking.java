package itso.ejb35.bank;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteStatelessBanking
 * @generated
 */
public class EJSRemoteStatelessBanking extends EJSWrapper implements Banking {
	/**
	 * EJSRemoteStatelessBanking
	 * @generated
	 */
	public EJSRemoteStatelessBanking() throws java.rmi.RemoteException {
		super();	}
	/**
	 * deposit
	 * @generated
	 */
	public java.math.BigDecimal deposit(java.lang.String anAccountID, java.math.BigDecimal anAmount) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.math.BigDecimal _EJS_result = null;
		try {
			itso.ejb35.bank.BankingBean beanRef = (itso.ejb35.bank.BankingBean)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = beanRef.deposit(anAccountID, anAmount);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 0, _EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getBalance
	 * @generated
	 */
	public java.math.BigDecimal getBalance(java.lang.String anAccountID) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.math.BigDecimal _EJS_result = null;
		try {
			itso.ejb35.bank.BankingBean beanRef = (itso.ejb35.bank.BankingBean)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = beanRef.getBalance(anAccountID);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 1, _EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * withdraw
	 * @generated
	 */
	public java.math.BigDecimal withdraw(java.lang.String anAccountID, java.math.BigDecimal anAmount) throws java.rmi.RemoteException, itso.ejb35.util.InsufficientFundException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.math.BigDecimal _EJS_result = null;
		try {
			itso.ejb35.bank.BankingBean beanRef = (itso.ejb35.bank.BankingBean)container.preInvoke(this, 2, _EJS_s);
			_EJS_result = beanRef.withdraw(anAccountID, anAmount);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (itso.ejb35.util.InsufficientFundException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 2, _EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * transferMoney
	 * @generated
	 */
	public void transferMoney(java.lang.String fromAccountID, java.lang.String toAccountID, java.math.BigDecimal anAmount) throws java.rmi.RemoteException, itso.ejb35.util.InsufficientFundException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		
		try {
			itso.ejb35.bank.BankingBean beanRef = (itso.ejb35.bank.BankingBean)container.preInvoke(this, 3, _EJS_s);
			beanRef.transferMoney(fromAccountID, toAccountID, anAmount);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (itso.ejb35.util.InsufficientFundException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 3, _EJS_s);
		}
		return ;
	}
}
