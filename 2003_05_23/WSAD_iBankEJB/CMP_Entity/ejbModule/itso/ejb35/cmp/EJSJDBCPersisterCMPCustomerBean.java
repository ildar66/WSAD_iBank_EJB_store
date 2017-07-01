package itso.ejb35.cmp;
import com.ibm.ejs.persistence.*;
import javax.ejb.EntityBean;
import java.sql.*;
import java.text.*;
import com.ibm.vap.converters.*;
import com.ibm.vap.converters.streams.*;
/**
 * EJSJDBCPersisterCMPCustomerBean
 * @generated
 */
public class EJSJDBCPersisterCMPCustomerBean extends EJSJDBCPersister implements itso.ejb35.cmp.EJSFinderCustomerBean {
	/**
	 * @generated
	 */
	private static final String _createString = "INSERT INTO ITSO.CUSTOMER (CUSTOMERID, FIRSTNAME, LASTNAME, TITLE, USERID, PASSWORD, ADDRESS) VALUES (?, ?, ?, ?, ?, ?, ?)";
	/**
	 * @generated
	 */
	private static final String _removeString = "DELETE FROM ITSO.CUSTOMER  WHERE CUSTOMERID = ?";
	/**
	 * @generated
	 */
	private static final String _storeString = "UPDATE ITSO.CUSTOMER  SET FIRSTNAME = ?, LASTNAME = ?, TITLE = ?, USERID = ?, PASSWORD = ?, ADDRESS = ? WHERE CUSTOMERID = ?";
	/**
	 * @generated
	 */
	private static final String _loadString = "SELECT T1.CUSTOMERID, T1.FIRSTNAME, T1.LASTNAME, T1.TITLE, T1.USERID, T1.PASSWORD, T1.ADDRESS FROM ITSO.CUSTOMER  T1 WHERE T1.CUSTOMERID = ?";
	/**
	 * @generated
	 */
	private static final String _loadForUpdateString = _loadString + " FOR UPDATE";
	/**
	 * @generated
	 */
	private byte[] serObj = null;
	/**
	 * EJSJDBCPersisterCMPCustomerBean
	 * @generated
	 */
	public EJSJDBCPersisterCMPCustomerBean() throws java.rmi.RemoteException {
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
		CustomerBean b = (CustomerBean) eb;
		PreparedStatement pstmt;
		pstmt = getPreparedStatement(_createString);
		try {
			pstmt.setInt(1, b.customerID);
			objectTemp = com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(b.firstName);
			if (objectTemp == null) {
				pstmt.setNull(2, java.sql.Types.VARCHAR);
			}
			else {
				pstmt.setString(2, (java.lang.String)objectTemp);
			}
			objectTemp = com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(b.lastName);
			if (objectTemp == null) {
				pstmt.setNull(3, java.sql.Types.VARCHAR);
			}
			else {
				pstmt.setString(3, (java.lang.String)objectTemp);
			}
			objectTemp = com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(b.title);
			if (objectTemp == null) {
				pstmt.setNull(4, java.sql.Types.VARCHAR);
			}
			else {
				pstmt.setString(4, (java.lang.String)objectTemp);
			}
			objectTemp = com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(b.userID);
			if (objectTemp == null) {
				pstmt.setNull(5, java.sql.Types.VARCHAR);
			}
			else {
				pstmt.setString(5, (java.lang.String)objectTemp);
			}
			objectTemp = com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(b.password);
			if (objectTemp == null) {
				pstmt.setNull(6, java.sql.Types.VARCHAR);
			}
			else {
				pstmt.setString(6, (java.lang.String)objectTemp);
			}
			objectTemp = com.ibm.vap.converters.streams.VapBinaryStreamToSerializableObjectConverter.singleton().dataFrom(b.address);
			if (objectTemp == null) {
				pstmt.setNull(7, java.sql.Types.BLOB);
			}
			else {
				pstmt.setBinaryStream(7, new java.io.ByteArrayInputStream((byte[])objectTemp), ((byte[])objectTemp).length);
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
		CustomerBean b = (CustomerBean) eb;
		itso.ejb35.cmp.CustomerKey _primaryKey = (itso.ejb35.cmp.CustomerKey)pKey;
		java.sql.ResultSet resultSet = (java.sql.ResultSet) data;
		b.customerID = _primaryKey.customerID;
		b.firstName = (java.lang.String)com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(resultSet.getString(2));
		b.lastName = (java.lang.String)com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(resultSet.getString(3));
		b.title = (java.lang.String)com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(resultSet.getString(4));
		b.userID = (java.lang.String)com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(resultSet.getString(5));
		b.password = (java.lang.String)com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(resultSet.getString(6));
		b.address = (itso.ejb35.util.CustomerAddress)com.ibm.vap.converters.streams.VapBinaryStreamToSerializableObjectConverter.singleton().objectFrom(resultSet.getBlob(7));
	}
	/**
	 * load
	 * @generated
	 */
	public void load(EntityBean eb, Object pKey, boolean forUpdate) throws Exception {
		Object objectTemp = null;
		CustomerBean b = (CustomerBean) eb;
		itso.ejb35.cmp.CustomerKey _primaryKey = (itso.ejb35.cmp.CustomerKey)pKey;
		PreparedStatement pstmt;
		ResultSet resultSet = null;
		pstmt = (forUpdate) ?
			getPreparedStatement(_loadForUpdateString):
			getPreparedStatement(_loadString);
		try {
			pstmt.setInt(1, _primaryKey.customerID);
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
		CustomerBean b = (CustomerBean) eb;
		itso.ejb35.cmp.CustomerKey _primaryKey = new itso.ejb35.cmp.CustomerKey();
		_primaryKey.customerID = b.customerID;
		load(b, _primaryKey, forUpdate);
	}
	/**
	 * store
	 * @generated
	 */
	public void store(EntityBean eb) throws Exception {
		Object objectTemp = null;
		CustomerBean b = (CustomerBean) eb;
		itso.ejb35.cmp.CustomerKey _primaryKey = new itso.ejb35.cmp.CustomerKey();
		_primaryKey.customerID = b.customerID;
		PreparedStatement pstmt;
		pstmt = getPreparedStatement(_storeString);
		try {
			pstmt.setInt(7, _primaryKey.customerID);
			objectTemp = com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(b.firstName);
			if (objectTemp == null) {
				pstmt.setNull(1, java.sql.Types.VARCHAR);
			}
			else {
				pstmt.setString(1, (java.lang.String)objectTemp);
			}
			objectTemp = com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(b.lastName);
			if (objectTemp == null) {
				pstmt.setNull(2, java.sql.Types.VARCHAR);
			}
			else {
				pstmt.setString(2, (java.lang.String)objectTemp);
			}
			objectTemp = com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(b.title);
			if (objectTemp == null) {
				pstmt.setNull(3, java.sql.Types.VARCHAR);
			}
			else {
				pstmt.setString(3, (java.lang.String)objectTemp);
			}
			objectTemp = com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(b.userID);
			if (objectTemp == null) {
				pstmt.setNull(4, java.sql.Types.VARCHAR);
			}
			else {
				pstmt.setString(4, (java.lang.String)objectTemp);
			}
			objectTemp = com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(b.password);
			if (objectTemp == null) {
				pstmt.setNull(5, java.sql.Types.VARCHAR);
			}
			else {
				pstmt.setString(5, (java.lang.String)objectTemp);
			}
			objectTemp = com.ibm.vap.converters.streams.VapBinaryStreamToSerializableObjectConverter.singleton().dataFrom(b.address);
			if (objectTemp == null) {
				pstmt.setNull(6, java.sql.Types.BLOB);
			}
			else {
				pstmt.setBinaryStream(6, new java.io.ByteArrayInputStream((byte[])objectTemp), ((byte[])objectTemp).length);
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
		CustomerBean b = (CustomerBean) eb;
		itso.ejb35.cmp.CustomerKey _primaryKey = new itso.ejb35.cmp.CustomerKey();
		_primaryKey.customerID = b.customerID;
		PreparedStatement pstmt;
		pstmt = getPreparedStatement(_removeString);
		try {
			pstmt.setInt(1, _primaryKey.customerID);
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
		itso.ejb35.cmp.CustomerKey key = new itso.ejb35.cmp.CustomerKey();
		java.sql.ResultSet resultSet = (java.sql.ResultSet) data;

		if (resultSet != null) {
			Object objectTemp = null;
			key.customerID = resultSet.getInt(1);
			return key;
		}
		return null;
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public itso.ejb35.cmp.Customer findByPrimaryKey(itso.ejb35.cmp.CustomerKey primaryKey) throws java.rmi.RemoteException, javax.ejb.FinderException {
		return (itso.ejb35.cmp.Customer) home.activateBean(primaryKey);
	}
}
