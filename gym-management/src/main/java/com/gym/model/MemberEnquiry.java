package com.gym.model;



import java.text.SimpleDateFormat;
import java.util.Date;

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
public class MemberEnquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int enq_id;
	private String m_name;
	private long contact;
	private float age;
	private String address;
	private String time_slot_expected;
	private String status;
	private String activity;
	@Column(nullable = false)
	private String enq_date;
	
	@PrePersist
	private void onCreate()
	{
		Date date=new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		enq_date=formatter.format(date);
		
	}
	
	
	
	
	@OneToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private Member member;

	
	
	

}
