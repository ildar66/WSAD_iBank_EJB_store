package itso.ejb35.bank;

/**
 * This is an Enterprise Java Bean Remote Interface
 */
public interface Savings extends BankAccount {

/**
 * Getter method for minAmount
 * @return java.math.BigDecimal
 * @exception java.rmi.RemoteException The exception description.
 */
java.math.BigDecimal getMinAmount() throws java.rmi.RemoteException;
/**
 * Setter method for minAmount
 * @param newValue java.math.BigDecimal
 * @exception java.rmi.RemoteException The exception description.
 */
void setMinAmount(java.math.BigDecimal newValue) throws java.rmi.RemoteException;
}
