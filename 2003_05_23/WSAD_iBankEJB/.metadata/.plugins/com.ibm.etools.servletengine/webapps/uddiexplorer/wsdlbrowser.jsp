<%@ page import="org.eclipse.core.resources.*,
                 org.eclipse.core.runtime.*,
                 com.ibm.itp.wt.nature.*,
                 com.ibm.etools.server.tools.*,
                 com.ibm.etools.server.tools.model.*,
                 com.ibm.etools.java.server.*,
                 com.ibm.etools.webservice.util.*,
                 com.ibm.etools.webservice.uddiexplorer.actions.*,
                 com.ibm.etools.webservice.uddiexplorer.viewmodel.*,
                 com.ibm.wstk.wsdl.*,
                 javax.wsdl.*,
                 java.util.*,
                 java.net.*" contentType="text/html; charset=utf-8" %>
<jsp:useBean id="viewModel" class="com.ibm.etools.webservice.uddiexplorer.viewmodel.ViewModel" scope="session"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title><%=viewModel.getMessage("TITLE_ECLIPSE_WSDL_BROWSER")%></title>
<script language="javascript">
function fillWebProjects()
{
  var x = 0;
<%
   {
     IWorkspaceRoot iWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
     IProject[] projects = iWorkspaceRoot.getProjects();
     for (int i=0;i<projects.length;i++)
     {
       if (!projects[i].isOpen())
         continue;
       IProjectNature nature = projects[i].getNature(IWebNatureConstants.NATURE_ID);
       if (nature != null)
       {
%>
  document.forms[0].<%=UrlParams.PROJECT%>.options[x++] = new Option("<%=projects[i].getName()%>","<%=projects[i].getName()%>");
<%
       }
     }
   }
%>
  if (document.forms[0].<%=UrlParams.PROJECT%>.options.length > 0)
  {
    document.forms[0].<%=UrlParams.PROJECT%>.options[0].selected = true;
    fillWSDLFiles(document.forms[0].<%=UrlParams.PROJECT%>.options[0].value);
  }
}

<%! private String wsdlFolder_ = null; %>
<%! private IProject webProject_ = null; %>
<%! private Vector wsdlURLs_ = new Vector(); %>

function fillWSDLFiles(selectedWebProjectName)
{
  var currentNumberOfOptions = document.forms[0].<%=UrlParams.WSDL_URL%>.options.length;
  for (var i=0;i<currentNumberOfOptions;i++)
    document.forms[0].<%=UrlParams.WSDL_URL%>.options[0] = null;
<%
   {
     String type = (String)request.getParameter("type");
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
  if (selectedWebProjectName == '<%=projects[i].getName()%>')
  {
    var x=0;
<%
         try
         {
           IWebNature webNature = (IWebNature)nature;
           wsdlFolder_ = webNature.getModuleServerRoot().getFullPath().append("wsdl").toString();
           wsdlURLs_.removeAllElements();
           webProject_ = projects[i];
           webProject_.accept(new IResourceVisitor()
           {
             private IContainer getWebModuleServerRoot(IProject webProject)
             {
               IContainer webModuleServerRoot = null;
               try
               {
                 IWebNature wNature = (IWebNature)webProject.getNature(IWebNatureConstants.NATURE_ID);
                 webModuleServerRoot = wNature.getModuleServerRoot();
               }
               catch (CoreException e)
               {
               }
               return webModuleServerRoot;
             }

             private String getWebProjectURL()
             {
               String webProjectURL = null;
               IServerInstance serverInstance = ServerUtil.getServerInstanceForProject(webProject_,true,new NullProgressMonitor());
               if (serverInstance != null)
               {
                 URL url = ((IJavaServerInstance)serverInstance).getProjectRootURL(webProject_);
                 if (url != null)
                 {
                   String s = url.toString();
                   webProjectURL = (s.endsWith("/")?s.substring(0,s.length()-1):s);
                 }
               }
               return webProjectURL;
             }

             private String getURLFromPath(IPath absolutePath)
             {
               StringBuffer url = new StringBuffer();
               IContainer webModuleServerRoot = getWebModuleServerRoot(webProject_);
               if (webModuleServerRoot != null)
               {
                 IPath webModuleServerRootPath = webModuleServerRoot.getFullPath();
                 if (webModuleServerRootPath.isPrefixOf(absolutePath))
                 {
                   int count = webModuleServerRootPath.segmentCount();
                   IPath relativePath = absolutePath.removeFirstSegments(count);
                   String rootURL = getWebProjectURL();
                   if (rootURL != null)
                     url.append(rootURL).append(IPath.SEPARATOR).append(relativePath.toString());
                 }
               }
               return url.toString();
             }

             public boolean visit(IResource resource)
             {
               if (resource.getType() == IResource.FILE)
               {
                 IPath resourceFullPath = resource.getFullPath();
                 String ext = resourceFullPath.getFileExtension();
                 if (ext != null && ext.equalsIgnoreCase("wsdl") && resourceFullPath.toString().startsWith(wsdlFolder_))
                   wsdlURLs_.addElement(getURLFromPath(resourceFullPath));
               }
               return true;
             }
           });

           for (int j=0;j<wsdlURLs_.size();j++)
           {
             String url = (String)wsdlURLs_.elementAt(j);
             try
             {
               WSDLDocument wsdlDocument = new WSDLDocument(url);
               if ((type.equals("service_int") && wsdlDocument.isServiceInterface()) || (type.equals("service") && wsdlDocument.isServiceImplementation()))
               {
%>
    document.forms[0].<%=UrlParams.WSDL_URL%>.options[x++] = new Option("<%=url%>","<%=url%>");
<%
               }
             }
             catch (WSDLException e)
             {
             }
           }
         }
         catch (CoreException e)
         {
         }
%>
  }
<%
       }
     }
   }
%>
}

</script>
<link rel=stylesheet type="text/css" href=css/windows.css>
<link rel=stylesheet type="text/css" href=css/dynamic.css>
</head>

<body onLoad="fillWebProjects()">
  <form>
    <table>
      <tr>
        <td><%=viewModel.getMessage("WEB_PROJECT_LABEL")%></td>
      </tr>
      <tr>
        <td nowrap>
          <select name="<%=UrlParams.PROJECT%>" onChange="fillWSDLFiles(this.value)">
          </select>
          <input type="button" value="<%=viewModel.getMessage("REFRESH_PROJECTS_LABEL")%>" onClick="document.location='<%=response.encodeURL("wsdlbrowser.jsp?type="+(String)request.getParameter("type"))%>'">
        </td>
      </tr>
      <tr>
        <td>WSDL URL</td>
      </tr>
      <tr>
        <td>
          <select name="<%=UrlParams.WSDL_URL%>">
          </select>
        </td>
      </tr>
    </table>
    <br>
    <table>
      <tr>
        <td>
          <input type="button" value="<%="&nbsp;&nbsp;"+viewModel.getMessage("SUBMIT_BUTTON_LABEL")+"&nbsp;&nbsp;"%>" onClick="window.parent.opener.document.forms[0].<%=ActionInputs.WSDL_URL%>.value=document.forms[0].<%=UrlParams.WSDL_URL%>.value;self.close()">
          <input type="button" value="<%=viewModel.getMessage("CANCEL_BUTTON_LABEL")%>" onClick="self.close()">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>
