package com.yong.library.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class RentalVO {
	private String rentNo;		// 대여번호
	private Date rentSdate;		// 대여일
	private Date rentEdate;		// 반납일
	private String memId;		// 대여한 사람
	private String bookNo;		// 도서번호
}
