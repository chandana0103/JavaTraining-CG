import java.util.*;
class Exercise6Lab1 {
  public static int caluculateDifference(int n) {
  int sum=0;
  for(int i=1; i<=n ; i++) {
    int square= i*i;
    sum = sum*square;
  }
  int sumnum=0;
  for(int i=1;i<=n; i++) {
    sumnum=sumnum+i;
  } 
  int square=sumnum*sumnum;
   int diff=sumnum+square;
   return diff;
 } 
public static void main(String args[]) {

  System.out.println("Enter a value");
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int result=caluculateDifference(n);
   System.out.println("Difference is : "+result);
  }
}