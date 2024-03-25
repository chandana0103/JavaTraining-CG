import java.util.*;
class PrintPrimeNumEx4{
public static void main(String args[]){
int n, p;
System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=2; i<n;i++)
{
    p=0;
   for(int j=2; j<i; j++)
   {
     if(i%j==0)
     p=1;
   }
if(p==0)
System.out.println("the prime numbers are : "+i);
}
}
}