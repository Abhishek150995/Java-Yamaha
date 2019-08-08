package com;
import java.util.*;
class Employee1
{	
	
	private String name;
	private int empId;
	private String date;
	private String dept;
	private String design;
	private double basic;
	private double hra;
	private double it;
	private double da;
	public Employee1(int empId,String name,String date,String dept,String design,double basic,double hra,double it)
	{
		this.empId=empId;
		this.name=name;
		this.date=date;
		this.dept=dept;
		this.design=design;
		this.basic=basic;
		this.hra=hra;
		this.it=it;
	
	}
	public int getEmpid()
	{
		return empId;
	}
	public String getName()
	{
		return name;
	}
	public String getDept()
	{
		return dept;
	}
	public String getDesign()
	{
		String result="";
		switch(design)
		{
			case "e":
			result="Engineer";
			break;
			case "c":
			result="Consultant";
			break;
			case "k":
			result="Clerk";
			break;
			case "r":
			result="Receptionist";
			break;
			default:
			System.out.println("Invalid Choice");

		}
		return result;
		
	}

	public Double getSalary()
	{
		Double result;
		Double da;
		result=basic+hra-it;
	
		switch(design)
		{
			case "e":
			da=20000.0;
			result+=da;
			break;
			case "c":
			da=32000.0;
			result+=da;			
			break;
			case "k":
			da=12000.0;
			result+=da;

			break;
			case "r":
			da=15000.0;
			result+=da;
			break;
			default:
			System.out.println("Invalid Choice");

		}
		return result;
		
	}

}

public class Prj1
{
	public static void main(String args[])
	{
		Employee1 e[]={new Employee1(1001,"Ashish","01/04/2009","R&D","e",20000,8000,3000),new Employee1(1002,"Sushma","23/08/2012","PM","c",30000,12000,9000),new Employee1(1003,"Rahul","12/11/2008","Acct","k",10000,8000,1000),new Employee1(1004,"Chahat","29/01/2013","Front Desk","r",12000,6000,2000)};
		Scanner ob=new Scanner(System.in);

		System.out.println("Enter the empId whose details you want to see");
		int eid=ob.nextInt();
		boolean b=false;
		for(Employee1 emp:e)
		{
			if(emp.getEmpid()==eid)
			{	
				System.out.println("EmpId\tName\tDept\tDesignation\tSalary");
				System.out.println(emp.getEmpid()+"\t"+emp.getName()+"\t"+emp.getDept()+"\t"+emp.getDesign()+"\t"+emp.getSalary());
				b=true;
				break;
			}

		}
		if(b==false)
			System.out.println("Not Available");
		
	}	

}
			
					
		
		