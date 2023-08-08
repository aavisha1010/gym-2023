package com.gym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.model.MemberEnquiry;
import com.gym.model.Transactions;
import com.gym.service.TransactionsService;

@RestController
@RequestMapping("/transaction")
@CrossOrigin("*")
public class TransactionsController {

	@Autowired
	private TransactionsService transactionsService;
		
	@PostMapping("/")
	public Transactions addTransaction(@RequestBody Transactions transaction) {
		return this.transactionsService.addTransaction(transaction);
	}
	
	@GetMapping("/")
	public List<Transactions> getTransactionsList(){
		return transactionsService.getTransactionsList();
	}
	
	@GetMapping("/{trans_id}")
	public Transactions getTransaction(@PathVariable("trans_id") int trans_id){
		return transactionsService.getTransaction(trans_id);
	} 
	
}
