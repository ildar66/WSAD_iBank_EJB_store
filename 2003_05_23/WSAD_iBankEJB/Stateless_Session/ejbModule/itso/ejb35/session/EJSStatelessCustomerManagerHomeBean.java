package itso.ejb35.session;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSStatelessCustomerManagerHomeBean
 * @generated
 */
public class EJSStatelessCustomerManagerHomeBean extends EJSHome {
	/**
	 * EJSStatelessCustomerManagerHomeBean
	 * @generated
	 */
	public EJSStatelessCustomerManagerHomeBean() throws java.rmi.RemoteException {
		super();	}
	/**
	 * create
	 * @generated
	 */
	public itso.ejb35.session.CustomerManager create() throws javax.ejb.CreateException, java.rmi.RemoteException {
BeanO beanO = null;
itso.ejb35.session.CustomerManager _EJS_result = null;
boolean createFailed = false;
try {
	_EJS_result = (itso.ejb35.session.CustomerManager) super.createWrapper(new BeanId(this, null));
}
catch (javax.ejb.CreateException ex) {
	createFailed = true;
	throw ex;
} catch (java.rmi.RemoteException ex) {
	createFailed = true;
	throw ex;
} catch (Throwable ex) {
	createFailed = true;
	throw new CreateFailureException(ex);
} finally {
	if (createFailed) {
		super.createFailure(beanO);
	}
}
return _EJS_result;	}
}
