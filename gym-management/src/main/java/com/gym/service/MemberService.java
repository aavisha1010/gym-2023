package com.gym.service;

import java.util.List;

import com.gym.model.Member;

public interface MemberService{
	
	public Member addMember(Member member);
	public Member updateMember(Member member);
	public List<Member> getMembersList();
	public Member getMember(int member_id);

}
