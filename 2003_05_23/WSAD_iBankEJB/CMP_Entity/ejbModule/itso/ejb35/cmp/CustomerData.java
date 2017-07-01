package itso.ejb35.cmp;
import com.ibm.etools.ejb.client.runtime.*;
/**
 * CustomerData
 * @generated
 */
public class CustomerData extends AbstractEntityData {
	/**
	 * @generated
	 */
	private itso.ejb35.util.CustomerAddress address;
	/**
	 * @generated
	 */
	private boolean isaddressDirty = false;
	/**
	 * @generated
	 */
	private int customerID;
	/**
	 * @generated
	 */
	private boolean iscustomerIDDirty = false;
	/**
	 * @generated
	 */
	private java.lang.String firstName;
	/**
	 * @generated
	 */
	private boolean isfirstNameDirty = false;
	/**
	 * @generated
	 */
	private java.lang.String lastName;
	/**
	 * @generated
	 */
	private boolean islastNameDirty = false;
	/**
	 * @generated
	 */
	private java.lang.String name;
	/**
	 * @generated
	 */
	private boolean isnameDirty = false;
	/**
	 * @generated
	 */
	private java.lang.String password;
	/**
	 * @generated
	 */
	private boolean ispasswordDirty = false;
	/**
	 * @generated
	 */
	private java.lang.String title;
	/**
	 * @generated
	 */
	private boolean istitleDirty = false;
	/**
	 * @generated
	 */
	private java.lang.String userID;
	/**
	 * @generated
	 */
	private boolean isuserIDDirty = false;
	/**
	 * getIsaddressDirty
	 * @generated
	 */
	public boolean getIsaddressDirty() {
		return this.isaddressDirty;
	}
	/**
	 * getAddress
	 * @generated
	 */
	public itso.ejb35.util.CustomerAddress getAddress() {
		return this.address;
	}
	/**
	 * setAddress
	 * @generated
	 */
	public void setAddress(itso.ejb35.util.CustomerAddress value) {
		this.address = value;
		this.isaddressDirty = true;
		this.isDirty = true;
	}
	/**
	 * getIscustomerIDDirty
	 * @generated
	 */
	public boolean getIscustomerIDDirty() {
		return this.iscustomerIDDirty;
	}
	/**
	 * getCustomerID
	 * @generated
	 */
	public int getCustomerID() {
		return this.customerID;
	}
	/**
	 * getIsfirstNameDirty
	 * @generated
	 */
	public boolean getIsfirstNameDirty() {
		return this.isfirstNameDirty;
	}
	/**
	 * getFirstName
	 * @generated
	 */
	public java.lang.String getFirstName() {
		return this.firstName;
	}
	/**
	 * setFirstName
	 * @generated
	 */
	public void setFirstName(java.lang.String value) {
		this.firstName = value;
		this.isfirstNameDirty = true;
		this.isDirty = true;
	}
	/**
	 * getIslastNameDirty
	 * @generated
	 */
	public boolean getIslastNameDirty() {
		return this.islastNameDirty;
	}
	/**
	 * getLastName
	 * @generated
	 */
	public java.lang.String getLastName() {
		return this.lastName;
	}
	/**
	 * setLastName
	 * @generated
	 */
	public void setLastName(java.lang.String value) {
		this.lastName = value;
		this.islastNameDirty = true;
		this.isDirty = true;
	}
	/**
	 * getIsnameDirty
	 * @generated
	 */
	public boolean getIsnameDirty() {
		return this.isnameDirty;
	}
	/**
	 * getName
	 * @generated
	 */
	public java.lang.String getName() {
		return this.name;
	}
	/**
	 * getIspasswordDirty
	 * @generated
	 */
	public boolean getIspasswordDirty() {
		return this.ispasswordDirty;
	}
	/**
	 * getPassword
	 * @generated
	 */
	public java.lang.String getPassword() {
		return this.password;
	}
	/**
	 * setPassword
	 * @generated
	 */
	public void setPassword(java.lang.String value) {
		this.password = value;
		this.ispasswordDirty = true;
		this.isDirty = true;
	}
	/**
	 * getIstitleDirty
	 * @generated
	 */
	public boolean getIstitleDirty() {
		return this.istitleDirty;
	}
	/**
	 * getTitle
	 * @generated
	 */
	public java.lang.String getTitle() {
		return this.title;
	}
	/**
	 * setTitle
	 * @generated
	 */
	public void setTitle(java.lang.String value) {
		this.title = value;
		this.istitleDirty = true;
		this.isDirty = true;
	}
	/**
	 * getIsuserIDDirty
	 * @generated
	 */
	public boolean getIsuserIDDirty() {
		return this.isuserIDDirty;
	}
	/**
	 * getUserID
	 * @generated
	 */
	public java.lang.String getUserID() {
		return this.userID;
	}
	/**
	 * setUserID
	 * @generated
	 */
	public void setUserID(java.lang.String value) {
		this.userID = value;
		this.isuserIDDirty = true;
		this.isDirty = true;
	}
	/**
	 * Store
	 * @generated
	 */
	public interface Store extends AbstractEntityData.Store {
			/**
		 * getAddress
		 * @generated
		 */
		public itso.ejb35.util.CustomerAddress getAddress();
		/**
		 * setAddress
		 * @generated
		 */
		public void setAddress(itso.ejb35.util.CustomerAddress value);
		/**
		 * getCustomerID
		 * @generated
		 */
		public int getCustomerID();
		/**
		 * getFirstName
		 * @generated
		 */
		public java.lang.String getFirstName();
		/**
		 * setFirstName
		 * @generated
		 */
		public void setFirstName(java.lang.String value);
		/**
		 * getLastName
		 * @generated
		 */
		public java.lang.String getLastName();
		/**
		 * setLastName
		 * @generated
		 */
		public void setLastName(java.lang.String value);
		/**
		 * getName
		 * @generated
		 */
		public java.lang.String getName();
		/**
		 * getPassword
		 * @generated
		 */
		public java.lang.String getPassword();
		/**
		 * setPassword
		 * @generated
		 */
		public void setPassword(java.lang.String value);
		/**
		 * getTitle
		 * @generated
		 */
		public java.lang.String getTitle();
		/**
		 * setTitle
		 * @generated
		 */
		public void setTitle(java.lang.String value);
		/**
		 * getUserID
		 * @generated
		 */
		public java.lang.String getUserID();
		/**
		 * setUserID
		 * @generated
		 */
		public void setUserID(java.lang.String value);
}
	/**
	 * CustomerData
	 * @generated
	 */
	public CustomerData() {
		super();
	}
	/**
	 * CustomerData
	 * @generated
	 */
	public CustomerData(CustomerData.Store initializer) {
		super(initializer);
		initialize(initializer);
	}
	/**
	 * initialize
	 * @generated
	 */
	protected void initialize(CustomerData.Store initializer) {
		this.address = initializer.getAddress();
		this.customerID = initializer.getCustomerID();
		this.firstName = initializer.getFirstName();
		this.lastName = initializer.getLastName();
		this.name = initializer.getName();
		this.password = initializer.getPassword();
		this.title = initializer.getTitle();
		this.userID = initializer.getUserID();
	}
	/**
	 * copyTo
	 * @generated
	 */
	public void copyTo(CustomerData.Store target) {
		if (!this.isDirty) return;
		if (this.isaddressDirty ) target.setAddress(this.address);
		if (this.isfirstNameDirty ) target.setFirstName(this.firstName);
		if (this.islastNameDirty ) target.setLastName(this.lastName);
		if (this.ispasswordDirty ) target.setPassword(this.password);
		if (this.istitleDirty ) target.setTitle(this.title);
		if (this.isuserIDDirty ) target.setUserID(this.userID);
	}
}
