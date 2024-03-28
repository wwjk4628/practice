package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		User[] users = new User[3]; 
		//	User 클래스와 하위 클래스 모두 담을 수 있는 배열
		
		users[0] = new Customer("jws", "j1234", "정우성", 1000);
		users[1] = new Customer("yjs", "y2345", "유재석", 2000);
		users[2] = new Employee("master", "m7788", "운영자", 5000000);
		
		//	세 명의 사용자 배열에 등록
		//	참조 자료형의 배열은 참조 객체의 주소가 할당
		//	객체가 직접 들어가는 것은 아니다.
		
		int i;
		for (i = 0; i < users.length; i++) {
		users[i].showInfo();
		}
		
		//	다운 캐스팅
		int salary = ((Employee)users[2]).getSalary();
		System.out.println("운영자의 월급은" + salary + "원 입니다");
		
	}
	

}
