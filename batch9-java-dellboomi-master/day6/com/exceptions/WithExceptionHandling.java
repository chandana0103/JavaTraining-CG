package com.exceptions;

class WithExceptionHandling {

   public static void main(String[] args) {

   System.out.println("Main Starts...");

   int a = 10;

   int b = 0;

   try {
       int c = a/b; //if exception occurred jvm create exception object (which exception obj ?)  and throwing into environment....
                    // ArithmeticException ex = new ArithmeticException();
                    // throw ex;

       System.out.println("Result:"+c);
    }
    catch(ArithmeticException e) {
      System.out.println("denominator should not be zero");
    }    
   System.out.println("Main Ends...");

 }

}
