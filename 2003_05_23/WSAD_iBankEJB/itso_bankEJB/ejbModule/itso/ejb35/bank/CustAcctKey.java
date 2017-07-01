package itso.ejb35.bank;

public class CustAcctKey implements java.io.Serializable {
	private final static long serialVersionUID = 3206093459760846163L;
	public java.lang.String account_accID;
	public java.lang.Integer customer_customerID;
/**
 * Default constructor
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public CustAcctKey() {
	super();
}
/**
 * Initialize a key from the passed values
 * @param argAccount itso.ejb35.bank.BankAccountKey
 * @param argCustomer itso.ejb35.bank.CustomerKey
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public CustAcctKey(BankAccountKey argAccount, CustomerKey argCustomer) {
	privateSetAccountKey(argAccount);
	privateSetCustomerKey(argCustomer);
}
/**
 * equals method
 * @return boolean
 * @param o java.lang.Object
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public boolean equals(java.lang.Object o) {
	if (o instanceof CustAcctKey) {
		CustAcctKey otherKey = (CustAcctKey) o;
		return ((this.account_accID.equals(otherKey.account_accID)
		 && this.customer_customerID.equals(otherKey.customer_customerID)));
	}
	else
		return false;
}
/**
 * This method was generated for supporting the association named AccountToCustomer.  
 * 	It will be deleted/edited when the association is deleted/edited.
 * @return itso.ejb35.bank.BankAccountKey
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public itso.ejb35.bank.BankAccountKey getAccountKey() {
	itso.ejb35.bank.BankAccountKey temp = null;
	temp = new itso.ejb35.bank.BankAccountKey();
	boolean account_NULLTEST = true;
	account_NULLTEST &= (account_accID == null);
	temp.accID = account_accID;
	if (account_NULLTEST) temp = null;
	return temp;
}
/**
 * This method was generated for supporting the association named CustomerToAccount.  
 * 	It will be deleted/edited when the association is deleted/edited.
 * @return itso.ejb35.bank.CustomerKey
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public itso.ejb35.bank.CustomerKey getCustomerKey() {
	itso.ejb35.bank.CustomerKey temp = null;
	temp = new itso.ejb35.bank.CustomerKey();
	boolean customer_NULLTEST = true;
	customer_NULLTEST &= (customer_customerID == null);
	temp.customerID = ((customer_customerID == null) ? 0 : customer_customerID.intValue());
	if (customer_NULLTEST) temp = null;
	return temp;
}
/**
 * hashCode method
 * @return int
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public int hashCode() {
	return (account_accID.hashCode()
		 + customer_customerID.hashCode());
}
/**
 * This method was generated for supporting the association named AccountToCustomer.  
 * 	It will be deleted/edited when the association is deleted/edited.
 * @param inKey itso.ejb35.bank.BankAccountKey
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void privateSetAccountKey(itso.ejb35.bank.BankAccountKey inKey) {
	boolean account_NULLTEST = (inKey == null);
	if (account_NULLTEST) account_accID = null; else account_accID = inKey.accID;
}
/**
 * This method was generated for supporting the association named CustomerToAccount.  
 * 	It will be deleted/edited when the association is deleted/edited.
 * @param inKey itso.ejb35.bank.CustomerKey
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void privateSetCustomerKey(itso.ejb35.bank.CustomerKey inKey) {
	boolean customer_NULLTEST = (inKey == null);
	if (customer_NULLTEST) customer_customerID = null; else customer_customerID = (new Integer(inKey.customerID));
}
}
