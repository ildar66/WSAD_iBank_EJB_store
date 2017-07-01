package itso.ejb35.session;
/**
 * Home interface for Enterprise Bean: Transfer
 */
public interface TransferHome extends javax.ejb.EJBHome {
	/**
	 * Creates a default instance of Session Bean: Transfer
	 */
	public itso.ejb35.session.Transfer create() throws javax.ejb.CreateException, java.rmi.RemoteException;
}
