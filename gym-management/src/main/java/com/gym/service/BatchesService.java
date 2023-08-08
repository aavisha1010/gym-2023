package com.gym.service;

import java.util.List;

import com.gym.model.Batches;

public interface BatchesService {
	
	public Batches addBatch(Batches batche);
	public List<Batches> getBatchesList();
	public Batches getBatch(int batch_id);

}
