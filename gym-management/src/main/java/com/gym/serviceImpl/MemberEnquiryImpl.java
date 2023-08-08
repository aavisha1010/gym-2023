package com.gym.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.model.MemberEnquiry;
import com.gym.repository.MemberEnquiryRepo;
import com.gym.service.MemberEnquiryService;

@Service
public class MemberEnquiryImpl implements MemberEnquiryService {

	@Autowired
	private MemberEnquiryRepo memberEnquiryRepo;
	
	
	@Override
	public MemberEnquiry addEnquiry(MemberEnquiry memberEnquiry) {
		// TODO Auto-generated method stub
		return memberEnquiryRepo.save(memberEnquiry);
	}

	@Override
	public List<MemberEnquiry> getEnquiryMemberList() {
		// TODO Auto-generated method stub
		return memberEnquiryRepo.findAll();
	}

	@Override
	public MemberEnquiry getrEnquiryMember(int enq_id) {
		// TODO Auto-generated method stub
		return memberEnquiryRepo.findById(enq_id).get();
	}

	@Override
	public void deleteEnquiryMember(int enq_id) {
		// TODO Auto-generated method stub
		memberEnquiryRepo.deleteById(enq_id);
	}

	@Override
	public MemberEnquiry updateEnquiry(MemberEnquiry memberEnquiry) {
		
		return memberEnquiryRepo.save(memberEnquiry);
	}

	
	
}
