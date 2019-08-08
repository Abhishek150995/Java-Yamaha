package com;
class Employee {
	String name;
	public Employee(String name) {
		this.name=name;
	}
	public int hashCode() {																// return hash code as name length
		return name.length();
	}
	public String toString() {															// return name on SOP object
		return name;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Employee && this.name==((Employee)obj).name)					// checks 2nd condition only if 1st condition is true
			return true;
		else 
			return false;
	}
}

public class ObjectClass{
	public static void main( String args[]) {
		Employee e=new Employee("A");
		Employee e1=new Employee("Abhishek");

		System.out.println("e employee obj: "+e);
		System.out.println("e1 employee obj: "+ e1);
		System.out.println("===========");
		
		String s=new String("A");
		String s1=new String("A");
		System.out.println("s string obj: "+s);
		System.out.println("s1 string obj: "+ s1);
		System.out.println("===========");
		
		System.out.println("e==e1 operator for employee obj: "+ (e==e1));				// always checks the memory; e and e1 are not pointing to the same memory
		System.out.println("s==s1 operator for string obj: " + (s==s1));					// output is false because it checks memory address
		System.out.println("===========");
		System.out.println("equals method for employee obj: "+ e.equals(e1));						// internally using e==e1
		System.out.println("equals method for string obj:  "+ s.equals(s1));						// equals class is overridden in String Class
	}
}