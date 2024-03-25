import java.util.*;
class Function{
void NonRecurFun(int a,int b,int c,int n)
{
  for(int i=1;i<=n-2;i++){
     c=a+b;
     a=b;
     b=c;
}
a=b=1;
System.out.println("nth value by non recursive function is:"+c);
}
void RecursiveFun(int a, int b,int c,int n){
 if(n-2>0)
{
c=a+b;
a=b;
b=c;
 RecursiveFun(a,b,c,n-1);
  return;
}
System.out.println("\n nth value by recursive function is:"+c);
}
}
class Exercise3Lab1{
public static void main(String args[]){
Function f=new Function();
int n,a=1,b=1,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
n=sc.nextInt();
f.RecursiveFun(a,b,c,n);
f.NonRecurFun(a,b,c,n);
}
}


