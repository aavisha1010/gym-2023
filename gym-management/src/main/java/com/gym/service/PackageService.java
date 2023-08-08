package com.gym.service;

import java.util.List;
import com.gym.model.Package;

public interface PackageService {
	
	public Package addPackage(Package package1);
	public List<Package> getPackagesList();
	public Package getPackage(int package_id);

}


