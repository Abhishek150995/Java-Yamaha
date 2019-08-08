package com;

import java.io.File;
import java.io.IOException;

public class TestException {

	public static void main(String[] args) {
		/*int a=10;
		int b=0;
		System.out.println("Hello");
		if(b!=0)
			System.out.println(a/b);
		else
			System.out.println("B must be greater then 0");
		System.out.println("Hi");*/
		
		
		
		String str=null;
		try {
			System.out.println("Hello");
			System.out.println(10/0);
			System.out.println("hi");
			System.out.println(str.toLowerCase());
		} /* catch (Exception e) {													// Exception is super class of all exception, but performance is low
			if (e instanceof ArithmeticException)
				System.out.println(" Do something for arithmentic ");
			else if (e instanceof NullPointerException)
				System.out.println(" Do somthing for null ");
		} catch (NullPointerException e) {													
			System.out.println("Error1:" );
			
		}
		catch (ArithmeticException e) {
			System.out.println("Error 2 because"+ e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error 3");
		}*/
		
		catch(ArithmeticException | NullPointerException e) {						// java 7 by pipe lining
			System.out.println("Error");
			return;																	// stops execution of current method
		}
		catch( Exception e)
		{
			System.out.println("error 1");
		}
		finally {
			System.out.println(" Finally block");
		}
			System.out.println("ENd of MAIN");
		

		File f= new File("C:\\Users\\ve00ym113\\Desktop\\workspace\\java program\\bin\\com\\abc.txt");
		try {
			f.createNewFile();
			System.out.println("File Created");
		} catch (IOException e) {
			e.printStackTrace();	}
		
		
		
		
		
	}

}
