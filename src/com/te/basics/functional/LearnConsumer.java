package com.te.basics.functional;

import java.util.ArrayList;

public class LearnConsumer {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(118, "Virat", 9.8));
		students.add(new Student(107, "Dhoni", 9.7));
		students.add(new Student(119, "Rahul", 7.0));
		students.add(new Student(145, "Rohit", 8.0));

		students.stream().forEach(s -> System.out.println(s));
	}
}
