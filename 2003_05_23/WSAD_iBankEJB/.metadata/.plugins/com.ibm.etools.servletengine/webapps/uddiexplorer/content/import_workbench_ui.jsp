<%@ page import="org.eclipse.core.resources.*,com.ibm.itp.wt.nature.*,com.ibm.etools.webservice.uddiexplorer.actions.*,com.ibm.etools.webservice.util.*,com.ibm.etools.webservice.viewmodel.*" contentType="text/html; charset=utf-8" %>
<jsp:useBean id="viewModel" class="com.ibm.etools.webservice.uddiexplorer.viewmodel.ViewModel" scope="session"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script language="javascript" src="<%=response.encodeURL("../scripts/actions.js")%>">
</script>
<link rel=stylesheet type="text/css" href=<%=response.encodeURL("../css/windows.css")%>>
<link rel=stylesheet type="text/css" href=<%=response.encodeURL("../css/dynamic.css")%>>
</head>
<body>
  <table width="95%" cellpadding="3" border="0">
    <tr>
<%
   HtmlImage image = (HtmlImage)session.getAttribute(ActionInputs.IMAGE);
%>
      <td colspan="2" valign="top" bgcolor="#6699CC"> <%=image.getHtmlTag(response,image.getImagePathFocused())%>&nbsp;<%=viewModel.getMessage("IMPORT_ECLIPSE_WSDL_LABEL")%> </td>
    </tr>
  </table>
  <br>
  <form action="<%=response.encodeURL("../import_workbench.jsp")%>" method="post" enctype="multipart/form-data" target="<%=UrlParams.WSEXP_STATUS_PAGE_TARGET%>">
    <table border="0">
      <tr>
        <td><%=viewModel.getMessage("WEB_PROJECT_LABEL")%></td>

      </tr>
      <tr>
        <td>
          <select name="<%=UrlParams.PROJECT%>">
<%
            IWorkspaceRoot iWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
            IProject[] projects = iWorkspaceRoot.getProjects();
            for (int i=0;i<projects.length;i++)
            {
              if (!projects[i].isOpen())
                continue;
              IProjectNature nature = projects[i].getNature(IWebNatureConstants.NATURE_ID);
              if (nature != null && nature instanceof IWebNature)
              {
%>
            <option value="<%=projects[i].getName()%>"><%=projects[i].getName()%>
<%
              }
            }
%>
          </select>
          <input type="button" onClick="document.location='import_workbench_ui.jsp'" value="<%=viewModel.getMessage("REFRESH_PROJECTS_LABEL")%>">
        </td>
      </tr>
      <tr>
        <td><%=viewModel.getMessage("WSDL_FILENAME_LABEL")%></td>
      </tr>
      <tr>
<%
        ImportToFileSystemAction action = (ImportToFileSystemAction)session.getAttribute(ActionInputs.IMPORT_FS_ACTION);
%>
        <td><input type="text" name="<%=ActionInputs.WSDL_URL_FILE%>" value="<%=action.getWSDLBaseFilename()%>" size=29></td>
      </tr>
    </table>
    <br>
    <table>
      <tr>
        <td align="center"> <input type="submit" name="<%=ActionInputs.SUBMIT%>" value="&nbsp;&nbsp;<%=viewModel.getMessage("SUBMIT_BUTTON_LABEL")%>&nbsp;&nbsp;" onClick="checkAndSubmit('<%=viewModel.getMessage("MSG_ERROR_OPERATION_IN_PROGRESS")%>')"> </td>
      </tr>
    </table>
  </form>
</body>
</html>
