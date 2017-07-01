package itso.ejb35.cmp;
/**
 * Remote interface for Enterprise Bean: Customer
 */
public interface Customer extends javax.ejb.EJBObject {
	/**
	 * Get accessor for persistent attribute: firstName
	 */
	public java.lang.String getFirstName() throws java.rmi.RemoteException;
	/**
	 * Set accessor for persistent attribute: firstName
	 */
	public void setFirstName(java.lang.String newFirstName) throws java.rmi.RemoteException;
	/**
	 * Get accessor for persistent attribute: lastName
	 */
	public java.lang.String getLastName() throws java.rmi.RemoteException;
	/**
	 * Set accessor for persistent attribute: lastName
	 */
	public void setLastName(java.lang.String newLastName) throws java.rmi.RemoteException;
	/**
	 * Get accessor for persistent attribute: title
	 */
	public java.lang.String getTitle() throws java.rmi.RemoteException;
	/**
	 * Set accessor for persistent attribute: title
	 */
	public void setTitle(java.lang.String newTitle) throws java.rmi.RemoteException;
	/**
	 * Get accessor for persistent attribute: userID
	 */
	public java.lang.String getUserID() throws java.rmi.RemoteException;
	/**
	 * Set accessor for persistent attribute: userID
	 */
	public void setUserID(java.lang.String newUserID) throws java.rmi.RemoteException;
	/**
	 * Get accessor for persistent attribute: password
	 */
	public java.lang.String getPassword() throws java.rmi.RemoteException;
	/**
	 * Set accessor for persistent attribute: password
	 */
	public void setPassword(java.lang.String newPassword) throws java.rmi.RemoteException;
	/**
	 * Get accessor for persistent attribute: address
	 */
	public itso.ejb35.util.CustomerAddress getAddress() throws java.rmi.RemoteException;
	/**
	 * Set accessor for persistent attribute: address
	 */
	public void setAddress(itso.ejb35.util.CustomerAddress newAddress) throws java.rmi.RemoteException;
	public String getName() throws java.rmi.RemoteException;
	public int getCustomerID() throws java.rmi.RemoteException;
	/**
	 * getCustomerData
	 */
	public itso.ejb35.cmp.CustomerData getCustomerData() throws java.rmi.RemoteException;
	/**
	 * setCustomerData
	 */
	public void setCustomerData(itso.ejb35.cmp.CustomerData data) throws java.rmi.RemoteException, com.ibm.etools.ejb.client.runtime.FieldChangedException;
	/**
	 * syncCustomerData
	 */
	public itso.ejb35.cmp.CustomerData syncCustomerData(itso.ejb35.cmp.CustomerData data) throws java.rmi.RemoteException;
}
