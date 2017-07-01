package itso.ejb35.bank;

/**
 * This is a Home interface for the Session Bean
 */
public interface BankingHome extends javax.ejb.EJBHome {

/**
 * create method for a session bean
 * @return itso.ejb35.bank.Banking
 * @exception javax.ejb.CreateException The exception description.
 * @exception java.rmi.RemoteException The exception description.
 */
itso.ejb35.bank.Banking create() throws javax.ejb.CreateException, java.rmi.RemoteException;
}
