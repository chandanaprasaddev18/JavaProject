package com.te.basics.functional;

import java.util.ArrayList;
import java.util.function.Predicate;

public class LearnPredicate {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(118, "Virat", 9.8));
		students.add(new Student(107, "Dhoni", 9.7));
		students.add(new Student(119, "Rahul", 7.0));
		students.add(new Student(145, "Rohit", 8.0));

		// used to check a condition
		Predicate<Student> predicate = new Predicate<Student>() {

			@Override
			public boolean test(Student t) {
				return t.getCgpa() > 8.5;
			}
		};

		students.stream().filter(predicate).forEach(System.out::println);
	}
}
