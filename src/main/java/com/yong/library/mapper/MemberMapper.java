package com.yong.library.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.yong.library.vo.MemberVO;

@Mapper
public interface MemberMapper {

	public int insertMember(MemberVO memberVO);

}
