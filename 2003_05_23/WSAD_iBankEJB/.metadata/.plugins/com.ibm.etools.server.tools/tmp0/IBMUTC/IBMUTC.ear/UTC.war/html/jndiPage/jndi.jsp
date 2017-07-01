<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">

<!--
 Licensed Material - Property of IBM 
 (C) Copyright IBM Corp. 2001 - All Rights Reserved. 
 US Government Users Restricted Rights - Use, duplication or disclosure 
 restricted by GSA ADP Schedule Contract with IBM Corp. 
-->

<%@ page errorPage="/error.jsp" import="com.ibm.etools.utc.Tree" contentType="text/html; charset=utf-8" %>
<jsp:useBean id="jndiView" scope="session" class="com.ibm.etools.utc.view.JNDIView"/>
<%@ taglib uri="/utc" prefix="utc" %>

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta http-equiv="Content-Style-Type" content="text/css">
  <meta http-equiv="Pragma" content="no-cache">
  <meta http-equiv="Cache-Control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <link rel=stylesheet type="text/css" href="/UTC/css/dynamic.css">
</head>

<body>

<div class="jndiPage">

<div class="lookup">
<form action="/UTC/jndiLookup" method="post" target="main" enctype="multipart/form-data">
<input type="hidden" name="random" value="<%= Math.random() %>"/>

<table cellpadding=4 cellspacing=0 border=0 width=60%>
<tr>
  <td><utc:resource key="jndiLookupPageJNDIName"/></td>
</tr>
<tr>
  <td><input type="text" name="name" value="" size=50/>&nbsp;<input type=submit id="lookup" class="button" value="<utc:resource key="jndiLookupPageLookup"/>"/></td>
</tr>

<% if (jndiView.isError()) { %>
<tr>
  <td><utc:resource key="jndiLookupPageError"/></td>
</tr>
<tr>
  <td><img src="/UTC/images/error.gif" width=16 height=16><span class=error><%= jndiView.getError() %></span></td>
</tr>
<% } %>

</table>
</form>
</div>


<% jndiView.cacheJNDINamespace(request); %>

<%= Tree.getTableTree(request, "/html/jndiPage/jndi.jsp", jndiView.getJNDIRoot(), false) %>

</div>

</body>
</html>
