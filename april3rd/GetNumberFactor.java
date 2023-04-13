package com.dsa.april3rd;

public class GetNumberFactor {
	
	
	public static String getFactors(int value) {
	    if (value < 0) {
	        return "-1";
	    }
	    
	    if (value == 0) {
	        return "-2";
	    }
	    
	    String factors = "";
	    
	    for (int i = 1; i <= value; i++) {
	        if (value % i == 0) {
	            factors += i + " ";
	        }
	    }
	    
	    return factors;
	}
public static void main(String[] args) {
	int value = 20;
	System.out.println(getFactors(value));
}
}
