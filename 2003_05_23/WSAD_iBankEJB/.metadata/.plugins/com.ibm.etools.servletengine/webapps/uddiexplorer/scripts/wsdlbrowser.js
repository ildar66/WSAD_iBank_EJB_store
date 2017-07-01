var wsdlBrowserWindow;

function openWSDLBrowserWindow(wsdlBrowserJSP,windowTargetName)
{
  wsdlBrowserWindow = window.open(wsdlBrowserJSP,windowTargetName,"height=300,width=300,status=yes,scrollbars=yes,resizable=yes");
  if (wsdlBrowserWindow.focus)
    wsdlBrowserWindow.focus();
}

function closeWSDLBrowserWindow()
{
  if (wsdlBrowserWindow && wsdlBrowserWindow.open && !wsdlBrowserWindow.closed)
    wsdlBrowserWindow.close();
}
