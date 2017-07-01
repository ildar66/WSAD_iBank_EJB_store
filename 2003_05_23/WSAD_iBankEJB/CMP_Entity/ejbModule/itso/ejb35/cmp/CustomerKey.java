package itso.ejb35.cmp;
/**
 * Key class for Entity Bean: Customer
 */
public class CustomerKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	/**
	 * Implemetation field for persistent attribute: customerID
	 */
	public int customerID;
	/**
	 * Creates an empty key for Entity Bean: Customer
	 */
	public CustomerKey() {
	}
	/**
	 * Creates a key for Entity Bean: Customer
	 */
	public CustomerKey(int customerID) {
		this.customerID = customerID;
	}
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof itso.ejb35.cmp.CustomerKey) {
			itso.ejb35.cmp.CustomerKey o = (itso.ejb35.cmp.CustomerKey)otherKey;
			return ((this.customerID == o.customerID));
		}
		return false;
	}
	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return ((new java.lang.Integer(customerID).hashCode()));
	}
}
