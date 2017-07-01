/**
 * This class was generated by the VisualAge for Java Access Bean SmartGuide.
 * Warning:  Modifications will be lost when this part is regenerated.
 */

package itso.ejb35.bank;

import javax.ejb.*;
import javax.rmi.*;
import com.ibm.ivj.ejb.runtime.*;

public class BankAccountAccessBean extends com.ibm.ivj.ejb.runtime.AbstractEntityAccessBean implements BankAccountAccessBeanData {

    transient private itso.ejb35.bank.BankAccount __ejbRef = null;
    private java.lang.String initKey_accID;
 
    static final long serialVersionUID = 3206093459760846163L;

   /**
    * Zero argument constructor used to initialize the access bean.
    *
    * This constructor corresponds to the following home interface method:
    *
    * public abstract itso.ejb35.bank.BankAccount itso.ejb35.bank.BankAccountHome.findByPrimaryKey(itso.ejb35.bank.BankAccountKey) throws java.rmi.RemoteException,javax.ejb.FinderException
    *
    * The home interface method properties need to be set by calling
    * the following setter methods before calling any business methods:
    * setInitKey_accID( java.lang.String )

    */

    public BankAccountAccessBean () {
        super();
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public BankAccountAccessBean ( javax.ejb.EJBObject o ) throws java.rmi.RemoteException {
        super(o);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public BankAccountAccessBean(java.lang.String arg0, java.math.BigDecimal arg1) throws javax.ejb.CreateException, java.rmi.RemoteException, javax.naming.NamingException {
        ejbRef = ejbHome().create(arg0, arg1);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public java.util.Enumeration findAccountsForCustomer(int arg0) throws java.rmi.RemoteException, javax.ejb.FinderException, javax.naming.NamingException {
        itso.ejb35.bank.BankAccountHome localHome = ejbHome();
        java.util.Enumeration ejbs = localHome.findAccountsForCustomer(arg0);
        return (java.util.Enumeration) createAccessBeans(ejbs);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public java.util.Enumeration findAccountsWithBalanceBetween(java.math.BigDecimal arg0, java.math.BigDecimal arg1) throws javax.ejb.FinderException, java.rmi.RemoteException, javax.naming.NamingException {
        itso.ejb35.bank.BankAccountHome localHome = ejbHome();
        java.util.Enumeration ejbs = localHome.findAccountsWithBalanceBetween(arg0, arg1);
        return (java.util.Enumeration) createAccessBeans(ejbs);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public java.util.Enumeration findAccountsWithBalanceGreater(java.math.BigDecimal arg0) throws javax.ejb.FinderException, java.rmi.RemoteException, javax.naming.NamingException {
        itso.ejb35.bank.BankAccountHome localHome = ejbHome();
        java.util.Enumeration ejbs = localHome.findAccountsWithBalanceGreater(arg0);
        return (java.util.Enumeration) createAccessBeans(ejbs);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public java.util.Enumeration findAccountsWithBalanceGreaterThan(java.math.BigDecimal arg0) throws javax.ejb.FinderException, java.rmi.RemoteException, javax.naming.NamingException {
        itso.ejb35.bank.BankAccountHome localHome = ejbHome();
        java.util.Enumeration ejbs = localHome.findAccountsWithBalanceGreaterThan(arg0);
        return (java.util.Enumeration) createAccessBeans(ejbs);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public java.util.Enumeration findAll() throws javax.ejb.FinderException, java.rmi.RemoteException, javax.naming.NamingException {
        itso.ejb35.bank.BankAccountHome localHome = ejbHome();
        java.util.Enumeration ejbs = localHome.findAll();
        return (java.util.Enumeration) createAccessBeans(ejbs);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public java.util.Enumeration findGoldAccounts(java.math.BigDecimal arg0) throws java.rmi.RemoteException, javax.ejb.FinderException, javax.naming.NamingException {
        itso.ejb35.bank.BankAccountHome localHome = ejbHome();
        java.util.Enumeration ejbs = localHome.findGoldAccounts(arg0);
        return (java.util.Enumeration) createAccessBeans(ejbs);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public void setInitKey_accID( java.lang.String newValue ) {
        this.initKey_accID = (newValue);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    protected String defaultJNDIName() {
        return "itso/ejb35/bank/BankAccount";
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    private itso.ejb35.bank.BankAccountHome ejbHome() throws java.rmi.RemoteException, javax.naming.NamingException {
        return (itso.ejb35.bank.BankAccountHome) PortableRemoteObject.narrow(getHome(), itso.ejb35.bank.BankAccountHome.class);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    private itso.ejb35.bank.BankAccount ejbRef() throws java.rmi.RemoteException {
        if ( ejbRef == null )
            return null;
        if ( __ejbRef == null )
            __ejbRef = (itso.ejb35.bank.BankAccount) PortableRemoteObject.narrow(ejbRef, itso.ejb35.bank.BankAccount.class);

        return __ejbRef;
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    protected void instantiateEJB() throws java.rmi.RemoteException, javax.ejb.FinderException, javax.naming.NamingException {
        if ( ejbRef() != null )
            return;

        itso.ejb35.bank.BankAccountKey key = keyFromFields(initKey_accID);
        ejbRef = ejbHome().findByPrimaryKey(key);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    private itso.ejb35.bank.BankAccountKey keyFromFields ( java.lang.String f0 ) {
        itso.ejb35.bank.BankAccountKey keyClass = new itso.ejb35.bank.BankAccountKey();
        keyClass.accID = f0;
        return keyClass;
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
            itso.ejb35.bank.BankAccountKey pKey = (itso.ejb35.bank.BankAccountKey) this.__getKey();
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

    public java.math.BigDecimal getBalance() throws java.rmi.RemoteException, javax.ejb.CreateException, javax.ejb.FinderException, javax.naming.NamingException {
        return (((java.math.BigDecimal) __getCache("balance")));
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public void setBalance( java.math.BigDecimal newValue ) {
        __setCache("balance", newValue);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public java.util.Enumeration getBankTransactions() throws java.rmi.RemoteException, javax.ejb.FinderException, javax.naming.NamingException {

        instantiateEJB();
        return ejbRef().getBankTransactions();
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public java.util.Enumeration getCustAcct() throws java.rmi.RemoteException, javax.ejb.FinderException, javax.naming.NamingException {

        instantiateEJB();
        return ejbRef().getCustAcct();
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public void addBankTransactions(itso.ejb35.bank.TransRecord arg0) throws java.rmi.RemoteException, javax.ejb.FinderException, javax.naming.NamingException {

        instantiateEJB();
        ejbRef().addBankTransactions(arg0);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public void deposit(java.math.BigDecimal arg0) throws java.rmi.RemoteException, javax.ejb.FinderException, javax.naming.NamingException {

        instantiateEJB();
        ejbRef().deposit(arg0);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public void secondaryAddBankTransactions(itso.ejb35.bank.TransRecord arg0) throws java.rmi.RemoteException, javax.ejb.FinderException, javax.naming.NamingException {

        instantiateEJB();
        ejbRef().secondaryAddBankTransactions(arg0);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public void secondaryAddCustAcct(itso.ejb35.bank.CustAcct arg0) throws java.rmi.RemoteException, javax.ejb.FinderException, javax.naming.NamingException {

        instantiateEJB();
        ejbRef().secondaryAddCustAcct(arg0);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public void secondaryRemoveBankTransactions(itso.ejb35.bank.TransRecord arg0) throws java.rmi.RemoteException, javax.ejb.FinderException, javax.naming.NamingException {

        instantiateEJB();
        ejbRef().secondaryRemoveBankTransactions(arg0);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public void secondaryRemoveCustAcct(itso.ejb35.bank.CustAcct arg0) throws java.rmi.RemoteException, javax.ejb.FinderException, javax.naming.NamingException {

        instantiateEJB();
        ejbRef().secondaryRemoveCustAcct(arg0);
    }


   /**
    * This method was generated by the VisualAge for Java Access Bean SmartGuide.
    * Warning: Modifications will be lost when this part is regenerated.
    */

    public void withdraw(java.math.BigDecimal arg0) throws java.rmi.RemoteException, itso.ejb35.util.InsufficientFundException, javax.ejb.FinderException, javax.naming.NamingException {

        instantiateEJB();
        ejbRef().withdraw(arg0);
    }


}
