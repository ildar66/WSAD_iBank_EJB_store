<%@ page import="com.ibm.etools.webservice.util.*" contentType="text/html; charset=utf-8" %>
<jsp:useBean id="viewModel" scope="session" class="com.ibm.etools.webservice.uddiexplorer.viewmodel.ViewModel"/>

<%
   if (session.getMaxInactiveInterval() > 0)
     session.setMaxInactiveInterval(-1);
   viewModel.setFavoritesFilePath(application.getRealPath("/favorites.dat"));
   viewModel.processUddiExplorer(request);
%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title> <%=viewModel.getTitle((String)session.getAttribute(UrlParams.PROJECT))%> </title>
</head>

<frameset cols="400,*">
  <frame name="treewindow" src=<%=response.encodeURL("treewindow.jsp")%> marginwidth="1" marginheight="1" scrolling="no" frameborder="1">
  <frameset rows="80%,20%">
    <frame name=<%=UrlParams.WSEXP_ACTION_PAGE_TARGET%> src=<%=response.encodeURL("propwindow.jsp")%> marginwidth="1" marginheight="1" scrolling="no" frameborder="1">
    <frame name="statuswindow" src=<%=response.encodeURL("statuswindow.jsp")%> marginwidth="1" marginheight="1" scrolling="no" frameborder="1">
  </frameset>
</frameset>
</html>
