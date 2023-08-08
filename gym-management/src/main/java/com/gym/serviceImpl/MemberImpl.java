package com.gym.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.model.Member;
import com.gym.model.MemberEnquiry;
import com.gym.repository.MemberRepo;
import com.gym.service.MemberEnquiryService;
import com.gym.service.MemberService;

@Service
public class MemberImpl implements MemberService{

	@Autowired
	private MemberRepo memberRepo;
	
	@Autowired
	private MemberEnquiryService enquiryService;
	
	@Override
	public Member addMember(Member member) {
		
	MemberEnquiry memberEnquiry = enquiryService.getrEnquiryMember(member.getMemberenquiry().getEnq_id());		
		memberRepo.save(member);
		
		
		memberEnquiry.setMember(member);
		
		
		
		enquiryService.updateEnquiry(memberEnquiry);
		return member;
	}

	@Override
	public List<Member> getMembersList() {
		// TODO Auto-generated method stub
		return this.memberRepo.findAll();
	}

	@Override
	public Member getMember(int member_id) {
		
		return this.memberRepo.findById(member_id).get();
	}

	@Override
	public Member updateMember(Member member) {
		Member m=this.memberRepo.findById(member.getMember_id()).get();
		m.setBatches(member.getBatches());
		
		return memberRepo.save(m);
	}
	
	
	

}
