package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {

	private Long bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date updateDate;
}


/*
 * create sequence seq_board;
 * 
 * create table tbl_board( bno number(10, 0), title varchar2(200) not null,
 * content varchar2(2000) not null, writer varchar2(50) not null, regdate date
 * default sysdate, updatedate date default sysdate );
 * 
 * alter table tbl_board add constraint pk_board primary key (bno);
 */
