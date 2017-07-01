package itso.ejb35.cmp;
/**
 * Home interface for Enterprise Bean: Customer
 */
public interface CustomerHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: Customer
	 */
	public itso.ejb35.cmp.Customer create(int customerID)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	* Creates an instance from a key for Entity Bean: Customer
	*/
	public itso.ejb35.cmp.Customer create(
		int argCustomerID,
		String aTitle,
		String aFirstName,
		String aLastName,
		String aUserID,
		String aPassword)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: Customer
	 */
	public itso.ejb35.cmp.Customer findByPrimaryKey(
		itso.ejb35.cmp.CustomerKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
}