<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">

<!--
 Licensed Material - Property of IBM 
 (C) Copyright IBM Corp. 2001 - All Rights Reserved. 
 US Government Users Restricted Rights - Use, duplication or disclosure 
 restricted by GSA ADP Schedule Contract with IBM Corp. 
-->

<%@ page errorPage="/error.jsp" import="java.util.List,com.ibm.etools.utc.Tree,com.ibm.etools.utc.Resource,com.ibm.etools.utc.view.*,com.ibm.etools.utc.model.*" contentType="text/html; charset=utf-8" %>
<jsp:useBean id="parameterView" scope="session" class="com.ibm.etools.utc.view.ParameterView"/>
<jsp:useBean id="modelManager" scope="session" class="com.ibm.etools.utc.ClassModelManager"/>
<jsp:useBean id="resultView" scope="session" class="com.ibm.etools.utc.view.ResultView"/>
<%@ taglib uri="/utc" prefix="utc" %>

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta http-equiv="Content-Style-Type" content="text/css">
  <meta http-equiv="Pragma" content="no-cache">
  <meta http-equiv="Cache-Control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <link rel=stylesheet type="text/css" href="/UTC/css/dynamic.css">
</head>

<% parameterView.loadManagerObjects(modelManager);
  parameterView.loadManagerClasses(modelManager); %>

