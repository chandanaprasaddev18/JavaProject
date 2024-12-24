package com.te.basics.functional;

import java.util.ArrayList;
import java.util.function.Supplier;

public class LearnSupplier {
	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(118, "Virat", 9.8));
		students.add(new Student(107, "Dhoni", 9.7));
		students.add(new Student(119, "Rahul", 7.0));
		students.add(new Student(145, "Rohit", 8.0));

		Supplier<String> supplier = () -> {
			return "My name is ";
		};

		students.stream().forEach(s -> System.out.println(supplier.get().concat(s.getName())));
	}
}
