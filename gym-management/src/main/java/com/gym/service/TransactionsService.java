package com.gym.service;

import java.util.List;

import com.gym.model.Transactions;

public interface TransactionsService {

	public Transactions addTransaction(Transactions transaction);
	public List<Transactions> getTransactionsList();
	public Transactions getTransaction(int trans_id);	
	
}
