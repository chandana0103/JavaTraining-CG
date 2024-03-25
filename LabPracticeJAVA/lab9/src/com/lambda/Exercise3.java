package com.lambda;

public class Exercise3 {
	public static void main(String[] args) {

		String name = "chandana";
		String pass = "1234";
		Accept acc = ((username, password) -> {
			if (username.equals(name) && password.equals(pass))
				return true;
			else
				return false;
		});
		System.out.println(acc.acceptUser("chandana", "1234"));
	}
}
interface Accept {
	
	boolean acceptUser(String username, String password);


}
