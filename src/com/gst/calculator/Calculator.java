package com.gst.calculator;

import java.util.ArrayList;
import java.util.List;

class Calculator { 
	
	
	
    public static void main (String[] args) { 
      
    	int unit = Integer.parseInt(args[0]);
    	String commodity = args[1];
    	int initialUnitPrice = Integer.parseInt(args[2]);
    	GST gst = new GST();
    	int gstPercent = gst.setGSTPercent(commodity);
        
        int gstAmount = gst.calculateGSTCharge(initialUnitPrice,10); 
        System.out.println("Sum of two integer values :"+ gstAmount); 
         
        
    } 
}