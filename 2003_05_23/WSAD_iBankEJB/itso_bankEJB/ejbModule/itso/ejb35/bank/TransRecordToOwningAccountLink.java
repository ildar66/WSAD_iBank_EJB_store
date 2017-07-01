package itso.ejb35.bank;

import com.ibm.ivj.ejb.associations.interfaces.*;
import com.ibm.ivj.ejb.associations.links.*;
import java.rmi.*;
import java.util.*;
import javax.ejb.*;
import javax.naming.*;
public class TransRecordToOwningAccountLink extends ManyToSingleLink {
	private static BankAccountHome targetHome = null;
	private final static java.lang.String targetHomeName = "BankAccount";
/**
 * Create a link instance with the passed source bean
 * @param anEntityBean javax.ejb.EntityBean
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public TransRecordToOwningAccountLink(javax.ejb.EntityBean anEntityBean) {
	super(anEntityBean);
	isRequired = true;
}
/**
 * Fetch the target for this single link, return an instance of the target class.
 * @return javax.ejb.EJBObject
 * @exception java.rmi.RemoteException The exception description.
 * @exception javax.ejb.FinderException The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
protected javax.ejb.EJBObject fetchTarget() throws java.rmi.RemoteException, javax.ejb.FinderException {
	EJBObject target = null;
	itso.ejb35.bank.BankAccountKey key = ((itso.ejb35.bank.TransRecordBean)source).getOwningAccountKey();
	try {
		target = ((itso.ejb35.bank.BankAccountHome)getTargetHome(this)).findByPrimaryKey(key);
	}
	catch (NamingException e) {
		throw new FinderException(e.toString());
	}
	return target;
}
/**
 * Get the entity context from the source bean.
 * @return javax.ejb.EntityContext
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public javax.ejb.EntityContext getEntityContext() {
	return ((itso.ejb35.bank.TransRecordBean)source).getEntityContext();
}
/**
 * Get the target home for the link.
 * @return itso.ejb35.bank.BankAccountHome
 * @param aLink com.ibm.ivj.ejb.associations.links.Link
 * @exception javax.naming.NamingException The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
protected static synchronized BankAccountHome getTargetHome(com.ibm.ivj.ejb.associations.links.Link aLink) throws javax.naming.NamingException {
	if (targetHome == null) {
		String homeName = aLink.getEntityContext().getEnvironment().getProperty(targetHomeName);
		if (homeName == null)
			homeName = targetHomeName;
		targetHome = (itso.ejb35.bank.BankAccountHome)lookupTargetHome(homeName, itso.ejb35.bank.BankAccountHome.class);
	}
	return targetHome;
}
/**
 * Return whether or not the source key is valid for querying.
 * @return boolean
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
protected boolean isKeyValid() {
	return (((itso.ejb35.bank.TransRecordBean)source).getOwningAccountKey() != null);
}
/**
 * Reset my target key.
 * @exception java.rmi.RemoteException The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
protected void resetKey() throws java.rmi.RemoteException {
	((itso.ejb35.bank.TransRecordBean)source).privateSetOwningAccountKey(null);
}
/**
 * Forward inverse maintenance through my target EJB.
 * @param anEJB javax.ejb.EJBObject
 * @exception java.rmi.RemoteException The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void secondaryAddElementCounterLinkOf(javax.ejb.EJBObject anEJB) throws java.rmi.RemoteException {
	if (anEJB != null)
		((itso.ejb35.bank.BankAccount)anEJB).secondaryAddBankTransactions((itso.ejb35.bank.TransRecord)getEntityContext().getEJBObject());
}
/**
 * Forward inverse maintenance through my target EJB.
 * @param anEJB javax.ejb.EJBObject
 * @exception java.rmi.RemoteException The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void secondaryRemoveElementCounterLinkOf(javax.ejb.EJBObject anEJB) throws java.rmi.RemoteException {
	if (anEJB != null)
		((itso.ejb35.bank.BankAccount)anEJB).secondaryRemoveBankTransactions((itso.ejb35.bank.TransRecord)getEntityContext().getEJBObject());
}
/**
 * Set the target for this single link, an instance of the target class.
 * @param targetEJB javax.ejb.EJBObject
 * @exception java.rmi.RemoteException The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void set(javax.ejb.EJBObject targetEJB) throws java.rmi.RemoteException {
	super.set(targetEJB);
	if (targetEJB == null)
		((itso.ejb35.bank.TransRecordBean)source).privateSetOwningAccountKey(null);
	else
		((itso.ejb35.bank.TransRecordBean)source).privateSetOwningAccountKey((itso.ejb35.bank.BankAccountKey)targetEJB.getPrimaryKey());
}
}
