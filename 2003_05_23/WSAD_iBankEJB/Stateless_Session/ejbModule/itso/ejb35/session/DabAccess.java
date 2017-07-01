package itso.ejb35.session;

import com.ibm.db.*;
import com.ibm.db.base.*;
import com.ibm.ivj.db.uibeans.*;
public class DabAccess extends DatabaseAccess {
public static com.ibm.db.CallableStatementMetaData callCustStp() throws java.lang.Throwable {
  String name = "itso.ejb35.session.DabAccess.callCustStp";
  String statement = "{ CALL DB2ADMIN.CUSTOMERBYLASTNAME(:PARTIALNAME) }";

  CallableStatementMetaData aSpec = null;
  try{
    aSpec = new CallableStatementMetaData();
    aSpec.setName(name);
    aSpec.setSQL(statement);

    aSpec.addParameter("PARTIALNAME", 12, 12, 1);
    // user code begin {1} 
    // user code end {1}
  }
  catch(java.lang.Throwable e){
    // user code begin {2} 
    // user code end {2}
    throw e;
  }
  return aSpec;
/*V2.0
**start of SQL Assist data**
504b030414g08g08gc184872egggggggggggg0cggg6275696c64657220646174615bf39681b5b48841
343a3ada272bb12c512f27312f5d2fb8a428332fddbad82eef5ad6fd63ba4c0c0c15050c0c0c4c409522d8141af972ae6d31
7a120e53c80e54288c45ddda4b61cf5fca56bbc30d2c6160333530308e37286160342c2d64a863608108b3g852db0099a02
050dd0054db0a934c2266858c220ede264e4e8e2ebe9a7e71c1a1ce2efeb1ae414e9e3181ce2e7e8eb8aac1ce4324b90cb38
601a0ag504b0708c7292f8aa2ggg2e01gg504b010214g14g08g08gc184872ec7292f8aa2ggg2e01gg0cg
gggggggggggggggg6275696c6465722064617461504b0506gggg01g01g3agggdcggggg

**end of SQL Assist data**/
}
public static com.ibm.db.DatabaseConnection conn() throws java.lang.Throwable, com.ibm.db.DataException {
  com.ibm.db.DatabaseConnection connection = null;
  try{ 
    connection = new com.ibm.db.DatabaseConnection();
    connection.setConnectionAlias("itso.ejb35.session.DabAccess.conn");
    connection.setInitialContextFactory("com.ibm.ejs.ns.jndi.CNInitialContextFactory");
    connection.setJndiDataSource("jdbc/EJBBANK");
    connection.setUserID("");
    connection.setPromptUID(false);
    connection.setAutoCommit(false);
    connection.setPassword("", true);
  }
  catch(com.ibm.db.DataException e){throw e;}
  catch(java.lang.Throwable e){throw e;}
  return connection;
}
public static com.ibm.db.StatementMetaData selectByLastname() throws java.lang.Throwable {
  String name = "itso.ejb35.session.DabAccess.selectByLastname";
  String statement = "SELECT ITSO.CUSTOMER.CUSTOMERID, ITSO.CUSTOMER.FIRSTNAME, ITSO.CUSTOMER.LASTNAME FROM ITSO.CUSTOMER WHERE ( ( ITSO.CUSTOMER.LASTNAME like '%'||:PARTIALNAME||'%' ) )";

  StatementMetaData aSpec = null;
  try{
    aSpec = new com.ibm.db.StatementMetaData();
    aSpec.setName(name);
    aSpec.setSQL(statement);
    aSpec.addTable("ITSO.CUSTOMER");
    aSpec.addColumn("CUSTOMER.CUSTOMERID", 4,4);
    aSpec.addColumn("CUSTOMER.FIRSTNAME", 12,12);
    aSpec.addColumn("CUSTOMER.LASTNAME", 12,12);
    aSpec.addParameter("PARTIALNAME", 12, 12);
    // user code begin {1} 
    // user code end {1}
  }
  catch(java.lang.Throwable e){
    // user code begin {2} 
    // user code end {2}
    throw e;
  }
  return aSpec;
/*V2.0
**start of SQL Assist data**
504b030414g08g08g3b7a872egggggggggggg0cggg6275696c64657220646174615bf39681b5b48841
243ada272bb12c512f27312f5d2fb8a428332fdddac897736d8bd193702606868a0206060629a042612cead65e0a7bfe52b6
da1da68ea98481d9c8c0b08481d1b0b490a18e810922c66a6c60146f54c220e61912ecafe71c1a1ce2efeb1aa4e7e3181ce2
e7e8eb8aa114688038aa5237cf201c6a0d4a182450d5c2189e2ec88ad98d0c2ce20d40cad1dc6668600c12e5453104458591
812548056b5a624e712a9a8c29d8447334510226325b82c3c818598cd10c885551444c4b1858f24a7372500cb70405254880
0343d81024c08d216cg12e043b1df18d37e66430323f4b0018a81d419a0f9ce0ce43b2623746113903007d648358244144b
4951692a5aa498432285c72ac03128c4d3d1075d2fb305c80d183a813e330625292643230c6143ecc2a0883201g504b0708
9218dc2b3001ggf602gg504b010214g14g08g08g3b7a872e9218dc2b3001ggf602gg0cggggggggg
gggggggg6275696c6465722064617461504b0506gggg01g01g3aggg6a01gggg
**end of SQL Assist data**/
}
}
