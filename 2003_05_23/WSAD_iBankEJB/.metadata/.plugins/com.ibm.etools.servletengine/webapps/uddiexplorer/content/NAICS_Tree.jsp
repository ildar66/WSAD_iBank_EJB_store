<%@ page import="com.ibm.etools.webservice.util.*" contentType="text/html; charset=utf-8" %>
<jsp:useBean id="viewModel" scope="session" class="com.ibm.etools.webservice.uddiexplorer.viewmodel.ViewModel" />
<jsp:useBean id="naicsModel" scope="application" class="com.ibm.etools.webservice.uddiexplorer.datamodel.CategoryModel">
  <%
     naicsModel.loadData(application.getRealPath(UrlParams.FILE_PATH_NAICS));
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
<title> <%=viewModel.getMessage("TITLE_NAICS")%> </title>
</head>

<body onLoad="document.location='#<%=viewModel.getFocusedNAICSNodeAnchorName(request)%>';setSelectedAnchorName('<%=viewModel.getSelectedNAICSNodeAnchorName()%>')">

<%=viewModel.processNAICSNavigator(request,response,naicsModel)%>

</body>
</html>
