package com.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.model.Member;

public interface MemberRepo extends JpaRepository<Member, Integer> {

}
