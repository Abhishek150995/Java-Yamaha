package com;
interface Sizeable{
	String name="Avinash";
	void size();
	default void dis() {											// or default: can be redefined or overridden ; static: cannot be redefined 
		System.out.println("DIS!!!!!!!");
	}
}
interface Callable extends Sizeable{
	void call();
	}
public class Engine{
	public void call() {
		System.out.println(" Engine Class Call Method");
	}
}

public class Car extends Engine implements Callable
{
	public void size() {
		System.out.println("Size!!!!!");
	}
	// not overriding call(); because inherited from engine
	public void dis() {
		System.out.println("DIS######");
	}
}
public class Interface
{
	public static void main(String agrs[]) {
	System.out.println(Sizeable.name);
	Sizeable s= new Car();
	s.size();
	s.dis();							// Sizeable.dis(); for static because cannot be overridden
}
}