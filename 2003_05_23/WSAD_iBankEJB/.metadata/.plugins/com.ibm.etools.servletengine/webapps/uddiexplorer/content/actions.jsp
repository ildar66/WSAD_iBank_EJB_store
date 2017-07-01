<%@ page contentType="text/html; charset=utf-8" %>
<jsp:useBean id="viewModel" scope="session" class="com.ibm.etools.webservice.uddiexplorer.viewmodel.ViewModel" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script language="javascript" src=<%=response.encodeURL("../scripts/checkboxcontroller.js")%>>
</script>
<script language="javascript" src=<%=response.encodeURL("../scripts/categoryredirector.js")%>>
</script>
<script language="javascript" src=<%=response.encodeURL("../scripts/wsdlbrowser.js")%>>
</script>
<script language="javascript" src=<%=response.encodeURL("../scripts/actions.js")%>>
</script>

<link rel=stylesheet type="text/css" href=<%=response.encodeURL("../css/windows.css")%>>
<link rel=stylesheet type="text/css" href=<%=response.encodeURL("../css/dynamic.css")%>>
</head>

<body onUnload="closeCategoryWindow();closeWSDLBrowserWindow()">

    <%=viewModel.processActionContentPage(request,response)%>

</body>
</html>
