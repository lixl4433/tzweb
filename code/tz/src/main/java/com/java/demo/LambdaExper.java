package com.java.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * 如何优雅的使用map
 * @author think
 *
 */
public class LambdaExper {
	public static void main(String[] args) {
		convert();
	}
	
	
	public static void convert() {
		List<String> datas = new ArrayList<String>();
		datas.add("b");
		datas.add("d");
		datas.add("c");
		datas.add("a");
		List<Map<String, String>> l  = datas.parallelStream().map((p)->of(p, p)).collect(Collectors.toList());
		List<Map<String, String>> ll = datas.stream().map((p)->of(p, p)).collect(Collectors.toList());
		System.out.println(l);
		System.out.println(ll);
	}
	
	
	public static <K, V> Map<K, V> of() {
		return new HashMap<>();
	}
	
	public static <K, V> Map<K, V> of(K fieldName, V fieldValue) {
		Map<K, V> map = of();
		if (null != fieldName && null != fieldValue) map.put(fieldName, fieldValue);
		return map;
	}
}
