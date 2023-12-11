package com.yong.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yong.library.service.ILibraryService;
import com.yong.library.vo.BookVO;
import com.yong.library.vo.RentalVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/library")
public class LibraryController {
	
	@Autowired
	private ILibraryService libraryService;
	
	/** 
	 * 도서 리스트
	 * @return 
	 */
	@GetMapping(value = "/book", produces = "application/json;charset=utf-8")
	public List<BookVO> listBook(){
		return libraryService.listBook();
	}

	/**
	 * 도서 등록
	 * @param bookVO 등록할 도서
	 * @return
	 */
	@PostMapping(value = "/book", produces = "application/json;charset=utf-8")
	public int insertBook(@RequestBody BookVO bookVO){
		return libraryService.insertBook(bookVO);
	}

	/**
	 * 도서 수정
	 * @param bookVO 수정할 도서
	 * @return
	 */
	@PutMapping(value = "/book", produces ="application/json;charset=utf-8")
	public int updateBook(@RequestBody BookVO bookVO){
		return libraryService.updateBook(bookVO);
	}
	
	/** 
	 * 도서 대출이력
	 * @param bookNo 도서번호
	 * @return
	 */
	@GetMapping(value = "/rental/{bookNo}", produces = "application/json;charset=utf-8")
	public List<RentalVO> getHistory(@PathVariable String bookNo){
		return libraryService.getHistory(bookNo);
	}

	/**
	 * 도서 대출
	 * @param rentalVO 대출정보
	 * @return
	 */
	@PostMapping(value = "/rental", produces ="application/json;charset=utf-8")
	public int rentBook(@RequestBody RentalVO rentalVO){
		return libraryService.rentBook(rentalVO);
	}
	
	/**
	 * 도서 반납
	 * @param bookNo 도서번호
	 * @return
	 */
	@PutMapping(value = "/rental/{bookNo}", produces ="application/json;charset=utf-8")
	public int returnBook(@PathVariable String bookNo){
		return libraryService.returnBook(bookNo);
	}
}
