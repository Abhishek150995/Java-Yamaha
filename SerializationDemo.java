package com;

import java.io.*;
class Car1 /* implements Serializable*/{													/// if write car object in the file
	String cNaME="HONDA";
}

class Employee11 implements Serializable{
	
	String name="Abhishek";
	int age=23;
	transient String phone="987456321";
		transient Car1 c=new Car1();										/// if dont want to write the details 
}
public class SerializationDemo {

	public static void main(String[] args) {
		/*Date curDate= new Date();
		System.out.println(curDate);*/
		Employee11 emp=new Employee11();
		//System.out.println("");
		
		try {
			/*FileOutputStream fos= new FileOutputStream("C:\\Users\\ve00ym113\\Desktop\\workspace\\java program\\src\\com\\Object.txt");
			ObjectOutputStream oos= new ObjectOutputStream(fos);						/// converting object into byte stream
			oos.writeObject(curDate);
			oos.close();
			System.out.println("Done");			*/										//serialization of date object
			
			
			/*FileOutputStream fos= new FileOutputStream("C:\\Users\\ve00ym113\\Desktop\\workspace\\java program\\src\\com\\Object.txt");
			ObjectOutputStream oos= new ObjectOutputStream(fos);						/// converting object into byte stream
			oos.writeObject(emp);
			oos.close();
			System.out.println("Done");	*/												//serialization of employee object
			
			/*FileInputStream fis= new FileInputStream("C:\\Users\\ve00ym113\\Desktop\\workspace\\java program\\src\\com\\Object.txt");
			ObjectInputStream ois= new ObjectInputStream(fis);				/// converting object into byte stream
			Employee11 e1=(Employee11)ois.readObject();
			
			System.out.println(e1.name);
			System.out.println(e1.age);			*/											// de-serialization 
			
			
			/*FileInputStream fis= new FileInputStream("C:\\Users\\ve00ym113\\Desktop\\workspace\\java program\\src\\com\\Object.txt");
			ObjectInputStream ois= new ObjectInputStream(fis);
			Date d=(Date)ois.readObject();							/// returns object
			System.out.println(d);*/
			
			
		} catch (Exception e) {
			
			
			e.printStackTrace();
		}						
		
	}

}
