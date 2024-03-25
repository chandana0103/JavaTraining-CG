package com.exceptions;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		
		String str = "";
		
		try {
			String result = aMethod(str);
			System.out.println(result);
		} catch (Exception e) {			
			System.out.println("Empty String!");
		}		

	}
	
	static String aMethod(String str) throws ClassNotFoundException  {
		
		if(str.equals("")) {
			ClassNotFoundException cfe =  new ClassNotFoundException(); //checked			
			throw cfe;
//			NullPointerException npe = new NullPointerException();  //unchecked
//			throw npe;
			
		}
		
		return str.toUpperCase();
		
	}

}
