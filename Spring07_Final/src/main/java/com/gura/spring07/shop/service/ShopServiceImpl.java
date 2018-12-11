package com.gura.spring07.shop.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.gura.spring07.shop.dao.ShopDao;
import com.gura.spring07.shop.dto.ShopDto;

public class ShopServiceImpl implements ShopService{
	@Autowired
	private ShopDao dao;
	
	@Override
	public void signup(String id) {
		// TODO Auto-generated method stub
		
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
