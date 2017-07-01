package itso.ejb35.session;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteStatelessCustomerFinder
 * @generated
 */
public class EJSRemoteStatelessCustomerFinder extends EJSWrapper implements CustomerFinder {
	/**
	 * EJSRemoteStatelessCustomerFinder
	 * @generated
	 */
	public EJSRemoteStatelessCustomerFinder() throws java.rmi.RemoteException {
		super();	}
	/**
	 * findDab
	 * @generated
	 */
	public java.util.Vector findDab(java.lang.String partialName) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.util.Vector _EJS_result = null;
		try {
			itso.ejb35.session.CustomerFinderBean beanRef = (itso.ejb35.session.CustomerFinderBean)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = beanRef.findDab(partialName);
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
	 * findJdbc
	 * @generated
	 */
	public java.util.Vector findJdbc(java.lang.String partialName) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.util.Vector _EJS_result = null;
		try {
			itso.ejb35.session.CustomerFinderBean beanRef = (itso.ejb35.session.CustomerFinderBean)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = beanRef.findJdbc(partialName);
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
	 * findStp
	 * @generated
	 */
	public java.util.Vector findStp(java.lang.String partialName) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.util.Vector _EJS_result = null;
		try {
			itso.ejb35.session.CustomerFinderBean beanRef = (itso.ejb35.session.CustomerFinderBean)container.preInvoke(this, 2, _EJS_s);
			_EJS_result = beanRef.findStp(partialName);
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
	 * findStp2
	 * @generated
	 */
	public java.util.Vector findStp2(java.lang.String partialName) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.util.Vector _EJS_result = null;
		try {
			itso.ejb35.session.CustomerFinderBean beanRef = (itso.ejb35.session.CustomerFinderBean)container.preInvoke(this, 3, _EJS_s);
			_EJS_result = beanRef.findStp2(partialName);
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
}
