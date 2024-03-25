package com.exceptions;

class TryMultiCatchDemo {

   public static void main(String[] args) {

   System.out.println("Main Starts...");

   try {
       int a = Integer.parseInt(args[0]);
       int b = Integer.parseInt(args[1]);
       int c = a/b; 
       System.out.println("Result:"+c);
    }
    catch(ArithmeticException e) {
      System.out.println("denominator should not be zero");
      System.out.println(e.getMessage());
      e.printStackTrace();
    }    
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("pass correct number of args");
      System.out.println(e.getMessage());
       e.printStackTrace();
    }    
    catch(NumberFormatException e) {
      System.out.println("pass correct type of args");
      System.out.println(e.getMessage());
      e.printStackTrace();
    }    
   System.out.println("Main Ends...");

 }

}
