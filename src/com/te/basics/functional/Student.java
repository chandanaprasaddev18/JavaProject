package com.te.basics.functional;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private int studentId;
	private String name;
	private double cgpa;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String name, double cgpa) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cgpa, name, studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Double.doubleToLongBits(cgpa) == Double.doubleToLongBits(other.cgpa) && Objects.equals(name, other.name)
				&& studentId == other.studentId;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", cgpa=" + cgpa + "]";
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return s.studentId - this.studentId;
	}

}
