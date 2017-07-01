package itso.ejb35.bank;

/**
 * This is an Enterprise Java Bean Remote Interface
 */
public interface Checking extends BankAccount {

/**
 * Getter method for overdraft
 * @return java.math.BigDecimal
 * @exception java.rmi.RemoteException The exception description.
 */
java.math.BigDecimal getOverdraft() throws java.rmi.RemoteException;
/**
 * Setter method for overdraft
 * @param newValue java.math.BigDecimal
 * @exception java.rmi.RemoteException The exception description.
 */
void setOverdraft(java.math.BigDecimal newValue) throws java.rmi.RemoteException;
}
