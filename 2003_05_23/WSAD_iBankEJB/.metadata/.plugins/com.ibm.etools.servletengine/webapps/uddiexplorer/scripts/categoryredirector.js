var categoryWindow;

function getCategoryType(selectedNo)
{
  var counted = 0;
  for (var i=0;i<document.forms[0].elements.length;i++)
  {
    var e = document.forms[0].elements[i];
    if (e.type == 'select-one')
    {
      if (counted == selectedNo)
      {
        return e.options[e.selectedIndex].value;
        break;
      }
      counted++;
    }
  }
}

function openCategoryWindow(selectedNo,windowTargetName,naicsURLEncoded,unspscURLEncoded,geoURLEncoded)
{
  var categoryType = getCategoryType(selectedNo);
  var categoryJSP;
  if (categoryType == 'NAICS')
    categoryJSP = naicsURLEncoded;
  else if (categoryType == 'UNSPSC')
    categoryJSP = unspscURLEncoded;
  else if (categoryType == 'GEO')
    categoryJSP = geoURLEncoded;
  document.forms[0].pipe.value = selectedNo;
  categoryWindow = window.open(categoryJSP,windowTargetName,"height=300,width=300,status=yes,scrollbars=yes,resizable=yes");
  if (categoryWindow.focus)
    categoryWindow.focus();
}

function closeCategoryWindow()
{
  if (categoryWindow && categoryWindow.open && !categoryWindow.closed)
    categoryWindow.close();
}
