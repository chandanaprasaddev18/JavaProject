package com.te.basics.collections;

import java.util.Comparator;
import java.util.TreeSet;

class CompareByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}

public class LearnTreeSet {
	public static void main(String[] args) {
		CompareByName compareByName = new CompareByName();
		Comparator<Employee> compareByAge = (e1, e2) -> e2.getAge() - e1.getAge();
		TreeSet<Employee> treeSet = new TreeSet<>(compareByAge);

		treeSet.add(new Employee(101, "Chandana", 18));
		treeSet.add(new Employee(111, "Rajani", 28));
		treeSet.add(new Employee(121, "Sia", 38));
		treeSet.add(new Employee(131, "Pallu", 8));
		treeSet.add(new Employee(151, "Hasu", 18));

		System.out.print(treeSet);
	}

}
