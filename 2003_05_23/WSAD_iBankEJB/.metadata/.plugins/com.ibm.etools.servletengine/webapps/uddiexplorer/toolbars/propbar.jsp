<%@ page contentType="text/html; charset=utf-8" %>
<jsp:useBean id="viewModel" scope="session" class="com.ibm.etools.webservice.uddiexplorer.viewmodel.ViewModel" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>

<body bgcolor="#D6D3CE">

<table width="100%" cellpadding="0" cellspacing="0" border="0">
<tr>
<td valign="middle" align="center" width="25" height="25" background=<%=response.encodeURL("../images/toolbar/leftborder.gif")%>><img src=<%=response.encodeURL("../images/actions.gif")%> width="16" height="16" border="0"></td>
<td valign="middle" align="left" width="*" height="25" background=<%=response.encodeURL("../images/toolbar/middlebk.gif")%>><font face="Tahoma" SIZE="-1" color="Black"><%=viewModel.getMessage("TITLE_BAR_ACTIONS")%></font></td>

<%=viewModel.processActionToolbarPage(request,response)%>

<td valign="middle" align="center" width="10" height="25" background=<%=response.encodeURL("../images/toolbar/rightborder.gif")%>>&nbsp;</td>
</tr>
</table>
</body>
</html>
