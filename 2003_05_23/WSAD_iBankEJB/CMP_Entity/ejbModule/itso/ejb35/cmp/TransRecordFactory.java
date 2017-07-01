package itso.ejb35.cmp;
import javax.ejb.*;
import java.rmi.RemoteException;
import javax.naming.NamingException;
import com.ibm.etools.ejb.client.runtime.*;
/**
 * TransRecordFactory
 * @generated
 */
public class TransRecordFactory extends AbstractEJBFactory {
	/**
	 * TransRecordFactory
	 * @generated
	 */
	public TransRecordFactory() {
		super();
	}
	/**
	 * _acquireTransRecordHome
	 * @generated
	 */
	protected itso.ejb35.cmp.TransRecordHome _acquireTransRecordHome() throws java.rmi.RemoteException {
		return (itso.ejb35.cmp.TransRecordHome) _acquireEJBHome();
	}
	/**
	 * acquireTransRecordHome
	 * @generated
	 */
	public itso.ejb35.cmp.TransRecordHome acquireTransRecordHome() throws javax.naming.NamingException {
		return (itso.ejb35.cmp.TransRecordHome) acquireEJBHome();
	}
	/**
	 * getDefaultJNDIName
	 * @generated
	 */
	public String getDefaultJNDIName() {
		return "ejb/itso/ejb35/cmp/TransRecordHome";
	}
	/**
	 * getHomeInterface
	 * @generated
	 */
	protected Class getHomeInterface() {
		return itso.ejb35.cmp.TransRecordHome.class;
	}
	/**
	 * resetTransRecordHome
	 * @generated
	 */
	public void resetTransRecordHome() {
		resetEJBHome();
	}
	/**
	 * setTransRecordHome
	 * @generated
	 */
	public void setTransRecordHome(itso.ejb35.cmp.TransRecordHome home) {
		setEJBHome(home);
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public itso.ejb35.cmp.TransRecord findByPrimaryKey(itso.ejb35.cmp.TransRecordKey primaryKey) throws FinderException, RemoteException {
		return _acquireTransRecordHome().findByPrimaryKey(primaryKey);
	}
	/**
	 * create
	 * @generated
	 */
	public itso.ejb35.cmp.TransRecord create(java.lang.String anAccID, java.math.BigDecimal anAmount, java.lang.String aTranstype) throws CreateException, RemoteException {
		return _acquireTransRecordHome().create(anAccID, anAmount, aTranstype);
	}
	/**
	 * create
	 * @generated
	 */
	public itso.ejb35.cmp.TransRecord create(java.sql.Timestamp transID) throws CreateException, RemoteException {
		return _acquireTransRecordHome().create(transID);
	}
}
