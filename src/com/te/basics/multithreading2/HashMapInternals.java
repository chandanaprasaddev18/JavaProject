package com.te.basics.multithreading2;

import java.util.HashMap;

public class HashMapInternals {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("Virat", 18);
		hashMap.put("Dhoni", 7);
		hashMap.put("Rahul", 55);
		hashMap.put("Dhoni", 20);
		System.out.println(hashMap);
	}
}
