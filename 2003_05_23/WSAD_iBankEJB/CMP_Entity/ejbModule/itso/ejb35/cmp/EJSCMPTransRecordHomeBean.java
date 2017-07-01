package itso.ejb35.cmp;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSCMPTransRecordHomeBean
 * @generated
 */
public class EJSCMPTransRecordHomeBean extends EJSHome {
	/**
	 * EJSCMPTransRecordHomeBean
	 * @generated
	 */
	public EJSCMPTransRecordHomeBean() throws java.rmi.RemoteException {
		super();	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public itso.ejb35.cmp.TransRecord findByPrimaryKey(itso.ejb35.cmp.TransRecordKey primaryKey) throws javax.ejb.FinderException, java.rmi.RemoteException {
		return ((itso.ejb35.cmp.EJSJDBCPersisterCMPTransRecordBean) persister).findByPrimaryKey(primaryKey);
	}
	/**
	 * create
	 * @generated
	 */
	public itso.ejb35.cmp.TransRecord create(java.lang.String anAccID, java.math.BigDecimal anAmount, java.lang.String aTranstype) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		itso.ejb35.cmp.TransRecord _EJS_result = null;
		boolean createFailed = false;
		try {
			beanO = super.createBeanO();
			itso.ejb35.cmp.TransRecordBean bean = (itso.ejb35.cmp.TransRecordBean) beanO.getEnterpriseBean();
			bean.ejbCreate(anAccID, anAmount, aTranstype);
			_EJS_result = (itso.ejb35.cmp.TransRecord) super.postCreate(beanO, keyFromBean(bean));
			bean.ejbPostCreate(anAccID, anAmount, aTranstype);
		}
		catch (javax.ejb.CreateException ex) {
			createFailed = true;
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			createFailed = true;
			throw ex;
		} catch (Throwable ex) {
			createFailed = true;
			throw new CreateFailureException(ex);
		} finally {
			if (createFailed) {
				super.createFailure(beanO);
			}
		}
		return _EJS_result;
	}
	/**
	 * create
	 * @generated
	 */
	public itso.ejb35.cmp.TransRecord create(java.sql.Timestamp transID) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		itso.ejb35.cmp.TransRecord _EJS_result = null;
		boolean createFailed = false;
		try {
			beanO = super.createBeanO();
			itso.ejb35.cmp.TransRecordBean bean = (itso.ejb35.cmp.TransRecordBean) beanO.getEnterpriseBean();
			bean.ejbCreate(transID);
			_EJS_result = (itso.ejb35.cmp.TransRecord) super.postCreate(beanO, keyFromBean(bean));
			bean.ejbPostCreate(transID);
		}
		catch (javax.ejb.CreateException ex) {
			createFailed = true;
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			createFailed = true;
			throw ex;
		} catch (Throwable ex) {
			createFailed = true;
			throw new CreateFailureException(ex);
		} finally {
			if (createFailed) {
				super.createFailure(beanO);
			}
		}
		return _EJS_result;
	}
	/**
	 * keyFromBean
	 * @generated
	 */
	public Object keyFromBean(javax.ejb.EntityBean generalEJB) {
		itso.ejb35.cmp.TransRecordBean tmpEJB = (itso.ejb35.cmp.TransRecordBean) generalEJB;
		itso.ejb35.cmp.TransRecordKey keyClass = new itso.ejb35.cmp.TransRecordKey();
		keyClass.transID = tmpEJB.transID;
		return keyClass;
	}
	/**
	 * keyFromFields
	 * @generated
	 */
	public itso.ejb35.cmp.TransRecordKey keyFromFields(java.sql.Timestamp f0) {
		itso.ejb35.cmp.TransRecordKey keyClass = new itso.ejb35.cmp.TransRecordKey();
		keyClass.transID = f0;
		return keyClass;
	}
}
