package com.gym.service;

import java.util.List;

import com.gym.model.MemberEnquiry;

public interface MemberEnquiryService {

	public MemberEnquiry addEnquiry(MemberEnquiry memberEnquiry);
	public List<MemberEnquiry> getEnquiryMemberList();
	public MemberEnquiry getrEnquiryMember(int enq_id);
	public void deleteEnquiryMember(int enq_id);
	public MemberEnquiry updateEnquiry(MemberEnquiry memberEnquiry);
	
}
