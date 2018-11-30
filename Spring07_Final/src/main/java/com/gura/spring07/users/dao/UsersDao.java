package com.gura.spring07.users.dao;

import com.gura.spring07.users.dto.UsersDto;

/* UsersDaoImpl 클래스가 구현할 인터페이스 */
public interface UsersDao {
	//회원정보를 DB 에 INSERT 하는 메소드
	public void insert(UsersDto dto);
	//유효한 정보인지 리턴해주는 메소드
	public boolean isValid(UsersDto dto);
}
