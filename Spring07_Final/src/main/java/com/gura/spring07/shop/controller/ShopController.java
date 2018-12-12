package com.gura.spring07.shop.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring07.shop.dto.ShopDto;
import com.gura.spring07.shop.service.ShopService;

@Controller
public class ShopController {
	@Autowired
	private ShopService service;
	
	@RequestMapping("/shop/signup_form")
	//쇼핑몰 가입폼 요청 처리 
	public ModelAndView authSignupForm(HttpServletRequest request, 
			ModelAndView mView) {
		mView.setViewName("shop/signup_form");
		return mView;
	}
	//쇼핑몰 가입처리
	@RequestMapping("/shop/signup")
	public ModelAndView signup(@RequestParam String id, ModelAndView mView) {
		//회원 가입 처리
		service.signup(id);
		mView.addObject("msg", id+" 님 가입 처리 되었습니다.");
		mView.setViewName("shop/signup");
		return mView;
	}
	@RequestMapping("/shop/buy_form")
	public String buyForm() {
		
		return "shop/buy_form";
	}
	@RequestMapping("/shop/buy")
	public ModelAndView authBuy(HttpServletRequest request, 
			@ModelAttribute ShopDto dto) {
		//서비스를 통해서 상품 구입 비즈니스 로직 처리 
		service.buy(dto);
		ModelAndView mView=new ModelAndView();
		mView.addObject("msg", dto.getId()+" 님 주문이 완료 되었습니다.");
		mView.setViewName("shop/buy");
		return mView;
	}
	
}




































