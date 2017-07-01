package itso.ejb35.bmp;

import java.math.BigDecimal;
import java.rmi.*;
import java.rmi.RemoteException;
import java.security.Identity;
import java.sql.*;
import java.util.Properties;
import javax.ejb.*;
import javax.naming.*;
import javax.sql.*;
/**
 * This is an Entity Bean class with BMP fields
 */
public class TransactionRecordBean implements EntityBean {
	private javax.ejb.EntityContext entityContext = null;
	private final static long serialVersionUID = 3206093459760846163L;

	private java.sql.Timestamp transID;
	private java.lang.String transtype;
	private java.lang.String accID;
	private java.math.BigDecimal transamt;
	private static DataSource ds;
	/**
	 * Insert the method's description here.
	 * Creation date: (04.04.2003 15:31:31)
	 * @param pstmt java.sql.PreparedStatement
	 * @param conn java.sql.Connection
	 */
	private void cleanup(PreparedStatement pstmt, Connection conn) {
		try {
			pstmt.close();
		} catch (SQLException e) {
		}
		try {
			conn.close();
		} catch (SQLException e) {
		}
	}
	/**
	 * ejbActivate method comment
	 * @exception java.rmi.RemoteException The exception description.
	 */
	public void ejbActivate() throws java.rmi.RemoteException {
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (04.04.2003 15:53:31)
	 * @return itso.ejb35.bmp.TransactionRecordKey
	 * @param acctID java.lang.String
	 * @param amount java.math.BigDecimal
	 * @param aTranstype java.lang.String
	 * @exception javax.ejb.CreateException The exception description.
	 * @exception java.rmi.RemoteException The exception description.
	 */
	public TransactionRecordKey ejbCreate(
		String acctID,
		BigDecimal amount,
		String aTranstype)
		throws CreateException {
		java.util.Date date = new java.util.Date();
		TransactionRecordKey key =
			new TransactionRecordKey(new Timestamp(System.currentTimeMillis()));
		PreparedStatement pstmt = null;
		Connection conn = null;
		Properties prp = getEntityContext().getEnvironment();
		String tableName = prp.getProperty("TABLE_NAME");
		if (tableName == null) {
			tableName = "ITSO.TRANSRECORD";
			System.out.println("ejbCreate:TABLE_NAME" + tableName);
		}
		if (acctID == null)
			throw new CreateException("accountID is null");
		else
			if (amount == null)
				throw new CreateException("amount is null");
		// initialize fields
		accID = acctID;
		transamt = amount;
		transtype = aTranstype;
		try {
			conn = getConnection();
			pstmt =
				conn.prepareStatement(
					"insert into "
						+ tableName
						+ " (transid, accid, transtype, transamt) "
						+ " values (?, ?, ?, ?)");
			pstmt.setTimestamp(1, key.primaryKey);
			pstmt.setString(2, acctID);
			pstmt.setString(3, aTranstype);
			pstmt.setBigDecimal(4, amount);
			// execute the insert statement
			pstmt.executeUpdate();
			return key;
		} catch (SQLException exc) {
			System.out.println(
				"Exception while creating TransactionRecord #" + key.primaryKey);
		} finally {
			cleanup(pstmt, conn);
		}
		return key;
	}
	public void ejbPostCreate(String acctID, BigDecimal amount, String aTranstype)
		throws CreateException {
	}
	/**
	 * ejbFindByPrimaryKey method comment
	 * @return itso.ejb35.bmp.TransactionRecordKey
	 * @param primaryKey itso.ejb35.bmp.TransactionRecordKey
	 * @exception java.rmi.RemoteException The exception description.
	 * @exception javax.ejb.FinderException The exception description.
	 */
	public TransactionRecordKey ejbFindByPrimaryKey(TransactionRecordKey aKey)
		throws FinderException, ObjectNotFoundException {
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet rs = null;
		Properties prp = getEntityContext().getEnvironment();
		String tableName = prp.getProperty("TABLE_NAME");
		if (tableName == null) {
			tableName = "ITSO.TRANSRECORD";
			System.out.println("ejbFindByPrimaryKey:TABLE_NAME" + tableName);
		}
		try {
			conn = getConnection();
			pstmt =
				conn.prepareStatement(
					"select transid from " + tableName + " where transid = ?");
			pstmt.setTimestamp(1, aKey.primaryKey);
			// execute the query and read the values
			rs = pstmt.executeQuery();
			if (!rs.next())
				throw new ObjectNotFoundException(
					"Cannot find TransactionRecord #" + aKey.primaryKey);
		} catch (SQLException exc) {
			System.out.println(
				"Exception while querying TransactionRecord #" + aKey.primaryKey);
			throw new FinderException(exc.toString());
		} finally {
			cleanup(pstmt, conn);
		}
		return aKey;
	}
	/**
	 * ejbLoad method comment
	 * @exception java.rmi.RemoteException The exception description.
	 */
	public void ejbLoad() throws java.rmi.RemoteException {
		TransactionRecordKey key =
			(TransactionRecordKey) getEntityContext().getPrimaryKey();
		transID = key.primaryKey;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection conn = null;
		Properties prp = getEntityContext().getEnvironment();
		String tableName = prp.getProperty("TABLE_NAME");
		if (tableName == null) {
			tableName = "ITSO.TRANSRECORD";
			System.out.println("ejbFindByPrimaryKey:TABLE_NAME " + tableName);
		}
		try {
			conn = getConnection();
			pstmt =
				conn.prepareStatement(
					"select accid, transtype, transamt"
						+ " from "
						+ tableName
						+ " where transid = ?");
			pstmt.setTimestamp(1, transID);
			// execute the query and read the values
			rs = pstmt.executeQuery();
			rs.next();
			accID = rs.getString("accid");
			transamt = rs.getBigDecimal("transamt");
			transtype = rs.getString("transtype");
		} catch (SQLException exc) {
			System.out.println("Exception while loading TransactionRecord #" + transID);
		} finally {
			cleanup(pstmt, conn);
		}
	}
	/**
	 * ejbPassivate method comment
	 * @exception java.rmi.RemoteException The exception description.
	 */
	public void ejbPassivate() throws java.rmi.RemoteException {
	}
	/**
	 * ejbRemove method comment
	 * @exception java.rmi.RemoteException The exception description.
	 * @exception javax.ejb.RemoveException The exception description.
	 */
	public void ejbRemove() throws RemoteException, RemoveException {
		TransactionRecordKey key =
			(TransactionRecordKey) getEntityContext().getPrimaryKey();
		Timestamp trID = key.primaryKey;
		PreparedStatement pstmt = null;
		Connection conn = null;
		Properties prp = getEntityContext().getEnvironment();
		String tableName = prp.getProperty("TABLE_NAME");
		if (tableName == null) {
			tableName = "ITSO.TRANSRECORD";
			System.out.println("ejbFindByPrimaryKey:TABLE_NAME" + tableName);
		}
		try {
			conn = getConnection();
			pstmt =
				conn.prepareStatement("delete from " + tableName + " where transid = ?");
			pstmt.setTimestamp(1, trID);
			if (pstmt.executeUpdate() == 0) {
				// something went wrong
				throw new RemoveException(
					"TransactionRecord #" + trID + " was not removed from the DB");
			}
		} catch (SQLException exc) {
			System.out.println("Error occured while removing TransactionRecord #" + trID);
			exc.printStackTrace();
		} finally {
			cleanup(pstmt, conn);
		}
	}
	/**
	 * ejbStore method comment
	 * @exception java.rmi.RemoteException The exception description.
	 */
	public void ejbStore() throws RemoteException {
		//TransactionRecordKey key = (TransactionRecordKey)
		// getEntityContext().getPrimaryKey();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection conn = null;
		Properties prp = getEntityContext().getEnvironment();
		String tableName = prp.getProperty("TABLE_NAME");
		if (tableName == null) {
			tableName = "ITSO.TRANSRECORD";
			System.out.println("ejbFindByPrimaryKey:TABLE_NAME" + tableName);
		}
		try {
			conn = getConnection();
			pstmt =
				conn.prepareStatement(
					"update "
						+ tableName
						+ " set accid = ?, transtype = ?, transamt = ? where transid = ?");
			pstmt.setString(1, accID);
			pstmt.setString(2, transtype);
			pstmt.setBigDecimal(3, transamt);
			pstmt.setTimestamp(4, transID);
			// execute the update statement
			pstmt.executeUpdate();
		} catch (SQLException exc) {
			System.out.println("Exception while storing TransactionRecord #" + transID);
		} finally {
			cleanup(pstmt, conn);
		}
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (04.04.2003 14:57:28)
	 * @return java.lang.String
	 */
	public java.lang.String getAccID() {
		return accID;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (04.04.2003 15:29:20)
	 * @return java.sql.Connection
	 * @exception java.sql.SQLException The exception description.
	 */
	private Connection getConnection() throws SQLException {
		Properties prp = getEntityContext().getEnvironment();
		String dbUser = prp.getProperty("DB_USER");
		String dbPasswd = prp.getProperty("DB_PASSWD");
		//return getDatasource().getConnection( dbUser, dbPasswd );
		return getDatasource().getConnection();
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (04.04.2003 15:28:45)
	 * @return javax.sql.DataSource
	 * @exception java.sql.SQLException The exception description.
	 */
	private DataSource getDatasource() throws SQLException {
		if (ds == null) {
			Properties prp = getEntityContext().getEnvironment();
			String dsName = prp.getProperty("DATASOURCE_NAME");
			if (dsName == null)
				dsName = "jdbc/EJBBANK";
			String providerURL = prp.getProperty("PROVIDER_URL");
			if (providerURL == null)
				providerURL = "iiop:///";
			InitialContext ctx = null;
			Properties prop = new Properties();
			try {
				prop.put(Context.PROVIDER_URL, providerURL);
				prop.put(
					Context.INITIAL_CONTEXT_FACTORY,
					"com.ibm.ejs.ns.jndi.CNInitialContextFactory");
				ctx = new InitialContext(prop);
				ds = (DataSource) ctx.lookup(dsName);
			} catch (NamingException exc) {
				System.out.println("error retrieving datasource ");
				exc.printStackTrace();
			}
		}
		return ds;
	}
	/**
	 * getEntityContext method comment
	 * @return javax.ejb.EntityContext
	 */
	public javax.ejb.EntityContext getEntityContext() {
		return entityContext;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (04.04.2003 14:57:58)
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getTransamt() {
		return transamt;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (04.04.2003 14:55:59)
	 * @return java.sql.Timestamp
	 */
	public java.sql.Timestamp getTransID() {
		return transID;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (04.04.2003 14:56:48)
	 * @return java.lang.String
	 */
	public java.lang.String getTranstype() {
		return transtype;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (04.04.2003 14:57:28)
	 * @param newAccID java.lang.String
	 */
	public void setAccID(java.lang.String newAccID) {
		accID = newAccID;
	}
	/**
	 * setEntityContext method comment
	 * @param ctx javax.ejb.EntityContext
	 * @exception java.rmi.RemoteException The exception description.
	 */
	public void setEntityContext(javax.ejb.EntityContext ctx)
		throws java.rmi.RemoteException {
		entityContext = ctx;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (04.04.2003 14:57:58)
	 * @param newTransamt java.math.BigDecimal
	 */
	public void setTransamt(java.math.BigDecimal newTransamt) {
		transamt = newTransamt;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (04.04.2003 14:55:59)
	 * @param newTransID java.sql.Timestamp
	 */
	private void setTransID(java.sql.Timestamp newTransID) {
		transID = newTransID;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (04.04.2003 14:56:48)
	 * @param newTranstype java.lang.String
	 */
	public void setTranstype(java.lang.String newTranstype) {
		transtype = newTranstype;
	}
	/**
	 * unsetEntityContext method comment
	 * @exception java.rmi.RemoteException The exception description.
	 */
	public void unsetEntityContext() throws java.rmi.RemoteException {
		entityContext = null;
	}
}