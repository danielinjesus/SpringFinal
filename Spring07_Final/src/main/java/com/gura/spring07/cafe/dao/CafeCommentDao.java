package com.gura.spring07.cafe.dao;

import java.util.List;

import com.gura.spring07.cafe.dto.CafeCommentDto;

public interface CafeCommentDao {
	public List<CafeCommentDto> getList(int ref_group);
}
