package itso.ejb35.cmp;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteCMPCustomer
 * @generated
 */
public class EJSRemoteCMPCustomer extends EJSWrapper implements Customer {
	/**
	 * EJSRemoteCMPCustomer
	 * @generated
	 */
	public EJSRemoteCMPCustomer() throws java.rmi.RemoteException {
		super();	}
	/**
	 * getCustomerID
	 * @generated
	 */
	public int getCustomerID() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		int _EJS_result = 0;
		try {
			itso.ejb35.cmp.CustomerBean beanRef = (itso.ejb35.cmp.CustomerBean)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = beanRef.getCustomerID();
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
	 * getCustomerData
	 * @generated
	 */
	public itso.ejb35.cmp.CustomerData getCustomerData() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		itso.ejb35.cmp.CustomerData _EJS_result = null;
		try {
			itso.ejb35.cmp.CustomerBean beanRef = (itso.ejb35.cmp.CustomerBean)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = beanRef.getCustomerData();
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
	 * syncCustomerData
	 * @generated
	 */
	public itso.ejb35.cmp.CustomerData syncCustomerData(itso.ejb35.cmp.CustomerData data) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		itso.ejb35.cmp.CustomerData _EJS_result = null;
		try {
			itso.ejb35.cmp.CustomerBean beanRef = (itso.ejb35.cmp.CustomerBean)container.preInvoke(this, 2, _EJS_s);
			_EJS_result = beanRef.syncCustomerData(data);
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
	 * getAddress
	 * @generated
	 */
	public itso.ejb35.util.CustomerAddress getAddress() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		itso.ejb35.util.CustomerAddress _EJS_result = null;
		try {
			itso.ejb35.cmp.CustomerBean beanRef = (itso.ejb35.cmp.CustomerBean)container.preInvoke(this, 3, _EJS_s);
			_EJS_result = beanRef.getAddress();
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
	 * getFirstName
	 * @generated
	 */
	public java.lang.String getFirstName() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.lang.String _EJS_result = null;
		try {
			itso.ejb35.cmp.CustomerBean beanRef = (itso.ejb35.cmp.CustomerBean)container.preInvoke(this, 4, _EJS_s);
			_EJS_result = beanRef.getFirstName();
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
	 * getLastName
	 * @generated
	 */
	public java.lang.String getLastName() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.lang.String _EJS_result = null;
		try {
			itso.ejb35.cmp.CustomerBean beanRef = (itso.ejb35.cmp.CustomerBean)container.preInvoke(this, 5, _EJS_s);
			_EJS_result = beanRef.getLastName();
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
	 * getName
	 * @generated
	 */
	public java.lang.String getName() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.lang.String _EJS_result = null;
		try {
			itso.ejb35.cmp.CustomerBean beanRef = (itso.ejb35.cmp.CustomerBean)container.preInvoke(this, 6, _EJS_s);
			_EJS_result = beanRef.getName();
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
	 * getPassword
	 * @generated
	 */
	public java.lang.String getPassword() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.lang.String _EJS_result = null;
		try {
			itso.ejb35.cmp.CustomerBean beanRef = (itso.ejb35.cmp.CustomerBean)container.preInvoke(this, 7, _EJS_s);
			_EJS_result = beanRef.getPassword();
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
	 * getTitle
	 * @generated
	 */
	public java.lang.String getTitle() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.lang.String _EJS_result = null;
		try {
			itso.ejb35.cmp.CustomerBean beanRef = (itso.ejb35.cmp.CustomerBean)container.preInvoke(this, 8, _EJS_s);
			_EJS_result = beanRef.getTitle();
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
	 * getUserID
	 * @generated
	 */
	public java.lang.String getUserID() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.lang.String _EJS_result = null;
		try {
			itso.ejb35.cmp.CustomerBean beanRef = (itso.ejb35.cmp.CustomerBean)container.preInvoke(this, 9, _EJS_s);
			_EJS_result = beanRef.getUserID();
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 9, _EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * setAddress
	 * @generated
	 */
	public void setAddress(itso.ejb35.util.CustomerAddress newAddress) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		
		try {
			itso.ejb35.cmp.CustomerBean beanRef = (itso.ejb35.cmp.CustomerBean)container.preInvoke(this, 10, _EJS_s);
			beanRef.setAddress(newAddress);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
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
	/**
	 * setCustomerData
	 * @generated
	 */
	public void setCustomerData(itso.ejb35.cmp.CustomerData data) throws java.rmi.RemoteException, com.ibm.etools.ejb.client.runtime.FieldChangedException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		
		try {
			itso.ejb35.cmp.CustomerBean beanRef = (itso.ejb35.cmp.CustomerBean)container.preInvoke(this, 11, _EJS_s);
			beanRef.setCustomerData(data);
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
			container.postInvoke(this, 11, _EJS_s);
		}
		return ;
	}
	/**
	 * setFirstName
	 * @generated
	 */
	public void setFirstName(java.lang.String newFirstName) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		
		try {
			itso.ejb35.cmp.CustomerBean beanRef = (itso.ejb35.cmp.CustomerBean)container.preInvoke(this, 12, _EJS_s);
			beanRef.setFirstName(newFirstName);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 12, _EJS_s);
		}
		return ;
	}
	/**
	 * setLastName
	 * @generated
	 */
	public void setLastName(java.lang.String newLastName) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		
		try {
			itso.ejb35.cmp.CustomerBean beanRef = (itso.ejb35.cmp.CustomerBean)container.preInvoke(this, 13, _EJS_s);
			beanRef.setLastName(newLastName);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 13, _EJS_s);
		}
		return ;
	}
	/**
	 * setPassword
	 * @generated
	 */
	public void setPassword(java.lang.String newPassword) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		
		try {
			itso.ejb35.cmp.CustomerBean beanRef = (itso.ejb35.cmp.CustomerBean)container.preInvoke(this, 14, _EJS_s);
			beanRef.setPassword(newPassword);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 14, _EJS_s);
		}
		return ;
	}
	/**
	 * setTitle
	 * @generated
	 */
	public void setTitle(java.lang.String newTitle) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		
		try {
			itso.ejb35.cmp.CustomerBean beanRef = (itso.ejb35.cmp.CustomerBean)container.preInvoke(this, 15, _EJS_s);
			beanRef.setTitle(newTitle);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 15, _EJS_s);
		}
		return ;
	}
	/**
	 * setUserID
	 * @generated
	 */
	public void setUserID(java.lang.String newUserID) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		
		try {
			itso.ejb35.cmp.CustomerBean beanRef = (itso.ejb35.cmp.CustomerBean)container.preInvoke(this, 16, _EJS_s);
			beanRef.setUserID(newUserID);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 16, _EJS_s);
		}
		return ;
	}
}
