package itso.ejb35.cmp;
import javax.naming.*;
import java.rmi.RemoteException;
import java.security.Identity;
import java.util.Properties;
import javax.ejb.*;
/**
 * Bean implementation class for Enterprise Bean: BankAccount
 */
public class BankAccountBean implements javax.ejb.EntityBean, itso.ejb35.cmp.BankAccountData.Store {

	private javax.ejb.EntityContext myEntityCtx;
	/**
	 * Implemetation field for persistent attribute: accID
	 */
	public java.lang.String accID;
	/**
	 * Implemetation field for persistent attribute: balance
	 */
	public java.math.BigDecimal balance;

	private itso.ejb35.cmp.TransRecordHome txRecHomeCMP;
	protected boolean txRecHome = false; // TxRexHome not set yet

	/**
	 * getEntityContext
	 */
	public javax.ejb.EntityContext getEntityContext() {
		return myEntityCtx;
	}
	/**
	 * setEntityContext
	 */
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		myEntityCtx = ctx;
	}
	/**
	 * unsetEntityContext
	 */
	public void unsetEntityContext() {
		myEntityCtx = null;
	}
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		_initLinks();
	}
	/**
	 * ejbCreate method for a CMP entity bean.
	 */
	public itso.ejb35.cmp.BankAccountKey ejbCreate(
		java.lang.String accID,
		java.math.BigDecimal argBalance)
		throws javax.ejb.CreateException {
		_initLinks();
		this.accID = accID;
		balance = argBalance;
		return null;
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		_initLinks();
	}
	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(
		java.lang.String accID,
		java.math.BigDecimal argBalance)
		throws javax.ejb.CreateException {
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove() throws javax.ejb.RemoveException {
		try {
			_removeLinks();
		} catch (java.rmi.RemoteException e) {
			throw new javax.ejb.RemoveException(e.getMessage());
		}
	}
	/**
	 * ejbStore
	 */
	public void ejbStore() {
	}
	/**
	 * This method was generated for supporting the associations.
	 */
	protected void _initLinks() {
	}
	/**
	 * This method was generated for supporting the associations.
	 */
	protected java.util.Vector _getLinks() {
		java.util.Vector links = new java.util.Vector();
		return links;
	}
	/**
	 * This method was generated for supporting the associations.
	 */
	protected void _removeLinks()
		throws java.rmi.RemoteException, javax.ejb.RemoveException {
		java.util.List links = _getLinks();
		for (int i = 0; i < links.size(); i++) {
			try {
				((com.ibm.ivj.ejb.associations.interfaces.Link) links.get(i)).remove();
			} catch (javax.ejb.FinderException e) {
			} //Consume Finder error since I am going away
		}
	}
	/**
	 * Get accessor for persistent attribute: balance
	 */
	public java.math.BigDecimal getBalance() {
		return balance;
	}
	/**
	 * Set accessor for persistent attribute: balance
	 */
	public void setBalance(java.math.BigDecimal newBalance) {
		balance = newBalance;
	}
	/**
	 * ejbCreate method for a CMP entity bean.
	 */
	public itso.ejb35.cmp.BankAccountKey ejbCreate(java.lang.String accID)
		throws javax.ejb.CreateException {
		_initLinks();
		this.accID = accID;
		return null;
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.String accID)
		throws javax.ejb.CreateException {
	}

	public void deposit(java.math.BigDecimal amount) {
		balance = balance.add(amount);
		try {
			setTxRecHome();
			txRecHomeCMP.create(accID, amount, "D");
		} catch (Exception e) {
			System.out.println(" ==> transaction record failed");
			e.printStackTrace();
		}
	}

	public void withdraw(java.math.BigDecimal amount)
		throws itso.ejb35.util.InsufficientFundException {
		if (balance.compareTo(amount) == -1)
			throw new itso.ejb35.util.InsufficientFundException("Not enough funds");
		else
			balance = balance.subtract(amount);
		try {
			setTxRecHome();
			txRecHomeCMP.create(accID, amount, "C");
		} catch (Exception e) {
			System.out.println(" ==> transaction record failed");
			e.printStackTrace();
		}
	}
	private void setTxRecHome() {
		if (!txRecHome) {
			try {
				//Properties prop = new Properties();
				//prop.put( Context.PROVIDER_URL,"iiop:///" );
				//prop.put( Context.INITIAL_CONTEXT_FACTORY,
				// "com.ibm.ejs.ns.jndi.CNInitialContextFactory");
				//InitialContext ctx = new InitialContext(prop);
				InitialContext ctx = new InitialContext();
				txRecHomeCMP =
					(itso.ejb35.cmp.TransRecordHome) javax.rmi.PortableRemoteObject.narrow(
						ctx.lookup("ejb/itso/ejb35/cmp/TransRecordHome"),
						//ctx.lookup("java:comp/env/ejb/TransRecord"),
						itso.ejb35.cmp.TransRecordHome.class);
				txRecHome = true;
			} catch (NamingException exc) {
				System.out.println("Error retrieving the home");
				exc.printStackTrace();
			}
		}
	}
	/**
	 * getBankAccountData
	 */
	public itso.ejb35.cmp.BankAccountData getBankAccountData() {
		return new itso.ejb35.cmp.BankAccountData(this);
	}
	/**
	 * setBankAccountData
	 */
	public void setBankAccountData(itso.ejb35.cmp.BankAccountData data) throws com.ibm.etools.ejb.client.runtime.FieldChangedException {
		data.copyTo(this);
		if ( !data.getIsbalanceDirty() ) {
			if ( this.getBalance() != null && data.getBalance() != null ) {
				if ( !this.getBalance().equals(data.getBalance()) ) {
					throw new com.ibm.etools.ejb.client.runtime.FieldChangedException();
				}
			}
			else if ( !(this.getBalance() == null && data.getBalance() == null) ) {
				throw new com.ibm.etools.ejb.client.runtime.FieldChangedException();
			}
		}
	}
	/**
	 * syncBankAccountData
	 */
	public itso.ejb35.cmp.BankAccountData syncBankAccountData(itso.ejb35.cmp.BankAccountData data) {
		data.copyTo(this);
		return this.getBankAccountData();
	}
	/**
	 * getPrimaryKey
	 */
	public Object getPrimaryKey() {
		return getEntityContext().getPrimaryKey();
	}
}
