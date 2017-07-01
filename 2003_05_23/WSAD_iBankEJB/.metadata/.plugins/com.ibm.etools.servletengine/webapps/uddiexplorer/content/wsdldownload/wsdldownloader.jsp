<%@ page import="com.ibm.etools.webservice.uddiexplorer.actions.*,java.io.*" %>
<html>
<head>
</head>

<body>
<%
   BufferedInputStream bis = null;
   BufferedOutputStream bos = null;
   File tempWSDLFile = null;
   try
   {
     ImportToFileSystemAction action = (ImportToFileSystemAction)session.getAttribute(ActionInputs.IMPORT_FS_ACTION);
     if (action != null)
     {
       String tempWSDLFilePath = action.writeTempWSDLFile();
       if (tempWSDLFilePath != null)
       {
         response.setContentType("application/octet-stream");
         response.setHeader("Content-Disposition","attachment;filename="+action.getWSDLBaseFilename());
         tempWSDLFile = new File(tempWSDLFilePath);
         bis = new BufferedInputStream(new FileInputStream(tempWSDLFile));
         bos = new BufferedOutputStream(response.getOutputStream());

         byte[] buff = new byte[2048];
         int bytesRead = 0;
         while ((bytesRead = bis.read(buff,0,buff.length)) != -1)
           bos.write(buff,0,bytesRead);
       }
     }
   }
   catch (IOException ioe)
   {
   }
   finally
   {
     try
     {
       if (bis != null)
         bis.close();
       if (bos != null)
         bos.close();
       if (tempWSDLFile != null)
         tempWSDLFile.delete();
     }
     catch (IOException ioe)
     {
     }
   }
%>
</body>
</html>
