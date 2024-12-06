package com.te.basics.abstraction;

import java.util.Scanner;

interface AndroidOS {
	public abstract void off();
}

class OxygenOS implements AndroidOS {

	@Override
	public void off() {
		System.out.println("OxygenOS off");

	}

}

class ColorOS implements AndroidOS {

	@Override
	public void off() {
		System.out.println("ColorOS off");

	}

}

class MiuiOS implements AndroidOS {

	@Override
	public void off() {
		System.out.println("Miui off");

	}

}

class GetOSObject {
	public static AndroidOS getOS(String osType) {
		if (osType.equalsIgnoreCase("ColorOS")) {
			return new ColorOS();
		} else if (osType.equalsIgnoreCase("MiuiOS")) {
			return new MiuiOS();
		}
		return new OxygenOS();
	}
}

public class MultipleImpl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ostype");
		String osType = sc.next();
		AndroidOS os = GetOSObject.getOS(osType);
		os.off();
	}
}
