var grid = null;
$(function() {
	var rootPath = getContextPath();
	grid = $("#paging").lyGrid({
		l_column : [ {
			colkey : "id",
			name : "id",
		}, {
			colkey : "xm",
			name : "姓名",
		}, {
			colkey : "zjhm",
			name : "证件号码"
		}],
		async : true,
		checkValue : 'id',
		checkbox : true,
		jsonUrl : rootPath+'/person/page_list',
	});
});


function getContextPath() {
	var pathName = document.location.pathname;
	var index = pathName.substr(1).indexOf("/");
	var result = pathName.substr(0, index+ 1);
	return result;
}