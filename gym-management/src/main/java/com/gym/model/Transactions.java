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
import javax.persistence.ManyToOne;
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
public class Transactions {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int trans_id;
//	private int member_id;
	@Column(nullable = false)
	private String tran_date;
	private String sart_date;
	private String to_date;
	private String trans_mode;
	private float totalAmt;
	private float amtPaid;
	private char status;
	private String comment;
	private float dicount;
	
	@PrePersist
	private void onCreate()
	{
		Date date=new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		tran_date=formatter.format(date);
		
	}
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	private Member member;
	

}
