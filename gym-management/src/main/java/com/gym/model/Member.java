package com.gym.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int member_id;
//	private int enq_id;
	@Column(nullable = false)
	private String admission_date;
	private String start_date;
//	private int package_id;
	private int valid_days;
	private char valid_payment;
	private String comment;
	private float discount;
//	private int batch_id;
	
	private String last_day;
	private float dAmount;  //Discount Amount to be paid
	
	@PrePersist
	private void onCreate()
	{
		Date date=new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		admission_date=formatter.format(date);
		
	}
	
	
	
	@OneToOne(fetch = FetchType.EAGER)
	
	private MemberEnquiry memberenquiry;
	
	
	@OneToOne(fetch = FetchType.EAGER)
	
	private Package packages;
	
	@OneToOne(fetch = FetchType.EAGER)
	
	private Batches batches;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "member")
	private List<Transactions> transactions = new ArrayList<>();


	
	
	
	
}
