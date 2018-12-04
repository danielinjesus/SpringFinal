package com.gura.spring07.cafe.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring07.cafe.dto.CafeCommentDto;

@Repository
public class CafeCommentDaoImpl implements CafeCommentDao{
	@Autowired
	private SqlSession session;

	@Override
	public List<CafeCommentDto> getList(int ref_group) {
		//ref_group 번호를 이용해서 댓글 목록을 select 해서 리턴해준다. 
		return session.selectList("cafeComment.getList", ref_group);
	}

	@Override
	public void delete(int num) {
		session.delete("cafeComment.delete", num);
	}
	
}













