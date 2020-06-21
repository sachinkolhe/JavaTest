package com.synechron;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(new Employee("Sachin", 29), new Employee("Vaibhav", 25),
				new Employee("Srishti", 24), new Employee("Nitya", 2), new Employee("Komal", 23),
				new Employee("Pratik", 27), new Employee("Chirag", 30), new Employee("Nikhil", 35),
				new Employee("Pranita", 32), new Employee("Ram", 28));

		List<Employee> list2 = list.stream().filter(emp -> emp.age > 26)
				.sorted((emp1, emp2) -> emp1.firstName.compareTo(emp2.firstName)).collect(Collectors.toList());
		list2.stream().forEach(System.out::println);
	}

	static class Employee {
		private String firstName;
		private int age;

		private Employee(String firstName, int age) {
			this.firstName = firstName;
			this.age = age;
		}

		@Override
		public String toString() {
			return firstName + " - " + age;
		}
	}

}
