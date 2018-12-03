package com.gura.spring07.file.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gura.spring07.file.dao.FileDao;

@Service
public class FileServiceImpl implements FileService{
	@Autowired
	private FileDao dao;
	
}
