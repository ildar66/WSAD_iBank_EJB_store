<HTML>
	<HEAD><TITLE>Find Customer Output</TITLE></HEAD>
<BODY>
  <H2>Find Customer Output</H2>
  <jsp:useBean id="customer" type="itso.ejb35.cmp.Customer" scope="request"/>
  <H3>Customer: <%= customer.getCustomerID() %></H3>
  <TABLE border="0" cellpadding="4">
	<TR>
	<TD><b>Title</b>     </TD> <TD><%= customer.getTitle()     %></TD>
	</TR><TR>
	<TD><b>First Name</b></TD> <TD><%= customer.getFirstName() %></TD>
	</TR><TR>
	<TD><b>Last Name</b> </TD> <TD><%= customer.getLastName()  %></TD>
	</TR><TR>
	<TD><b>Userid</b>    </TD> <TD><%= customer.getUserID()    %></TD>
	</TR><TR>
	<TD><b>Password</b>  </TD> <TD><%= customer.getPassword()  %></TD>
	</TR>
  </TABLE>
</BODY>
</HTML>