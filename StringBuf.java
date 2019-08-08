package com;
public class StringBuf
{
	public static void main(String args[]) {
		String str="Hello";
		//StringBuffer sb=new StringBuffer(str);					till java5 
		StringBuilder sb=new StringBuilder(str);
		sb.append(" Java").insert(5, " Yamaha").reverse();
		System.out.println(sb);
	}
}