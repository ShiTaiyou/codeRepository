function funDel(id) {
	if (window.confirm("你确定要删除吗?")) {
		document.location.href = "del.action?id=" + id;
	}
}


/**
 * 分页跳转
 * @param index
 */
function funPage(index){
	document.forms[0].action="findPage.action?pageIndex="+index; //指定路径
	document.forms[0].submit();  //提交
}