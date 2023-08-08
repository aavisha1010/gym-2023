package com.gym.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.repository.PackageRepo;
import com.gym.service.PackageService;
import com.gym.model.Package;

@Service
public class PackageImpl implements PackageService {

	@Autowired
	private PackageRepo packageRepo;
	
	@Override
	public Package addPackage(Package package1) {
		return packageRepo.save(package1);
	}
	
	@Override
	public List<Package> getPackagesList(){
		return this.packageRepo.findAll();
	}
	
	@Override
	public Package getPackage(int pacakge_id) {
		return this.packageRepo.findById(pacakge_id).get();
	}
	
	
}
