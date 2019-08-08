package com;
class Animal{
	public void eat() {
		System.out.println("Animal Eat Method");
	}
	
}
class Dog extends Animal{
	public void eat() {
		System.out.println("Dog Eat Method");
	}
	public void bark() {
		System.out.println("Dog bark Method");
	}
}
class Cat extends Animal{
	public void eat() {
		System.out.println("Cat Eat Method");
	}
	public void meow() {
		System.out.println("Cat meow Method");
	}
}
public class Wipro
{
	public static void main(String args[]) {
		Animal a[]= { new Animal(), new Dog(), new Cat()};
		for(Animal obj:a)
		{	
			obj.eat();
			
			if ( obj instanceof Dog)
				((Dog)obj).bark();
			else if ( obj instanceof Cat)
				((Cat)obj).meow();
			}
	}
}