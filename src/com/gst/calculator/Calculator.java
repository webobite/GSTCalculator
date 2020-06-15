package com.gst.calculator;

class Calculator {

	public static void main(String[] args) {

		int unit = Integer.parseInt(args[0]);
		String commodity = args[1];
		int initialUnitPrice = Integer.parseInt(args[2]);
		GST gst = new GST();

		try {
			int gstPercent = gst.setGSTPercent(commodity);
			if (gstPercent != -1) {
				int gstAmount = gst.calculateGSTCharge(initialUnitPrice, gstPercent);
				System.out.println("GST Applicable Per Unit for " + commodity + " : " + gstAmount);
				System.out.println("Final Price : " + ((unit * initialUnitPrice) + (unit * gstAmount)));
			} else {
				System.out.println(
						"Commodity name : " + commodity + " entered by the User doesnot exist in software System.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}