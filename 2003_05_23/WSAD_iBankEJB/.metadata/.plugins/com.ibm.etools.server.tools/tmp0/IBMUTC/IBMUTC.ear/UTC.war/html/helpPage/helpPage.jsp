<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">

<!--
 Licensed Material - Property of IBM 
 (C) Copyright IBM Corp. 2001 - All Rights Reserved. 
 US Government Users Restricted Rights - Use, duplication or disclosure 
 restricted by GSA ADP Schedule Contract with IBM Corp. 
-->

<html>

<%@ page errorPage="/error.jsp" contentType="text/html; charset=utf-8" %>
<jsp:useBean id="helpView" scope="session" class="com.ibm.etools.utc.view.HelpView"/>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta http-equiv="Content-Style-Type" content="text/css">
  <meta http-equiv="Pragma" content="no-cache">
  <meta http-equiv="Cache-Control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <link rel=stylesheet type="text/css" href="/UTC/css/windows.css">
</head>

<body bgcolor="#D6D3CE">

<div id="helpcontainer">
  <iframe id="helptoolbar" src="/UTC/html/toolbar/toolbar.jsp?page=9&returnURL=<%= helpView.getReturnURL() %>" frameborder="0" scrolling="No" marginheight="1" marginwidth="1"></iframe>
  <iframe id="helpcontent" name="form" src="/UTC/html/helpPage/help.jsp#<%= helpView.getName() %>" frameborder="0" scrolling="auto" marginheight="2" marginwidth="4"></iframe>
  <div id="helpshadow1"></div>
  <div id="helpshadow2"></div>
</div>

</body>
</html>