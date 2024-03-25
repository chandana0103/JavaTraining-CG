package com.day8.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.day8.bean.Account;

public class AccountListDemo {

	public static void main(String[] args) {
		
		Account account1 = new Account(1002,"acone",580000);
		Account account2 = new Account(1005,"actwo",90000);
		Account account3 = new Account(1001,"acthree",80000);
		Account account4 = new Account(1003,"acfour",180000);
		Account account5 = new Account(1008,"acfive",60000);
		Account account6 = new Account(1008,"acfive",60000);
		
		List<Account> accounts = null;
		
		accounts = new ArrayList<>();
		
		accounts.add(account1);	
		accounts.add(account2);	
		accounts.add(account3);
		accounts.add(account4);
		accounts.add(account5);
		accounts.add(account6);
		
		Collections.sort(accounts);
		
		Iterator<Account> i = accounts.iterator();
		while(i.hasNext()) {
			Account account = i.next();
			System.out.println(account.getAccno()+" "+account.getName()+" "+account.getBalance());
		}	
		
		List<String> names = new ArrayList<>();
		names.add("one");
		names.add("two");
		names.add("three");
		names.add("four");
		names.add("five");
		Collections.sort(names);
		System.out.println(names);

	}

}
