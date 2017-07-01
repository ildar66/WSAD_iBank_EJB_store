package itso.ejb35.cmp;
import java.rmi.*;
import javax.ejb.*;
import javax.naming.*;
/**
 * Bean implementation class for Enterprise Bean: Customer
 */
public class CustomerBean implements javax.ejb.EntityBean, itso.ejb35.cmp.CustomerData.Store {

	private javax.ejb.EntityContext myEntityCtx;
	/**
	 * Implemetation field for persistent attribute: customerID
	 */
	public int customerID;
	/**
	 * Implemetation field for persistent attribute: firstName
	 */
	public java.lang.String firstName;
	/**
	 * Implemetation field for persistent attribute: lastName
	 */
	public java.lang.String lastName;
	/**
	 * Implemetation field for persistent attribute: title
	 */
	public java.lang.String title;
	/**
	 * Implemetation field for persistent attribute: userID
	 */
	public java.lang.String userID;
	/**
	 * Implemetation field for persistent attribute: password
	 */
	public java.lang.String password;
	/**
	 * Implemetation field for persistent attribute: address
	 */
	public itso.ejb35.util.CustomerAddress address;
	/**
	 * getEntityContext
	 */
	public javax.ejb.EntityContext getEntityContext() {
		return myEntityCtx;
	}
	/**
	 * setEntityContext
	 */
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		myEntityCtx = ctx;
	}
	/**
	 * unsetEntityContext
	 */
	public void unsetEntityContext() {
		myEntityCtx = null;
	}
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		_initLinks();
	}
	/**
	 * ejbCreate method for a CMP entity bean.
	 */
	public itso.ejb35.cmp.CustomerKey ejbCreate(int argCustomerID)
		throws javax.ejb.CreateException {
		_initLinks();
		// All CMP fields should be initialized here.
		customerID = argCustomerID;
		firstName = "";
		lastName = "";
		password = "";
		title = "";
		userID = "";
		address = new itso.ejb35.util.CustomerAddress();
		return null;
	}
	public itso.ejb35.cmp.CustomerKey ejbCreate(
		int argCustomerID,
		String aTitle,
		String aFirstName,
		String aLastName,
		String aUserID,
		String aPassword)
		throws javax.ejb.CreateException {
		_initLinks();
		// All CMP fields should be initialized here.
		customerID = argCustomerID;
		title = aTitle;
		firstName = aFirstName;
		lastName = aLastName;
		userID = aUserID;
		password = aPassword;
		address = new itso.ejb35.util.CustomerAddress();
		return null;
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		_initLinks();
	}
	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(int customerID) throws javax.ejb.CreateException {
	}
	/**
	* ejbPostCreate
	*/
	public void ejbPostCreate(
		int argCustomerID,
		String aTitle,
		String aFirstName,
		String aLastName,
		String aUserID,
		String aPassword)
		throws javax.ejb.CreateException {
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove() throws javax.ejb.RemoveException {
		try {
			_removeLinks();
		} catch (java.rmi.RemoteException e) {
			throw new javax.ejb.RemoveException(e.getMessage());
		}
	}
	/**
	 * ejbStore
	 */
	public void ejbStore() {
	}
	/**
	 * This method was generated for supporting the associations.
	 */
	protected void _initLinks() {
	}
	/**
	 * This method was generated for supporting the associations.
	 */
	protected java.util.Vector _getLinks() {
		java.util.Vector links = new java.util.Vector();
		return links;
	}
	/**
	 * This method was generated for supporting the associations.
	 */
	protected void _removeLinks()
		throws java.rmi.RemoteException, javax.ejb.RemoveException {
		java.util.List links = _getLinks();
		for (int i = 0; i < links.size(); i++) {
			try {
				((com.ibm.ivj.ejb.associations.interfaces.Link) links.get(i)).remove();
			} catch (javax.ejb.FinderException e) {
			} //Consume Finder error since I am going away
		}
	}
	/**
	 * Get accessor for persistent attribute: firstName
	 */
	public java.lang.String getFirstName() {
		return firstName;
	}
	/**
	 * Set accessor for persistent attribute: firstName
	 */
	public void setFirstName(java.lang.String newFirstName) {
		firstName = newFirstName;
	}
	/**
	 * Get accessor for persistent attribute: lastName
	 */
	public java.lang.String getLastName() {
		return lastName;
	}
	/**
	 * Set accessor for persistent attribute: lastName
	 */
	public void setLastName(java.lang.String newLastName) {
		lastName = newLastName;
	}
	/**
	 * Get accessor for persistent attribute: title
	 */
	public java.lang.String getTitle() {
		return title;
	}
	/**
	 * Set accessor for persistent attribute: title
	 */
	public void setTitle(java.lang.String newTitle) {
		title = newTitle;
	}
	/**
	 * Get accessor for persistent attribute: userID
	 */
	public java.lang.String getUserID() {
		return userID;
	}
	/**
	 * Set accessor for persistent attribute: userID
	 */
	public void setUserID(java.lang.String newUserID) {
		userID = newUserID;
	}
	/**
	 * Get accessor for persistent attribute: password
	 */
	public java.lang.String getPassword() {
		return password;
	}
	/**
	 * Set accessor for persistent attribute: password
	 */
	public void setPassword(java.lang.String newPassword) {
		password = newPassword;
	}
	/**
	 * Get accessor for persistent attribute: address
	 */
	public itso.ejb35.util.CustomerAddress getAddress() {
		return address;
	}
	/**
	 * Set accessor for persistent attribute: address
	 */
	public void setAddress(itso.ejb35.util.CustomerAddress newAddress) {
		address = newAddress;
	}
	public String getName() {
		return title.trim() + ". " + firstName.trim() + " " + lastName.trim();
	}
	public int getCustomerID() {
		return customerID;
	}
	/**
	 * getCustomerData
	 */
	public itso.ejb35.cmp.CustomerData getCustomerData() {
		return new itso.ejb35.cmp.CustomerData(this);
	}
	/**
	 * setCustomerData
	 */
	public void setCustomerData(itso.ejb35.cmp.CustomerData data) throws com.ibm.etools.ejb.client.runtime.FieldChangedException {
		data.copyTo(this);
		if ( !data.getIsaddressDirty() ) {
			if ( this.getAddress() != null && data.getAddress() != null ) {
				if ( !this.getAddress().equals(data.getAddress()) ) {
					throw new com.ibm.etools.ejb.client.runtime.FieldChangedException();
				}
			}
			else if ( !(this.getAddress() == null && data.getAddress() == null) ) {
				throw new com.ibm.etools.ejb.client.runtime.FieldChangedException();
			}
		}
		if ( !data.getIsfirstNameDirty() ) {
			if ( this.getFirstName() != null && data.getFirstName() != null ) {
				if ( !this.getFirstName().equals(data.getFirstName()) ) {
					throw new com.ibm.etools.ejb.client.runtime.FieldChangedException();
				}
			}
			else if ( !(this.getFirstName() == null && data.getFirstName() == null) ) {
				throw new com.ibm.etools.ejb.client.runtime.FieldChangedException();
			}
		}
		if ( !data.getIslastNameDirty() ) {
			if ( this.getLastName() != null && data.getLastName() != null ) {
				if ( !this.getLastName().equals(data.getLastName()) ) {
					throw new com.ibm.etools.ejb.client.runtime.FieldChangedException();
				}
			}
			else if ( !(this.getLastName() == null && data.getLastName() == null) ) {
				throw new com.ibm.etools.ejb.client.runtime.FieldChangedException();
			}
		}
		if ( !data.getIspasswordDirty() ) {
			if ( this.getPassword() != null && data.getPassword() != null ) {
				if ( !this.getPassword().equals(data.getPassword()) ) {
					throw new com.ibm.etools.ejb.client.runtime.FieldChangedException();
				}
			}
			else if ( !(this.getPassword() == null && data.getPassword() == null) ) {
				throw new com.ibm.etools.ejb.client.runtime.FieldChangedException();
			}
		}
		if ( !data.getIstitleDirty() ) {
			if ( this.getTitle() != null && data.getTitle() != null ) {
				if ( !this.getTitle().equals(data.getTitle()) ) {
					throw new com.ibm.etools.ejb.client.runtime.FieldChangedException();
				}
			}
			else if ( !(this.getTitle() == null && data.getTitle() == null) ) {
				throw new com.ibm.etools.ejb.client.runtime.FieldChangedException();
			}
		}
		if ( !data.getIsuserIDDirty() ) {
			if ( this.getUserID() != null && data.getUserID() != null ) {
				if ( !this.getUserID().equals(data.getUserID()) ) {
					throw new com.ibm.etools.ejb.client.runtime.FieldChangedException();
				}
			}
			else if ( !(this.getUserID() == null && data.getUserID() == null) ) {
				throw new com.ibm.etools.ejb.client.runtime.FieldChangedException();
			}
		}
	}
	/**
	 * syncCustomerData
	 */
	public itso.ejb35.cmp.CustomerData syncCustomerData(itso.ejb35.cmp.CustomerData data) {
		data.copyTo(this);
		return this.getCustomerData();
	}
	/**
	 * getPrimaryKey
	 */
	public Object getPrimaryKey() {
		return getEntityContext().getPrimaryKey();
	}
}
