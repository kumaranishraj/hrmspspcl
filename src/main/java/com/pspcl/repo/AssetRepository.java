package com.pspcl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pspcl.model.AddEmployee;
import com.pspcl.model.Asset;

public interface AssetRepository extends JpaRepository<Asset, Integer> {

}
