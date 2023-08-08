package com.gym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.model.MemberEnquiry;
import com.gym.service.MemberEnquiryService;

@RestController
@RequestMapping("/enquiry")
@CrossOrigin("*")
public class MemberEnquiryController {

	@Autowired
	private MemberEnquiryService memberEnquiryService;
		
	@PostMapping("/")
	public MemberEnquiry addEnquiry(@RequestBody MemberEnquiry memberEnquiry) {
		return memberEnquiryService.addEnquiry(memberEnquiry);
	}
	
	@GetMapping("/")
	public List<MemberEnquiry> getMemberList(){
		return memberEnquiryService.getEnquiryMemberList();
	} 
	
	@GetMapping("/{enq_id}")
	public MemberEnquiry getEnquiryMember(@PathVariable("enq_id") int enq_id){
		return memberEnquiryService.getrEnquiryMember(enq_id);
	} 
	
	@DeleteMapping("/{enq_id}")
	public void deleteEnquiryMember(@PathVariable("enq_id") int enq_id){
		memberEnquiryService.deleteEnquiryMember(enq_id);
	} 
	
	
	
	
	
}
