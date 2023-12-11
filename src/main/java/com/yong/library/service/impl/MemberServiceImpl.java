package com.yong.library.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yong.library.mapper.MemberMapper;
import com.yong.library.service.IMemberService;
import com.yong.library.vo.MemberVO;

@Service
public class MemberServiceImpl implements IMemberService {

	@Autowired
	private MemberMapper memberMapper;

	@Override
	public int insertMember(MemberVO memberVO) {
		return memberMapper.insertMember(memberVO);
	}
}
