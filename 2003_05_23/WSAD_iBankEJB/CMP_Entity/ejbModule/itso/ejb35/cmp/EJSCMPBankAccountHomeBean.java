package itso.ejb35.cmp;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSCMPBankAccountHomeBean
 * @generated
 */
public class EJSCMPBankAccountHomeBean extends EJSHome {
	/**
	 * EJSCMPBankAccountHomeBean
	 * @generated
	 */
	public EJSCMPBankAccountHomeBean() throws java.rmi.RemoteException {
		super();	}
	/**
	 * create
	 * @generated
	 */
	public itso.ejb35.cmp.BankAccount create(java.lang.String accID, java.math.BigDecimal argBalance) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		itso.ejb35.cmp.BankAccount _EJS_result = null;
		boolean createFailed = false;
		try {
			beanO = super.createBeanO();
			itso.ejb35.cmp.BankAccountBean bean = (itso.ejb35.cmp.BankAccountBean) beanO.getEnterpriseBean();
			bean.ejbCreate(accID, argBalance);
			_EJS_result = (itso.ejb35.cmp.BankAccount) super.postCreate(beanO, keyFromBean(bean));
			bean.ejbPostCreate(accID, argBalance);
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
	 * findAccountsWithBalanceBetween
	 * @generated
	 */
	public java.util.Enumeration findAccountsWithBalanceBetween(java.math.BigDecimal anAmount1, java.math.BigDecimal anAmount2) throws javax.ejb.FinderException, java.rmi.RemoteException {
return super.getEnumeration(((itso.ejb35.cmp.EJSFinderBankAccountBean)persister).findAccountsWithBalanceBetween(anAmount1, anAmount2));	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public itso.ejb35.cmp.BankAccount findByPrimaryKey(itso.ejb35.cmp.BankAccountKey primaryKey) throws javax.ejb.FinderException, java.rmi.RemoteException {
		return ((itso.ejb35.cmp.EJSJDBCPersisterCMPBankAccountBean) persister).findByPrimaryKey(primaryKey);
	}
	/**
	 * findAccountsWithBalanceGreaterThan
	 * @generated
	 */
	public java.util.Enumeration findAccountsWithBalanceGreaterThan(java.math.BigDecimal anAmount) throws javax.ejb.FinderException, java.rmi.RemoteException {
return super.getEnumeration(((itso.ejb35.cmp.EJSFinderBankAccountBean)persister).findAccountsWithBalanceGreaterThan(anAmount));	}
	/**
	 * findAll
	 * @generated
	 */
	public java.util.Enumeration findAll() throws javax.ejb.FinderException, java.rmi.RemoteException {
return super.getEnumeration(((itso.ejb35.cmp.EJSFinderBankAccountBean)persister).findAll());	}
	/**
	 * create
	 * @generated
	 */
	public itso.ejb35.cmp.BankAccount create(java.lang.String accID) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		itso.ejb35.cmp.BankAccount _EJS_result = null;
		boolean createFailed = false;
		try {
			beanO = super.createBeanO();
			itso.ejb35.cmp.BankAccountBean bean = (itso.ejb35.cmp.BankAccountBean) beanO.getEnterpriseBean();
			bean.ejbCreate(accID);
			_EJS_result = (itso.ejb35.cmp.BankAccount) super.postCreate(beanO, keyFromBean(bean));
			bean.ejbPostCreate(accID);
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
	 * findAccountsWithBalanceGreater
	 * @generated
	 */
	public java.util.Enumeration findAccountsWithBalanceGreater(java.math.BigDecimal anAmount) throws javax.ejb.FinderException, java.rmi.RemoteException {
return super.getEnumeration(((itso.ejb35.cmp.EJSFinderBankAccountBean)persister).findAccountsWithBalanceGreater(anAmount));	}
	/**
	 * keyFromBean
	 * @generated
	 */
	public Object keyFromBean(javax.ejb.EntityBean generalEJB) {
		itso.ejb35.cmp.BankAccountBean tmpEJB = (itso.ejb35.cmp.BankAccountBean) generalEJB;
		itso.ejb35.cmp.BankAccountKey keyClass = new itso.ejb35.cmp.BankAccountKey();
		keyClass.accID = tmpEJB.accID;
		return keyClass;
	}
	/**
	 * keyFromFields
	 * @generated
	 */
	public itso.ejb35.cmp.BankAccountKey keyFromFields(java.lang.String f0) {
		itso.ejb35.cmp.BankAccountKey keyClass = new itso.ejb35.cmp.BankAccountKey();
		keyClass.accID = f0;
		return keyClass;
	}
}
