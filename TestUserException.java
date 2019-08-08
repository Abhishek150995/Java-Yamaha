package com;

import foo.MyException;

public class TestUserException {

	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		try {
			cal.setAge(40);
		} catch (MyException e) {
			System.out.println(e);
		}
	System.out.println("End of Main");
	}

}
