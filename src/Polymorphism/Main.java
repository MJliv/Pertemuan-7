package Polymorphism;

class Animal{
	int age;
	String name;
	
	public void sound() {
		System.out.println("Animal make sound");
	}
}

class Dog extends Animal{
	//override -> same name same parameter
	public void sound() {
		System.out.println("Woof");
	}
	
	//overload -> same name different parameter
	public void sound(String sound) {
		System.out.println("Dog " + sound);
	}
}

class Cat extends Animal{
	public void sound() {	
		System.out.println("Meow");
	}
}

class Bird extends Animal{
	public void sound() {
		System.out.println("Cirk");
	}
}

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		
		animal.sound();
		//override
		dog.sound();
		//overload
		dog.sound("Bark");
		
		// polymorphism - byk bentuk - cat, dog, bird
		Animal cat = new Cat();
		Animal Bird = new Bird();
		
		cat.sound();
		Bird.sound();
		
	}

}
