package com.javaex.ex05;

public class Depart extends Employee{
	String i;
	 //코드작성
	
	//	생성자
	//	기본생성자
	public Depart() {
		
	}
	
	public Depart(String name, int salary, String i) {
		super(name, salary);
		this.i = i;
	}
	
	public String getI() {
		return i;
	}
	
	public void setI(String i) {
		this.i = i;
	}
	
	@Override
	 public void showInformation() {
	        System.out.println("이름:" + super.getName() + "연봉:" + super.getSalary() + "부서:" + this.i );
	        // 부모의 showInfomation()을 사용
	        super.showInformation();
	}
}
