package itso.ejb35.cmp;
/**
 * Key class for Entity Bean: TransRecord
 */
public class TransRecordKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	/**
	 * Implemetation field for persistent attribute: transID
	 */
	public java.sql.Timestamp transID;
	/**
	 * Creates an empty key for Entity Bean: TransRecord
	 */
	public TransRecordKey() {
	}
	/**
	 * Creates a key for Entity Bean: TransRecord
	 */
	public TransRecordKey(java.sql.Timestamp transID) {
		this.transID = transID;
	}
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof itso.ejb35.cmp.TransRecordKey) {
			itso.ejb35.cmp.TransRecordKey o = (itso.ejb35.cmp.TransRecordKey)otherKey;
			return ((this.transID.equals(o.transID)));
		}
		return false;
	}
	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (transID.hashCode());
	}
}
