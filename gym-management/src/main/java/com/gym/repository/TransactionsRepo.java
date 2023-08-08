package com.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.model.Transactions;

public interface TransactionsRepo extends JpaRepository<Transactions, Integer>{

}
