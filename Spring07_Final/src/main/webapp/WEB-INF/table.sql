CREATE TABLE users
(id VARCHAR2(100) PRIMARY KEY,
pwd VARCHAR2(100) NOT NULL,
email VARCHAR2(100),
regdate DATE);

CREATE TABLE board_file(
num NUMBER PRIMARY KEY, -- 파일번호
writer VARCHAR2(100), -- 작성자
title VARCHAR2(100), -- 제목
orgFileName VARCHAR2(100), -- 원본파일명
saveFileName VARCHAR2(100), -- 파일 시스템에 저장된 파일명
fileSize NUMBER, -- 파일의 크기(byte)
downCount NUMBER DEFAULT 0, -- 다운로드 횟수
regdate DATE -- 등록일 
);

CREATE SEQUENCE board_file_seq;

CREATE TABLE board_cafe(
num NUMBER PRIMARY KEY,
writer VARCHAR2(100) NOT NULL,
title VARCHAR2(100) NOT NULL,
content CLOB,
viewCount NUMBER, 
regdate DATE
);

CREATE SEQUENCE board_cafe_seq;

-- 댓글 정보를 저장할 테이블
CREATE TABLE board_cafe_comment(
	num NUMBER PRIMARY KEY, -- 댓글의 글번호
	writer VARCHAR2(100), -- 댓글 작성자
	content VARCHAR2(500), -- 댓글 내용
	target_id VARCHAR2(100), -- 댓글의 대상이 되는 아이디(글작성자)
	ref_group NUMBER, -- 댓글 그룹번호
	comment_group NUMBER, -- 원글에 달린 댓글 내에서의 그룹번호
	deleted CHAR(3) DEFAULT 'no', -- 댓글이 삭제 되었는지 여부 
	regdate DATE -- 댓글 등록일 
);

CREATE SEQUENCE board_cafe_comment_seq;
-- 고객의 계좌 테이블
CREATE TABLE client_account
(id VARCHAR2(20) PRIMARY KEY, 
balance NUMBER DEFAULT 10000 CHECK(balance >= 0), 
bonusPoint NUMBER DEFAULT 0);
-- 배송 테이블
CREATE TABLE delivery
( num NUMBER PRIMARY KEY,
  name VARCHAR2(20),
  addr VARCHAR2(30)
);
-- 배송 테이블에 입력할 시퀀스 
CREATE SEQUENCE delivery_seq;






