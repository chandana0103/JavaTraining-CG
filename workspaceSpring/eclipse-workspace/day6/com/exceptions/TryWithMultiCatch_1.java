package com.exceptions;

public class TryWithMultiCatch {

	public static void main(String[] args) {
		

		   System.out.println("Main Starts...");

		   try {
		       int a = Integer.parseInt(args[0]);
		       int b = Integer.parseInt(args[1]);
		       int c = a/b; 
		       System.out.println("Result:"+c);
		    }
		    catch(ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {	
		    	System.out.println(e.getMessage());		     
		    }    
		  
		   System.out.println("Main Ends...");

	}

}
