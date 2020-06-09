package com.java.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 重试机制
 * 
 * @author think
 *
 */
public class RetryRegular {

	public static void main(String[] args) {
		try {
			save2();
		} catch (Exception e) {
			// 失败 retry机制 重试5次
			System.out.println("queue activemq poll message(pdfResult) output es fail...");
			Callable<String> calla = () -> {
				boolean retry = true;
				int retry_num = 0;
				while (retry) {
					try {
						save(retry_num);
						System.out.println("output es retry[" + (retry_num + 1) + "]  success...");
						return "0";
					} catch (Exception e1) {
						System.out.println("output es retry[" + (retry_num + 1) + "]  fail...");
					}
					if (++retry_num > 3)
						retry = false;
				}
				return "1";
			};
			FutureTask<String> ft = new FutureTask<String>(calla);
			new Thread(ft).start();
			try {
				if ("1".equals(ft.get())) {
					System.out.println("retry 5 times and fail... this data key[" + 1 + "]");
				}
			} catch (Exception e1) {
				System.out.println("not retry..");
			}
		}
	}

	public static void save(int num) throws Exception {
		if (num < 2) {
			throw new Exception();
		}
	}

	public static void save2() throws Exception {
		throw new Exception();
	}

}
