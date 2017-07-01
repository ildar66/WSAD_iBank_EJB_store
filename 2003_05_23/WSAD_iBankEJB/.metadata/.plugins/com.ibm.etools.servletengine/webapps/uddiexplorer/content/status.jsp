<%@ page contentType="text/html; charset=utf-8" %>
<jsp:useBean id="viewModel" scope="session" class="com.ibm.etools.webservice.uddiexplorer.viewmodel.ViewModel"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel=stylesheet type="text/css" href=<%=response.encodeURL("../css/windows.css")%>>
<link rel=stylesheet type="text/css" href=<%=response.encodeURL("../css/dynamic.css")%>>
</head>
<body>
<pre>
<%=viewModel.processStatusPage(request)%>
</pre>

</body>
</html>
