package itso.ejb35.cmp;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteCMPBankAccount
 * @generated
 */
public class EJSRemoteCMPBankAccount extends EJSWrapper implements BankAccount {
	/**
	 * EJSRemoteCMPBankAccount
	 * @generated
	 */
	public EJSRemoteCMPBankAccount() throws java.rmi.RemoteException {
		super();	}
	/**
	 * getBankAccountData
	 * @generated
	 */
	public itso.ejb35.cmp.BankAccountData getBankAccountData() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		itso.ejb35.cmp.BankAccountData _EJS_result = null;
		try {
			itso.ejb35.cmp.BankAccountBean beanRef = (itso.ejb35.cmp.BankAccountBean)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = beanRef.getBankAccountData();
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
	 * syncBankAccountData
	 * @generated
	 */
	public itso.ejb35.cmp.BankAccountData syncBankAccountData(itso.ejb35.cmp.BankAccountData data) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		itso.ejb35.cmp.BankAccountData _EJS_result = null;
		try {
			itso.ejb35.cmp.BankAccountBean beanRef = (itso.ejb35.cmp.BankAccountBean)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = beanRef.syncBankAccountData(data);
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
	 * getBalance
	 * @generated
	 */
	public java.math.BigDecimal getBalance() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.math.BigDecimal _EJS_result = null;
		try {
			itso.ejb35.cmp.BankAccountBean beanRef = (itso.ejb35.cmp.BankAccountBean)container.preInvoke(this, 2, _EJS_s);
			_EJS_result = beanRef.getBalance();
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
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
	 * deposit
	 * @generated
	 */
	public void deposit(java.math.BigDecimal amount) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		
		try {
			itso.ejb35.cmp.BankAccountBean beanRef = (itso.ejb35.cmp.BankAccountBean)container.preInvoke(this, 3, _EJS_s);
			beanRef.deposit(amount);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
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
	/**
	 * setBalance
	 * @generated
	 */
	public void setBalance(java.math.BigDecimal newBalance) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		
		try {
			itso.ejb35.cmp.BankAccountBean beanRef = (itso.ejb35.cmp.BankAccountBean)container.preInvoke(this, 4, _EJS_s);
			beanRef.setBalance(newBalance);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 4, _EJS_s);
		}
		return ;
	}
	/**
	 * setBankAccountData
	 * @generated
	 */
	public void setBankAccountData(itso.ejb35.cmp.BankAccountData data) throws java.rmi.RemoteException, com.ibm.etools.ejb.client.runtime.FieldChangedException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		
		try {
			itso.ejb35.cmp.BankAccountBean beanRef = (itso.ejb35.cmp.BankAccountBean)container.preInvoke(this, 5, _EJS_s);
			beanRef.setBankAccountData(data);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (com.ibm.etools.ejb.client.runtime.FieldChangedException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 5, _EJS_s);
		}
		return ;
	}
	/**
	 * withdraw
	 * @generated
	 */
	public void withdraw(java.math.BigDecimal amount) throws itso.ejb35.util.InsufficientFundException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		
		try {
			itso.ejb35.cmp.BankAccountBean beanRef = (itso.ejb35.cmp.BankAccountBean)container.preInvoke(this, 6, _EJS_s);
			beanRef.withdraw(amount);
		}
		catch (itso.ejb35.util.InsufficientFundException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 6, _EJS_s);
		}
		return ;
	}
}
