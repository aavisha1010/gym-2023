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
public class Package {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int package_id;
	private String package_name;
	private int package_month;
	private float package_amt;
	
	
	
//	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "packages")
//	private List<Member> member = new ArrayList<>();



	
}
