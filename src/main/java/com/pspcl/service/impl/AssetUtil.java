package com.pspcl.service.impl;

import java.util.HashMap;
import java.util.Map;

public class AssetUtil {
	static Map<String,String> zone = null;
	static Map<String,String> division = null;
	
	public static Map<String,String> getZones(){
		zone = new HashMap<String,String >();
		zone.put("L", "Ludhiana");
		zone.put("K", "Khanna");
		zone.put("P", "Patialla");
		zone.put("M", "Mohali");
		zone.put("B", "Bhatinda");
		zone.put("F", "Ferozpur");
		zone.put("S", "Sangrur");
		System.out.println(zone);
		return zone;
	}
	public static Map<String,String> getDivisions(){
		division = new HashMap<String,String >();
		//********** Ludhiana ****************
		division.put("L10", "L10-CMC");
		division.put("L11", "L11-City Central");
		division.put("L12", "L12-Focal Point");
		division.put("L13", "L13-Sunder Nagar");
		division.put("L14", "L14-Estate");
		division.put("L15", "L15-Janta Nagar");
		division.put("L16", "L16-Model Town");
		division.put("L17", "L17-City West");
		division.put("L18", "L18-Aggar Nagar");
		//************Khanna*******************
		division.put("K10", "K10-Doraha");
		division.put("K11", "K11-Gobindgarh");
		division.put("K12", "K12-Ahmedgarh");
		division.put("K13", "K13-Raikot");
		division.put("K14", "K14-Jagraon");
		//****************Patialla***********
		division.put("P10", "P10-Zirakpur");
		division.put("P11", "P10-Roopnagar");
		//*************Mohali****************
		division.put("M10", "M10-Kharar");
		division.put("M11", "M11-Lalru");
		//***********Ferozpur**********
		division.put("F10", "F10-Faridkot");
		division.put("F11", "F11-Moga");
		//************Sangrur******
		division.put("S10", "S10-Barnala");
		//************Bhatinda********
		System.out.println(division);
		return division;
	}
	public static void main(String[] args) {
		getZones();
		getDivisions();
	}
}
