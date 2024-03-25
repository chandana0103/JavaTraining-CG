import java.util.*;
class Exercise7Lab1{
  public static boolean checkNumber(int n)
  {
	while(n>0)
	{
	 int digit1 = n%10;
	 n = n/10;
			
	 if(digit1 < n%10)
	 return false;
	}
	 return true;
	}

	public static void main(String args[])
	{
          System.out.println("Enter  Digits ");
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
		
	   if(checkNumber(n))
	     System.out.println("Digits are in increasing order");
	   else
	     System.out.println("Digits are not in increasing order");
	}
}