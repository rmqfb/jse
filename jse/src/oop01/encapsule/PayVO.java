package oop01.encapsule;

import java.util.Scanner;

public class PayVO {
	private String name;
	private int salary;
	static final double TAX = 0.1;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
