package com.pspcl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pspcl.model.Asset;
import com.pspcl.repo.AssetRepository;
import com.pspcl.service.IAssetService;

@Service
public class AssetServiceImpl implements IAssetService{
	@Autowired
	private AssetRepository assetrepo;

	public List<Asset> addAsset(List<Asset> list) {
		return assetrepo.saveAll(list);
	}

	@Override
	public List<Asset> getAllAsset() {
		List<Asset> list = assetrepo.findAll();
		return list;
	}

}
