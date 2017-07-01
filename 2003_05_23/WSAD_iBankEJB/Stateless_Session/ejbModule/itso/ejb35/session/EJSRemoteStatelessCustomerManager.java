package itso.ejb35.session;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteStatelessCustomerManager
 * @generated
 */
public class EJSRemoteStatelessCustomerManager extends EJSWrapper implements CustomerManager {
	/**
	 * EJSRemoteStatelessCustomerManager
	 * @generated
	 */
	public EJSRemoteStatelessCustomerManager() throws java.rmi.RemoteException {
		super();	}
	/**
	 * createCustomer
	 * @generated
	 */
	public itso.ejb35.cmp.Customer createCustomer(int id, java.lang.String title, java.lang.String firstName, java.lang.String lastName, java.lang.String userid, java.lang.String password) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		itso.ejb35.cmp.Customer _EJS_result = null;
		try {
			itso.ejb35.session.CustomerManagerBean beanRef = (itso.ejb35.session.CustomerManagerBean)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = beanRef.createCustomer(id, title, firstName, lastName, userid, password);
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
	 * findCustomer
	 * @generated
	 */
	public itso.ejb35.cmp.Customer findCustomer(int id) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		itso.ejb35.cmp.Customer _EJS_result = null;
		try {
			itso.ejb35.session.CustomerManagerBean beanRef = (itso.ejb35.session.CustomerManagerBean)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = beanRef.findCustomer(id);
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
	 * getAllProperties
	 * @generated
	 */
	public java.util.Hashtable getAllProperties(itso.ejb35.cmp.Customer customer) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.util.Hashtable _EJS_result = null;
		try {
			itso.ejb35.session.CustomerManagerBean beanRef = (itso.ejb35.session.CustomerManagerBean)container.preInvoke(this, 2, _EJS_s);
			_EJS_result = beanRef.getAllProperties(customer);
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
	 * setAllProperties
	 * @generated
	 */
	public void setAllProperties(itso.ejb35.cmp.Customer customer, java.util.Hashtable ht) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		
		try {
			itso.ejb35.session.CustomerManagerBean beanRef = (itso.ejb35.session.CustomerManagerBean)container.preInvoke(this, 3, _EJS_s);
			beanRef.setAllProperties(customer, ht);
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
}
