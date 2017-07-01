package itso.ejb35.session;

import itso.ejb35.cmp.*;
import java.rmi.*;
import java.rmi.RemoteException;
import java.security.Identity;
import java.util.*;
import java.util.Properties;
import javax.ejb.*;
import javax.naming.*;
import javax.rmi.*;
/**
 * Bean implementation class for Enterprise Bean: CustomerManager
 */
public class CustomerManagerBean implements javax.ejb.SessionBean {
	private javax.ejb.SessionContext mySessionCtx;
	private CustomerHome customerHome;
	/**
	 * getSessionContext
	 */
	public javax.ejb.SessionContext getSessionContext() {
		return mySessionCtx;
	}
	/**
	 * setSessionContext
	 */
	public void setSessionContext(javax.ejb.SessionContext ctx) {
		mySessionCtx = ctx;
	}
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
	}
	/**
	 * ejbCreate
	 */
	public void ejbCreate() throws javax.ejb.CreateException {
	}
	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove() {
	}
	/**
	* Insert the method's description here.
	* Creation date: (10.04.2003 11:01:09)
	* @return itso.ejb35.cmp.Customer
	* @param id int
	* @param title java.lang.String
	* @param firstName java.lang.String
	* @param lastName java.lang.String
	* @param userid java.lang.String
	* @param password java.lang.String
	*/
	public Customer createCustomer(
		int id,
		String title,
		String firstName,
		String lastName,
		String userid,
		String password) {
		Customer customer = null;
		try {
			customer =
				getCustomerHome().create(id, title, firstName, lastName, userid, password);
		} catch (Exception e) {
			System.out.println("Cannot create a new EJB for customer" + id);
		}
		return customer;
	}
	/**
	* Insert the method's description here.
	* Creation date: (10.04.2003 11:02:59)
	* @return itso.ejb35.cmp.Customer
	* @param id int
	*/
	public Customer findCustomer(int id) {
		Customer customer = null;
		try {
			customer = getCustomerHome().findByPrimaryKey(new CustomerKey(id));
		} catch (Exception e) {
			System.out.println("Cannot find the customer: " + id);
		}
		return customer;
	}
	/**
	* Insert the method's description here.
	* Creation date: (10.04.2003 11:04:00)
	* @return java.util.Hashtable
	* @param customer itso.ejb35.cmp.Customer
	* @exception java.rmi.RemoteException The exception description.
	*/
	public Hashtable getAllProperties(Customer customer)
		throws java.rmi.RemoteException 
		{
		Hashtable ht = new Hashtable();
		ht.put("customerID", new Integer(customer.getCustomerID()));
		ht.put("title", customer.getTitle());
		ht.put("firstName", customer.getFirstName());
		ht.put("lastName", customer.getLastName());
		String userID = customer.getUserID();
		String password = customer.getPassword();
		itso.ejb35.util.CustomerAddress address = customer.getAddress();
		if (userID != null)
			ht.put("userID", userID);
		if (customer.getPassword() != null)
			ht.put("password", password);
		if (customer.getAddress() != null)
			ht.put("address", address);
		return ht;
	}
	/**
	* Insert the method's description here.
	* Creation date: (10.04.2003 11:17:04)
	* @param customer itso.ejb35.cmp.Customer
	* @param ht java.util.Hashtable
	* @exception java.rmi.RemoteException The exception description.
	*/
	public void setAllProperties(Customer customer, Hashtable ht)
		throws java.rmi.RemoteException {
		String localTitle = (String) ht.get("title");
		String localFirstName = (String) ht.get("firstName");
		String localLastName = (String) ht.get("lastName");
		String localPassword = (String) ht.get("password");
		String localUserID = (String) ht.get("userID");
		itso.ejb35.util.CustomerAddress localAddress =
			(itso.ejb35.util.CustomerAddress) ht.get("address");
		// Set the property, only if parameter not null
		if (localTitle != null)
			customer.setTitle(localTitle);
		if (localFirstName != null)
			customer.setFirstName(localFirstName);
		if (localLastName != null)
			customer.setLastName(localTitle);
		if (localUserID != null)
			customer.setUserID(localUserID);
		if (localPassword != null)
			customer.setPassword(localPassword);
		if (localAddress != null)
			customer.setAddress(localAddress);
	}
	/**
	* Insert the method's description here.
	* Creation date: (10.04.2003 10:53:27)
	* @return itso.ejb35.cmp.CustomerHome
	*/
	private CustomerHome getCustomerHome() {
		if (customerHome == null) {
			try {
				// Get initial context
				InitialContext ctx = new InitialContext();
				// Get EJBHome for Customer
				Object objHome = ctx.lookup("ejb/itso/ejb35/cmp/CustomerHome");
				customerHome =
					(CustomerHome) PortableRemoteObject.narrow(objHome, CustomerHome.class);
			} catch (Exception e) {
				System.out.println("Cannot retrieve the EJBHome for Customer");
			}
		}
		return customerHome;
	}
}