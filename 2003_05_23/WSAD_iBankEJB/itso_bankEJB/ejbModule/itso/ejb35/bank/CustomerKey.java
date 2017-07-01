package itso.ejb35.bank;

public class CustomerKey implements java.io.Serializable {
	public int customerID;
	private final static long serialVersionUID = 3206093459760846163L;
/**
 * Default constructor
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public CustomerKey() {
	super();
}
/**
 * Initialize a key from the passed values
 * @param argCustomerID int
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public CustomerKey(int argCustomerID) {
	customerID = argCustomerID;
}
/**
 * equals method
 * @return boolean
 * @param o java.lang.Object
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public boolean equals(java.lang.Object o) {
	if (o instanceof CustomerKey) {
		CustomerKey otherKey = (CustomerKey) o;
		return (((this.customerID == otherKey.customerID)));
	}
	else
		return false;
}
/**
 * hashCode method
 * @return int
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public int hashCode() {
	return ((new java.lang.Integer(customerID).hashCode()));
}
}
