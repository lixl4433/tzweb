package com.java.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class NIOUtil {
	public static void main(String[] args) {
		char[] c =readFromBuffer(readIntoBuffer("C:\\test_file\\custom_trem.txt"),"GBK");
		System.out.println(new String(c));
	}
	/**
	 * 读取文件数据进入缓存
	 * @param file_path
	 * @return
	 */
	public static ByteBuffer readIntoBuffer(String file_path) {
		ByteBuffer bf = null;
		try (
				FileInputStream fin = new FileInputStream(new File(file_path));
				FileChannel channel = fin.getChannel();
			) {
				bf = ByteBuffer.allocate(102400);
				channel.read(bf);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bf;
	}
	
	/**
	 * 从缓存中读取数据
	 * @param bb
	 * @param decode
	 * @return
	 */
	public static char[] readFromBuffer(ByteBuffer bb, String decode) {
		Charset charset=Charset.forName(decode);
		bb.flip();
		CharBuffer cb = charset.decode(bb);
		char[] b = new char[cb.limit()];
		cb.get(b);
		return b;
	}
}
