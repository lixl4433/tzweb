package com.web.tz;

public class Test{
	
	public Object wait_test = 1;
	
	public static void main(String[] args) {
/*		String a = "test";
		String b = "test";
		String c = new String("test");
		String d  = c.intern();
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a==d);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));*/
		
		
/*		String a = new String(new byte[50]);
		System.out.println(a);*/
/*		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.forEach(System.out::println);*/
		
		
		
		/*MyLinkedList ml = new MyLinkedList();
		ml.add("1");
		ml.add("12");
		ml.add("123");
		ml.add("1234");
		ml.add("12345");
		String s = JSON.toJSONString(ml);
		JSONObject j = JSONObject.parseObject(s);
		System.out.println(j);
		System.out.println(s);
		System.out.println(JSON.toJSONString(ml.get(0)));
		System.out.println(JSON.toJSONString(ml.get(1)));
		System.out.println(JSON.toJSONString(ml.get(2)));
		*/
		/*
		HashMap<String, String> m = new HashMap<>();
		getS(1,2,3);*/
		Thread t1 = new Thread(new ThreadTest1());
		//Thread t2 = new Thread(new ThreadTest2());
		
		Thread t3 = new Thread(new ThreadTest1());
	/*	t1.run();
		t2.run();*/
		
		
		t1.start();
		t3.start();
		
		
		/*try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		//System.out.println("------------------");
	}
	
	
	public static void getS(Integer... s) {
		//Arrays.asList(s).forEach(System.out :: println);
	}

}
