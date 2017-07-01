package itso.ejb35.bmp;
/**
 * Remote interface for Enterprise Bean: TransactionRecord
 */
public interface TransactionRecord extends javax.ejb.EJBObject {
/**
 * Insert the method's description here.
 * Creation date: (04.04.2003 14:57:58)
 * @return java.math.BigDecimal
 */
public java.math.BigDecimal getTransamt() throws java.rmi.RemoteException;
/**
 * Insert the method's description here.
 * Creation date: (04.04.2003 14:55:59)
 * @return java.sql.Timestamp
 */
public java.sql.Timestamp getTransID() throws java.rmi.RemoteException;
/**
 * Insert the method's description here.
 * Creation date: (04.04.2003 14:56:48)
 * @return java.lang.String
 */
public java.lang.String getTranstype() throws java.rmi.RemoteException;
/**
 * Insert the method's description here.
 * Creation date: (04.04.2003 14:57:28)
 * @return java.lang.String
 */
public java.lang.String getAccID() throws java.rmi.RemoteException;
/**
 * Insert the method's description here.
 * Creation date: (04.04.2003 14:57:28)
 * @param newAccID java.lang.String
 */
public void setAccID(java.lang.String newAccID) throws java.rmi.RemoteException;
/**
 * Insert the method's description here.
 * Creation date: (04.04.2003 14:57:58)
 * @param newTransamt java.math.BigDecimal
 */
public void setTransamt(java.math.BigDecimal newTransamt) throws java.rmi.RemoteException;
/**
 * Insert the method's description here.
 * Creation date: (04.04.2003 14:56:48)
 * @param newTranstype java.lang.String
 */
public void setTranstype(java.lang.String newTranstype) throws java.rmi.RemoteException;
}
