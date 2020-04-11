$(function() {
	var rootPath = "/test";
	$("#table").click(function(){
		$(".div1_2_2").load(rootPath+'/person/list');
	});
	$("#table2").click(function(){
		$(".div1_2_2").load(rootPath+'/car/list');
	});
});