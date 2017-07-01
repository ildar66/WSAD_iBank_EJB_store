package itso.ejb35.session;
import com.ibm.ivj.db.uibeans.*;
import javax.naming.*;
import java.sql.*;
import javax.sql.*;
import java.util.Vector;
import java.rmi.RemoteException;
import java.security.Identity;
import java.util.Properties;
import javax.ejb.*;
/**
 * Bean implementation class for Enterprise Bean: CustomerFinder
 */
public class CustomerFinderBean implements javax.ejb.SessionBean {
	private javax.ejb.SessionContext mySessionCtx;

	private Select ivjSelect1 = null;
	private ProcedureCall ivjProcedureCall1 = null;
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
	* Creation date: (07.04.2003 15:19:40)
	* @return java.util.Vector
	* @param partialName java.lang.String
	*/
	public Vector findDab(String partialName) {
		Vector result = new Vector();
		Select sel = getSelect1();
		try {
			sel.setParameterFromString(1, partialName);
			sel.execute();
			for (int i = 0; i < sel.getNumRows(); i++) {
				result.add(
					sel.getColumnValue(0)
						+ " "
						+ sel.getColumnValue(1)
						+ " "
						+ sel.getColumnValue(2));
				sel.nextRow();
			}
			sel.disconnect();
		} catch (Throwable ex) {
			handleException(ex);
		}
		return result;
	}
	/**
	* Insert the method's description here.
	* Creation date: (07.04.2003 14:57:26)
	* @return java.util.Vector
	* @param partialName java.lang.String
	*/
	public java.util.Vector findJdbc(String partialName) {
		Vector result = new Vector();
		PreparedStatement pstmt = null;
		Connection conn = null;
		try {
			conn = getDatasource().getConnection();
			pstmt =
				conn.prepareStatement(
					"select customerid,firstname,lastname"
						+ " from itso.customer where lastname like '%'||?||'%'");
			pstmt.setString(1, partialName);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				result.add(
					rs.getString("customerid")
						+ " "
						+ rs.getString("firstname")
						+ " "
						+ rs.getString("lastname"));
			}
			return result;
		} catch (SQLException exc) {
			System.out.println("Exception ..... names: " + partialName);
			return null;
		} finally {
			try {
				pstmt.close();
			} catch (Exception e1) {
			};
			try {
				conn.close();
			} catch (Exception e1) {
			};
		}
	}
	/**
	* Insert the method's description here.
	* Creation date: (07.04.2003 16:17:49)
	* @return java.util.Vector
	* @param partialName java.lang.String
	*/
	public Vector findStp(String partialName) {
		Vector result = new Vector();
		CallableStatement pstmt = null;
		Connection conn = null;
		try {
			conn = getDatasource().getConnection();
			pstmt = conn.prepareCall("CALL DB2ADMIN.CUSTOMERBYLASTNAME(?)");
			pstmt.setString(1, partialName);
			pstmt.execute();
			ResultSet rs = pstmt.getResultSet();
			while (rs.next()) {
				result.add(
					rs.getString("customerid")
						+ " "
						+ rs.getString("firstname")
						+ " "
						+ rs.getString("lastname"));
			}
			return result;
		} catch (SQLException exc) {
			System.out.println("Exception ..... names: " + partialName);
			return null;
		} finally {
			try {
				pstmt.close();
			} catch (Exception e1) {
			};
			try {
				conn.close();
			} catch (Exception e1) {
			};
		}
	}
	/**
	* Insert the method's description here.
	* Creation date: (07.04.2003 16:42:34)
	* @return java.util.Vector
	* @param partialName java.lang.String
	*/
	public Vector findStp2(String partialName) {
		Vector result = new Vector();
		ProcedureCall proc = getProcedureCall1();
		try {
			proc.setParameterFromString(1, partialName);
			proc.execute();
			for (int i = 0; i < proc.getNumRows(); i++) {
				result.add(
					proc.getColumnValue(0)
						+ " "
						+ proc.getColumnValue(1)
						+ " "
						+ proc.getColumnValue(2));
				proc.nextRow();
			}
			proc.disconnect();
		} catch (Throwable ex) {
			handleException(ex);
		}
		return result;

	}
	/**
	* Insert the method's description here.
	* Creation date: (07.04.2003 15:03:18)
	* @return javax.sql.DataSource
	* @exception java.sql.SQLException The exception description.
	*/
	private DataSource getDatasource() throws java.sql.SQLException {
		DataSource ds = null;
		InitialContext ctx = null;
		Properties prop = new Properties();
		try {
			prop.put(Context.PROVIDER_URL, "iiop:///");
			prop.put(
				Context.INITIAL_CONTEXT_FACTORY,
				"com.ibm.ejs.ns.jndi.CNInitialContextFactory");
			ctx = new InitialContext(prop);
			ds = (DataSource) ctx.lookup("jdbc/EJBBANK");
		} catch (NamingException exc) {
			System.out.println("error ... ");
			exc.printStackTrace();
		}
		return ds;
	}
	/**
	* Return the ProcedureCall1 property value.
	* @return com.ibm.ivj.db.uibeans.ProcedureCall
	*/
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private com.ibm.ivj.db.uibeans.ProcedureCall getProcedureCall1() {
		if (ivjProcedureCall1 == null) {
			try {
				ivjProcedureCall1 = new com.ibm.ivj.db.uibeans.ProcedureCall();
				ivjProcedureCall1.setProcedure(
					new com.ibm.ivj.db.uibeans.Query(
						itso.ejb35.session.DabAccess.conn(),
						itso.ejb35.session.DabAccess.callCustStp()));
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjProcedureCall1;
	}
	/**
	* Return the Select1 property value.
	* @return com.ibm.ivj.db.uibeans.Select
	*/
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private com.ibm.ivj.db.uibeans.Select getSelect1() {
		if (ivjSelect1 == null) {
			try {
				ivjSelect1 = new com.ibm.ivj.db.uibeans.Select();
				ivjSelect1.setQuery(
					new com.ibm.ivj.db.uibeans.Query(
						itso.ejb35.session.DabAccess.conn(),
						itso.ejb35.session.DabAccess.selectByLastname()));
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjSelect1;
	}
	/**
	* Called whenever the part throws an exception.
	* @param exception java.lang.Throwable
	*/
	private void handleException(java.lang.Throwable exception) {

		/* Uncomment the following lines to print uncaught exceptions to stdout */
		// System.out.println("--------- UNCAUGHT EXCEPTION ---------");
		// exception.printStackTrace(System.out);
	}
	/**
	* Initialize the class.
	*/
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void initialize() {
		try {
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			handleException(ivjExc);
		}
		// user code begin {2}
		// user code end
	}
}