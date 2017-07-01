var requestSubmitted = false;
function checkAndSubmit(message)
{
  if (requestSubmitted)
  {
    alert(message);
    return false;
  }
  requestSubmitted = true;
  document.forms[0].submit();
  return true;
}

function updateActionPage(newAction,newTarget,itemKey)
{
  document.forms[0].action = newAction;
  document.forms[0].target = newTarget;
  if (document.forms[0].pipe)
    document.forms[0].pipe.value = itemKey;
}
