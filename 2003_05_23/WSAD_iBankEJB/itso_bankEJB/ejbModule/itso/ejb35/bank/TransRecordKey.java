package itso.ejb35.bank;

public class TransRecordKey implements java.io.Serializable {
	private final static long serialVersionUID = 3206093459760846163L;
	public java.sql.Timestamp transID;

/**
 * Default constructor
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public TransRecordKey() {
	super();
}
/**
 * Initialize a key from the passed values
 * @param argTransID java.sql.Timestamp
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public TransRecordKey(java.sql.Timestamp argTransID) {
	transID = argTransID;
}
/**
 * equals method
 * @return boolean
 * @param o java.lang.Object
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public boolean equals(java.lang.Object o) {
	if (o instanceof TransRecordKey) {
		TransRecordKey otherKey = (TransRecordKey) o;
		return ((this.transID.equals(otherKey.transID)));
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
	return (transID.hashCode());
}
}
