package itso.ejb35.cmp;
import com.ibm.ejs.persistence.*;
import javax.ejb.EntityBean;
import java.sql.*;
import java.text.*;
import com.ibm.vap.converters.*;
import com.ibm.vap.converters.streams.*;
/**
 * EJSJDBCPersisterCMPTransRecordBean
 * @generated
 */
public class EJSJDBCPersisterCMPTransRecordBean extends EJSJDBCPersister implements itso.ejb35.cmp.EJSFinderTransRecordBean {
	/**
	 * @generated
	 */
	private static final String _createString = "INSERT INTO ITSO.TRANSRECORD (TRANSID, TRANSAMT, TRANSTYPE, ACCID) VALUES (?, ?, ?, ?)";
	/**
	 * @generated
	 */
	private static final String _removeString = "DELETE FROM ITSO.TRANSRECORD  WHERE TRANSID = ?";
	/**
	 * @generated
	 */
	private static final String _storeString = "UPDATE ITSO.TRANSRECORD  SET TRANSAMT = ?, TRANSTYPE = ?, ACCID = ? WHERE TRANSID = ?";
	/**
	 * @generated
	 */
	private static final String _loadString = "SELECT T1.TRANSID, T1.TRANSAMT, T1.TRANSTYPE, T1.ACCID FROM ITSO.TRANSRECORD  T1 WHERE T1.TRANSID = ?";
	/**
	 * @generated
	 */
	private static final String _loadForUpdateString = _loadString + " FOR UPDATE";
	/**
	 * @generated
	 */
	private byte[] serObj = null;
	/**
	 * EJSJDBCPersisterCMPTransRecordBean
	 * @generated
	 */
	public EJSJDBCPersisterCMPTransRecordBean() throws java.rmi.RemoteException {
		super();	}
	/**
	 * postInit
	 * @generated
	 */
	public void postInit() {
	}
	/**
	 * _create
	 * @generated
	 */
	public void _create(EntityBean eb) throws Exception {
		Object objectTemp = null;
		TransRecordBean b = (TransRecordBean) eb;
		PreparedStatement pstmt;
		pstmt = getPreparedStatement(_createString);
		try {
			if (b.transID == null) {
				pstmt.setNull(1, java.sql.Types.TIMESTAMP);
			}
			else {
				pstmt.setTimestamp(1, b.transID);
			}
			if (b.transamt == null) {
				pstmt.setNull(2, java.sql.Types.DECIMAL);
			}
			else {
				pstmt.setBigDecimal(2, b.transamt);
			}
			objectTemp = com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(b.transtype);
			if (objectTemp == null) {
				pstmt.setNull(3, java.sql.Types.VARCHAR);
			}
			else {
				pstmt.setString(3, (java.lang.String)objectTemp);
			}
			objectTemp = com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(b.accID);
			if (objectTemp == null) {
				pstmt.setNull(4, java.sql.Types.VARCHAR);
			}
			else {
				pstmt.setString(4, (java.lang.String)objectTemp);
			}
			pstmt.executeUpdate();
		}
		finally {
			returnPreparedStatement(pstmt);
		}
	}
	/**
	 * hydrate
	 * @generated
	 */
	public void hydrate(EntityBean eb, Object data, Object pKey) throws Exception {
		Object objectTemp = null;
		TransRecordBean b = (TransRecordBean) eb;
		itso.ejb35.cmp.TransRecordKey _primaryKey = (itso.ejb35.cmp.TransRecordKey)pKey;
		java.sql.ResultSet resultSet = (java.sql.ResultSet) data;
		b.transID = _primaryKey.transID;
		b.transamt = resultSet.getBigDecimal(2);
		b.transtype = (java.lang.String)com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(resultSet.getString(3));
		b.accID = (java.lang.String)com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(resultSet.getString(4));
	}
	/**
	 * load
	 * @generated
	 */
	public void load(EntityBean eb, Object pKey, boolean forUpdate) throws Exception {
		Object objectTemp = null;
		TransRecordBean b = (TransRecordBean) eb;
		itso.ejb35.cmp.TransRecordKey _primaryKey = (itso.ejb35.cmp.TransRecordKey)pKey;
		PreparedStatement pstmt;
		ResultSet resultSet = null;
		pstmt = (forUpdate) ?
			getPreparedStatement(_loadForUpdateString):
			getPreparedStatement(_loadString);
		try {
			if (_primaryKey.transID == null) {
				pstmt.setNull(1, java.sql.Types.TIMESTAMP);
			}
			else {
				pstmt.setTimestamp(1, _primaryKey.transID);
			}
			resultSet = pstmt.executeQuery();
			if (!(resultSet.next())) throw new javax.ejb.ObjectNotFoundException();
			hydrate(eb, resultSet, pKey);
		}
		finally {
			if (resultSet != null) resultSet.close();
			returnPreparedStatement(pstmt);
		}
	}
	/**
	 * refresh
	 * @generated
	 */
	public void refresh(EntityBean eb, boolean forUpdate) throws Exception {
		TransRecordBean b = (TransRecordBean) eb;
		itso.ejb35.cmp.TransRecordKey _primaryKey = new itso.ejb35.cmp.TransRecordKey();
		_primaryKey.transID = b.transID;
		load(b, _primaryKey, forUpdate);
	}
	/**
	 * store
	 * @generated
	 */
	public void store(EntityBean eb) throws Exception {
		Object objectTemp = null;
		TransRecordBean b = (TransRecordBean) eb;
		itso.ejb35.cmp.TransRecordKey _primaryKey = new itso.ejb35.cmp.TransRecordKey();
		_primaryKey.transID = b.transID;
		PreparedStatement pstmt;
		pstmt = getPreparedStatement(_storeString);
		try {
			if (_primaryKey.transID == null) {
				pstmt.setNull(4, java.sql.Types.TIMESTAMP);
			}
			else {
				pstmt.setTimestamp(4, _primaryKey.transID);
			}
			if (b.transamt == null) {
				pstmt.setNull(1, java.sql.Types.DECIMAL);
			}
			else {
				pstmt.setBigDecimal(1, b.transamt);
			}
			objectTemp = com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(b.transtype);
			if (objectTemp == null) {
				pstmt.setNull(2, java.sql.Types.VARCHAR);
			}
			else {
				pstmt.setString(2, (java.lang.String)objectTemp);
			}
			objectTemp = com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(b.accID);
			if (objectTemp == null) {
				pstmt.setNull(3, java.sql.Types.VARCHAR);
			}
			else {
				pstmt.setString(3, (java.lang.String)objectTemp);
			}
			pstmt.executeUpdate();
		}
		finally {
			returnPreparedStatement(pstmt);
		}
	}
	/**
	 * remove
	 * @generated
	 */
	public void remove(EntityBean eb) throws Exception {
		Object objectTemp = null;
		TransRecordBean b = (TransRecordBean) eb;
		itso.ejb35.cmp.TransRecordKey _primaryKey = new itso.ejb35.cmp.TransRecordKey();
		_primaryKey.transID = b.transID;
		PreparedStatement pstmt;
		pstmt = getPreparedStatement(_removeString);
		try {
			if (_primaryKey.transID == null) {
				pstmt.setNull(1, java.sql.Types.TIMESTAMP);
			}
			else {
				pstmt.setTimestamp(1, _primaryKey.transID);
			}
			pstmt.executeUpdate();
		}
		finally {
			returnPreparedStatement(pstmt);
		}
	}
	/**
	 * getPrimaryKey
	 * @generated
	 */
	public Object getPrimaryKey(Object data) throws Exception {
		itso.ejb35.cmp.TransRecordKey key = new itso.ejb35.cmp.TransRecordKey();
		java.sql.ResultSet resultSet = (java.sql.ResultSet) data;

		if (resultSet != null) {
			Object objectTemp = null;
			key.transID = resultSet.getTimestamp(1);
			return key;
		}
		return null;
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public itso.ejb35.cmp.TransRecord findByPrimaryKey(itso.ejb35.cmp.TransRecordKey primaryKey) throws java.rmi.RemoteException, javax.ejb.FinderException {
		return (itso.ejb35.cmp.TransRecord) home.activateBean(primaryKey);
	}
}
