package com.dsa.april3rd;

public class GetFactorial {
	
	public static int getFactorial(int value) {
	    if (value < 0) {
	        return -1;
	    }
	    
	    if (value == 0) {
	        return -2;
	    }
	    
	    int factorial = 1;
	    
	    for (int i = 1; i <= value; i++) {
	        factorial *= i;
	    }
	    
	    return factorial;
	}
public static void main(String[] args) {
	int n = 5;
	System.out.println(getFactorial(n));
}

}
