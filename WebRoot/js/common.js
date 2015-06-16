function preImg(sourceId, targetId) {
	if (typeof FileReader === 'undefined') {
		alert('Your browser does not support FileReader...');
		return;
	}
	var reader = new FileReader();

	reader.onload = function(e) {
		var img = document.getElementById(targetId);
		img.src = this.result;
		img.value = this.result;
	}
	reader.readAsDataURL(document.getElementById(sourceId).files[0]);
}
function SetWinHeight(obj)   
{   
var win=obj;   
if (document.getElementById)   
{   
if (win && !window.opera)   
{   
if (win.contentDocument && win.contentDocument.body.offsetHeight)   
win.height = win.contentDocument.body.offsetHeight;   
else if(win.Document && win.Document.body.scrollHeight)   
win.height = win.Document.body.scrollHeight;   
}   
}   
}   
function login() {
	if (loginfrm.radiobutton1[0].checked == true) {
		loginfrm.action = "Login!customLogin.action"
	}
	if (loginfrm.radiobutton1[1].checked == true) {
		loginfrm.action = "Login!sellerLogin.action"
	}
	if (loginfrm.radiobutton1[2].checked == true) {
		loginfrm.action = "Login!adminLogin.action"
	}
}
function register() {
	if (regfrm.radiobutton1[0].checked == true) {
		regfrm.action = "Register!addCustom.action"
	}
	if (regfrm.radiobutton1[1].checked == true) {
		regfrm.action = "Register!addSeller.action"
	}
}
function g(o){return document.getElementById(o);}
function HoverLi(n,m,q,p){
	for(var i=1;i<=m;i++)
	{
		g(q+i).className='normaltab';
		g(p+i).className='hide';
	}
	g(p+n).className='nohide';
	g(q+n).className='hot';
}
function updateorder(){
	alert("successful update ");
}
function deleteorder(){
	alert("successful delete ");
}
function updateinfo() {
	alert("successful update ");
}