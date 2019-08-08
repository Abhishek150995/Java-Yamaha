package com;
public class StringClass
{
	public static void main(String args[]) {
		String str="HELLO";
		String str1="HELLO";
		
		String s=new String("HELLO");					// FORCING COMPILER TO CRETE NEW MEMORY
		String s1=new String("HELLO");
		str.concat("Java");
		System.out.println(str);
		//str=str.concat("Java");
		System.out.println(str);
		System.out.println(str==str1);					// POINTING TO SAMNE MEMORY DUE TO STRING POOL
		System.out.println(str.equals(str1));			// checks if class and value is same
		System.out.println(s==s1);						// FORCING COMPILER TO CRETE NEW MEMORY
		System.out.println(str==s1);
		
		
		// SUBSTRING();
		String temp="ABCDEFGHIJ";
		System.out.println(temp.substring(2,6));				// (startindex, endindex)
		
		//
		String temp1="Avinash12abhishek54tarun54gitesh555amit";
		//String s2[]=temp1.split(",");
		String s2[]=temp1.split("\\d+");
		for(String s3:s2)
		System.out.println(s3);
		
		
		
	}
}