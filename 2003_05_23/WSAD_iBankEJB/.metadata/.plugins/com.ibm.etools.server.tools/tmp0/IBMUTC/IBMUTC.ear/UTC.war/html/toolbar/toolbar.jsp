<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">

<!--
 Licensed Material - Property of IBM 
 (C) Copyright IBM Corp. 2001 - All Rights Reserved. 
 US Government Users Restricted Rights - Use, duplication or disclosure 
 restricted by GSA ADP Schedule Contract with IBM Corp. 
-->

<%@ page errorPage="/error.jsp" import="com.ibm.etools.utc.view.Toolbar" contentType="text/html; charset=utf-8" %>
<%@ taglib uri="/utc" prefix="utc" %>

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <link rel=stylesheet type="text/css" href="/UTC/css/dynamic.css">
</head>

<body class="header">

<% int pg = -1;
   try {
     pg = Integer.parseInt(request.getParameter("page"));
   } catch (Exception e) { }
%>

<table width="100%" cellpadding="0" cellspacing="0" border="0">
<tr>
<td valign="middle" align="center" width="25" height="25" background="/UTC/images/toolbar/leftborder.gif"><img src="<%= Toolbar.getImage(pg) %>" width="16" height="16" border="0"></td>
<td valign="middle" align="left" height="25" background="/UTC/images/toolbar/middlebk.gif" class="toolbar"><utc:resource key="<%= Toolbar.getTitle(pg) %>"/></td>
<td valign="middle" align="center" width="*" height="25" background="/UTC/images/toolbar/middlebk.gif">&nbsp;</td>

<%= Toolbar.getExtraToolbarItems(request, pg) %>

<% String helpURL = Toolbar.getHelpURL(pg);
   if (helpURL != null) { %>
  <td valign="middle" align="center" width="25" height="25" background="/UTC/images/toolbar/middlebk.gif">
    <a href="/UTC/help?name=<%= helpURL %>&returnURL=<%= Toolbar.getHelpReturnURL(pg) %>&random=<%= Math.random() %>" target="main"><img src="/UTC/images/elocal/help_view.gif" width="16" height="16" alt="<utc:resource key="helpPageTitle"/>" border="0" onMouseOver="src='/UTC/images/clocal/help_view.gif'" onMouseOut="src='/UTC/images/elocal/help_view.gif'"></a></td>
<% } %>

<td valign="middle" align="center" width="10" height="25" background="/UTC/images/toolbar/rightborder.gif">&nbsp;</td>
</tr>

</table>
</body>
</html>