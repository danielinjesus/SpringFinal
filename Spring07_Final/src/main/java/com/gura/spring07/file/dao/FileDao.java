package com.gura.spring07.file.dao;

import java.util.List;

import com.gura.spring07.file.dto.FileDto;

public interface FileDao {
	//FileDto 에 들어있는 검색 키워드에 부합하는 전체 자료의 갯수를 리턴하는 메소드 
	public int getCount(FileDto dto);
	//FileDto 에 들어있는 검색 키워드에 부합하는 자료 목록중에서
	//startRowNum 과 endRowNum 에 해당하는 목록을 리턴하는 메소드 
	public List<FileDto> getList(FileDto dto);
}











