function checkAll(commonCheckboxName,checkAllCheckboxName)
{
  for (var i=0;i<document.forms[0].elements.length;i++)
  {
    var e = document.forms[0].elements[i];
    if (e.type == 'checkbox' && e.name == commonCheckboxName)
      e.checked = document.forms[0].elements[checkAllCheckboxName].checked;
  }
}

function checkCheckAll(commonCheckboxName,checkAllCheckboxName)
{
  var totalBoxes = 0;
  var totalOn = 0;
  for (var i=0;i<document.forms[0].elements.length;i++)
  {
    var e = document.forms[0].elements[i];
    if (e.type == 'checkbox' && e.name == commonCheckboxName)
    {
      totalBoxes++;
      if (e.checked)
        totalOn++;
    }
  }
  if (totalBoxes == totalOn)
    document.forms[0].elements[checkAllCheckboxName].checked = true;
  else
    document.forms[0].elements[checkAllCheckboxName].checked = false;
}
