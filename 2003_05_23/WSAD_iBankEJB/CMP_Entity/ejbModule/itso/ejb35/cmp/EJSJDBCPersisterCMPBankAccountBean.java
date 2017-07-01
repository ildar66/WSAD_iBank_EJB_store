package itso.ejb35.cmp;
import com.ibm.ejs.persistence.*;
import javax.ejb.EntityBean;
import java.sql.*;
import java.text.*;
import com.ibm.vap.converters.*;
import com.ibm.vap.converters.streams.*;
/**
 * EJSJDBCPersisterCMPBankAccountBean
 * @generated
 */
public class EJSJDBCPersisterCMPBankAccountBean extends EJSJDBCPersister implements itso.ejb35.cmp.EJSFinderBankAccountBean {
	/**
	 * @generated
	 */
	private static final String _createString = "INSERT INTO ITSO.ACCOUNT (ACCID, BALANCE) VALUES (?, ?)";
	/**
	 * @generated
	 */
	private static final String _removeString = "DELETE FROM ITSO.ACCOUNT  WHERE ACCID = ?";
	/**
	 * @generated
	 */
	private static final String _storeString = "UPDATE ITSO.ACCOUNT  SET BALANCE = ? WHERE ACCID = ?";
	/**
	 * @generated
	 */
	private static final String _loadString = "SELECT T1.ACCID, T1.BALANCE FROM ITSO.ACCOUNT  T1 WHERE T1.ACCID = ?";
	/**
	 * @generated
	 */
	private static final String _loadForUpdateString = _loadString + " FOR UPDATE";
	/**
	 * @generated
	 */
	private byte[] serObj = null;
	/**
	 * EJSJDBCPersisterCMPBankAccountBean
	 * @generated
	 */
	public EJSJDBCPersisterCMPBankAccountBean() throws java.rmi.RemoteException {
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
		BankAccountBean b = (BankAccountBean) eb;
		PreparedStatement pstmt;
		pstmt = getPreparedStatement(_createString);
		try {
			if (b.accID == null) {
				pstmt.setNull(1, java.sql.Types.CHAR);
			}
			else {
				pstmt.setString(1, b.accID);
			}
			if (b.balance == null) {
				pstmt.setNull(2, java.sql.Types.DECIMAL);
			}
			else {
				pstmt.setBigDecimal(2, b.balance);
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
		BankAccountBean b = (BankAccountBean) eb;
		itso.ejb35.cmp.BankAccountKey _primaryKey = (itso.ejb35.cmp.BankAccountKey)pKey;
		java.sql.ResultSet resultSet = (java.sql.ResultSet) data;
		b.accID = _primaryKey.accID;
		b.balance = resultSet.getBigDecimal(2);
	}
	/**
	 * load
	 * @generated
	 */
	public void load(EntityBean eb, Object pKey, boolean forUpdate) throws Exception {
		Object objectTemp = null;
		BankAccountBean b = (BankAccountBean) eb;
		itso.ejb35.cmp.BankAccountKey _primaryKey = (itso.ejb35.cmp.BankAccountKey)pKey;
		PreparedStatement pstmt;
		ResultSet resultSet = null;
		pstmt = (forUpdate) ?
			getPreparedStatement(_loadForUpdateString):
			getPreparedStatement(_loadString);
		try {
			if (_primaryKey.accID == null) {
				pstmt.setNull(1, java.sql.Types.CHAR);
			}
			else {
				pstmt.setString(1, _primaryKey.accID);
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
		BankAccountBean b = (BankAccountBean) eb;
		itso.ejb35.cmp.BankAccountKey _primaryKey = new itso.ejb35.cmp.BankAccountKey();
		_primaryKey.accID = b.accID;
		load(b, _primaryKey, forUpdate);
	}
	/**
	 * store
	 * @generated
	 */
	public void store(EntityBean eb) throws Exception {
		Object objectTemp = null;
		BankAccountBean b = (BankAccountBean) eb;
		itso.ejb35.cmp.BankAccountKey _primaryKey = new itso.ejb35.cmp.BankAccountKey();
		_primaryKey.accID = b.accID;
		PreparedStatement pstmt;
		pstmt = getPreparedStatement(_storeString);
		try {
			if (_primaryKey.accID == null) {
				pstmt.setNull(2, java.sql.Types.CHAR);
			}
			else {
				pstmt.setString(2, _primaryKey.accID);
			}
			if (b.balance == null) {
				pstmt.setNull(1, java.sql.Types.DECIMAL);
			}
			else {
				pstmt.setBigDecimal(1, b.balance);
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
		BankAccountBean b = (BankAccountBean) eb;
		itso.ejb35.cmp.BankAccountKey _primaryKey = new itso.ejb35.cmp.BankAccountKey();
		_primaryKey.accID = b.accID;
		PreparedStatement pstmt;
		pstmt = getPreparedStatement(_removeString);
		try {
			if (_primaryKey.accID == null) {
				pstmt.setNull(1, java.sql.Types.CHAR);
			}
			else {
				pstmt.setString(1, _primaryKey.accID);
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
		itso.ejb35.cmp.BankAccountKey key = new itso.ejb35.cmp.BankAccountKey();
		java.sql.ResultSet resultSet = (java.sql.ResultSet) data;

		if (resultSet != null) {
			Object objectTemp = null;
			key.accID = resultSet.getString(1);
			return key;
		}
		return null;
	}
	/**
	 * findAccountsWithBalanceBetween
	 * @generated
	 */
	public EJSFinder findAccountsWithBalanceBetween(java.math.BigDecimal anAmount1, java.math.BigDecimal anAmount2) throws javax.ejb.FinderException, java.rmi.RemoteException {
		ResultSet resultSet = null;
		PreparedStatement pstmt = null;
		try {
			preFind();
			pstmt = getPreparedStatement("SELECT T1.ACCID, T1.BALANCE FROM ITSO.ACCOUNT  T1 WHERE T1.balance >= ? AND T1.balance <= ?");
			pstmt.setBigDecimal(1, anAmount1);
			pstmt.setBigDecimal(2, anAmount2);
			resultSet = pstmt.executeQuery();
			return new EJSJDBCFinder(resultSet, this, pstmt);
		}
		catch (Exception ex) {
			throw new EJSPersistenceException("find failed:", ex);
		}
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public itso.ejb35.cmp.BankAccount findByPrimaryKey(itso.ejb35.cmp.BankAccountKey primaryKey) throws java.rmi.RemoteException, javax.ejb.FinderException {
		return (itso.ejb35.cmp.BankAccount) home.activateBean(primaryKey);
	}
	/**
	 * findAccountsWithBalanceGreaterThan
	 * @generated
	 */
	public EJSFinder findAccountsWithBalanceGreaterThan(java.math.BigDecimal anAmount) throws javax.ejb.FinderException, java.rmi.RemoteException {
		ResultSet resultSet = null;
		PreparedStatement pstmt = null;
		try {
			preFind();
			pstmt = getPreparedStatement("select T1.accid, T1.balance from ITSO.Account T1 where T1.balance > ?");
			pstmt.setBigDecimal(1, anAmount);
			resultSet = pstmt.executeQuery();
			return new EJSJDBCFinder(resultSet, this, pstmt);
		}
		catch (Exception ex) {
			throw new EJSPersistenceException("find failed:", ex);
		}
	}
	/**
	 * findAll
	 * @generated
	 */
	public EJSFinder findAll() throws javax.ejb.FinderException, java.rmi.RemoteException {
		ResultSet resultSet = null;
		PreparedStatement pstmt = null;
		try {
			preFind();
			pstmt = getPreparedStatement("SELECT T1.ACCID, T1.BALANCE FROM ITSO.ACCOUNT  T1 WHERE 1 = 1");
			resultSet = pstmt.executeQuery();
			return new EJSJDBCFinder(resultSet, this, pstmt);
		}
		catch (Exception ex) {
			throw new EJSPersistenceException("find failed:", ex);
		}
	}
	/**
	 * findAccountsWithBalanceGreater
	 * @generated
	 */
	public EJSFinder findAccountsWithBalanceGreater(java.math.BigDecimal anAmount) throws javax.ejb.FinderException, java.rmi.RemoteException {
		ResultSet resultSet = null;
		PreparedStatement pstmt = null;
		try {
			preFind();
			pstmt = getPreparedStatement("SELECT T1.ACCID, T1.BALANCE FROM ITSO.ACCOUNT  T1 WHERE T1.balance > ?");
			pstmt.setBigDecimal(1, anAmount);
			resultSet = pstmt.executeQuery();
			return new EJSJDBCFinder(resultSet, this, pstmt);
		}
		catch (Exception ex) {
			throw new EJSPersistenceException("find failed:", ex);
		}
	}
}
