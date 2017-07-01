package itso.ejb35.session;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteStatelessTransfer
 * @generated
 */
public class EJSRemoteStatelessTransfer extends EJSWrapper implements Transfer {
	/**
	 * EJSRemoteStatelessTransfer
	 * @generated
	 */
	public EJSRemoteStatelessTransfer() throws java.rmi.RemoteException {
		super();	}
	/**
	 * transferMoney
	 * @generated
	 */
	public void transferMoney(java.lang.String fromAccountID, java.lang.String toAccountID, java.math.BigDecimal anAmount) throws itso.ejb35.util.InsufficientFundException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = new EJSDeployedSupport();
		
		try {
			itso.ejb35.session.TransferBean beanRef = (itso.ejb35.session.TransferBean)container.preInvoke(this, 0, _EJS_s);
			beanRef.transferMoney(fromAccountID, toAccountID, anAmount);
		}
		catch (itso.ejb35.util.InsufficientFundException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
		return ;
	}
}
