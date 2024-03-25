public class Ex2Lab5{
   public static void main(String[] args) {
    System.out.print("Name of employee : ");
    String s1= "  ";
    String s2="  ";
 class NameException extends Exception {
     public NameException(String str) {
        System.out.println(str);
     }
  }
     try {
      if(s1==s2) 
       throw new NameException("Name should not be blank");
     else
       System.out.println("name");
     }
     catch (NameException a) {
        System.out.println(a);
     }
    }
  }