package com.te.basics.functional;

import java.util.ArrayList;

public class LearnFunction {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(118, "Virat", 9.8));
		students.add(new Student(107, "Dhoni", 9.7));
		students.add(new Student(119, "Rahul", 7.0));
		students.add(new Student(145, "Rohit", 8.0));

//		Function<Student, String> function = new Function<Student, String>() {
//
//			@Override
//			public String apply(Student t) {
//				// TODO Auto-generated method stub
//				return t.getName().toUpperCase();
//			}
//		};

		students.stream().map(s -> s.getName().toUpperCase()).forEach(s -> System.out.println(s));

	}

}
