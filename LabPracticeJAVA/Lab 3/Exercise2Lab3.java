import java.util.*;
class Exercise2Lab3 {
  public String getImage(String str) {
    StringBuffer sb1=new StringBuffer(str);
    sb1.append('|');
    StringBuffer sb2=new StringBuffer(str);
    sb2.reverse();
    sb1.append(sb2);
    return sb1.toString();
  }
  public static void main(String args[]) {
    
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a name ");
   Exercise2Lab3 a=new Exercise2Lab3();
   String str=sc.next();
   System.out.println(a.getImage(str));
  }
}