<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">

<!--
 Licensed Material - Property of IBM 
 (C) Copyright IBM Corp. 2001 - All Rights Reserved. 
 US Government Users Restricted Rights - Use, duplication or disclosure 
 restricted by GSA ADP Schedule Contract with IBM Corp. 
-->

<%@ page errorPage="/error.jsp" import="com.ibm.etools.utc.view.*" contentType="text/html; charset=utf-8" %>
<jsp:useBean id="jndiObjectView" scope="session" class="com.ibm.etools.utc.view.JNDIObjectView"/>
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

<% if (jndiObjectView.isTransactionCurrent()) { %>

<% TransactionObject transaction = (TransactionObject) jndiObjectView.getCurrent(); %>

<br>
<b><utc:resource key="jndiObjectsPageTransactionStatus"/></b> <%= transaction.getStatus() %>
<p>

<table cellpadding=3 cellspacing=0 border=0>
<tr>
<% if (transaction.showBeginAction()) { %>
<form action="/UTC/userTransaction" method="get">
  <td><input type=hidden name="action" value="begin">
  <input type=submit value="<utc:resource key="jndiObjectsPageTransactionBegin"/>" id="begin" class="button"></td>
</form>

<% } %>

<% if (transaction.showStateActions()) { %>
<form action="/UTC/userTransaction" method="get">
  <td><input type=hidden name="action" value="commit">
  <input type=submit value="<utc:resource key="jndiObjectsPageTransactionCommit"/>" id="commit" class="button"></td>
</form>
<p>
<form action="/UTC/userTransaction" method="get">
  <td><input type=hidden name="action" value="rollback">
  <input type=submit value="<utc:resource key="jndiObjectsPageTransactionRollback"/>" id="rollback" class="button"></td>
</form>
<p>
<form action="/UTC/userTransaction" method="get">
  <td><input type=hidden name="action" value="rollbackOnly">
  <input type=submit value="<utc:resource key="jndiObjectsPageTransactionRollbackOnly"/>" id="rollbackonly" class="button"></td>
</form>

<% } %>
</tr>
</table>

<% } else if (jndiObjectView.isDataSourceCurrent()) { %>

<% DataSourceObject dataSource = (DataSourceObject) jndiObjectView.getCurrent(); %>

<div class="datasource">
<table cellpadding=3 cellspacing=0 border=0>
<tr>
  <td><utc:resource key="jndiObjectsPageDataSourceDriver"/></td>
  <td><%= dataSource.getDatabaseProductName() %>, <%= dataSource.getDatabaseProductVersion() %></td>
</tr>
<tr class="alternating">
  <td><utc:resource key="jndiObjectsPageDataSourceDriver"/></td>
  <td><%= dataSource.getDriverName() %>, <%= dataSource.getDriverVersion() %></td>
</tr>
<tr>
  <td><utc:resource key="jndiObjectsPageDataSourceUser"/></td>
  <td><%= dataSource.getUserName() %></td>
</tr>
<tr class="alternating">
  <td><utc:resource key="jndiObjectsPageDataSourceMaxConnections"/></td>
  <td><%= dataSource.getMaxConnections() %></td>
</tr>
<tr>
  <td><utc:resource key="jndiObjectsPageDataSourceURL"/></td>
  <td><%= dataSource.getURL() %></td>
</tr>
</table>
</div>

<% } else { %>

<utc:resource key="jndiObjectsPageInvalid"/>

<% } %>

</body>
</html>
