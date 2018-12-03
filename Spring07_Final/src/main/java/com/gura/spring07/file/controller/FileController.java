package com.gura.spring07.file.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.gura.spring07.file.service.FileService;

@Controller
public class FileController {
	@Autowired
	private FileService service;
	
}
