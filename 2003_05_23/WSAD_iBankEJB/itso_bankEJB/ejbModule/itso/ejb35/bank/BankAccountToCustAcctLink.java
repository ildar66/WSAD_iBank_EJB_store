package itso.ejb35.bank;

import com.ibm.ivj.ejb.associations.interfaces.*;
import com.ibm.ivj.ejb.associations.links.*;
import java.rmi.*;
import java.util.*;
import javax.ejb.*;
import javax.naming.*;
public class BankAccountToCustAcctLink extends SingleToManyLink {
	private static CustAcctHome targetHome = null;
	private final static java.lang.String targetHomeName = "CustAcct";
/**
 * Create a link instance with the passed source bean
 * @param anEntityBean javax.ejb.EntityBean
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public BankAccountToCustAcctLink(javax.ejb.EntityBean anEntityBean) {
	super(anEntityBean);
	isRequired = true;
}
/**
 * Check if I contain anEJB by comparing primary keys.
 * @return boolean
 * @param anEJB javax.ejb.EJBObject
 * @exception java.rmi.RemoteException The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
protected boolean currentlyContains(javax.ejb.EJBObject anEJB) throws java.rmi.RemoteException {
	return (	super.currentlyContains(anEJB)
			||	getEntityContext().getPrimaryKey()
						.equals(((itso.ejb35.bank.CustAcct)anEJB).getAccountKey()));
}
/**
 * Fetch the target for this many link, return an enumeration of the members.
 * @return java.util.Enumeration
 * @exception java.rmi.RemoteException The exception description.
 * @exception javax.ejb.FinderException The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
protected java.util.Enumeration fetchTargetEnumeration() throws java.rmi.RemoteException, javax.ejb.FinderException {
	Enumeration enum = null;
	try {
		enum = ((itso.ejb35.bank.CustAcctHome)getTargetHome(this)).findCustAcctByAccount((itso.ejb35.bank.BankAccountKey)getEntityContext().getPrimaryKey());
	}
	catch (NamingException e) {
		throw new FinderException(e.toString());
	}
	return enum;
}
/**
 * Get the entity context from the source bean.
 * @return javax.ejb.EntityContext
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public javax.ejb.EntityContext getEntityContext() {
	return ((itso.ejb35.bank.BankAccountBean)source).getEntityContext();
}
/**
 * Get the target home for the link.
 * @return itso.ejb35.bank.CustAcctHome
 * @param aLink com.ibm.ivj.ejb.associations.links.Link
 * @exception javax.naming.NamingException The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
protected static synchronized CustAcctHome getTargetHome(com.ibm.ivj.ejb.associations.links.Link aLink) throws javax.naming.NamingException {
	if (targetHome == null) {
		String homeName = aLink.getEntityContext().getEnvironment().getProperty(targetHomeName);
		if (homeName == null)
			homeName = targetHomeName;
		targetHome = (itso.ejb35.bank.CustAcctHome)lookupTargetHome(homeName, itso.ejb35.bank.CustAcctHome.class);
	}
	return targetHome;
}
/**
 * Return whether or not the source key is valid for querying.
 * @return boolean
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
protected boolean isKeyValid() {
	return (getEntityContext().getPrimaryKey() != null);
}
/**
 * Narrow the remote object.
 * @return javax.ejb.EJBObject
 * @param element java.lang.Object
 * @exception java.rmi.RemoteException The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
protected javax.ejb.EJBObject narrowElement(java.lang.Object element) throws java.rmi.RemoteException {
	return (EJBObject)javax.rmi.PortableRemoteObject.narrow(element, itso.ejb35.bank.CustAcct.class);
}
/**
 * Direct my counterLink to set my source as its target
 * @param anEJB javax.ejb.EJBObject
 * @exception java.rmi.RemoteException The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void secondarySetCounterLinkOf(javax.ejb.EJBObject anEJB) throws java.rmi.RemoteException {}
/**
 * Send my counterLink #secondaryDisconnect by routing through my target EJB
 * @param anEJB javax.ejb.EJBObject
 * @exception java.rmi.RemoteException The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void secondarySetNullCounterLinkOf(javax.ejb.EJBObject anEJB) throws java.rmi.RemoteException {}
/**
 * Send my counterLink #secondaryDisconnect by routing through my target EJB
 * @param anEJB javax.ejb.EJBObject
 * @exception java.rmi.RemoteException The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void setNullCounterLinkOf(javax.ejb.EJBObject anEJB) throws java.rmi.RemoteException {}
}
