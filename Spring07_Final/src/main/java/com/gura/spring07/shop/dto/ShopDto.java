package com.gura.spring07.shop.dto;

public class ShopDto {
	private String id;  //구입자의 아이디
	private int money;  //가격
	private int point;  //포인트
	private String addr;//배송주소
	//생성자
	public ShopDto() {}
	public ShopDto(String id, int money, int point, String addr) {
		super();
		this.id = id;
		this.money = money;
		this.point = point;
		this.addr = addr;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
