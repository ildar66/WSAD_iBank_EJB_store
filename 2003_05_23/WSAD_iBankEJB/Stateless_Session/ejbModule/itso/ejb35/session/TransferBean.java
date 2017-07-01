package itso.ejb35.session;
import java.rmi.*;
import java.security.Identity;
import java.util.Properties;
import javax.ejb.*;
import javax.naming.*;
import itso.ejb35.cmp.*;
import java.math.BigDecimal;
/**
 * Bean implementation class for Enterprise Bean: Transfer
 */
public class TransferBean implements javax.ejb.SessionBean {
	private javax.ejb.SessionContext mySessionCtx;
	private BankAccountHome bankAccHome;
	/**
	 * getSessionContext
	 */
	public javax.ejb.SessionContext getSessionContext() {
		return mySessionCtx;
	}
	/**
	 * setSessionContext
	 */
	public void setSessionContext(javax.ejb.SessionContext ctx) {
		mySessionCtx = ctx;
	}
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
	}
	/**
	 * ejbCreate
	 */
	public void ejbCreate() throws javax.ejb.CreateException {
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
					//ctx.lookup("itso/ejb35/cmp/BankAccount"),
					//ctx.lookup("java:comp/env/ejb/BankAccount"),
					ctx.lookup("ejb/itso/ejb35/cmp/BankAccountHome"),
					BankAccountHome.class);
		} catch (NamingException exc) {
			System.out.println("Error retrieving the home of BankAccount");
			exc.printStackTrace();
		}
	}
	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove() {
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
		} catch (FinderException exc) {
			exc.printStackTrace();
			System.out.println("FinderException: an account could not be found!");
		} catch (RemoteException exc) {
			exc.printStackTrace();
			System.out.println("RemoteException: an account could not be accessed!");
		}
	}
}