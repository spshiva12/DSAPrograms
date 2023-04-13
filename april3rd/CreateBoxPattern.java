package com.dsa.april3rd;

public class CreateBoxPattern {
	
	public static String createBoxPattern(int rows, int columns) {
	    if (rows < 0 || columns < 0) {
	        return "-1";
	    }
	    
	    if (rows == 0 || columns == 0) {
	        return "-2";
	    }
	    
	    String pattern = "";
	    
	    for (int i = 1; i <= rows; i++) {
	        for (int j = 1; j <= columns; j++) {
	            pattern += "* ";
	        }
	        pattern += "\n";
	    }
	    
	    return pattern;
	}
public static void main(String[] args) {
	int rows = 3, columns = 5;
	System.out.println(createBoxPattern(rows, columns));
}

}
