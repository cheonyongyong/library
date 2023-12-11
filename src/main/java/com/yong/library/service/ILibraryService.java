package com.yong.library.service;

import java.util.List;

import com.yong.library.vo.BookVO;
import com.yong.library.vo.RentalVO;

public interface ILibraryService {

	public List<BookVO> listBook();

	public int insertBook(BookVO bookVO);

	public int updateBook(BookVO bookVO);

	public List<RentalVO> getHistory(String bookNo);

	public int rentBook(RentalVO rentalVO);
	
	public int returnBook(String bookNo);

}
