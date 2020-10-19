package com.java.npl.hanlp.demo;

import com.hankcs.hanlp.dictionary.CoreSynonymDictionary;

public class HanLPDemo {
	public static void main(String[] args) {
		// String str = "张柏芝士蛋糕店";
		// List<Term> termList = HanLP.segment(str);

		// CoNLLSentence coNLLsentence =
		// grammarParserService.dependencyParser(termList);
		// termList.forEach(t -> System.out.println(t.toString()));

		/*	ClusterAnalyzer<String> analyzer = new ClusterAnalyzer<String>();
			analyzer.addDocument("赵一", "流行, 流行, 流行, 流行, 流行, 流行, 流行, 流行, 流行, 流行, 蓝调, 蓝调, 蓝调, 蓝调, 蓝调, 蓝调, 摇滚, 摇滚, 摇滚, 摇滚");
			analyzer.addDocument("钱二", "爵士, 爵士, 爵士, 爵士, 爵士, 爵士, 爵士, 爵士, 舞曲, 舞曲, 舞曲, 舞曲, 舞曲, 舞曲, 舞曲, 舞曲, 舞曲");
			analyzer.addDocument("张三", "古典, 古典, 古典, 古典, 民谣, 民谣, 民谣, 民谣");
			analyzer.addDocument("李四", "爵士, 爵士, 爵士, 爵士, 爵士, 爵士, 爵士, 爵士, 爵士, 金属, 金属, 舞曲, 舞曲, 舞曲, 舞曲, 舞曲, 舞曲");
			analyzer.addDocument("王五", "流行, 流行, 流行, 流行, 摇滚, 摇滚, 摇滚, 嘻哈, 嘻哈, 嘻哈");
			analyzer.addDocument("马六", "古典, 古典, 古典, 古典, 古典, 古典, 古典, 古典, 摇滚");
			System.out.println(analyzer.repeatedBisection(1.0)); // 自动判断聚类数量k
		*/	
		System.out.println(fun_01("国家主席",""));
		System.out.println(fun_01("你好","hello"));
		System.out.println(fun_01("你好","你好呀"));
		System.out.println(fun_01("你好","你真丑"));
		
	}
	
	static double fun_01(String param1, String param2){
		return CoreSynonymDictionary.similarity(param1, param2);
	}
}
