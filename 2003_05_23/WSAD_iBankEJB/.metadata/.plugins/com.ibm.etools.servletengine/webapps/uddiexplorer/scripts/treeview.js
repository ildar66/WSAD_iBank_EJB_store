var selectedAnchorName = "";

function setSelectedAnchorName(anchorName)
{
  selectedAnchorName = anchorName;
}

function selectNode(anchorName)
{
  var isIE = false;
  if (navigator.appName == "Microsoft Internet Explorer")
    isIE = true;
  if (selectedAnchorName.length > 0)
  {
    var selectedAnchor;
    if (isIE)
      selectedAnchor = document.anchors(selectedAnchorName);
    else
      selectedAnchor = document.anchors[selectedAnchorName];
    if (selectedAnchor)
      selectedAnchor.className = "unselectedTextAnchor";
  }
  if (isIE)
    document.anchors(anchorName).className = "selectedTextAnchor";
  else
    document.anchors[anchorName].className = "selectedTextAnchor";
  setSelectedAnchorName(anchorName);
  return true;
}
