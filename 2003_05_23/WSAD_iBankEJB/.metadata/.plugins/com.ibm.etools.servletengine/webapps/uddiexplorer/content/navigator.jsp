<%@ page contentType="text/html; charset=utf-8" %>
<jsp:useBean id="viewModel" scope="session" class="com.ibm.etools.webservice.uddiexplorer.viewmodel.ViewModel" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel=stylesheet type="text/css" href=<%=response.encodeURL("../css/dynamic.css")%>>
<script language="javascript" src=<%=response.encodeURL("../scripts/treeview.js")%>>
</script>
</head>
<body onLoad="document.location='#<%=viewModel.getFocusedNavigatorNodeAnchorName(request)%>';setSelectedAnchorName('<%=viewModel.getSelectedNavigatorNodeAnchorName()%>')">

<%=viewModel.processNavigator(request,response)%>

</body>
</html>
