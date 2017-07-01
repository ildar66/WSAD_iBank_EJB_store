package itso.ejb35.bmp;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPTransactionRecord
 * @generated
 */
public class EJSRemoteBMPTransactionRecord extends EJSWrapper implements TransactionRecord {
	/**
	 * EJSRemoteBMPTransactionRecord
	 * @generated
	 */
	public EJSRemoteBMPTransactionRecord() throws java.rmi.RemoteException {
		super();	}
	/**
	 * getAccID
	 * @generated
	 */
	public java.lang.String getAccID() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.lang.String _EJS_result = null;
		try {
			itso.ejb35.bmp.TransactionRecordBean beanRef = (itso.ejb35.bmp.TransactionRecordBean)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = beanRef.getAccID();
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 0, _EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getTranstype
	 * @generated
	 */
	public java.lang.String getTranstype() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.lang.String _EJS_result = null;
		try {
			itso.ejb35.bmp.TransactionRecordBean beanRef = (itso.ejb35.bmp.TransactionRecordBean)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = beanRef.getTranstype();
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 1, _EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getTransamt
	 * @generated
	 */
	public java.math.BigDecimal getTransamt() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.math.BigDecimal _EJS_result = null;
		try {
			itso.ejb35.bmp.TransactionRecordBean beanRef = (itso.ejb35.bmp.TransactionRecordBean)container.preInvoke(this, 2, _EJS_s);
			_EJS_result = beanRef.getTransamt();
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 2, _EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getTransID
	 * @generated
	 */
	public java.sql.Timestamp getTransID() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		java.sql.Timestamp _EJS_result = null;
		try {
			itso.ejb35.bmp.TransactionRecordBean beanRef = (itso.ejb35.bmp.TransactionRecordBean)container.preInvoke(this, 3, _EJS_s);
			_EJS_result = beanRef.getTransID();
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 3, _EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * setAccID
	 * @generated
	 */
	public void setAccID(java.lang.String newAccID) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		
		try {
			itso.ejb35.bmp.TransactionRecordBean beanRef = (itso.ejb35.bmp.TransactionRecordBean)container.preInvoke(this, 4, _EJS_s);
			beanRef.setAccID(newAccID);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 4, _EJS_s);
		}
		return ;
	}
	/**
	 * setTransamt
	 * @generated
	 */
	public void setTransamt(java.math.BigDecimal newTransamt) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		
		try {
			itso.ejb35.bmp.TransactionRecordBean beanRef = (itso.ejb35.bmp.TransactionRecordBean)container.preInvoke(this, 5, _EJS_s);
			beanRef.setTransamt(newTransamt);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 5, _EJS_s);
		}
		return ;
	}
	/**
	 * setTranstype
	 * @generated
	 */
	public void setTranstype(java.lang.String newTranstype) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		
		try {
			itso.ejb35.bmp.TransactionRecordBean beanRef = (itso.ejb35.bmp.TransactionRecordBean)container.preInvoke(this, 6, _EJS_s);
			beanRef.setTranstype(newTranstype);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			container.postInvoke(this, 6, _EJS_s);
		}
		return ;
	}
}
