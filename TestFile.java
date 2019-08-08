package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFile {
	public static void main(String args[]) {
		try {
			FileOutputStream fos= new FileOutputStream("C:\\Users\\ve00ym113\\Desktop\\workspace\\java program\\data.txt");
			DataOutputStream dos= new DataOutputStream(fos);
			dos.writeInt(23);
			dos.writeDouble(12.34);
			dos.writeBoolean(true);
			dos.writeChar('a');
			dos.flush();
			dos.close();
			
			FileInputStream fis= new FileInputStream("C:\\Users\\ve00ym113\\Desktop\\workspace\\java program\\data.txt");
			DataInputStream dis= new DataInputStream(fis);
			int a=dis.readInt();
			double d=dis.readDouble();
			boolean b=dis.readBoolean();
			System.out.println(a);
			System.out.println(d);
			System.out.println(b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}


