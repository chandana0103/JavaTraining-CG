import java.util.Scanner;
class Ex2Lab5{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("salary of employee ");
    String str = sc.next();

class EmployeeException extends Exception {
   public EmployeeException(String str) {
     System.out.println(str);
   }
 }
     try {
      if(str=="  ") 
       throw new EmployeeException("less salary");
     else
       System.out.println("more salary");
     }
     catch (EmployeeException a) {
        System.out.println(a);
     }
    }
  }