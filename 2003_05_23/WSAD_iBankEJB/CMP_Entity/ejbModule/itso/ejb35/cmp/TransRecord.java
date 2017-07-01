package itso.ejb35.cmp;
/**
 * Remote interface for Enterprise Bean: TransRecord
 */
public interface TransRecord extends javax.ejb.EJBObject {
	/**
	 * Get accessor for persistent attribute: transamt
	 */
	public java.math.BigDecimal getTransamt() throws java.rmi.RemoteException;
	/**
	 * Set accessor for persistent attribute: transamt
	 */
	public void setTransamt(java.math.BigDecimal newTransamt) throws java.rmi.RemoteException;
	/**
	 * Get accessor for persistent attribute: transtype
	 */
	public java.lang.String getTranstype() throws java.rmi.RemoteException;
	/**
	 * Set accessor for persistent attribute: transtype
	 */
	public void setTranstype(java.lang.String newTranstype) throws java.rmi.RemoteException;
	/**
	 * Get accessor for persistent attribute: accID
	 */
	public java.lang.String getAccID() throws java.rmi.RemoteException;
	/**
	 * Set accessor for persistent attribute: accID
	 */
	public void setAccID(java.lang.String newAccID) throws java.rmi.RemoteException;
	/**
	 * getTransRecordData
	 */
	public itso.ejb35.cmp.TransRecordData getTransRecordData() throws java.rmi.RemoteException;
	/**
	 * setTransRecordData
	 */
	public void setTransRecordData(itso.ejb35.cmp.TransRecordData data) throws java.rmi.RemoteException, com.ibm.etools.ejb.client.runtime.FieldChangedException;
	/**
	 * syncTransRecordData
	 */
	public itso.ejb35.cmp.TransRecordData syncTransRecordData(itso.ejb35.cmp.TransRecordData data) throws java.rmi.RemoteException;
}
