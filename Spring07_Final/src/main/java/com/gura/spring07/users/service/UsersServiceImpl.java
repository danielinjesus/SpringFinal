package com.gura.spring07.users.service;

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
	
}