<% if (parameterView.isLoadClassView()) { %>
<!- *************** Load class *************** -->
<body>
<div class="parameterPage">
<form name="newClassForm" action="/UTC/toolbox" method="post" target="formParameters" enctype="multipart/form-data">
<input type="hidden" name="random" value="<%= Math.random() %>"/>
<input type="hidden" name="utility" value="2"/>
<table cellpadding=3 cellspacing=0 border=0 bgcolor=white>
<tr>
  <td colspan=2><b><utc:resource key="infoToolboxLoadClass"/></b></td>
</tr>
<tr>
  <td colspan><utc:resource key="ejbPageParameterViewLoadClass"/></td>
  <td><input type="text" name="class" size=25/></td>
</tr>
<tr>
  <td><input type=submit value="<utc:resource key="ejbPageParameterViewLoad"/>" id="invoke" class="button"/></td>
</tr>

</table>
</form>

<% } else if (parameterView.isClassCastView()) { %>
<!- *************** Class Cast *************** -->
<body>
<div class="parameterPage">
<form name="newClassForm" action="/UTC/toolbox" method="post" target="formParameters" enctype="multipart/form-data">
<input type="hidden" name="random" value="<%= Math.random() %>"/>
<input type="hidden" name="utility" value="0"/>
<table cellpadding=3 cellspacing=0 border=0 bgcolor=white>
<tr>
  <td colspan=2><b><utc:resource key="infoToolboxCastClass"/></b></td>
</tr>
<tr>
  <td><utc:resource key="ejbPageParameterViewObject"/></td>
  <td>

<select name="object" id="object">
<% List castObjects = parameterView.getManagerObjects();
  int size = castObjects.size();
  for (int j = 0; j < size; j++) {
  ObjectModel model = (ObjectModel) castObjects.get(j); %>
  <option value="<%= j %>"><%= model.getName() %></option>
<% } %>
</select>
  </td>
</tr>
<tr>
  <td><utc:resource key="ejbPageParameterViewCastType"/></td>
  <td>

<select name="class" id="class">
<% List castClasses = parameterView.getManagerClasses();
  size = castClasses.size();
  for (int j = 0; j < size; j++) {
  ClassModel model = (ClassModel) castClasses.get(j); %>
  <option value="<%= j %>"><%= model.getName() %></option>
  <% } %>
</select>
  </td>
</tr>
<tr>
  <td><input type=submit value="<utc:resource key="ejbPageParameterViewCast"/>" id="invoke" class="button"/></td>
</tr>

</table>
</form>

<% } else if (parameterView.isArrayView()) { %>
<!- *************** Array Creation *************** -->
<body>
<div class="parameterPage">
<form name="createArrayForm" action="/UTC/toolbox" method="post" target="formParameters" enctype="multipart/form-data">
<input type="hidden" name="random" value="<%= Math.random() %>"/>
<input type="hidden" name="utility" value="1"/>
<table cellpadding=3 cellspacing=0 border=0 bgcolor=white>
<tr>
  <td colspan=2><b><utc:resource key="infoToolboxCreateArray"/></b></td>
</tr>
<tr>
  <td><utc:resource key="ejbPageParameterViewArrayType"/></td>
  <td>

<select name="class" id="class">
<% List castClasses = parameterView.getManagerClasses();
  int size = castClasses.size();
  for (int j = 0; j < size; j++) {
  ClassModel model = (ClassModel) castClasses.get(j); %>
  <option value="<%= j %>"><%= model.getName() %></option>
  <% } %>
</select>

  </td>
</tr>
<tr>
  <td><utc:resource key="ejbPageParameterViewArraySize"/></td>
  <td><input type="text" name="size" value="1" size=5/></td>
</tr>
<tr>
  <td><input type=submit value="<utc:resource key="ejbPageParameterViewArrayCreate"/>" id="invoke" class="button"/></td>
</tr>

</table>
</form>

<% } else if (parameterView.isCollectionToArrayView()) { %>
<!- *************** Collection To Array *************** -->
<% parameterView.loadManagerCollections(modelManager); %>
<body>
<div class="parameterPage">
<form name="collectionToArrayForm" action="/UTC/toolbox" method="post" target="formParameters" enctype="multipart/form-data">
<input type="hidden" name="random" value="<%= Math.random() %>"/>
<input type="hidden" name="utility" value="3"/>
<table cellpadding=3 cellspacing=0 border=0 bgcolor=white>
<tr>
  <td colspan=2><b>Collection -> Object[]</b></td>
</tr>
<tr>
  <td><utc:resource key="ejbPageParameterViewCollection"/></td>
  <td>

<select name="collection" id="collection">
<% List collections = parameterView.getManagerCollections();
  int size = collections.size();
  for (int j = 0; j < size; j++) {
  ClassModel model = (ClassModel) collections.get(j); %>
  <option value="<%= j %>"><%= model.getName() %></option>
  <% } %>
</select>

  </td>
</tr>
<tr>
  <td><input type=submit value="<utc:resource key="ejbPageParameterViewConvert"/>" id="invoke" class="button"/></td>
</tr>

</table>
</form>

<% } else if (parameterView.isArrayToListView()) { %>
<!- *************** Array To List *************** -->
<% parameterView.loadManagerArrays(modelManager); %>
<body>
<div class="parameterPage">
<form name="arrayToListForm" action="/UTC/toolbox" method="post" target="formParameters" enctype="multipart/form-data">
<input type="hidden" name="random" value="<%= Math.random() %>"/>
<input type="hidden" name="utility" value="4"/>
<table cellpadding=3 cellspacing=0 border=0 bgcolor=white>
<tr>
  <td colspan=2><b>Object[] -> List</b></td>
</tr>
<tr>
  <td><utc:resource key="ejbPageParameterViewArray"/></td>
  <td>

<select name="array" id="array">
<% List arrays = parameterView.getManagerArrays();
  int size = arrays.size();
  for (int j = 0; j < size; j++) {
  ClassModel model = (ClassModel) arrays.get(j); %>
  <option value="<%= j %>"><%= model.getName() %></option>
  <% } %>
</select>
  </td>
</tr>
<tr>
  <td><input type=submit value="<utc:resource key="ejbPageParameterViewConvert"/>" id="invoke" class="button"/></td>
</tr>

</table>
</form>

<% } else if (parameterView.isSetArrayElementView()) { %>
<!- *************** Set Array Element *************** -->
<% parameterView.loadManagerArrays(modelManager); %>
<% parameterView.loadManagerObjects(modelManager); %>
<body>
<div class="parameterPage">
<form name="arrayElementForm" action="/UTC/toolbox" method="post" target="formParameters" enctype="multipart/form-data">
<input type="hidden" name="random" value="<%= Math.random() %>"/>
<input type="hidden" name="utility" value="5"/>
<table cellpadding=3 cellspacing=0 border=0 bgcolor=white>
<tr>
  <td colspan=2><b><utc:resource key="infoToolboxSetArrayElement"/></b></td>
</tr>
<tr>
  <td><utc:resource key="ejbPageParameterViewArray"/></td>
  <td>

<select name="array" id="array">
<% List arrays = parameterView.getManagerArrays();
  int size = arrays.size();
  for (int j = 0; j < size; j++) {
  ClassModel model = (ClassModel) arrays.get(j); %>
  <option value="<%= j %>"><%= model.getName() %></option>
  <% } %>
</select>
  </td>
</tr>

<tr>
  <td><utc:resource key="ejbPageParameterViewElement"/></td>
  <td><input type="text" name="element" value="0" size=5/></td>
</tr>

<tr>
  <td><utc:resource key="ejbPageParameterViewObject"/></td>
  <td>

<select name="object" id="object">
<% List objects = parameterView.getManagerObjects();
  size = objects.size();
  for (int j = 0; j < size; j++) {
  ClassModel model = (ClassModel) objects.get(j); %>
  <option value="<%= j %>"><%= model.getName() %></option>
  <% } %>
</select>
  </td>
</tr>

<tr>
  <td><input type=submit value="<utc:resource key="ejbPageParameterViewSet"/>" id="invoke" class="button"/></td>
</tr>

</table>
</form>

<% } else if (parameterView.isInspectorView()) { %>
<!- *************** Field Inspector *************** -->
<% parameterView.cacheInspectorTree(modelManager); %>
<body>
<div class="parameterPage">
<%= Tree.getTableTree(request, "/html/ejbPage/parameter.jsp", parameterView.getInspectorTreeRoot(), true) %>

<% } else if (parameterView.isHierarchyView()) { %>
<!- *************** Hierarchy/Method Visibility *************** -->
<body>
<div class="parameterPage">
<b><utc:resource key="ejbPageParameterVisibility"/> <%= parameterView.getHierarchyClassFullName() %></b><br>

<form action="/UTC/setHierarchy" target="formReferences" method="post" enctype="multipart/form-data">
<input type="hidden" name="random" value="<%= Math.random() %>"/>

<div class="hierarchy">
<table cellpadding=3 cellspacing=0 border=0 width=100%>

<tr class=header>
  <td colspan=2><b><utc:resource key="ejbPageParameterVisibilitySuperclasses"/></b></td>
</tr>
<%= parameterView.getHierarchySuperclassForm() %>

<tr><td></td></tr>

<tr class=header>
  <td colspan=2><b><utc:resource key="ejbPageParameterVisibilitySuperinterfaces"/></b></td>
</tr>
<%= parameterView.getHierarchyInterfaceForm() %>

</table>
</div>
<br>

<input type=submit value="<utc:resource key="ejbPageParameterVisibilitySet"/>" id="visibility" class="button"/>

</form>

<% } else { %>
<!- *************** Constructor/Method Invocation *************** -->
<body>
<div class="parameterPage">
<% if (parameterView.isValid()) { %>

<form name="invokeForm" action="/UTC/invoke" method="post" target="formParameters" enctype="multipart/form-data">
<input type="hidden" name="random" value="<%= Math.random() %>"/>
<table cellpadding=3 cellspacing=0 border=0 bgcolor=white>

  <% if (parameterView.isEmbeddedConstructor()) {
    ParameterView subView = parameterView.getEmbeddedView(); %>
  <tr class=alternating>
    <td><img src="<%= subView.getImageSource() %>" width=16 height=16/></td>
    <td colspan=3 nowrap><span class="heading"><%= subView.getFullName() %></span></td>
  </tr>
  <% } %>

  <tr>
    <td><img src="<%= parameterView.getImageSource() %>" width=16 height=16/></td>
    <td colspan=3 nowrap><span class="heading"><%= parameterView.getFullName() %></span></td>
  </tr>

  <tr height=8><td></td></tr>

</table>

<% int count = parameterView.getParameterCount();
  if (count > 0) { %>

 <div class="parameters">
  <table width=100% cellpadding=3 cellspacing=0 border=0 bgcolor=white>

  <tr class=header>
    <td class=header><utc:resource key="ejbPageParameterViewParameter"/></td>
    <td class=header width=8>&nbsp;</td>
    <td class=header><utc:resource key="ejbPageParameterViewValue"/></td>
    <td class=header width=8>&nbsp;</td>
    <td class=header colspan=2>&nbsp;</td>
  </tr>

  <tr height=1 class=separator><td colspan=6></td></tr>

  <% for (int i = 0; i < count; i++) { %>

  <tr align=left<% if (i % 2 == 1) { %> class=alternating<% } %>>
    <td nowrap><image src="/UTC/images/members/field_public.gif" width=16 height=16> <%= parameterView.getParameterTypeName(i) %></td>
    <td>&nbsp;</td>
    <td nowrap>
    <% if (parameterView.isSupportedParameter(i) && parameterView.getParameterValue(i) != null) { %>
      <input type="text" name="param<%= i %>" size=8 value="<%= parameterView.getParameterValue(i) %>">
    <% } else { %>
      <%= parameterView.getParameterValue(i) %>
    <% } %>

  <td>&nbsp;</td>

  <td>
  <!- Object values drop down -->
    <% parameterView.updateCreators(modelManager, i);
    List objectValues = parameterView.getObjectValues();
    int size = objectValues.size();
    if (size > 0) { %>
      <select name="object<%= i %>" onChange="javascript:document.invokeForm.submit();">
      <option value="o"><utc:resource key="ejbPageParameterViewUseObject"/></option>
      <% for (int j = 0; j < size; j++) {
        ObjectModel model = (ObjectModel) objectValues.get(j); %>
        <option value="o<%= j %>"><%= model.getName() %></option>
      <% } %>
      </select>
    <% } else { %>&nbsp;<% } %>
  </td>

  <td>
  <!- Constructor drop down -->
    <% List constructorValues = parameterView.getConstructorValues();
    size = constructorValues.size();
    if (size > 0) { %>
      <select name="constructor<%= i %>" onChange="javascript:document.invokeForm.submit();">
      <option value="c"><utc:resource key="ejbPageParameterViewUseConstructor"/></option>
      <% for (int j = 0; j < size; j++) {
        ConstructorModel model = (ConstructorModel) constructorValues.get(j); %>
        <option value="c<%= j %>"><%= parameterView.formatConstructor(model) %></option>
      <% } %>
      </select>
    <% } else { %>&nbsp;<% } %>
  </td>
  </tr>

  <% if (i < count - 1) { %>
  <tr height=1 class=separator><td colspan=6></td></tr>
  <% } %>

  <% } %>
  </table>
</div>
<% } %>

  <br>
  <input type=submit value="<% if (parameterView.isEmbeddedConstructor()) { %><%= Resource.getString("ejbPageParameterViewEmbeddedInvoke") %><% } else { %><%= Resource.getString("ejbPageParameterViewInvoke") %><% } %>" id="invoke" name="invoke" class="button"/>
</form>

<% if (parameterView.isEmbeddedConstructor()) { %>
  <form name="cancel" action="/UTC/cancelEmbeddedConstructor" method="get" target="formParameters">
  <input type="hidden" name="random" value="<%= Math.random() %>"/>
  <input type=submit value="<utc:resource key="ejbPageParameterViewCancel"/>" id="cancel" class="button"/>
  </form>
<% } %>

<% } else { %>
  <utc:resource key="ejbPageParameterViewInvalid"/>
<% } %>

<% } %>
<!- *************** Results Section *************** -->

