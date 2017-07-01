package itso.ejb35.session;
/**
 * Home interface for Enterprise Bean: CustomerManager
 */
public interface CustomerManagerHome extends javax.ejb.EJBHome {
	/**
	 * Creates a default instance of Session Bean: CustomerManager
	 */
	public itso.ejb35.session.CustomerManager create() throws javax.ejb.CreateException, java.rmi.RemoteException;
}
