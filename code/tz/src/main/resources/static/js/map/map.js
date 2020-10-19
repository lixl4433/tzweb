var rootPath = getContextPath();
//声明变量 map、layer、url
var map, layer, url = "http://192.168.0.208:8090/iserver/services/map-baidu2/rest/maps/normal";
   
$(function() {
	init();
});


//创建地图控件
function init() {
    map = new SuperMap.Map ("div_map");
    //创建分块动态 REST 图层，该图层显示 iserver 8C 服务发布的地图,
    //其中"world"为图层名称，url 图层的服务地址，{transparent: true}设置到 url 的可选参数
    layer = new SuperMap.Layer.TiledDynamicRESTLayer("World", url, 
    null, {maxResolution:"auto"});
    layer.events.on({"layerInitialized": addLayer});          
}             
function addLayer() {
    //将 Layer 图层加载到 Map 对象上
    map.addLayer(layer);
    //出图，map.setCenter 函数显示地图
    var l = 133.755;
	var d =35.12;
	map.setCenter(new SuperMap.LonLat(l*100000, d*100000),10); 
}

function getContextPath() {
	var pathName = document.location.pathname;
	var index = pathName.substr(1).indexOf("/");
	var result = pathName.substr(0, index+ 1);
	return result;
}