<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">

<!--
 Licensed Material - Property of IBM 
 (C) Copyright IBM Corp. 2001 - All Rights Reserved. 
 US Government Users Restricted Rights - Use, duplication or disclosure 
 restricted by GSA ADP Schedule Contract with IBM Corp. 
-->

<%@ page errorPage="/error.jsp" import="com.ibm.etools.utc.Tree" contentType="text/html; charset=utf-8" %>
<jsp:useBean id="jndiObjectView" scope="session" class="com.ibm.etools.utc.view.JNDIObjectView"/>

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

<%= Tree.getTableTree(request, "/html/jndiObjectsPage/jndiObjects.jsp", jndiObjectView.getJNDIObjectTree(), false) %>

</body>
</html>
