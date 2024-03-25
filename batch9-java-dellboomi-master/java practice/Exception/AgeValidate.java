package com.Exception;

public class AgeValidate 
{
	
	public static void main(String[] args) 
	{
		int age=15;
		try
		{
			aAge(age);
		}
		catch(AgeLimitException e)
		{
			System.out.println("Not Eligible");
		}
		
		
	}

	public static void aAge(int age) throws AgeLimitException
	{
		
		if(age<15)
		{
			throw new AgeLimitException();
		}
		else
		{
			System.out.println("Eligible");
		}
		
	}
	

}
