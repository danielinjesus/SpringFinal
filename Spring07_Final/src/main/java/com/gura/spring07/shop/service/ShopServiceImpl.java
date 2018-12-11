package com.gura.spring07.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gura.spring07.shop.dao.ShopDao;
import com.gura.spring07.shop.dto.ShopDto;

@Service
public class ShopServiceImpl implements ShopService{
	@Autowired
	private ShopDao dao;
	
	@Override
	public void signup(String id) {
		dao.signup(id);
	}

	@Override
	public void deposit(ShopDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buy(ShopDto dto) {
		// TODO Auto-generated method stub
		
	}

}
