package com.gura.spring07.exception;

public class HelloException extends RuntimeException{
	//예외 메세지를 저장할 필드
	private String message;
	
	//생성자
	public HelloException(String message) {
		//인자로 전달된 문자열을 필드에 저장하기
		this.message=message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
