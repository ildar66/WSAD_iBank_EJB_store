package itso.ejb35.cmp;
import com.ibm.etools.ejb.client.runtime.*;
/**
 * TransRecordData
 * @generated
 */
public class TransRecordData extends AbstractEntityData {
	/**
	 * @generated
	 */
	private java.lang.String accID;
	/**
	 * @generated
	 */
	private boolean isaccIDDirty = false;
	/**
	 * @generated
	 */
	private java.math.BigDecimal transamt;
	/**
	 * @generated
	 */
	private boolean istransamtDirty = false;
	/**
	 * @generated
	 */
	private java.lang.String transtype;
	/**
	 * @generated
	 */
	private boolean istranstypeDirty = false;
	/**
	 * getIsaccIDDirty
	 * @generated
	 */
	public boolean getIsaccIDDirty() {
		return this.isaccIDDirty;
	}
	/**
	 * getAccID
	 * @generated
	 */
	public java.lang.String getAccID() {
		return this.accID;
	}
	/**
	 * setAccID
	 * @generated
	 */
	public void setAccID(java.lang.String value) {
		this.accID = value;
		this.isaccIDDirty = true;
		this.isDirty = true;
	}
	/**
	 * getIstransamtDirty
	 * @generated
	 */
	public boolean getIstransamtDirty() {
		return this.istransamtDirty;
	}
	/**
	 * getTransamt
	 * @generated
	 */
	public java.math.BigDecimal getTransamt() {
		return this.transamt;
	}
	/**
	 * setTransamt
	 * @generated
	 */
	public void setTransamt(java.math.BigDecimal value) {
		this.transamt = value;
		this.istransamtDirty = true;
		this.isDirty = true;
	}
	/**
	 * getIstranstypeDirty
	 * @generated
	 */
	public boolean getIstranstypeDirty() {
		return this.istranstypeDirty;
	}
	/**
	 * getTranstype
	 * @generated
	 */
	public java.lang.String getTranstype() {
		return this.transtype;
	}
	/**
	 * setTranstype
	 * @generated
	 */
	public void setTranstype(java.lang.String value) {
		this.transtype = value;
		this.istranstypeDirty = true;
		this.isDirty = true;
	}
	/**
	 * Store
	 * @generated
	 */
	public interface Store extends AbstractEntityData.Store {
			/**
		 * getAccID
		 * @generated
		 */
		public java.lang.String getAccID();
		/**
		 * setAccID
		 * @generated
		 */
		public void setAccID(java.lang.String value);
		/**
		 * getTransamt
		 * @generated
		 */
		public java.math.BigDecimal getTransamt();
		/**
		 * setTransamt
		 * @generated
		 */
		public void setTransamt(java.math.BigDecimal value);
		/**
		 * getTranstype
		 * @generated
		 */
		public java.lang.String getTranstype();
		/**
		 * setTranstype
		 * @generated
		 */
		public void setTranstype(java.lang.String value);
}
	/**
	 * TransRecordData
	 * @generated
	 */
	public TransRecordData() {
		super();
	}
	/**
	 * TransRecordData
	 * @generated
	 */
	public TransRecordData(TransRecordData.Store initializer) {
		super(initializer);
		initialize(initializer);
	}
	/**
	 * initialize
	 * @generated
	 */
	protected void initialize(TransRecordData.Store initializer) {
		this.accID = initializer.getAccID();
		this.transamt = initializer.getTransamt();
		this.transtype = initializer.getTranstype();
	}
	/**
	 * copyTo
	 * @generated
	 */
	public void copyTo(TransRecordData.Store target) {
		if (!this.isDirty) return;
		if (this.isaccIDDirty ) target.setAccID(this.accID);
		if (this.istransamtDirty ) target.setTransamt(this.transamt);
		if (this.istranstypeDirty ) target.setTranstype(this.transtype);
	}
}
