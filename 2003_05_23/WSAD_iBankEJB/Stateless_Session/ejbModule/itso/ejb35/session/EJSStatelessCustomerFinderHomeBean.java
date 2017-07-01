package itso.ejb35.session;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSStatelessCustomerFinderHomeBean
 * @generated
 */
public class EJSStatelessCustomerFinderHomeBean extends EJSHome {
	/**
	 * EJSStatelessCustomerFinderHomeBean
	 * @generated
	 */
	public EJSStatelessCustomerFinderHomeBean() throws java.rmi.RemoteException {
		super();	}
	/**
	 * create
	 * @generated
	 */
	public itso.ejb35.session.CustomerFinder create() throws javax.ejb.CreateException, java.rmi.RemoteException {
BeanO beanO = null;
itso.ejb35.session.CustomerFinder _EJS_result = null;
boolean createFailed = false;
try {
	_EJS_result = (itso.ejb35.session.CustomerFinder) super.createWrapper(new BeanId(this, null));
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
