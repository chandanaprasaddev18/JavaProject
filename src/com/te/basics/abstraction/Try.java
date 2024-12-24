package com.te.basics.abstraction;

class Try {
	public static void main(String[] args) {
//		Test t = new Test();
//		System.out.println(t.display(5));
//	}
//
//	public int display(int a) {
//		return a;
//	}
//
//	public double display(int a) {
//		return a + 1.0;
//	}

		String str = null;
		if (str instanceof String) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
