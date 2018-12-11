package com.gura.spring07;

import java.io.InputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring07.exception.HelloException;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView test(@RequestParam(defaultValue="merong") String msg) {
		ModelAndView mView=new ModelAndView();
		mView.addObject("greeting", msg);
		mView.setViewName("hello");
		
		//임의의 테스트
		if(msg.equals("merong")) {//특정 상황에서 예외 발생 시키기
			throw new HelloException("파라미터가 전달이 안됬네?");
		}
		
		return mView;
	}
	//HelloException type 예외가 발생했을때 호출되는 메소드 
	@ExceptionHandler(HelloException.class)
	public ModelAndView handleHelloException(HelloException he) {
		ModelAndView mView=new ModelAndView();
		mView.addObject("exception", he);
		mView.setViewName("error/hello");
		return mView;
	}
}














