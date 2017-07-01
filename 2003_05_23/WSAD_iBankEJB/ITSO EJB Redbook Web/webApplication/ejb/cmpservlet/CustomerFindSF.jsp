<HTML>
	<HEAD><TITLE>Find Customer Output</TITLE></HEAD>
<BODY>
  <H2>Find Customer Output with Session Facade</H2>
  <jsp:useBean id="custht" type="java.util.Hashtable" scope="request"/>
  <H3>Customer: <%= custht.get("customerID") %></H3>
  <TABLE border="0" cellpadding="4">
	<TR>
	<TD><b>Title</b>     </TD> <TD><%= custht.get("title")     %></TD>
	</TR><TR>
	<TD><b>First Name</b></TD> <TD><%= custht.get("firstName") %></TD>
	</TR><TR>
	<TD><b>Last Name</b> </TD> <TD><%= custht.get("lastName")  %></TD>
	</TR><TR>
	<TD><b>Userid</b>    </TD> <TD><%= custht.get("userID")    %></TD>
	</TR><TR>
	<TD><b>Password</b>  </TD> <TD><%= custht.get("password")  %></TD>
	</TR>
  </TABLE>
</BODY>
</HTML>