function updateCategoryInfo(catKeyName,name,catKeyValue,value,selectedAnchorName)
{
  var counted = 0;
  var selectedNo = parseInt(window.parent.opener.document.forms[0].pipe.value);
  var elements = window.parent.opener.document.forms[0].elements;
  selectNode(selectedAnchorName);
  for (var i=0;i<elements.length;i++)
  {
    var e = elements[i];
    if (e.type == 'text')
    {
      if (e.name == catKeyName)
      {
        if (counted == selectedNo)
          e.value = name;
      }
      else if (e.name == catKeyValue)
      {
        if (counted == selectedNo)
        {
          e.value = value;
          break;
        }
        counted++;
      }
    }
  }
}
