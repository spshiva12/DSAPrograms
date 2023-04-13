package com.dsa.april3rd;

public class GetSquare {
	
	public static int getSquare(int number) {
	    if (number == 0) {
	        return -1;
	    }
	    
	    if (number < 0) {
	        return -2;
	    }
	    
	    return number * number;
	}
	
	public static void main(String[] args) {
		int n = 25;
		System.out.println(getSquare(n));
	}


}
