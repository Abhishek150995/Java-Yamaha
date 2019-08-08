package com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.lang.*;

public class DateMap {
	@SuppressWarnings("deprecation")							//annotation
public static void main(String[] args) {
		/*Locale l=new Locale("NL","NL");								// netherlands
		Locale l=new Locale("NL","NL");	
		System.out.println("Hello Java");
		Date d= new Date();
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,l);
		System.out.println(df.format(d));

		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.get(Calendar.DATE));
		
		
		
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter DOB: ");
		String dob=s.next();
		SimpleDateFormat sf= new SimpleDateFormat("dd-MM-yyyy");				//MM for month mm is for minuts
		Date d1=sf.parse(dob);
		System.out.println(d1);*/
		
		String str="22";
		int a= Integer.parseInt(str);
		Integer b= Integer.valueOf(str);
		System.out.println(a+b);
	}

}
