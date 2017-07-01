<%@ page import="com.ibm.etools.webservice.util.*" contentType="text/html; charset=utf-8" %>
<jsp:useBean id="viewModel" scope="session" class="com.ibm.etools.webservice.uddiexplorer.viewmodel.ViewModel" />
<jsp:useBean id="geoModel" scope="application" class="com.ibm.etools.webservice.uddiexplorer.datamodel.CategoryModel">
  <%
     geoModel.loadData(application.getRealPath(UrlParams.FILE_PATH_GEO));
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
<title> <%=viewModel.getMessage("TITLE_GEO")%> </title>
</head>

<body onLoad="document.location='#<%=viewModel.getFocusedGEONodeAnchorName(request)%>';setSelectedAnchorName('<%=viewModel.getSelectedGEONodeAnchorName()%>')">

<%=viewModel.processGEONavigator(request,response,geoModel)%>

</body>
</html>
