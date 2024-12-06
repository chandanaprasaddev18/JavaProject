package com.te.basics;

class SuperClass {
	static int superStaticVar = initializeSuperStatic();
	int superInstanceVar = initializeSuperInstance();

	static {
		System.out.println("Static block in SuperClass");
	}

	{
		System.out.println("Instance initializer block in SuperClass");
	}

	SuperClass() {
		System.out.println("SuperClass Constructor");
	}

	static int initializeSuperStatic() {
		System.out.println("Static variable in SuperClass initialized");
		return 10;
	}

	int initializeSuperInstance() {
		System.out.println("Instance variable in SuperClass initialized");
		return 20;
	}
}

class SubClass extends SuperClass {
	static int subStaticVar = initializeSubStatic();
	int subInstanceVar = initializeSubInstance();

	static {
		System.out.println("Static block in SubClass");
	}

	{
		System.out.println("Instance initializer block in SubClass");
	}

	SubClass() {
		System.out.println("SubClass Constructor");
	}

	static int initializeSubStatic() {
		System.out.println("Static variable in SubClass initialized");
		return 30;
	}

	int initializeSubInstance() {
		System.out.println("Instance variable in SubClass initialized");
		return 40;
	}
}

public class Main {
	public static void main(String[] args) {
		System.out.println("Creating SubClass Object...");
		SubClass sub = new SubClass();
//		System.out.println(sub.superInstanceVar);
//		System.out.println(sub.subInstanceVar);
	}
}
