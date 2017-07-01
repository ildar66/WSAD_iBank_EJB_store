package itso.ejb35.cmp;
import javax.ejb.*;
import java.rmi.RemoteException;
import javax.naming.NamingException;
import com.ibm.etools.ejb.client.runtime.*;
/**
 * CustomerFactory
 * @generated
 */
public class CustomerFactory extends AbstractEJBFactory {
	/**
	 * CustomerFactory
	 * @generated
	 */
	public CustomerFactory() {
		super();
	}
	/**
	 * _acquireCustomerHome
	 * @generated
	 */
	protected itso.ejb35.cmp.CustomerHome _acquireCustomerHome() throws java.rmi.RemoteException {
		return (itso.ejb35.cmp.CustomerHome) _acquireEJBHome();
	}
	/**
	 * acquireCustomerHome
	 * @generated
	 */
	public itso.ejb35.cmp.CustomerHome acquireCustomerHome() throws javax.naming.NamingException {
		return (itso.ejb35.cmp.CustomerHome) acquireEJBHome();
	}
	/**
	 * getDefaultJNDIName
	 * @generated
	 */
	public String getDefaultJNDIName() {
		return "ejb/itso/ejb35/cmp/CustomerHome";
	}
	/**
	 * getHomeInterface
	 * @generated
	 */
	protected Class getHomeInterface() {
		return itso.ejb35.cmp.CustomerHome.class;
	}
	/**
	 * resetCustomerHome
	 * @generated
	 */
	public void resetCustomerHome() {
		resetEJBHome();
	}
	/**
	 * setCustomerHome
	 * @generated
	 */
	public void setCustomerHome(itso.ejb35.cmp.CustomerHome home) {
		setEJBHome(home);
	}
	/**
	 * create
	 * @generated
	 */
	public itso.ejb35.cmp.Customer create(int customerID) throws CreateException, RemoteException {
		return _acquireCustomerHome().create(customerID);
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public itso.ejb35.cmp.Customer findByPrimaryKey(itso.ejb35.cmp.CustomerKey primaryKey) throws FinderException, RemoteException {
		return _acquireCustomerHome().findByPrimaryKey(primaryKey);
	}
	/**
	 * create
	 * @generated
	 */
	public itso.ejb35.cmp.Customer create(int argCustomerID, java.lang.String aTitle, java.lang.String aFirstName, java.lang.String aLastName, java.lang.String aUserID, java.lang.String aPassword) throws CreateException, RemoteException {
		return _acquireCustomerHome().create(argCustomerID, aTitle, aFirstName, aLastName, aUserID, aPassword);
	}
}
