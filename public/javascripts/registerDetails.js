document.getElementById("isCommunity").onclick(function () {
    document.getElementById("communityName").enabled((document.getElementById("isCommunity").checked === true));
})

$('document').ready(function(){
    document.getElementById("communityName").enabled(false);
});