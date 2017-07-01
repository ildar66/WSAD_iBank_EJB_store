<%@ page import="com.ibm.etools.webservice.util.*" contentType="text/html; charset=utf-8" %>
<jsp:useBean id="viewModel" scope="session" class="com.ibm.etools.webservice.uddiexplorer.viewmodel.ViewModel" />
<jsp:useBean id="unspscModel" scope="application" class="com.ibm.etools.webservice.uddiexplorer.datamodel.CategoryModel">
  <%
     unspscModel.loadData(application.getRealPath(UrlParams.FILE_PATH_UNSPSC));
  %>
</jsp:useBean>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel=stylesheet type="text/css" href=<%=response.encodeURL("../css/dynamic.css")%>>
<script language="javascript" src=<%=response.encodeURL("../scripts/updatecategoryinfo.js")%>>
</script>
<script language="javascript" src=<%=response.encodeURL("../scripts/treeview.js")%>>
</script>
<title> <%=viewModel.getMessage("TITLE_UNSPSC")%> </title>
</head>

<body onLoad="document.location='#<%=viewModel.getFocusedUNSPSCNodeAnchorName(request)%>';setSelectedAnchorName('<%=viewModel.getSelectedUNSPSCNodeAnchorName()%>')">

<%=viewModel.processUNSPSCNavigator(request,response,unspscModel)%>

</body>
</html>
