package com.gura.spring07.users.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring07.users.dto.UsersDto;
/*
 *  users 에 관련된 DB 에 
 *  INSERT, UPDATE, DELETE, SELECT 작업을 할 객체 
 */
@Repository
public class UsersDaoImpl implements UsersDao{
	//의존객체를 주입 받기 위해 
	@Autowired
	private SqlSession session;

	@Override
	public void insert(UsersDto dto) {
		/*
		 *  mapper namespace : users
		 *  sql id : insert
		 *  parameterType : UsersDto 
		 */
		session.insert("users.insert", dto);
	}

	@Override
	public boolean isValid(UsersDto dto) {
		/*
		 *  parameterType : UsersDto
		 *  resultType : String
		 */
		String id=session.selectOne("users.getId", dto);
		if(id == null) { //아이디 혹은 비밀번호가 틀리면 null 이다. 
			return false;
		}else { // null 이 아니면 유효한 정보이다. 
			return true; 
		}
	}
	
}











