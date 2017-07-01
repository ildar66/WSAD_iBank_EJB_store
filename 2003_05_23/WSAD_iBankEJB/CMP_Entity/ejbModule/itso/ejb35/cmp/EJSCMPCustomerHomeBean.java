package itso.ejb35.cmp;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSCMPCustomerHomeBean
 * @generated
 */
public class EJSCMPCustomerHomeBean extends EJSHome {
	/**
	 * EJSCMPCustomerHomeBean
	 * @generated
	 */
	public EJSCMPCustomerHomeBean() throws java.rmi.RemoteException {
		super();	}
	/**
	 * create
	 * @generated
	 */
	public itso.ejb35.cmp.Customer create(int customerID) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		itso.ejb35.cmp.Customer _EJS_result = null;
		boolean createFailed = false;
		try {
			beanO = super.createBeanO();
			itso.ejb35.cmp.CustomerBean bean = (itso.ejb35.cmp.CustomerBean) beanO.getEnterpriseBean();
			bean.ejbCreate(customerID);
			_EJS_result = (itso.ejb35.cmp.Customer) super.postCreate(beanO, keyFromBean(bean));
			bean.ejbPostCreate(customerID);
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
	public itso.ejb35.cmp.Customer findByPrimaryKey(itso.ejb35.cmp.CustomerKey primaryKey) throws javax.ejb.FinderException, java.rmi.RemoteException {
		return ((itso.ejb35.cmp.EJSJDBCPersisterCMPCustomerBean) persister).findByPrimaryKey(primaryKey);
	}
	/**
	 * create
	 * @generated
	 */
	public itso.ejb35.cmp.Customer create(int argCustomerID, java.lang.String aTitle, java.lang.String aFirstName, java.lang.String aLastName, java.lang.String aUserID, java.lang.String aPassword) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		itso.ejb35.cmp.Customer _EJS_result = null;
		boolean createFailed = false;
		try {
			beanO = super.createBeanO();
			itso.ejb35.cmp.CustomerBean bean = (itso.ejb35.cmp.CustomerBean) beanO.getEnterpriseBean();
			bean.ejbCreate(argCustomerID, aTitle, aFirstName, aLastName, aUserID, aPassword);
			_EJS_result = (itso.ejb35.cmp.Customer) super.postCreate(beanO, keyFromBean(bean));
			bean.ejbPostCreate(argCustomerID, aTitle, aFirstName, aLastName, aUserID, aPassword);
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
		itso.ejb35.cmp.CustomerBean tmpEJB = (itso.ejb35.cmp.CustomerBean) generalEJB;
		itso.ejb35.cmp.CustomerKey keyClass = new itso.ejb35.cmp.CustomerKey();
		keyClass.customerID = tmpEJB.customerID;
		return keyClass;
	}
	/**
	 * keyFromFields
	 * @generated
	 */
	public itso.ejb35.cmp.CustomerKey keyFromFields(int f0) {
		itso.ejb35.cmp.CustomerKey keyClass = new itso.ejb35.cmp.CustomerKey();
		keyClass.customerID = f0;
		return keyClass;
	}
}
