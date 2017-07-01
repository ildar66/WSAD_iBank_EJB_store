package itso.ejb35.cmp;
/**
 * Bean implementation class for Enterprise Bean: TransRecord
 */
public class TransRecordBean implements javax.ejb.EntityBean, itso.ejb35.cmp.TransRecordData.Store {

	private javax.ejb.EntityContext myEntityCtx;
	/**
	 * Implemetation field for persistent attribute: transID
	 */
	public java.sql.Timestamp transID;
	/**
	 * Implemetation field for persistent attribute: transamt
	 */
	public java.math.BigDecimal transamt;
	/**
	 * Implemetation field for persistent attribute: transtype
	 */
	public java.lang.String transtype;
	/**
	 * Implemetation field for persistent attribute: accID
	 */
	public java.lang.String accID;
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
	public itso.ejb35.cmp.TransRecordKey ejbCreate(
		String anAccID,
		java.math.BigDecimal anAmount,
		String aTranstype)
		throws javax.ejb.CreateException {
		_initLinks();
		transID = new java.sql.Timestamp(System.currentTimeMillis());
		accID = anAccID;
		transtype = aTranstype;
		transamt = anAmount;
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
		String anAccID,
		java.math.BigDecimal anAmount,
		String aTranstype)
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
	protected void _removeLinks() throws java.rmi.RemoteException, javax.ejb.RemoveException {
		java.util.List links = _getLinks();
		for (int i = 0; i < links.size() ; i++) {
			try {
				((com.ibm.ivj.ejb.associations.interfaces.Link) links.get(i)).remove();
			} catch (javax.ejb.FinderException e) {} //Consume Finder error since I am going away
		}
	}
	/**
	 * Get accessor for persistent attribute: transamt
	 */
	public java.math.BigDecimal getTransamt() {
		return transamt;
	}
	/**
	 * Set accessor for persistent attribute: transamt
	 */
	public void setTransamt(java.math.BigDecimal newTransamt) {
		transamt = newTransamt;
	}
	/**
	 * Get accessor for persistent attribute: transtype
	 */
	public java.lang.String getTranstype() {
		return transtype;
	}
	/**
	 * Set accessor for persistent attribute: transtype
	 */
	public void setTranstype(java.lang.String newTranstype) {
		transtype = newTranstype;
	}
	/**
	 * ejbCreate method for a CMP entity bean.
	 */
	public itso.ejb35.cmp.TransRecordKey ejbCreate(java.sql.Timestamp transID) throws javax.ejb.CreateException {
		_initLinks();
		this.transID = transID;
		return null;
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.sql.Timestamp transID) throws javax.ejb.CreateException {
	}
	/**
	 * Get accessor for persistent attribute: accID
	 */
	public java.lang.String getAccID() {
		return accID;
	}
	/**
	 * Set accessor for persistent attribute: accID
	 */
	public void setAccID(java.lang.String newAccID) {
		accID = newAccID;
	}
	/**
	 * getTransRecordData
	 */
	public itso.ejb35.cmp.TransRecordData getTransRecordData() {
		return new itso.ejb35.cmp.TransRecordData(this);
	}
	/**
	 * setTransRecordData
	 */
	public void setTransRecordData(itso.ejb35.cmp.TransRecordData data) throws com.ibm.etools.ejb.client.runtime.FieldChangedException {
		data.copyTo(this);
		if ( !data.getIsaccIDDirty() ) {
			if ( this.getAccID() != null && data.getAccID() != null ) {
				if ( !this.getAccID().equals(data.getAccID()) ) {
					throw new com.ibm.etools.ejb.client.runtime.FieldChangedException();
				}
			}
			else if ( !(this.getAccID() == null && data.getAccID() == null) ) {
				throw new com.ibm.etools.ejb.client.runtime.FieldChangedException();
			}
		}
		if ( !data.getIstransamtDirty() ) {
			if ( this.getTransamt() != null && data.getTransamt() != null ) {
				if ( !this.getTransamt().equals(data.getTransamt()) ) {
					throw new com.ibm.etools.ejb.client.runtime.FieldChangedException();
				}
			}
			else if ( !(this.getTransamt() == null && data.getTransamt() == null) ) {
				throw new com.ibm.etools.ejb.client.runtime.FieldChangedException();
			}
		}
		if ( !data.getIstranstypeDirty() ) {
			if ( this.getTranstype() != null && data.getTranstype() != null ) {
				if ( !this.getTranstype().equals(data.getTranstype()) ) {
					throw new com.ibm.etools.ejb.client.runtime.FieldChangedException();
				}
			}
			else if ( !(this.getTranstype() == null && data.getTranstype() == null) ) {
				throw new com.ibm.etools.ejb.client.runtime.FieldChangedException();
			}
		}
	}
	/**
	 * syncTransRecordData
	 */
	public itso.ejb35.cmp.TransRecordData syncTransRecordData(itso.ejb35.cmp.TransRecordData data) {
		data.copyTo(this);
		return this.getTransRecordData();
	}
	/**
	 * getPrimaryKey
	 */
	public Object getPrimaryKey() {
		return getEntityContext().getPrimaryKey();
	}
}
