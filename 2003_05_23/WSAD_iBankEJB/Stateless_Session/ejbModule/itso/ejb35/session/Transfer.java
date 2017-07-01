package itso.ejb35.session;
/**
 * Remote interface for Enterprise Bean: Transfer
 */
public interface Transfer extends javax.ejb.EJBObject {
	/**
	* Insert the method's description here.
	* Creation date: (07.04.2003 12:59:03)
	* @param fromAccountID java.lang.String
	* @param toAccountID java.lang.String
	* @param anAmount java.math.BigDecimal
	* @exception itso.ejb35.util.InsufficientFundException The exception description.
	*/
	public void transferMoney (String fromAccountID, String toAccountID, java.math.BigDecimal anAmount)
		throws itso.ejb35.util.InsufficientFundException, java.rmi.RemoteException;
}
