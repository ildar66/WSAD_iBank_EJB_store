package itso.ejb35.session;
/**
 * Remote interface for Enterprise Bean: CustomerManager
 */
public interface CustomerManager extends javax.ejb.EJBObject {
	/**
	 * 
	 * @return itso.ejb35.cmp.Customer
	 * @param id int
	 * @param title java.lang.String
	 * @param firstName java.lang.String
	 * @param lastName java.lang.String
	 * @param userid java.lang.String
	 * @param password java.lang.String
	 * @exception String The exception description.
	 */
	itso.ejb35.cmp.Customer createCustomer(
		int id,
		java.lang.String title,
		java.lang.String firstName,
		java.lang.String lastName,
		java.lang.String userid,
		java.lang.String password)
		throws java.rmi.RemoteException;

	/**
	 * 
	 * @return itso.ejb35.cmp.Customer
	 * @param id int
	 * @exception String The exception description.
	 */
	itso.ejb35.cmp.Customer findCustomer(int id) throws java.rmi.RemoteException;
	/**
	 * 
	 * @return java.util.Hashtable
	 * @param customer itso.ejb35.cmp.Customer
	 * @exception String The exception description.
	 */
	java.util.Hashtable getAllProperties(itso.ejb35.cmp.Customer customer)
		throws java.rmi.RemoteException;
	/**
	 * 
	 * @return void
	 * @param customer itso.ejb35.cmp.Customer
	 * @param ht java.util.Hashtable
	 * @exception String The exception description.
	 */
	void setAllProperties(itso.ejb35.cmp.Customer customer, java.util.Hashtable ht)
		throws java.rmi.RemoteException;
}