package itso.ejb35.bmp;

/**
 * This is a Home interface for the Entity Bean
 */
public interface TransactionRecordHome extends javax.ejb.EJBHome {

	/**
	 * 
	 * @return itso.ejb35.bmp.TransactionRecord
	 * @param acctID java.lang.String
	 * @param amount java.math.BigDecimal
	 * @param aTranstype java.lang.String
	 * @exception String The exception description.
	 * @exception String The exception description.
	 */
	itso.ejb35.bmp.TransactionRecord create(
		java.lang.String acctID,
		java.math.BigDecimal amount,
		java.lang.String aTranstype)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * findByPrimaryKey method comment
	 * @return itso.ejb35.bmp.TransactionRecord
	 * @param key itso.ejb35.bmp.TransactionRecordKey
	 * @exception java.rmi.RemoteException The exception description.
	 * @exception javax.ejb.FinderException The exception description.
	 */
	itso.ejb35.bmp.TransactionRecord findByPrimaryKey(
		itso.ejb35.bmp.TransactionRecordKey key)
		throws
			java.rmi.RemoteException,
			javax.ejb.FinderException,
			javax.ejb.ObjectNotFoundException;
}