package itso.ejb35.bank;

public class BankAccountKey implements java.io.Serializable {
	public java.lang.String accID;
	private final static long serialVersionUID = 3206093459760846163L;

/**
 * Default constructor
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public BankAccountKey() {
	super();
}
/**
 * Initialize a key from the passed values
 * @param argAccID java.lang.String
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public BankAccountKey(java.lang.String argAccID) {
	accID = argAccID;
}
/**
 * equals method
 * @return boolean
 * @param o java.lang.Object
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public boolean equals(java.lang.Object o) {
	if (o instanceof BankAccountKey) {
		BankAccountKey otherKey = (BankAccountKey) o;
		return ((this.accID.equals(otherKey.accID)));
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
	return (accID.hashCode());
}
}
