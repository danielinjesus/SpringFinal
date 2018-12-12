package com.gura.spring07.shop.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring07.shop.dto.ShopDto;

@Repository
public class ShopDaoImpl implements ShopDao{
	@Autowired
	private SqlSession session;
		
	@Override
	public void signup(String id) {
		session.insert("shop.insert", id);
	}

	@Override
	public void deposit(ShopDto dto) {
		// TODO Auto-generated method stub
		
	}
	//계좌 잔액 줄이기
	@Override
	public void withDraw(ShopDto dto) {
		session.update("shop.withDraw", dto);
	}
	//포인트 적립하기
	@Override
	public void addPoint(ShopDto dto) {
		session.update("shop.addPoint", dto);
	}
	//배송 정보 입력하기 
	@Override
	public void requestDelivery(ShopDto dto) {
		session.insert("shop.requestDelivery", dto);
	}
}



