package com.gura.spring07.users.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring07.users.dao.UsersDao;
import com.gura.spring07.users.dto.UsersDto;
/*
 *  users 에 관련된 비즈니스 로직을 처리할 객체 
 */
@Service
public class UsersServiceImpl implements UsersService{
	@Autowired
	private UsersDao dao;

	@Override
	public void addUser(ModelAndView mView, UsersDto dto) {
		dao.insert(dto);
		mView.addObject("id", dto.getId());
	}
	//UsersDto 에 담긴 id, pwd 가 유효한 정보인지 확인해서 로그인 처리를 하는 메소드
	@Override
	public void validUser(HttpSession session, ModelAndView mView, UsersDto dto) {
		//UsersDao 를 이용해서 아이디 비밀번호가 유효한지 여부를 알아낸다. 
		boolean isValid=dao.isValid(dto);
		if(isValid) {
			//로그인 처리를 해준다.
			session.setAttribute("id", dto.getId());
			//로그인 성공 여부를 ModelAndView 객체에 담는다.
			mView.addObject("isSuccess", true);
		}else {
			mView.addObject("isSuccess", false);
		}
	}
	
}









