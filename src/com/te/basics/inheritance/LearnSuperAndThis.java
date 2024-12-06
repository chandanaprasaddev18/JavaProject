package com.te.basics.inheritance;

//Parent class
class Aaa {
	// Constructor
	Aaa() {
		System.out.println("Inside Aaa's constructor");
		System.out.println("this.hashCode(): " + this.hashCode());
		System.out.println("super.hashCode(): " + super.hashCode());
	}

}

//Child class
class Bbb extends Aaa {
	// Constructor
	Bbb() {
		super(); // Explicit call to parent class constructor (optional as it’s automatically
					// called)
		System.out.println("Inside Bbb's constructor");
		System.out.println("this.hashCode(): " + this.hashCode());
		System.out.println("super.hashCode(): " + super.hashCode());
	}

}

//Main class
public class LearnSuperAndThis {
	public static void main(String[] args) {
		System.out.println("Creating object of Bbb...");
		Bbb obj = new Bbb();
		Aaa obj2 = new Bbb();
	}
}
