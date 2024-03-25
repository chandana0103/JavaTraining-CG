import java.util.Scanner;
public class Ex1Lab5{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your age ");
    int age = sc.nextInt();
class AgeException extends Exception {
   public AgeException(String str) {
     System.out.println(str);
   }
 }
     try {
      if(age < 18) 
       throw new AgeException("Invalid age");
     else
       System.out.println("Valid age");
     }
     catch (AgeException a) {
        System.out.println(a);
     }
    }
  }