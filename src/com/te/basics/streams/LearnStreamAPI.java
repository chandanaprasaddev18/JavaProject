package com.te.basics.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LearnStreamAPI {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("TY0001", "Virat", 22, LocalDate.of(2019, 9, 1), 21000));
		employees.add(new Employee("TY0004", "Dhoni", 21, LocalDate.of(2017, 6, 1), 25000));
		employees.add(new Employee("TY0009", "Rohit", 27, LocalDate.of(2022, 3, 1), 23000));
		employees.add(new Employee("TY0002", "Rahul", 25, LocalDate.of(2021, 8, 1), 28000));
		employees.add(new Employee("TY0005", "Yuvraj", 20, LocalDate.of(2020, 1, 1), 27000));

		/*
		 * 1: Increase the salary of employees by 50% who have spent 2+ years in the
		 * company. And for employees less than 2 years, increase the salary by 20%.
		 */

		employees.stream().forEach(e -> {
			if (LocalDate.now().getYear() - e.getEmpDataOfJoining().getYear() > 2) {
				e.setEmpSalary(e.getEmpSalary() * 1.5);
			} else {
				e.setEmpSalary(e.getEmpSalary() * 1.2);
			}
		});

		// System.out.println(employees);

		// 2: Filter employees whose age is less than 25!
		List<Employee> list = employees.stream().filter(e -> e.getEmpAge() < 25).collect(Collectors.toList());
		System.out.println(list);

		// 2: Filter employees with highest salary
		System.out.println(
				employees.stream().max((e1, e2) -> Double.compare(e1.getEmpSalary(), e2.getEmpSalary())).get());

		Set<String> collect = employees.stream().map((e) -> e.getEmpName().toUpperCase()).collect(Collectors.toSet());
		System.out.println(collect);
	}
}
