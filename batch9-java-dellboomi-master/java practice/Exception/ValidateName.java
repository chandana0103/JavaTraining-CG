package com.Exception;

public class ValidateName 
{
	public static void main(String[] args)
	{
		String firstName="gfhjj";
		String lastName="";
		String fullName=firstName.concat(lastName);
		if(firstName=="" && lastName=="")
		{
			System.out.println(fullName);
		}
		try 
		{
			empName( firstName, lastName);
		}
		catch(NameValidateException e)
		{
			System.out.println("FIRSTNAME AND LASTNAME SHOULD NOT BE EMPTY");
		}
		
	}

	public static void empName(String firstName,String lastName) throws NameValidateException
	{
		
		if(firstName=="" || lastName=="") {
			 throw new NameValidateException();}
		else
		{
			System.out.println("FIRSTNAME AND LASTNAME Filled Suuccesfully");
		}
		
	}
	

	

}