<a name="result"/>
<table cellpadding=0 cellspacing=0 width=100%>
  <tr><td height=5></td></tr>
  <tr><td bgcolor=black height=1></td></tr>
  <tr><td height=5></td></tr>
</table>

<b><utc:resource key="ejbPageParameterViewLastResult"/></b>
<!-- Result Page --->
<% if (resultView.isValid()) { %>

  <% if (resultView.isErrorResult()) { %>
    <font color=red><%= resultView.getError() %></font>
  <% } else if (resultView.isVoidResult()) { %>
    <utc:resource key="ejbPageResultViewVoid"/>
  <% } else if (resultView.isNullResult()) { %>
    <utc:resource key="ejbPageResultViewNull"/>
  <% } else if (resultView.isExceptionResult()) { %>
    <img src="/UTC/images/error.gif" width=16 height=16 align="top"/>
    <%= resultView.getExceptionMessage() %>
  <% } else { %>
    <% if (resultView.getModel() instanceof ObjectModel) { %>
      <img src="/UTC/images/object.gif" width=16 height=16 align="top"/>&nbsp;<%= resultView.getObjectValue() %>&nbsp;(<%= resultView.getModelFullName() %>)
    <% } else { %>
      <img src="/UTC/images/class.gif" width=16 height=16 align="top"/>&nbsp;<%= resultView.getModelFullName() %>
    <% } %>
  <% } %>

  <% if (resultView.showSource()) { %>
    <br>
    <div class="resultSource">
    (<utc:resource key="ejbPageParameterViewSource"/> <img src="<%= resultView.getSourceImage() %>" width=16 height=16/><%= resultView.getSource() %>)
    </div><br>
  <% } %>

  <% if (resultView.isExceptionResult() || resultView.isObjectResult()) { %>
    <table cellpadding=3 cellspacing=0 border=0>
    <tr valign="baseline">
    <% if (modelManager.contains(resultView.getModel())) { %>
      <td><utc:resource key="ejbPageResultViewInUse"/></td>
    <% } else { %>
      <td><form name="work" action="/UTC/addObject" method="get" target="formReferences">
      <input type="hidden" name="random" value="<%= Math.random() %>"/>
      <input type=submit value="<utc:resource key="ejbPageResultViewUse"/>" id="work" class="button"/>
      </form></td>
    <% } %>
    <% if (resultView.isCollection()) { %>
      <td><form name="workAll" action="/UTC/addAllObjects" method="get" target="formReferences">
      <input type="hidden" name="random" value="<%= Math.random() %>"/>
      <input type=submit value="<utc:resource key="ejbPageResultViewUseAll"/>" id="workAll" class="button"/>
      </form></td>
    <% } %>
    </tr></table>
  <% } %>

  <% if (resultView.isExceptionResult()) { %>
    <pre class="exception"><% resultView.printException(out); %></pre>
  <% } %>

<% } else { %>
  <utc:resource key="ejbPageResultViewInvalid"/>
<% } %>

</body>

</html>