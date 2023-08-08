package com.gym.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.model.Batches;
import com.gym.repository.BatchesRepo;
import com.gym.service.BatchesService;

@Service
public class BatchesImpl implements BatchesService{

	@Autowired
	private BatchesRepo batchesRepo;
	
	@Override
	public Batches addBatch(Batches batch) {
		return batchesRepo.save(batch);
	}
	
	@Override
	public List<Batches> getBatchesList(){
		return this.batchesRepo.findAll();
	}
	
	@Override
	public Batches getBatch(int batch_id) {
		return this.batchesRepo.findById(batch_id).get();
	}
	
	
	
	
}
