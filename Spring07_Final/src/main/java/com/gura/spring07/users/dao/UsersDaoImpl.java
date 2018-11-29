package com.gura.spring07.users.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/*
 *  users 에 관련된 DB 에 
 *  INSERT, UPDATE, DELETE, SELECT 작업을 할 객체 
 */
@Repository
public class UsersDaoImpl implements UsersDao{
	//의존객체를 주입 받기 위해 
	@Autowired
	private SqlSession session;
	
}











