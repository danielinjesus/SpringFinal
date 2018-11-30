package com.gura.spring07.users.dao;

import com.gura.spring07.users.dto.UsersDto;

/* UsersDaoImpl 클래스가 구현할 인터페이스 */
public interface UsersDao {
	//회원정보를 DB 에 INSERT 하는 메소드
	public void insert(UsersDto dto);
	//유효한 정보인지 리턴해주는 메소드
	public boolean isValid(UsersDto dto);
	//인자로 전달된 아이디가 이미 DB에 존재하는지 여부를 리턴하는 메소드
	public boolean isExist(String inputId);
	//인나로 전달된 아이디에 해당하는 개인정보를 리턴해주는 메소드
	public UsersDto getData(String id);
}







