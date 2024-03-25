class Activity{
	String string1;
	String string2;
	String operator;

	public Activity(String string1,String string2,String operator){
		this.string1 = string1;
		this.string2 = string2;
		this.operator = operator;
	}
	public String getString1(){
		return string1;
	}

	public String getString2(){
		return string2;
	}

	public String getOperator(){
		return operator;
	}
}


class Source1 {
	public static String handleException(Activity a){
		String s1 = a.getString1();
		String s2 = a.getString2();
		String op = a.getOperator();
		String msg ="";
		if(s1==null||s2==null){
			try {
				throw new NullPointerException( "Null values found");
			}catch(NullPointerException e) {
				msg+=e.getMessage();
			}

		}else if(op!="+"&&op!="-"){
			try {
				throw  new Exception(op);
			}catch(Exception e) {
				msg+=e.getMessage();
			}

		}else{
			msg = "No Exception Found";
		}
		return msg; 
	}
	public static String doOperation(Activity a)
	{
		String s1 = a.getString1();
		String s2 = a.getString2();
		String op = a.getOperator();
		String msg ="";
		switch(op){
		case "+":
			msg +=s1+s2;
			break;
		case "-":
			msg+=s1.replace(s2, "");
			break;
		default:
			break;
		}
		return msg;
	}

	public static void main(String args[] )  {
		Activity a = new Activity("hello", "world", "+");
		if(Source1.handleException(a).equals("No Exception Found")){
			System.out.println(doOperation(a));
			
		}else {
			System.out.println(Source1.handleException(a));
		}
		

	}
}

//import java.util.*;
//
//// import java.util.Scanner;
//class Activity{
//  //Implement Activity class here..
//  String string1;
//  String string2;
//  String operator;
//  
//  public Activity(String string1, String string2, String operator) {
//    this.string1 = string1;
//    this.string2 = string2;
//    this.operator = operator;
//  }
//}
//
//public class HandlingStuff {
//  //Implement the two function given in description in here...
//  public static String doOperation(Activity a) {
//		String string1 = a.string1;
//		String string2 = a.string2;
//		String operator = a.operator;
//		String msg = null;
//		
//		switch(operator) {
//			case "+":
//				msg = string1 + "" + string2;
//				break;
//			case "-":
//				msg = string1.replace(string2,"");
//				break;
//			default:
//				break;
//		}
//		return msg;
//	}
//
//  public static String handleException(Activity a) {
//		String string1 = a.string1;
//		String string2 = a.string2;
//		String operator = a.operator;
//		String msg = null;
//		
//		try{
//			if(string1 == null || string2 == null) {
//				msg = "Null values found";
//				throw new NullPointerException("Parameter Type cannot be null");
//			}else if(operator != "+" && operator != "-") {
//				msg = operator;
//			}else {
//				msg = "No Exception Found";
//			}
//		}catch (NullPointerException e){
//			System.out.println(e);
//		}
//		
//		return msg;
//	}
//  
//	public static void main(String args[] ) throws Exception {
//    //Write your own main to check the program...
//	// Scanner sc = new Scanner(System.in);
//	// String string1 = sc.next();
//	// String string2 = sc.next();
//	// String operator = sc.next();
//
//    Activity a = new Activity("hello", "world", "@");
//		System.out.println(handleException(a));
//		System.out.println(doOperation(a));
//	}
//}




//
//public class HandlingStuff {
//	
//	public static String doOperation(Activity a) {
//		String s1=a.string1;
//		String s2=a.string2;
//		String o=a.operator;
//		String msg = null;
//		switch (o) {
//		case "+":
//			System.out.println(s1+s2);
//			break;
//		case "-":
//			System.out.println(s1.replace(s2, ""));
//			break;
//		default:
//			break;
//		}
//		return msg;
//	}
//	
//	public static String handleException(Activity a) throws defaultException {
//		String s1=a.string1;
//		String s2=a.string2;
//		String o=a.operator;
//		String msg=null;
////			System.out.println(s1.length());
////			System.out.println(s2.length());
//		if(s1 == null || s2 == null) {
//			throw new NullPointerException("Null values found.");
//		}
//		else if(o!="+" && o!="-") {
//			throw new defaultException(o);
//		}
//		else {
//			msg="No Exception Found";
//		}
//		
//		return msg;
//	}
//
//	public static void main(String[] args) throws defaultException {
//		Activity a=new Activity();
//		a.string1="hello";
//		a.string2="world";
//		a.operator="+";
//		handleException(a);
//		doOperation(a);		
//	}
//
//}
//class Activity{
//	String string1;
//	String string2;
//	String operator;
//	
//	public Activity() {
//		
//	}
//	
//	public Activity(String string1,String string2,String operator) {
//		this.string1=string1;
//		this.string2=string2;
//		this.operator=operator;
//	}
//	public String getString1(){
//	    return string1;
//	  }
//
//	  public String getString2(){
//	    return string2;
//	  }
//
//	  public String getOperator(){
//	    return operator;
//	  }
//}
//class defaultException extends Exception{
//	public defaultException(String msg) {
//		super(msg);
//	}
//}