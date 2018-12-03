package com.gura.spring07.file.service;

import javax.servlet.http.HttpServletRequest;

public interface FileService {
	public void getList(HttpServletRequest request);
	public void removeFileInfo(int num, HttpServletRequest request);
}
