package com.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.model.MemberEnquiry;

public interface MemberEnquiryRepo extends JpaRepository<MemberEnquiry, Integer>{

}
