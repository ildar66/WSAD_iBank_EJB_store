<%@ page contentType="text/html; charset=utf-8" %>
<jsp:useBean id="viewModel" scope="session" class="com.ibm.etools.webservice.uddiexplorer.viewmodel.ViewModel" />

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel=stylesheet type="text/css" href="css/windows.css">
</head>

<body bgcolor="#D6D3CE">

<%
   viewModel.processActionPage(request);
%>

<div id="container">
  <iframe id="proptoolbar" src=<%=response.encodeURL("toolbars/propbar.jsp")%> frameborder="0" scrolling="no" marginheight="1"</iframe>
  <iframe name="propcontent" id="propcontent" src=<%=response.encodeURL("content/actions.jsp")%> frameborder="0" scrolling="yes" marginheight="1" marginwidth="1"></iframe>
  <div id="shadow1"></div>
  <div id="shadow2"></div>
</div>

</body>
</html>
