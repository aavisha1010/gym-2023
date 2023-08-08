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

import com.gym.model.Package;
import com.gym.service.PackageService;

@RestController
@RequestMapping("/package")
@CrossOrigin("*")
public class PackageController {

	@Autowired
	private PackageService packageService;
	
	
	@PostMapping("/")
	public Package addPackage(@RequestBody Package package1) {
		return packageService.addPackage(package1);
	} 
	
	@GetMapping("/")
	public List<Package> getPackages()
	{
		return this.packageService.getPackagesList();
	}
	@GetMapping("/{package_Id}")
	public Package getSinglePackage(@PathVariable("package_Id") int package_Id){
		return this.packageService.getPackage(package_Id);
	} 
}
