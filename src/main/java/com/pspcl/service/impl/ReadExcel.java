package com.pspcl.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pspcl.model.Asset;
import com.pspcl.service.IAddEmployeeService;
import com.pspcl.service.IAssetService;
@Component
public class ReadExcel implements CommandLineRunner {
	@Autowired
	private IAssetService assetservice;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("from runner");
		List<Asset> list =new ArrayList<>();
		FileInputStream file = new FileInputStream(new File("D:\\SpringBootAngular-FullStack\\asset\\asset.xlsx"));
		Workbook workbook = new XSSFWorkbook(file);
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("ASSET");
		Iterator<Row> itr = sheet.iterator();
		while (itr.hasNext()) {
			Row r = itr.next();
			list.add( new Asset((long) r.getCell(0).getNumericCellValue(), r.getCell(1).getStringCellValue(),
					r.getCell(2).getStringCellValue()));
			

		}
		//assetservice.addAsset(list);
		//System.out.println(list);
		workbook.close();

	}
}
