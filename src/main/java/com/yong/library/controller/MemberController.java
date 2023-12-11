package com.yong.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.yong.library.service.IMemberService;
import com.yong.library.vo.MemberVO;

public class MemberController {
	
	@Autowired
	private IMemberService memberService;
	
	/**
	 * 회원가입
	 * @param memberVO
	 * @return
	 */
	@PostMapping(value = "/signup", produces = "application/json;charset=utf-8")
	public int insertMember(@RequestBody MemberVO memberVO){
		return memberService.insertMember(memberVO);
	}
	
}
