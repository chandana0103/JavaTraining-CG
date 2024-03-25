import java.util.*;
class SumOfnCubesEx1 {

   public static int SumOfnCubes(int number) {
   int sum=0;
   while(number!=0)
    {
      int n=number%10;
      sum=sum+n*n*n;
      number=number/10;
     }
    return sum;
 }
public static void main(String args[]) {
   System.out.println("Enter a number");
   Scanner sc=new Scanner(System.in);
   int number=sc.nextInt();
    int result = SumOfnCubes(number);
   System.out.println("sum of cubes = "+result);
  }
}