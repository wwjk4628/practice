package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
	@Override
    public void execute(String str){
    	
        //코드작성
    	if("앱".equals(str)) {
    		start();
    	}else {
    	super.execute(str);
    	}
    }
 
    //메소드작성
    public void start() {
    	System.out.println("앱실행");
    }
    //메소드작성
    @Override
    protected void playMusic(){
        System.out.println("다운로드해서 음악재생");
    }
    
    
}
