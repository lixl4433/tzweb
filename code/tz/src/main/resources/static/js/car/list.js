var grid = null;
$(function() {
	var rootPath = getContextPath();
	grid = $("#paging").lyGrid({
		l_column : [ {
			colkey : "id",
			name : "id",
		}, {
			colkey : "lx",
			name : "车辆类型",
		}, {
			colkey : "cph",
			name : "车牌号",
		}, {
			colkey : "comment",
			name : "备注"
		}],
		async : true,
		checkValue : 'id',
		checkbox : true,
		jsonUrl : rootPath+'/car/page_list',
	});
});


function getContextPath() {
	var pathName = document.location.pathname;
	var index = pathName.substr(1).indexOf("/");
	var result = pathName.substr(0, index+ 1);
	return result;
}