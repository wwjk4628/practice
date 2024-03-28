package com.javaex.ex04;

public class Customer extends User{
	private int point;
	
	//	생성자
	//	기본생성자
	public Customer() {
	}
	
	public Customer(String id, String password, String name, int point) {
		super(id, password, name);
		this.point = point;
		
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public void showInfo() {
		System.out.printf("#아이디:%s, #패스워드:%s, #이름:%s #포인트:%d%n",
				super.getId(),
				super.getPassword(),
				super.getName(),
				this.point
				);
	}

	

}
