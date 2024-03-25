import java.util.*;
class Exercise8Lab1 {
 public static boolean checkNumber(int n) {

  while(n%2==0) {
   n=n/2;
  }
  if(n==1) {
   return true;
  }
  else {
   return false;
  }
 }
public static void main(String args[]){

  System.out.println("Enter a value");
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  boolean result=checkNumber(n);
  System.out.println("Power of Two : "+result);
  }
}