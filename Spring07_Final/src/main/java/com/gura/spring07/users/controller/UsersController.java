package com.gura.spring07.users.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
/*
 *  users 에 관련된 요청 처리할 컨트롤러 
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring07.users.dto.UsersDto;
import com.gura.spring07.users.service.UsersService;
@Controller
public class UsersController {
	@Autowired
	private UsersService service;
	//회원 가입 폼 요청 처리
	@RequestMapping("/users/signup_form")
	public String signupForm() {
		return "users/signup_form";
	}
	//회원 가입 요청 처리
	@RequestMapping("/users/signup")
	public ModelAndView signup(ModelAndView mView, @ModelAttribute UsersDto dto) {
		//@ModelAttribute 라는 어노테이션을 UsersDto 앞에 붙여 놓으면
		//폼전송되는 파라미터가 추출되어서 UsersDto 객체에 담겨서 전달된다.
		//ModelAndView 객체가 필요하면 메소드에 받을 준비를 해놓으면 전달된다.
		service.addUser(mView, dto);
		mView.setViewName("users/greeting");
		return mView;
	}
	//로그인 폼 요청 처리 
	@RequestMapping("/users/loginform")
	public String loginform() {
		
		return "users/loginform";
	}
	//로그인 요청 처리
	@RequestMapping("/users/login")
	public ModelAndView login(HttpSession session, ModelAndView mView, @ModelAttribute UsersDto dto) {
		//UsersService 를 통해서 로그인 관련 처리를 하고
		service.validUser(session, mView, dto);
		//view 페이지 정보를 담고 
		mView.setViewName("users/login");
		//ModelAndView 객체를 리턴해 준다. 
		return mView;
	}
	//로그아웃 요청 처리
	@RequestMapping("/users/logout")
	public String logout(HttpSession session) {
		//로그 아웃 처리를 하고 
		session.invalidate();
		//home.do 로 리다일렉트 이동 시킨다.
		return "redirect:/home.do";
	}
}














































