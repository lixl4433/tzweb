package com.web.tz;

public class ThreadTest2 implements Runnable{

	public void run() {
		
		Object wait_test = new Test().wait_test;
		synchronized(wait_test) {
			for (int i = 0; i < 10; i++) {
				System.out.println("ThreadTest2");
			}
			wait_test.notify();
		}
		
	}

}
