package com.gym.model;

import java.util.ArrayList;
import java.util.List;

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
public class Batches {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int batch_id;
	private String batch_name;
	private float batch_start_time;
	
	
	
//	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "batches")
//	private List<Member> member = new ArrayList<>();



	
	
 
}
