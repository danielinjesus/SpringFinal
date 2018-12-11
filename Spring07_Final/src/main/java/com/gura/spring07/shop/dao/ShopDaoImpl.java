package com.gura.spring07.shop.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.gura.spring07.shop.dto.ShopDto;

public class ShopDaoImpl implements ShopDao{
	@Autowired
	private SqlSession session;
		
	@Override
	public void signup(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(ShopDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withDraw(ShopDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPoint(ShopDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void requestDelivery(ShopDto dto) {
		// TODO Auto-generated method stub
		
	}

}
