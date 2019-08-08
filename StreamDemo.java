package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StreamDemo {
	public static void main(String args[]) {
		byte b[]=new byte[100];
		try {
			FileInputStream fis= new FileInputStream("C:\\Users\\ve00ym113\\Desktop\\workspace\\java program\\Test1.txt");
			fis.read();
			fis.close();
			FileOutputStream fos= new FileOutputStream("C:\\Users\\ve00ym113\\Desktop\\workspace\\java program\\newTest.txt", true);
			fos.write(b);
			
			fos.flush();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
