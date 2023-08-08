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

import com.gym.model.Batches;
import com.gym.model.MemberEnquiry;
import com.gym.service.BatchesService;

@RestController
@RequestMapping("/batches")
@CrossOrigin("*")
public class BatchesController {

	@Autowired
	private BatchesService batchesService;
	
	@PostMapping("/")
	public Batches addBatch(@RequestBody Batches batch) {
		return batchesService.addBatch(batch);
	}
	
	@GetMapping("/")
	public List<Batches> getAllBatches()
	{
		return this.batchesService.getBatchesList();
	}
	
	@GetMapping("/{batch_id}")
	public Batches getSingleBatch(@PathVariable("batch_id") int batch_id){
		return batchesService.getBatch(batch_id);
	} 
	
	
}
