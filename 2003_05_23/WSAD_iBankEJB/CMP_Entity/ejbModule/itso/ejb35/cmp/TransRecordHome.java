package itso.ejb35.cmp;
/**
 * Home interface for Enterprise Bean: TransRecord
 */
public interface TransRecordHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: TransRecord
	 */
	public itso.ejb35.cmp.TransRecord create(
		String anAccID,
		java.math.BigDecimal anAmount,
		String aTranstype)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: TransRecord
	 */
	public itso.ejb35.cmp.TransRecord findByPrimaryKey(
		itso.ejb35.cmp.TransRecordKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	/**
	 * Creates an instance from a key for Entity Bean: TransRecord
	 */
	public itso.ejb35.cmp.TransRecord create(java.sql.Timestamp transID) throws javax.ejb.CreateException, java.rmi.RemoteException;
}