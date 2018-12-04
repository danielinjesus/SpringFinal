package com.gura.spring07.cafe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gura.spring07.cafe.dao.CafeCommentDao;
import com.gura.spring07.cafe.dao.CafeDao;

@Service
public class CafeServiceImpl implements CafeService{
	@Autowired
	private CafeDao cafeDao;
	@Autowired
	private CafeCommentDao cafeCommentDao;
	
}












