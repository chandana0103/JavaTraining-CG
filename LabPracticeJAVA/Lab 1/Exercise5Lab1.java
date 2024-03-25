import java.util.*;
class Exercise5Lab1 {
    
   public static int caluculateSum(int n) {
   int sum=0;
   for(int i=0; i<n ;i++)  {
     if(i%3==0 || i%5==0) {
        sum =sum+i;
       }
     }
    return sum;
 }
public static void main(String args[]) {
      System.out.println("Enter a value");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int result=caluculateSum(n);
      System.out.println("Sum : "+result);
 }
}
