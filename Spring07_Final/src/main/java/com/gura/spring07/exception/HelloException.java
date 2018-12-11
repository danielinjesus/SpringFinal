package com.gura.spring07.exception;

public class HelloException extends RuntimeException{
	//생성자
	public HelloException(String message) {
		//생성자의 인자로 전달된 예외 메세지를 부모 생성자에 전달  
		super(message);
		//부모 클래스는 getMessage() 라는 메소드가 이미 존재한다. 
	}
}
