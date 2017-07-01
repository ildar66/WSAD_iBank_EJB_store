<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">

<!--
 Licensed Material - Property of IBM 
 (C) Copyright IBM Corp. 2001 - All Rights Reserved. 
 US Government Users Restricted Rights - Use, duplication or disclosure 
 restricted by GSA ADP Schedule Contract with IBM Corp. 
-->

<%@ page errorPage="error.jsp" import="java.util.Properties,java.util.Iterator" contentType="text/html; charset=utf-8" %>
<jsp:useBean id="jndiInfo" scope="session" class="com.ibm.etools.utc.view.JNDIInfo"/>
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

<div class="properties">
<table cellspacing=0 cellpadding=4 border=0 width=100%>
<form action="/UTC/jndiProperties" method="post" enctype="multipart/form-data">
<input type="hidden" name="random" value="<%= Math.random() %>"/>
<input type="hidden" name="action" value="set"/>
<tr valign="top">
  <td nowrap><utc:resource key="propertiesPageInitialFactory"/>&nbsp;<span class="info">(INITIAL_CONTEXT_FACTORY)</span></td>
  <td><input type="text" name="initialFactory" value="<%= jndiInfo.getInitialFactory() %>" size=50/></td>
  <td></td>
</tr>
<tr class="alternating">
  <td nowrap><utc:resource key="propertiesPageProviderURL"/>&nbsp;<span class="info">(PROVIDER_URL)</span></td>
  <td><input type="text" name="providerURL" value="<%= jndiInfo.getProviderURL() %>" size=50/></td>
  <td></td>
</tr>
<tr>
  <td nowrap><utc:resource key="propertiesPageUser"/>&nbsp;<span class="info">(SECURITY_PRINCIPAL)</span></td>
  <td><input type="text" name="user" value="<%= jndiInfo.getUser() %>" size=30/></td>
  <td></td>
</tr>
<tr class="alternating">
  <td nowrap><utc:resource key="propertiesPagePassword"/>&nbsp;<span class="info">(SECURITY_CREDENTIALS)</span></td>
  <td><input type="password" name="password" value="<%= jndiInfo.getPassword() %>" size=30/></td>
  <td><input type=submit value="<utc:resource key="propertiesPageSet"/>" id="set" class="button"/></td>
</tr>
</form>
<% String message = jndiInfo.getMessage();
  if (message != null) { %>
<tr>
  <td><utc:resource key="propertiesPageStatus"/></td>
</tr>
<tr>
  <td colspan=3><%= message %></td>
</tr>
<% } %>


<tr height=20><td></td></tr>

<tr class=header>
  <td colspan=3 class=header><utc:resource key="propertiesPageAdditionalProperties"/></td>
</tr>

<tr class=alternating>
  <form action="/UTC/jndiProperties" method="post" enctype="multipart/form-data">
  <input type="hidden" name="random" value="<%= Math.random() %>"/>
  <input type="hidden" name="action" value="add"/>
  <td><b><utc:resource key="propertiesPageName"/></b>&nbsp;<input type="text" name="property" size=25/></td>
  <td><b><utc:resource key="propertiesPageValue"/></b>&nbsp;<input type="text" name="value" size=25/></td>
  <td><input type=submit value="<utc:resource key="propertiesPageAdd"/>" id="add" class="button"/></td>
  </form>
</tr>

<% Properties p = jndiInfo.getAdditionalProperties(); 
Iterator iterator = p.keySet().iterator(); 
if (iterator.hasNext()) { %>
  <tr height=1 class="separator"><td colspan=3></td></tr>
<% }

int count = 0;
while (iterator.hasNext()) {
  count++;
  String property = (String) iterator.next();
  String value = p.getProperty(property); %>

<tr<% if (count % 2 == 0) { %> class=alternating<% } %>>
  <form action="/UTC/jndiProperties" method="post" enctype="multipart/form-data">
  <input type="hidden" name="random" value="<%= Math.random() %>"/>
  <input type="hidden" name="action" value="remove"/>
  <input type="hidden" name="property" value="<%= property %>"/>
  <td><%= property %></td>
  <td><%= value %></td>
  <td><input type=submit value="<utc:resource key="propertiesPageRemove"/>" id="remove" class="button"/></td>
  </form>
</tr>
<% } %>

<% String message2 = jndiInfo.getMessage2();
  if (message2 != null) { %>
<tr>
  <td><utc:resource key="propertiesPageStatus"/></td>
</tr>
<tr>
  <td colspan=3><%= message2 %></td>
</tr>
<% } %>

</table>

</div>

</body>
</html>
