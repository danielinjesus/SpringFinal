package com.gura.spring07.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/*
 *  users 에 관련된 요청 처리할 컨트롤러 
 */

import com.gura.spring07.users.service.UsersService;
@Controller
public class UsersController {
	@Autowired
	private UsersService service;
	
}








