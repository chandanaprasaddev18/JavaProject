package com.te.basics.objectandstring;

public class Object1 {
	String name;

	public Object1(String string) {
		this.name = string;

	}

	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		Object1 obj1 = (Object1) obj;
		return this.name.equals(obj1.name);
	}

	public static void main(String[] args) {
		Object1 object1 = new Object1("Chandana");
		Object1 object2 = new Object1("Chandana");
		System.out.println(object1.equals(object2));
		System.out.println(object1 == object2);
	}
}
