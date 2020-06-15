package com.gst.calculator;

import java.util.ArrayList;
import java.util.List;

class GST {

	/**
	 * Static constant for GST Percent of 4 categories of products If you want
	 * to change the GST percent change here only. It will be reflected in other
	 * places too.
	 */
	private static final int foodGrainGSTPercent = 0;
	private static final int furnitureGSTPercent = 5;
	private static final int electronicsGSTPercent = 18;
	private static final int cosmeticsGSTPercent = 28;

	/**
	 * List of products
	 */
	static List<String> foodGrainProducts = new ArrayList<String>() {
		{
			add("Rice");
			add("Wheat");
			add("Dal");
		}
	};
	static List<String> furnitureProducts = new ArrayList<String>() {
		{

			add("Table");
			add("Sofa");
			add("Chair");
		}
	};

	static List<String> electronicProducts = new ArrayList<String>() {
		{
			add("Mobile");
			add("TV");
			add("Tablet");
		}
	};

	static List<String> cosmeticsProducts = new ArrayList<String>() {
		{

			add("Cream");
			add("Perfume");
			add("Lotion");
		}
	};

	int gstCharge = 0;

	/**
	 * Method to set GST Percent according to commodity entered
	 * 
	 * @param commodity
	 */
	public int setGSTPercent(String commodity) {

		// if commodity entered doesn't match with existing record will return -1
		int gstPercent = -1;

		/**
		 * Search in foodGrainProducts for commodity
		 */
		for (String product : foodGrainProducts) {
			if (product.contains(commodity)) {
				return foodGrainGSTPercent;
			}
		}

		/**
		 * Search in furnitureProducts for commodity
		 */
		for (String product : furnitureProducts) {
			if (product.contains(commodity)) {
				return furnitureGSTPercent;
			}
		}

		/**
		 * Search in electronicProducts for commodity
		 */
		for (String product : electronicProducts) {
			if (product.contains(commodity)) {
				return electronicsGSTPercent;
			}
		}

		/**
		 * Search in cosmeticsProducts for commodity
		 */
		for (String product : cosmeticsProducts) {
			if (product.contains(commodity)) {
				return cosmeticsGSTPercent;
			}
		}

		return gstPercent;

	}

	/**
	 * Method to calculate GST charge
	 * 
	 * @param originalCost
	 * @param gstPercent
	 * @return gstCharge
	 */
	public int calculateGSTCharge(int originalCost, int gstPercent) {
		gstCharge = (originalCost * gstPercent) / 100;
		return gstCharge;
	}

}