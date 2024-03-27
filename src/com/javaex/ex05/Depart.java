package com.javaex.ex05;

public class Depart extends Employee{
	String i;
	 //코드작성
	public Depart(String name, int salary, String i) {
		super(name, salary);
		this.i = i;
	}
	 public void showInformation() {
	        System.out.println("이름:" + super.getName() + "연봉:" + super.getSalary() + "부서:" + this.i );
	    }
}
