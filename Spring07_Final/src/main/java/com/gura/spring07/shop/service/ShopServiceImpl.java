package com.gura.spring07.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	//상품 구입에 관련된 비즈니스 로직처리를 하는 서비스 메소드 
	@Transactional
	@Override
	public void buy(ShopDto dto) {
		//1. 10% 포인트를 적립하고
		int point=(int)(dto.getMoney()*0.1); //포인트를 계산해서
		dto.setPoint(point);//dto 에 담기 
		dao.addPoint(dto);//dao 를 이용해서 DB 에 반영 
		//2. 물품 금액만큼 계좌 잔액을 줄이고
		dao.withDraw(dto);
		//3. 배송 정보를 입력한다.
		dao.requestDelivery(dto);
	}
}













