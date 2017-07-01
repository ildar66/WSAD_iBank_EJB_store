<%@ page import="java.io.*,com.ibm.etools.webservice.uddiexplorer.actions.*,com.ibm.etools.webservice.util.*,org.eclipse.core.resources.*,org.eclipse.core.runtime.*" contentType="text/html; charset=utf-8" %>
<jsp:useBean id="viewModel" scope="session" class="com.ibm.etools.webservice.uddiexplorer.viewmodel.ViewModel" />

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<%
   ImportToFileSystemAction action = (ImportToFileSystemAction)session.getAttribute(ActionInputs.IMPORT_FS_ACTION);
   if (action.setupForHtmlForm())
   {
     BufferedInputStream bis = null;
     File tempWSDLFile = null;
     try
     {
       String tempWSDLFilePath = action.writeTempWSDLFile();
       tempWSDLFile = new File(tempWSDLFilePath);
       bis = new BufferedInputStream(new FileInputStream(tempWSDLFile));
       MultipartFormDataParser parser = new MultipartFormDataParser();
       parser.parseRequest(request,HtmlUtils.utf8Encoding());
       String projectName = parser.getParameter(UrlParams.PROJECT);
       String wsdlFileName = parser.getParameter(ActionInputs.WSDL_URL_FILE);

       // Check if the target file already exists. If so, delete it.
       IWorkspaceRoot iWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
       IProject iProject = iWorkspaceRoot.getProject(projectName);
       IResource targetFileResource = iProject.findMember(wsdlFileName);
       if (targetFileResource != null && targetFileResource.getType() == IResource.FILE)
         targetFileResource.delete(true,new NullProgressMonitor());
       IFile iFile = iProject.getFile("/"+wsdlFileName);
       iFile.create(bis,true,new NullProgressMonitor());
       String[] parms = {wsdlFileName,projectName};
       out.println(viewModel.getMessage("MSG_INFO_IMPORT_ECLIPSE_SUCCESS",parms));
     }
     catch (CoreException ce)
     {
       out.println("CoreException: " + ce.getMessage());
     }
     catch (IOException ioe)
     {
       out.println("IOException: " + ioe.getMessage());
     }
     catch (MultipartFormDataException mfde)
     {
       out.println("MultipartFormDataException: " + mfde.getMessage());
     }
     finally
     {
       try
       {
         if (bis != null)
           bis.close();
         if (tempWSDLFile != null)
           tempWSDLFile.delete();
       }
       catch (IOException e)
       {
       }
     }
   }
   else
     out.println(viewModel.getMessage("MSG_ERROR_NO_WSDL_FILE"));
%>
<script language="javascript">
  top.frames['<%=UrlParams.WSEXP_ACTION_PAGE_TARGET%>'].frames['<%=UrlParams.WSEXP_ACTION_CONTENT_PAGE_TARGET%>'].location='content/import_workbench_ui.jsp';
</script>
</body>
</html>
