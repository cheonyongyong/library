package com.yong.library.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yong.library.vo.BookVO;
import com.yong.library.vo.RentalVO;

@Mapper
public interface LibraryMapper {

	public List<BookVO> listBook();

	public int insertBook(BookVO bookVO);

	public int updateBook(BookVO bookVO);

	public List<RentalVO> getHistory();

	public int rentBook(RentalVO rentalVO);

	public int returnBook(String bookNo);

	public void stateYBook(String bookNo);
}
