package com.web.tz;

public class ThreadTest1 implements Runnable{

	@Override
	public void run() {
	/*	try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		Object wait_test = new Test().wait_test;
		synchronized(wait_test) {
			for (int i = 0; i < 10; i++) {
				System.out.println("ThreadTest1");
				try {
					wait_test.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				wait_test.notify();
			}
			
		}
	}
}
