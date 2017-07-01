package itso.ejb35.cmp;
import com.ibm.etools.ejb.client.runtime.*;
/**
 * BankAccountData
 * @generated
 */
public class BankAccountData extends AbstractEntityData {
	/**
	 * @generated
	 */
	private java.math.BigDecimal balance;
	/**
	 * @generated
	 */
	private boolean isbalanceDirty = false;
	/**
	 * getIsbalanceDirty
	 * @generated
	 */
	public boolean getIsbalanceDirty() {
		return this.isbalanceDirty;
	}
	/**
	 * getBalance
	 * @generated
	 */
	public java.math.BigDecimal getBalance() {
		return this.balance;
	}
	/**
	 * setBalance
	 * @generated
	 */
	public void setBalance(java.math.BigDecimal value) {
		this.balance = value;
		this.isbalanceDirty = true;
		this.isDirty = true;
	}
	/**
	 * Store
	 * @generated
	 */
	public interface Store extends AbstractEntityData.Store {
			/**
		 * getBalance
		 * @generated
		 */
		public java.math.BigDecimal getBalance();
		/**
		 * setBalance
		 * @generated
		 */
		public void setBalance(java.math.BigDecimal value);
}
	/**
	 * BankAccountData
	 * @generated
	 */
	public BankAccountData() {
		super();
	}
	/**
	 * BankAccountData
	 * @generated
	 */
	public BankAccountData(BankAccountData.Store initializer) {
		super(initializer);
		initialize(initializer);
	}
	/**
	 * initialize
	 * @generated
	 */
	protected void initialize(BankAccountData.Store initializer) {
		this.balance = initializer.getBalance();
	}
	/**
	 * copyTo
	 * @generated
	 */
	public void copyTo(BankAccountData.Store target) {
		if (!this.isDirty) return;
		if (this.isbalanceDirty ) target.setBalance(this.balance);
	}
}
