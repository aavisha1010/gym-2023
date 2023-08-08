package com.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gym.model.Package;

public interface PackageRepo extends JpaRepository<Package, Integer> {

}
