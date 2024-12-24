package com.te.basics.functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LearnComparator {
	public static void main(String[] args) {
		Comparator<Student> compareByNames = (s1, s2) -> {
			return s1.getName().compareTo(s2.getName());
		};
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(118, "Virat", 9.8));
		students.add(new Student(107, "Dhoni", 9.7));
		students.add(new Student(119, "Rahul", 7.0));
		students.add(new Student(145, "Rohit", 8.0));
		Collections.sort(students);
		students.forEach(s -> System.out.println(s));
	}
}
