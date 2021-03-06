/**
 * This class was generated by the VisualAge for Java Access Bean SmartGuide.
 * Warning:  Modifications will be lost when this part is regenerated.
 */

package itso.ejb35.bank;

import javax.ejb.*;
import javax.rmi.*;
import com.ibm.ivj.ejb.runtime.*;

public class CustAcctAccessBean extends com.ibm.ivj.ejb.runtime.AbstractEntityAccessBean implements CustAcctAccessBeanData {

    transient private itso.ejb35.bank.CustAcct __ejbRef = null;
 
    static final long serialVersionUID = 3206093459760846163L;

   /**
    * Zero argument constructor used to initialize the access bean.
    *
    * This constructor corresponds to the following home interface method:
    *
    * public abstract itso.ejb35.bank.CustAcct itso.ejb35.bank.CustAcctHome.create() throws javax.ejb.CreateException,java.rmi.RemoteException
    *
    */

    public CustAcctAccessBean () {
        super();
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public CustAcctAccessBean ( javax.ejb.EJBObject o ) throws java.rmi.RemoteException {
        super(o);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public CustAcctAccessBean(itso.ejb35.bank.CustAcctKey arg0) throws java.rmi.RemoteException, javax.ejb.FinderException, javax.naming.NamingException {
        ejbRef = ejbHome().findByPrimaryKey(arg0);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public java.util.Enumeration findCustAcctByAccount(itso.ejb35.bank.BankAccountKey arg0) throws java.rmi.RemoteException, javax.ejb.FinderException, javax.naming.NamingException {
        itso.ejb35.bank.CustAcctHome localHome = ejbHome();
        java.util.Enumeration ejbs = localHome.findCustAcctByAccount(arg0);
        return (java.util.Enumeration) createAccessBeans(ejbs);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public java.util.Enumeration findCustAcctByCustomer(itso.ejb35.bank.CustomerKey arg0) throws java.rmi.RemoteException, javax.ejb.FinderException, javax.naming.NamingException {
        itso.ejb35.bank.CustAcctHome localHome = ejbHome();
        java.util.Enumeration ejbs = localHome.findCustAcctByCustomer(arg0);
        return (java.util.Enumeration) createAccessBeans(ejbs);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    protected String defaultJNDIName() {
        return "itso/ejb35/bank/CustAcct";
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    private itso.ejb35.bank.CustAcctHome ejbHome() throws java.rmi.RemoteException, javax.naming.NamingException {
        return (itso.ejb35.bank.CustAcctHome) PortableRemoteObject.narrow(getHome(), itso.ejb35.bank.CustAcctHome.class);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    private itso.ejb35.bank.CustAcct ejbRef() throws java.rmi.RemoteException {
        if ( ejbRef == null )
            return null;
        if ( __ejbRef == null )
            __ejbRef = (itso.ejb35.bank.CustAcct) PortableRemoteObject.narrow(ejbRef, itso.ejb35.bank.CustAcct.class);

        return __ejbRef;
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    protected void instantiateEJB() throws javax.ejb.CreateException, java.rmi.RemoteException, javax.naming.NamingException {
        if ( ejbRef() != null )
            return;

        ejbRef = ejbHome().create();
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    protected boolean instantiateEJBByPrimaryKey() throws java.rmi.RemoteException, javax.ejb.CreateException, javax.naming.NamingException {
        boolean result = false;

        if ( ejbRef() != null )
            return true;

        try {
            itso.ejb35.bank.CustAcctKey pKey = (itso.ejb35.bank.CustAcctKey) this.__getKey();
            if ( pKey != null ) {
                ejbRef = ejbHome().findByPrimaryKey(pKey);
                result = true;
            }
        }
        catch ( javax.ejb.FinderException e ) {
        }
        return result;
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public void commitCopyHelper() throws java.rmi.RemoteException, javax.ejb.CreateException, javax.ejb.FinderException, javax.naming.NamingException {
        commitCopyHelper(ejbRef());
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public void refreshCopyHelper() throws java.rmi.RemoteException, javax.ejb.CreateException, javax.ejb.FinderException, javax.naming.NamingException {
        refreshCopyHelper(ejbRef());
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public itso.ejb35.bank.BankAccountKey getAccountKey() throws java.rmi.RemoteException, javax.ejb.CreateException, javax.ejb.FinderException, javax.naming.NamingException {
        return (((itso.ejb35.bank.BankAccountKey) __getCache("accountKey")));
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public itso.ejb35.bank.CustomerKey getCustomerKey() throws java.rmi.RemoteException, javax.ejb.CreateException, javax.ejb.FinderException, javax.naming.NamingException {
        return (((itso.ejb35.bank.CustomerKey) __getCache("customerKey")));
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public itso.ejb35.bank.BankAccountAccessBean getAccount() throws java.rmi.RemoteException, javax.ejb.FinderException, javax.ejb.CreateException, javax.naming.NamingException {
        instantiateEJB();
        itso.ejb35.bank.BankAccount localEJBRef = ejbRef().getAccount();
        if ( localEJBRef != null )
            return new itso.ejb35.bank.BankAccountAccessBean(localEJBRef);
        else
            return null;
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public itso.ejb35.bank.CustomerAccessBean getCustomer() throws java.rmi.RemoteException, javax.ejb.FinderException, javax.ejb.CreateException, javax.naming.NamingException {
        instantiateEJB();
        itso.ejb35.bank.Customer localEJBRef = ejbRef().getCustomer();
        if ( localEJBRef != null )
            return new itso.ejb35.bank.CustomerAccessBean(localEJBRef);
        else
            return null;
    }


}
