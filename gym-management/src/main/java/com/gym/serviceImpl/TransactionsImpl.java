package com.gym.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.model.Transactions;
import com.gym.repository.TransactionsRepo;
import com.gym.service.TransactionsService;

@Service
public class TransactionsImpl implements TransactionsService{
	
	@Autowired
	private TransactionsRepo transactionsRepo;

	@Override
	public Transactions addTransaction(Transactions transaction) {
		
		return transactionsRepo.save(transaction);
	}

	@Override
	public List<Transactions> getTransactionsList() {
		// TODO Auto-generated method stub
		return transactionsRepo.findAll();
	}

	@Override
	public Transactions getTransaction(int trans_id) {
		// TODO Auto-generated method stub
		return transactionsRepo.findById(trans_id).get();
	}
	
	

}
