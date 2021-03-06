package com.gura.spring07.cafe.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.gura.spring07.cafe.dto.CafeCommentDto;
import com.gura.spring07.cafe.dto.CafeDto;

public interface CafeService {
	public void getList(HttpServletRequest request);
	public void saveContent(CafeDto dto);
	public void getDetail(HttpServletRequest request);
	public void deleteContent(int num);
	public void getUpdateData(ModelAndView mView, int num);
	public void updateContent(CafeDto dto);
	public void deleteComment(int num);
	public void saveComment(HttpServletRequest request);
	public void updateComment(CafeCommentDto dto);
}












