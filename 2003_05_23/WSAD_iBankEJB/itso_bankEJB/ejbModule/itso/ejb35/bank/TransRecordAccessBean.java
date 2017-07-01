/**
 * This class was generated by the VisualAge for Java Access Bean SmartGuide.
 * Warning:  Modifications will be lost when this part is regenerated.
 */

package itso.ejb35.bank;

import javax.ejb.*;
import javax.rmi.*;
import com.ibm.ivj.ejb.runtime.*;

public class TransRecordAccessBean extends com.ibm.ivj.ejb.runtime.AbstractEntityAccessBean implements TransRecordAccessBeanData {

    transient private itso.ejb35.bank.TransRecord __ejbRef = null;
    private itso.ejb35.bank.BankAccount init_acct;
    private java.math.BigDecimal init_anAmount;
    private java.lang.String init_aTranstype;
 
    static final long serialVersionUID = 3206093459760846163L;

   /**
    * Zero argument constructor used to initialize the access bean.
    *
    * This constructor corresponds to the following home interface method:
    *
    * public abstract itso.ejb35.bank.TransRecord itso.ejb35.bank.TransRecordHome.create(itso.ejb35.bank.BankAccount,java.math.BigDecimal,java.lang.String) throws javax.ejb.CreateException,java.rmi.RemoteException
    *
    * The home interface method properties need to be set by calling
    * the following setter methods before calling any business methods:
    * setInit_acct( itso.ejb35.bank.BankAccount )
    * setInit_anAmount( java.math.BigDecimal )
    * setInit_aTranstype( java.lang.String )

    */

    public TransRecordAccessBean () {
        super();
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public TransRecordAccessBean ( javax.ejb.EJBObject o ) throws java.rmi.RemoteException {
        super(o);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public TransRecordAccessBean(java.lang.String arg0, java.math.BigDecimal arg1, java.lang.String arg2) throws javax.ejb.CreateException, java.rmi.RemoteException, javax.naming.NamingException {
        ejbRef = ejbHome().create(arg0, arg1, arg2);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public TransRecordAccessBean(itso.ejb35.bank.TransRecordKey arg0) throws java.rmi.RemoteException, javax.ejb.FinderException, javax.naming.NamingException {
        ejbRef = ejbHome().findByPrimaryKey(arg0);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public java.util.Enumeration findBankTransactionsByOwningAccount(itso.ejb35.bank.BankAccountKey arg0) throws java.rmi.RemoteException, javax.ejb.FinderException, javax.naming.NamingException {
        itso.ejb35.bank.TransRecordHome localHome = ejbHome();
        java.util.Enumeration ejbs = localHome.findBankTransactionsByOwningAccount(arg0);
        return (java.util.Enumeration) createAccessBeans(ejbs);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public void setInit_acct( itso.ejb35.bank.BankAccount newValue ) {
        this.init_acct = (newValue);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public void setInit_anAmount( java.math.BigDecimal newValue ) {
        this.init_anAmount = (newValue);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public void setInit_aTranstype( java.lang.String newValue ) {
        this.init_aTranstype = (newValue);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    protected String defaultJNDIName() {
        return "itso/ejb35/bank/TransRecord";
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    private itso.ejb35.bank.TransRecordHome ejbHome() throws java.rmi.RemoteException, javax.naming.NamingException {
        return (itso.ejb35.bank.TransRecordHome) PortableRemoteObject.narrow(getHome(), itso.ejb35.bank.TransRecordHome.class);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    private itso.ejb35.bank.TransRecord ejbRef() throws java.rmi.RemoteException {
        if ( ejbRef == null )
            return null;
        if ( __ejbRef == null )
            __ejbRef = (itso.ejb35.bank.TransRecord) PortableRemoteObject.narrow(ejbRef, itso.ejb35.bank.TransRecord.class);

        return __ejbRef;
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    protected void instantiateEJB() throws javax.ejb.CreateException, java.rmi.RemoteException, javax.naming.NamingException {
        if ( ejbRef() != null )
            return;

        ejbRef = ejbHome().create(init_acct, init_anAmount, init_aTranstype);
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
            itso.ejb35.bank.TransRecordKey pKey = (itso.ejb35.bank.TransRecordKey) this.__getKey();
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

    public java.lang.String getTranstype() throws java.rmi.RemoteException, javax.ejb.CreateException, javax.ejb.FinderException, javax.naming.NamingException {
        return (((java.lang.String) __getCache("transtype")));
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public void setTranstype( java.lang.String newValue ) {
        __setCache("transtype", newValue);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public itso.ejb35.bank.BankAccountKey getOwningAccountKey() throws java.rmi.RemoteException, javax.ejb.CreateException, javax.ejb.FinderException, javax.naming.NamingException {
        return (((itso.ejb35.bank.BankAccountKey) __getCache("owningAccountKey")));
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public java.math.BigDecimal getTransamt() throws java.rmi.RemoteException, javax.ejb.CreateException, javax.ejb.FinderException, javax.naming.NamingException {
        return (((java.math.BigDecimal) __getCache("transamt")));
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public void setTransamt( java.math.BigDecimal newValue ) {
        __setCache("transamt", newValue);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public itso.ejb35.bank.BankAccountAccessBean getOwningAccount() throws java.rmi.RemoteException, javax.ejb.FinderException, javax.ejb.CreateException, javax.naming.NamingException {
        instantiateEJB();
        itso.ejb35.bank.BankAccount localEJBRef = ejbRef().getOwningAccount();
        if ( localEJBRef != null )
            return new itso.ejb35.bank.BankAccountAccessBean(localEJBRef);
        else
            return null;
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public void privateSetOwningAccountKey(itso.ejb35.bank.BankAccountKey arg0) throws java.rmi.RemoteException, javax.ejb.CreateException, javax.naming.NamingException {

        instantiateEJB();
        ejbRef().privateSetOwningAccountKey(arg0);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public void secondarySetOwningAccount(itso.ejb35.bank.BankAccount arg0) throws java.rmi.RemoteException, javax.ejb.CreateException, javax.naming.NamingException {

        instantiateEJB();
        ejbRef().secondarySetOwningAccount(arg0);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public void setOwningAccount(itso.ejb35.bank.BankAccount arg0) throws java.rmi.RemoteException, javax.ejb.CreateException, javax.naming.NamingException {

        instantiateEJB();
        ejbRef().setOwningAccount(arg0);
    }


}
