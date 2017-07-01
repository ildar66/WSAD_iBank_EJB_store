package itso.ejb35.session;
/**
 * Home interface for Enterprise Bean: CustomerFinder
 */
public interface CustomerFinderHome extends javax.ejb.EJBHome {
	/**
	 * Creates a default instance of Session Bean: CustomerFinder
	 */
	public itso.ejb35.session.CustomerFinder create() throws javax.ejb.CreateException, java.rmi.RemoteException;
}
