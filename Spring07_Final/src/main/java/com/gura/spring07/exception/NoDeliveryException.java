package com.gura.spring07.exception;

import org.springframework.dao.DataAccessException;

public class NoDeliveryException extends DataAccessException{
	//DataAccessException 은 default 생성자가 존재 하지 않는다. 
	public NoDeliveryException(String msg) {
		//자식 생성자에서 부모 생성자에 String type 을 전달해 주어야 된다. 
		//msg 는 예외 메세지 이다.
		super(msg);
		
	}
}














