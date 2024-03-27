package com.javaex.ex04;

public class Employee extends User{
	private int salary;
	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}
	public void showInfo() {
		System.out.printf("#아이디:%s, #패스워드:%s, #이름:%s #월급:%d%n",
				super.getId(),
				super.getPassword(),
				super.getName(),
				this.salary
				);
	}
	public void sal() {
		System.out.printf("%s의 월급은 %d원 입니다.",
				super.getName(),
				this.salary*10000);
	}
	

	
}
