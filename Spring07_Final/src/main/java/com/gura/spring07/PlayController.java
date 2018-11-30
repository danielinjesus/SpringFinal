package com.gura.spring07;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PlayController {
	//로그인이 되어 있어야 정상적으로 처리 되는 메소드 
	@RequestMapping("/play")
	public ModelAndView authPlay(HttpServletRequest request, ModelAndView mView) {
		//요청에 대한 비즈니스 로직 처리를 서비스로 하고
		
		//view 페이지로 forward 이동해서 응답 
		mView.setViewName("play");
		
		return mView;
	}
}









