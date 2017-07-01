<%@ page import="com.ibm.etools.webservice.util.*" contentType="text/html; charset=utf-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel=stylesheet type="text/css" href="css/windows.css">
</head>

<body bgcolor="#D6D3CE">

<div id="treecontainer">
  <iframe id="treetoolbar" src=<%=response.encodeURL("toolbars/navigatorbar.jsp")%> frameborder="0" scrolling="no" marginheight="1"></iframe>
  <iframe id="treecontent" name=<%=UrlParams.WSEXP_NAVIGATOR_PAGE_TARGET%> src=<%=response.encodeURL("content/navigator.jsp")%> frameborder="0" scrolling="yes" marginheight="1" marginwidth="1"></iframe>
  <div id="treeshadow1"></div>
  <div id="treeshadow2"></div>
</div>

</body>
</html>
