package com.yong.library.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yong.library.mapper.LibraryMapper;
import com.yong.library.service.ILibraryService;
import com.yong.library.vo.BookVO;
import com.yong.library.vo.RentalVO;

@Service
public class LibraryServiceImpl implements ILibraryService {

	@Autowired
	private LibraryMapper libraryMapper;
	
	@Override
	public List<BookVO> listBook() {
		List<BookVO> listBook = libraryMapper.listBook();
		return listBook;
	}

	@Override
	public int insertBook(BookVO bookVO) {
		return libraryMapper.insertBook(bookVO);
	}

	@Override
	public int updateBook(BookVO bookVO) {
		return libraryMapper.updateBook(bookVO);
	}

	@Override
	public List<RentalVO> getHistory(String bookNo) {
		List<RentalVO> listHistory = libraryMapper.getHistory();
		return listHistory;
	}

	@Override
	public int rentBook(RentalVO rentalVO) {
		int status = libraryMapper.rentBook(rentalVO);
		if(status > 0) {
			libraryMapper.stateNBook(rentalVO.getBookId());
		}
		return status;
	}

	@Override
	public int returnBook(String bookNo) {
		int status = libraryMapper.returnBook(bookNo);
		if(status > 0) {
			libraryMapper.stateYBook(bookNo);
		}
		return status;
	}

}
