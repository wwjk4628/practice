package com.javaex.ex03;

public class ShapeApp {

	public static void main(String[] args) {
			//	생성자를 선언하지 않으면 기본 생성자를 자동으로 추가
			//	임의로 생성자를 선언하면 기본생성자를 자동으로 추가하지 않음
			Triangle t1 = new Triangle(5, 5);
			t1.setFillColor("빨강");
			t1.setLineColor("파랑");
			t1.showInfo();
			
	}


}


