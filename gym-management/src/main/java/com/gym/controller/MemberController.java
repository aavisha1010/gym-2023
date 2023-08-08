package com.gym.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.model.Member;
import com.gym.service.MemberService;

@RestController
@RequestMapping("/member")
@CrossOrigin("*")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@PostMapping("/")
	public Member addMember(@RequestBody Member member) {
		
		
	
		Date date1;
		try {
			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(member.getStart_date());
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");  
		      String formattedDate1 = sdf1.format(date1); 
		      member.setStart_date(formattedDate1);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
			 
	
		member.setValid_payment('N');
		//Last Day Calculation
		int packageMonth=member.getPackages().getPackage_month();
		  Calendar cal = Calendar.getInstance();  
	      cal.add(Calendar.MONTH, packageMonth);  
	      Date updatedDate = cal.getTime();  
	      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
	      String formattedDate = sdf.format(updatedDate); 
	      member.setLast_day(formattedDate);
	      
	      //Discount Calculation
	     member.setDAmount( member.getPackages().getPackage_amt()-member.getDiscount());
		
		return this.memberService.addMember(member);
	}
	
	
	@GetMapping("/{member_id}")
	public Member getMemberById(@PathVariable("member_id") int member_id)
	{
		System.out.println("---------------------Inside Get Member Controller "+member_id);
		return this.memberService.getMember(member_id);
	}
	
	@PutMapping("/")
	public Member updateBatches(@RequestBody Member member) {
		
		return this.memberService.updateMember(member);
	}
	@GetMapping("/")
	public List<Member> getAllMember()
	{
		return this.memberService.getMembersList();
	}

}
