package itso.ejb35.bmp;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPTransactionRecordHomeBean
 * @generated
 */
public class EJSBMPTransactionRecordHomeBean extends EJSHome {
	/**
	 * EJSBMPTransactionRecordHomeBean
	 * @generated
	 */
	public EJSBMPTransactionRecordHomeBean() throws java.rmi.RemoteException {
		super();	}
	/**
	 * create
	 * @generated
	 */
	public itso.ejb35.bmp.TransactionRecord create(java.lang.String acctID, java.math.BigDecimal amount, java.lang.String aTranstype) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		itso.ejb35.bmp.TransactionRecord _EJS_result = null;
		boolean createFailed = false;
		try {
			beanO = super.createBeanO();
			itso.ejb35.bmp.TransactionRecordBean bean = (itso.ejb35.bmp.TransactionRecordBean) beanO.getEnterpriseBean();
			itso.ejb35.bmp.TransactionRecordKey _primaryKey = bean.ejbCreate(acctID, amount, aTranstype);
			_EJS_result = (itso.ejb35.bmp.TransactionRecord) super.postCreate(beanO, _primaryKey);
			bean.ejbPostCreate(acctID, amount, aTranstype);
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
	 * findByPrimaryKey
	 * @generated
	 */
	public TransactionRecord findByPrimaryKey(itso.ejb35.bmp.TransactionRecordKey key) throws java.rmi.RemoteException, javax.ejb.FinderException, javax.ejb.ObjectNotFoundException {
		BeanManagedBeanO _EJS_beanO = null;
		itso.ejb35.bmp.TransactionRecordKey _EJS_key = null;
		try {
			_EJS_beanO = super.getFinderBeanO();
			itso.ejb35.bmp.TransactionRecordBean _EJS_bean = (itso.ejb35.bmp.TransactionRecordBean)_EJS_beanO.getEnterpriseBean();
			_EJS_key = _EJS_bean.ejbFindByPrimaryKey(key);
		}
		finally {
			super.releaseFinderBeanO(_EJS_beanO);
		}
		return (TransactionRecord)super.activateBean((java.lang.Object)_EJS_key);	}
}
