package com.yong.library.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BookVO {
	private String bookNo;			// 도서코드
	private String bookName;		// 도서명
	private String bookWriter;		// 저자
	private Date bookDate;			// 등록일
	private String bookState = "Y";	// 대여상태
}
