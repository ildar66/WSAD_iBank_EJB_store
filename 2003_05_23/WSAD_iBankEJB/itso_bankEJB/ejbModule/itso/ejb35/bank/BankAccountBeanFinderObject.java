package itso.ejb35.bank;

/**
 * Insert the type's description here.
 * Creation date: (08.04.2003 13:41:24)
 * @author: Shafigullin Ildar
 */
public class BankAccountBeanFinderObject
    extends com.ibm.vap.finders.VapEJSJDBCFinderObject
    implements BankAccountBeanFinderHelper {
    private String cachedFindAccountsForCustomerQueryString = null;
/**
 * BankAccountBeanFinderObject constructor comment.
 */
public BankAccountBeanFinderObject() {
	super();
}
/**
 * Insert the method's description here.
 * Creation date: (08.04.2003 14:30:44)
 * @return java.sql.PreparedStatement
 * @param aCustomerId java.lang.String
 * @exception java.lang.Exception The exception description.
 */
public java.sql.PreparedStatement findAccountsForCustomer(int aCustomerId) throws java.lang.Exception {
    // Get the full query string and make a PreparedStatement.
    java.sql.PreparedStatement ps = getPreparedStatement(getFindAccountsForCustomerQueryString());
    // Inject the product id parameter into each merged where clause.
    for (int i = 0; i < getMergedWhereCount(); i++) {
        ps.setInt(i + 1, aCustomerId);
        //ps.setString(i+2,nextStringArgument); // if more arguments
        //ps.setDouble(i+3,nextDoubleArgument); 
    }
    return ps;
}
/**
 * findGoldAccounts method comment.
 */
public java.sql.PreparedStatement findGoldAccounts(java.math.BigDecimal aBalance) throws Exception {
    java.sql.PreparedStatement pstmt = null;
    int mergedCount = getMergedWhereCount();
    int columnCount = 1; // number of ? in the original query
    pstmt = getMergedPreparedStatement("T1.balance >= ?");
    for (int i = 0; i < (columnCount * mergedCount); i += columnCount)
        pstmt.setBigDecimal(i + 1, aBalance);
    return pstmt;
    ;
}
/**
 * Insert the method's description here.
 * Creation date: (16.04.2003 14:31:29)
 * @return java.lang.String
 */
protected String getFindAccountsForCustomerQueryString() {
    if (cachedFindAccountsForCustomerQueryString == null) {
        // Do the WHERE first
        // so that the genericFindInsertPoints are correct.
        int i;
        int[] genericFindInsertPoints = getGenericFindInsertPoints();
        StringBuffer sb = new StringBuffer(getGenericFindSqlString());
        for (i = 0; i < genericFindInsertPoints.length; i++) {
            sb.insert(genericFindInsertPoints[i], "(T1.accID = T4.accID) AND (T4.CustomerID = ?)");
        }
        // Make sure to update every FROM clause.
        String soFar = sb.toString();
        int fromOffset = soFar.indexOf(" FROM ");
        while (fromOffset != -1) {
            sb.insert((fromOffset + 5), " ITSO.CustAcct T4, ");
            soFar = sb.toString();
            fromOffset = soFar.indexOf(" FROM ", (fromOffset + 5));
        }
        cachedFindAccountsForCustomerQueryString = sb.toString();
    }
    return cachedFindAccountsForCustomerQueryString;
}
}
