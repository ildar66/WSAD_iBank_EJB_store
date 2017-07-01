package itso.ejb35.cmp;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteCMPBankAccountHome
 * @generated
 */
public class EJSRemoteCMPBankAccountHome extends EJSWrapper implements itso.ejb35.cmp.BankAccountHome {
	/**
	 * EJSRemoteCMPBankAccountHome
	 * @generated
	 */
	public EJSRemoteCMPBankAccountHome() throws java.rmi.RemoteException {
		super();	}
	/**
	 * create
	 * @generated
	 */
	public itso.ejb35.cmp.BankAccount create(java.lang.String accID) throws javax.ejb.CreateException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		itso.ejb35.cmp.BankAccount _EJS_result = null;
		try {
			itso.ejb35.cmp.EJSCMPBankAccountHomeBean _EJS_beanRef = (itso.ejb35.cmp.EJSCMPBankAccountHomeBean)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = _EJS_beanRef.create(accID);
		}
		catch (javax.ejb.CreateException ex) {
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
			container.postInvoke(this, 0, _EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * create
	 * @generated
	 */
	public itso.ejb35.cmp.BankAccount create(java.lang.String accID, java.math.BigDecimal argBalance) throws javax.ejb.CreateException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		itso.ejb35.cmp.BankAccount _EJS_result = null;
		try {
			itso.ejb35.cmp.EJSCMPBankAccountHomeBean _EJS_beanRef = (itso.ejb35.cmp.EJSCMPBankAccountHomeBean)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = _EJS_beanRef.create(accID, argBalance);
		}
		catch (javax.ejb.CreateException ex) {
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
			container.postInvoke(this, 1, _EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public itso.ejb35.cmp.BankAccount findByPrimaryKey(itso.ejb35.cmp.BankAccountKey primaryKey) throws javax.ejb.FinderException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		itso.ejb35.cmp.BankAccount _EJS_result = null;
		try {
			itso.ejb35.cmp.EJSCMPBankAccountHomeBean _EJS_beanRef = (itso.ejb35.cmp.EJSCMPBankAccountHomeBean)container.preInvoke(this, 2, _EJS_s);
			_EJS_result = _EJS_beanRef.findByPrimaryKey(primaryKey);
		}
		catch (javax.ejb.FinderException ex) {
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
			container.postInvoke(this, 2, _EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * findAccountsWithBalanceBetween
	 * @generated
	 */
	public java.util.Enumeration findAccountsWithBalanceBetween(java.math.BigDecimal anAmount1, java.math.BigDecimal anAmount2) throws javax.ejb.FinderException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.util.Enumeration _EJS_result = null;
		try {
			itso.ejb35.cmp.EJSCMPBankAccountHomeBean _EJS_beanRef = (itso.ejb35.cmp.EJSCMPBankAccountHomeBean)container.preInvoke(this, 3, _EJS_s);
			_EJS_result = _EJS_beanRef.findAccountsWithBalanceBetween(anAmount1, anAmount2);
		}
		catch (javax.ejb.FinderException ex) {
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
			container.postInvoke(this, 3, _EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * findAccountsWithBalanceGreater
	 * @generated
	 */
	public java.util.Enumeration findAccountsWithBalanceGreater(java.math.BigDecimal anAmount) throws javax.ejb.FinderException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.util.Enumeration _EJS_result = null;
		try {
			itso.ejb35.cmp.EJSCMPBankAccountHomeBean _EJS_beanRef = (itso.ejb35.cmp.EJSCMPBankAccountHomeBean)container.preInvoke(this, 4, _EJS_s);
			_EJS_result = _EJS_beanRef.findAccountsWithBalanceGreater(anAmount);
		}
		catch (javax.ejb.FinderException ex) {
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
			container.postInvoke(this, 4, _EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * findAccountsWithBalanceGreaterThan
	 * @generated
	 */
	public java.util.Enumeration findAccountsWithBalanceGreaterThan(java.math.BigDecimal anAmount) throws javax.ejb.FinderException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.util.Enumeration _EJS_result = null;
		try {
			itso.ejb35.cmp.EJSCMPBankAccountHomeBean _EJS_beanRef = (itso.ejb35.cmp.EJSCMPBankAccountHomeBean)container.preInvoke(this, 5, _EJS_s);
			_EJS_result = _EJS_beanRef.findAccountsWithBalanceGreaterThan(anAmount);
		}
		catch (javax.ejb.FinderException ex) {
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
			container.postInvoke(this, 5, _EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * findAll
	 * @generated
	 */
	public java.util.Enumeration findAll() throws javax.ejb.FinderException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.util.Enumeration _EJS_result = null;
		try {
			itso.ejb35.cmp.EJSCMPBankAccountHomeBean _EJS_beanRef = (itso.ejb35.cmp.EJSCMPBankAccountHomeBean)container.preInvoke(this, 6, _EJS_s);
			_EJS_result = _EJS_beanRef.findAll();
		}
		catch (javax.ejb.FinderException ex) {
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
		return _EJS_result;
	}
	/**
	 * getEJBMetaData
	 * @generated
	 */
	public javax.ejb.EJBMetaData getEJBMetaData() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		javax.ejb.EJBMetaData _EJS_result = null;
		try {
			itso.ejb35.cmp.EJSCMPBankAccountHomeBean _EJS_beanRef = (itso.ejb35.cmp.EJSCMPBankAccountHomeBean)container.preInvoke(this, 7, _EJS_s);
			_EJS_result = _EJS_beanRef.getEJBMetaData();
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 7, _EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getHomeHandle
	 * @generated
	 */
	public javax.ejb.HomeHandle getHomeHandle() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		javax.ejb.HomeHandle _EJS_result = null;
		try {
			itso.ejb35.cmp.EJSCMPBankAccountHomeBean _EJS_beanRef = (itso.ejb35.cmp.EJSCMPBankAccountHomeBean)container.preInvoke(this, 8, _EJS_s);
			_EJS_result = _EJS_beanRef.getHomeHandle();
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 8, _EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * remove
	 * @generated
	 */
	public void remove(java.lang.Object arg0) throws java.rmi.RemoteException, javax.ejb.RemoveException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		
		try {
			itso.ejb35.cmp.EJSCMPBankAccountHomeBean _EJS_beanRef = (itso.ejb35.cmp.EJSCMPBankAccountHomeBean)container.preInvoke(this, 9, _EJS_s);
			_EJS_beanRef.remove(arg0);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (javax.ejb.RemoveException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 9, _EJS_s);
		}
		return ;
	}
	/**
	 * remove
	 * @generated
	 */
	public void remove(javax.ejb.Handle arg0) throws java.rmi.RemoteException, javax.ejb.RemoveException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		
		try {
			itso.ejb35.cmp.EJSCMPBankAccountHomeBean _EJS_beanRef = (itso.ejb35.cmp.EJSCMPBankAccountHomeBean)container.preInvoke(this, 10, _EJS_s);
			_EJS_beanRef.remove(arg0);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (javax.ejb.RemoveException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 10, _EJS_s);
		}
		return ;
	}
}
