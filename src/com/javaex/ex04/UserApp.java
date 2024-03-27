package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		User[] users = new User[3]; 
		
		users[0] = new Customer("jws", "j1234", "정우성", 1000);
		users[1] = new Customer("yjs", "y2345", "유재석", 2000);
		users[2] = new Employee("master", "m7788", "운영자", 500);
		
		int i;
		for (i = 0; i < users.length; i++) {
		users[i].showInfo();
		}
		users[i-1].sal();
		
	}
	

}
