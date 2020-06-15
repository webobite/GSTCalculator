package com.gst.calculator;

class Calculator {

	public static void main(String[] args) {

		

		try {
			/**
			 * Command Line Argument
			 * unit --> integer type
			 * commodity --> String type
			 * initialUnitPrice --> Integer Type
			 */
			int unit = Integer.parseInt(args[0]);
			String commodity = args[1];
			int initialUnitPrice = Integer.parseInt(args[2]);
			
			// gst --> Object of GST class
			GST gst = new GST();
			
			
			// set the GST percentage for the entered Commodity 
			int gstPercent = gst.setGSTPercent(commodity);
			
			// Check for the commodity entered is present or not
			if (gstPercent != -1) {
				// Calculate GST amount
				int gstAmount = gst.calculateGSTCharge(initialUnitPrice, gstPercent);
				
				// Output --> GST Applicable Per Unit
				System.out.println("GST Applicable Per Unit for " + commodity + " : " + gstAmount);
				
				// Output as --> final Price
				System.out.println("Final Price : " + ((unit * initialUnitPrice) + (unit * gstAmount)));
			} else {
				System.out.println(
						"Commodity name : " + commodity + " entered by the User doesnot exist in software System.");
			}

		} catch (Exception e) {
			System.out.println("SOME THING WENT WRONG");
			e.printStackTrace();
		}

	}
}