package itso.ejb35.bank;

/**
 * This is an Enterprise Java Bean Remote Interface
 */
public interface Banking extends javax.ejb.EJBObject {

/**
 * 
 * @return java.math.BigDecimal
 * @param anAccountID java.lang.String
 * @param anAmount java.math.BigDecimal
 * @exception String The exception description.
 */
java.math.BigDecimal deposit(java.lang.String anAccountID, java.math.BigDecimal anAmount) throws java.rmi.RemoteException;
/**
 * 
 * @return java.math.BigDecimal
 * @param anAccountID java.lang.String
 * @exception String The exception description.
 */
java.math.BigDecimal getBalance(java.lang.String anAccountID) throws java.rmi.RemoteException;
/**
 * 
 * @return void
 * @param fromAccountID java.lang.String
 * @param toAccountID java.lang.String
 * @param anAmount java.math.BigDecimal
 * @exception String The exception description.
 * @exception String The exception description.
 */
void transferMoney(java.lang.String fromAccountID, java.lang.String toAccountID, java.math.BigDecimal anAmount) throws java.rmi.RemoteException, itso.ejb35.util.InsufficientFundException;
/**
 * 
 * @return java.math.BigDecimal
 * @param anAccountID java.lang.String
 * @param anAmount java.math.BigDecimal
 * @exception String The exception description.
 * @exception String The exception description.
 */
java.math.BigDecimal withdraw(java.lang.String anAccountID, java.math.BigDecimal anAmount) throws java.rmi.RemoteException, itso.ejb35.util.InsufficientFundException;
}
