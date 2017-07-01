package itso.ejb35.cmp;
/**
 * Key class for Entity Bean: BankAccount
 */
public class BankAccountKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	/**
	 * Implemetation field for persistent attribute: accID
	 */
	public java.lang.String accID;
	/**
	 * Creates an empty key for Entity Bean: BankAccount
	 */
	public BankAccountKey() {
	}
	/**
	 * Creates a key for Entity Bean: BankAccount
	 */
	public BankAccountKey(java.lang.String accID) {
		this.accID = accID;
	}
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof itso.ejb35.cmp.BankAccountKey) {
			itso.ejb35.cmp.BankAccountKey o = (itso.ejb35.cmp.BankAccountKey)otherKey;
			return ((this.accID.equals(o.accID)));
		}
		return false;
	}
	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (accID.hashCode());
	}
}
