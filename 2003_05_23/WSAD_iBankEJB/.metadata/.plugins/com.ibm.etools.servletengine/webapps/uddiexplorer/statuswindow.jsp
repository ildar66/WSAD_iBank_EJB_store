<%@ page import="com.ibm.etools.webservice.util.*" contentType="text/html; charset=utf-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel=stylesheet type="text/css" href="css/windows.css">
</head>

<body bgcolor="#D6D3CE">

<div id="statcontainer">
  <iframe id="stattoolbar" src=<%=response.encodeURL("toolbars/statusbar.jsp")%> frameborder="0" scrolling="no" marginheight="1"></iframe>
  <iframe id="statcontent" name=<%=UrlParams.WSEXP_STATUS_PAGE_TARGET%> src=<%=response.encodeURL("content/status.jsp")%> frameborder="0" scrolling="yes" marginheight="1" marginwidth="1"></iframe>
  <div id="statshadow1"></div>
  <div id="statshadow2"></div>
</div>

</body>
</html>
