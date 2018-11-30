package com.gura.spring07.users.service;

import org.springframework.web.servlet.ModelAndView;

import com.gura.spring07.users.dto.UsersDto;

public interface UsersService {
	//회원 정보를 추가하는 비즈니스 로직을 수행하는 메소드 형태 정의하기
	public void addUser(ModelAndView mView, UsersDto dto);
	
}
