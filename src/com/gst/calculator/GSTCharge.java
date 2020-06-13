package com.gst.calculator;

import java.util.ArrayList;
import java.util.List;

class GST {

	/**
	 * Static constant for GST Percent of 4 categories of products
	 * If you want to change the GST percent change here only. 
	 */
	private static final int foodGrainGSTPercent = 0;
	private static final int furnitureGSTPercent = 5;
	private static final int electronicsGSTPercent = 18;
	private static final int cosmeticsGSTPercent = 28;
	
	/**
	 * List of products 
	 */
	static List<String> products = new ArrayList<String>() {
		{
			add("Rice");
			add("Wheat");
			add("Dal");

			add("Table");
			add("Sofa");
			add("Chair");

			add("Mobile");
			add("TV");
			add("Tablet");

			add("Cream");
			add("Perfume");
			add("Lotion");
		}
	};


	int gstCharge = 0;
	
	int getGSTPercent(int itemPos) {
		if(itemPos >= 0 || itemPos <= 2) {
			return foodGrainGSTPercent;
		} else if (itemPos >= 3 || itemPos <= 5) {
			return furnitureGSTPercent;
		} else if (itemPos >= 6 || itemPos <= 8) {
			return electronicsGSTPercent;
		} else if (itemPos >= 9 || itemPos <= 11) {
			return cosmeticsGSTPercent;
		}
		return -1;
	}

	/**
	 * Method to set GST Percent according to commodity entered
	 * @param commodity
	 */
	public int setGSTPercent(String commodity) {
		
		// if commodity entered doesn't match with existing record will return -1
		int gstPercent = -1;
		
		System.out.println(products);

		for (int i = 0; i < products.size(); i++) {
			if (commodity.equals(products.get(i))) {
				gstPercent = getGSTPercent(i);
				return gstPercent;
			}
		}
		return gstPercent;

	}

	/**
	 * Method to calculate GST charge
	 * @param originalCost
	 * @param gstPercent
	 * @return gstCharge
	 */
	public int calculateGSTCharge(int originalCost, int gstPercent) {
		gstCharge = (originalCost * gstPercent) / 100;
		return gstCharge;
	}

}