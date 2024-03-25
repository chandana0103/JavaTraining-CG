import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
//class Activity{
//  //Implement Activity class here..
//  String string1;
//  String string2;
//  String operator;
//
//  public Activity(String string1, String string2, String operator){
//    this.string1 = string1;
//    this.string2 = string2;
//    this.operator = operator;
//  }
//
//  public String getString1(){
//    return string1;
//  }
//
//  public String getString2(){
//    return string2;
//  }
//
//  public String getOperator(){
//    return operator;
//  }
//}

public class HandlingStuffNew {
  //Implement the two function given in description in here...
  public static String handleException(Activity a) {
    String s1 = a.string1;
    String s2 = a.string2;
    String o = a.operator;
    String msg = null;

    if(s1 == null || s2 == null){
      msg="Null values found";
    }else if(o.equals("+")==false && o.equals("-")==false){
      msg = o;
    }else{
      msg = "No Exception Found";
    }
    return msg;
  }

  public static String doOperation(Activity a){
    String s1 = a.string1;
    String s2 = a.string2;
    String o = a.operator;
    String msg = null;

    switch(o){
      case "+":
        System.out.println(s1+""+s2);
        break;
      case "-":
        System.out.println(s1.replace(s2, ""));
        break;
      default:
        break;
    }
    return msg;
  }
  
	//public static void main(String args[]) {
    //Write your own main to check the program...
//    Activity a = new Activity("hello", "world", "+");
//    System.out.println(handleException(a));
//    doOperation(a);
		public static void main(String args[] ){
		    //Write your own main to check the program...
		    Activity a = null;
		    Scanner sc=new Scanner(System.in);
		    String s1=sc.next();
		    String s2=sc.next();
		    String o=sc.next();
		    a=new Activity(s1,s2,o);
		    System.out.println(handleException(a));
		    doOperation(a);
		   // sc.close();
			}
//		}
//	}
}

