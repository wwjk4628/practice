package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		//	생성자를 선언하지 않으면 기본 생성자를 자동으로 추가
		//	임의로 생성자를 선언하면 기본생성자를 자동으로 추가하지 않음
		Shape s1 = new Shape("파랑", "파랑");
		System.out.println("================");
		
		
		Triangle t1 = new Triangle();
		System.out.println("================");
		
		Triangle t2 = new Triangle(3, 4);
		System.out.println("================");
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println("================");
	}
}


