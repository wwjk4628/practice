package com.javaex.ex06;

public class MyBase extends Base{

    //코드작성
	public void service(String state) {

        if (state.equals("낮")) { //문자열의 같다(==) 는 equals()를 사용합니다.
            day();
        } else if (state.equals("밤")){
            night();
        } else {
        	afternoon();
        }
    }
	 public void day() {
	        System.out.println("낮에는 열심히 수업듣자");
	    }
	public void afternoon() {
		System.out.println("오후도 낯과 마찬가지로 공부해야 합니다.");
	}
}
