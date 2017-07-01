package itso.ejb35.session;
/**
 * Remote interface for Enterprise Bean: CustomerFinder
 */
public interface CustomerFinder extends javax.ejb.EJBObject {
	/**
	* Insert the method's description here.
	* Creation date: (07.04.2003 15:19:40)
	* @return java.util.Vector
	* @param partialName java.lang.String
	*/
	public java.util.Vector findDab(String partialName) throws java.rmi.RemoteException;
	/**
	* Insert the method's description here.
	* Creation date: (07.04.2003 14:57:26)
	* @return java.util.Vector
	* @param partialName java.lang.String
	*/
	public java.util.Vector findJdbc(String partialName) throws java.rmi.RemoteException;
	/**
	* Insert the method's description here.
	* Creation date: (07.04.2003 16:17:49)
	* @return java.util.Vector
	* @param partialName java.lang.String
	*/
	public java.util.Vector findStp(String partialName) throws java.rmi.RemoteException;
	/**
	* Insert the method's description here.
	* Creation date: (07.04.2003 16:42:34)
	* @return java.util.Vector
	* @param partialName java.lang.String
	*/
	public java.util.Vector findStp2(String partialName) throws java.rmi.RemoteException;
}
