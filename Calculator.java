package com;

import foo.MyException;

public class Calculator {
	public void setAge(int age) throws MyException {
		if (age<18)
			throw new MyException("School Age");
		if (age>18 && age<23)
			throw new MyException("College Age");
		if (age>23 && age<50)
			throw  new MyException("Working Age");
		System.out.println("Age="+age);
		
	
		
	}

}
