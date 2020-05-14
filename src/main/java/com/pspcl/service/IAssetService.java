package com.pspcl.service;

import java.util.List;
import com.pspcl.model.Asset;

public interface IAssetService {
	
	public List<Asset> addAsset(List<Asset> list);
	public List<Asset> getAllAsset();
	
}
