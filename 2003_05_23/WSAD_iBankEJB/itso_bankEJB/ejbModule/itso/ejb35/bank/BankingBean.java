package itso.ejb35.bank;

import java.math.BigDecimal;
import java.rmi.*;
import java.rmi.RemoteException;
import java.security.Identity;
import java.util.Properties;
import javax.ejb.*;
import javax.naming.*;
/**
 * This is a Session Bean Class
 */
public class BankingBean implements SessionBean {
    private javax.ejb.SessionContext mySessionCtx = null;
    private final static long serialVersionUID = 3206093459760846163L;

    private BankAccountHome bankAccHome;
/**
 * Insert the method's description here.
 * Creation date: (16.04.2003 14:58:39)
 * @return java.math.BigDecimal
 * @param anAccountID java.lang.String
 * @param anAmount java.math.BigDecimal
 */
public BigDecimal deposit(String anAccountID, BigDecimal anAmount) {
    BankAccount anAccount = null;
    try {
        anAccount = bankAccHome.findByPrimaryKey(new BankAccountKey(anAccountID));
        anAccount.deposit(anAmount);
        return anAccount.getBalance();
    }
    catch (Exception exc) {
        System.out.println("Deposit on the account failed!");
        return null;
    }
}
/**
 * ejbActivate method comment
 * @exception java.rmi.RemoteException The exception description.
 */
public void ejbActivate() throws java.rmi.RemoteException {}
/**
 * ejbCreate method comment
 * @exception javax.ejb.EJBException The exception description.
 * @exception javax.ejb.CreateException The exception description.
 */
public void ejbCreate() throws javax.ejb.CreateException, javax.ejb.EJBException {
    InitialContext ctx = null;
    Properties prop = new Properties();
    try {
        //prop.put( Context.PROVIDER_URL,"iiop:///" );
        //prop.put( Context.INITIAL_CONTEXT_FACTORY,
        // "com.ibm.ejs.ns.jndi.CNInitialContextFactory");
        //ctx = new InitialContext(prop);
        ctx = new InitialContext();
        bankAccHome =
            (BankAccountHome) javax.rmi.PortableRemoteObject.narrow(
                ctx.lookup("itso/ejb35/bank/BankAccount"),
                BankAccountHome.class);
    }
    catch (NamingException exc) {
        System.out.println("Error retrieving the home of BankAccount");
        exc.printStackTrace();
    }
}
/**
 * ejbPassivate method comment
 * @exception java.rmi.RemoteException The exception description.
 */
public void ejbPassivate() throws java.rmi.RemoteException {}
/**
 * ejbRemove method comment
 * @exception java.rmi.RemoteException The exception description.
 */
public void ejbRemove() throws java.rmi.RemoteException {}
/**
 * Insert the method's description here.
 * Creation date: (16.04.2003 14:57:22)
 * @return java.math.BigDecimal
 * @param anAccountID java.lang.String
 */
public BigDecimal getBalance(String anAccountID) {
    BankAccount anAccount = null;
    try {
        anAccount = bankAccHome.findByPrimaryKey(new BankAccountKey(anAccountID));
        return anAccount.getBalance();
    }
    catch (Exception exc) {
        exc.printStackTrace();
        System.out.println("Exception: an account could not be found!");
        return null;
    }
}
/**
 * getSessionContext method comment
 * @return javax.ejb.SessionContext
 */
public javax.ejb.SessionContext getSessionContext() {
	return mySessionCtx;
}
/**
 * setSessionContext method comment
 * @param ctx javax.ejb.SessionContext
 * @exception java.rmi.RemoteException The exception description.
 */
public void setSessionContext(javax.ejb.SessionContext ctx) throws java.rmi.RemoteException {
	mySessionCtx = ctx;
}
/**
 * Insert the method's description here.
 * Creation date: (07.04.2003 12:59:03)
 * @param fromAccountID java.lang.String
 * @param toAccountID java.lang.String
 * @param anAmount java.math.BigDecimal
 * @exception itso.ejb35.util.InsufficientFundException The exception description.
 */
public void transferMoney(String fromAccountID, String toAccountID, BigDecimal anAmount)
    throws itso.ejb35.util.InsufficientFundException { // Initialize the two accounts
    BankAccount fromAccount = null, toAccount = null;
    try {
        // Find the two accounts
        fromAccount = bankAccHome.findByPrimaryKey(new BankAccountKey(fromAccountID));
        toAccount = bankAccHome.findByPrimaryKey(new BankAccountKey(toAccountID));
        // Perform the money transfer
        fromAccount.withdraw(anAmount);
        toAccount.deposit(anAmount);
    }
    catch (FinderException exc) {
        exc.printStackTrace();
        System.out.println("FinderException: an account could not be found!");
    }
    catch (RemoteException exc) {
        exc.printStackTrace();
        System.out.println("RemoteException: an account could not be accessed!");
    }
}
/**
 * Insert the method's description here.
 * Creation date: (16.04.2003 15:00:15)
 * @return java.math.BigDecimal
 * @param anAccountID java.lang.String
 * @param anAmount java.math.BigDecimal
 * @exception itso.ejb35.util.InsufficientFundException The exception description.
 */
public BigDecimal withdraw(String anAccountID, BigDecimal anAmount) throws itso.ejb35.util.InsufficientFundException {
    BankAccount anAccount = null;
    try {
        anAccount = bankAccHome.findByPrimaryKey(new BankAccountKey(anAccountID));
        anAccount.withdraw(anAmount);
        return anAccount.getBalance();
    }
    catch (Exception exc) {
        System.out.println("Withdraw on the account failed!");
        return null;
    }
}
}
